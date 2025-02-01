package LABO06

import static javax.swing.JOptionPane.showInputDialog

def words = new URI("https://raw.githubusercontent.com/ehamiter/anagram/refs/heads/master/wordlist.txt").toURL().readLines()

def anagrams = [:]
words.each { word ->
    def key = word.toLowerCase().toList().sort().join()
    if (!anagrams.containsKey(key)) {
        anagrams[key] = []
    }
    anagrams[key] << word
}

anagrams = anagrams.sort { a, b -> a.value.size() <=> b.value.size() }

anagrams.each { key, list ->
    println "${list.size()} ${list[0]}: $list"
}

def wordToCheck = showInputDialog "Enter a word to check for anagrams"
def key = wordToCheck.toLowerCase().toList().sort().join()

if (anagrams.containsKey(key)) {
    println "Anagrams for $wordToCheck: ${anagrams[key]}"
} else {
    println "No anagrams found for $wordToCheck"
}

// anagramy z api, w porządku liczby anagramów słowa
// dla podanego słowa w dialogu wypisanie jego anagramów
