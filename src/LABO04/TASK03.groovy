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
        return true
    } catch (Exception ignored) {
        return false
    }
}

def validDates = []
(text =~ datePattern).each { match ->
    def (year, month, day) = match[1..3].collect { it as int }
    if (isValidDate(year, month, day)) {
        validDates << match[0]
    }
}

println "Poprawne daty: ${validDates.join(', ')}"
