package LABO04

import groovy.json.JsonSlurper

import java.math.RoundingMode

getExchangeRate = {
    def apiUrl = "https://api.nbp.pl/api/exchangerates/rates/a/eur?format=json"
    def response = new URI(apiUrl).toURL().text
    def json = new JsonSlurper().parseText(response)
    return json.rates[0].mid
}

def text = """
Zakup kosztował 100 PLN, a sprzedaż 250.50 PLN.
Dodatkowo, za usługę zapłacono 45 PLN.
W sumie wydano 395, ale to nie dotyczy PLN.
"""

def regex = ~/\b(\d+(\.\d+)?) PLN\b/

def convertedText = text.replaceAll(regex) { match ->
    def amountPLN = match[1] as BigDecimal
    def amountEUR = (amountPLN / getExchangeRate()).setScale(2, RoundingMode.HALF_UP)
    return "${amountEUR} EUR"
}

println "Tekst przed konwersją:\n$text"
println "Tekst po konwersji:\n$convertedText"
