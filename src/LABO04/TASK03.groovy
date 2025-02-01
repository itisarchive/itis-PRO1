package LABO04

import java.time.LocalDate

def text = """
2024-02-29 is a leap year date.
2023-13-01 is invalid.
2023-04-31 is invalid (April has only 30 days).
2023-12-25 is valid.
"""

def datePattern = ~/\b(\d{4})-(\d{2})-(\d{2})\b/

def isValidDate = { year, month, day ->
    try {
        LocalDate.of(year as int, month as int, day as int)
        true
    } catch (Exception ignored) {
        false
    }
}

def validDates = (text =~ datePattern).findAll {
    def (year, month, day) = it[1..3]*.toInteger()
    isValidDate(year, month, day)
}*.getAt(0)

println "Poprawne daty: ${validDates.join(', ')}"

// znalezienie poprawnych dat w tekście
