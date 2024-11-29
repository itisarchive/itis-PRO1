package LABO05

import groovy.json.JsonSlurper

import java.math.RoundingMode

getExchangeRate = {
    def apiUrl = "https://api.nbp.pl/api/exchangerates/rates/a/eur?format=json"
    def response = new URI(apiUrl).toURL().text
    def json = new JsonSlurper().parseText(response)
    return json.rates[0].mid
}

def plnPrices = new File("MenuPl.txt").readLines().collectEntries() {
    def tokens = it.split(/\s/)
    def dish = tokens[0]
    def price = tokens[1]
    [dish, price]
}

new File("MenuEur.txt").withWriter {
    plnPrices.each { dish, price ->
        def priceEur = (price as BigDecimal / getExchangeRate()).setScale(2, RoundingMode.HALF_UP)
        it.writeLine("${dish} ${priceEur} EUR")
    }
}
