package LABO06


def file = new File("slowa.txt")
if (!file.exists()) {
    println "Plik 'slowa.txt' nie istnieje!"
    return
}

def wordComparator = Comparator.comparingInt(String::length)
        .thenComparing { a, b -> a.compareToIgnoreCase(b) }

def sortedWords = new TreeSet(wordComparator)
file.eachLine { sortedWords.addAll(it.split(/\W+/)) }

println "Posortowane słowa:"
sortedWords.each { println it }

// posortowany zbiór słów z pliku wg dwóch kryteriów
