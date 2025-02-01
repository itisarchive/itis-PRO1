package LABO06

import java.text.Collator

def text = new File("slowa.txt").text

def collator = Collator.getInstance(Locale.of("pl", "PL"))

def words = text.tokenize(" \t\n\r,.;:!?()[]{}\"'-")
        .collect { it.toLowerCase() }

def wordCounts = new TreeMap(collator)

words.each { word ->
    if (word) {
        wordCounts[word] = (wordCounts[word] ?: 0) + 1
    }
}

println "Liczba wystąpień poszczególnych słów:"
wordCounts.each { word, count ->
    println "$word: $count"
}

// liczba wystąpień słów w pliku, alfabetycznie wg języka
