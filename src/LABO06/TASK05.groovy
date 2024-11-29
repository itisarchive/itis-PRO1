package LABO06

import java.text.Collator

def text = new File("slowa.txt").text

def collator = Collator.getInstance(Locale.of("pl", "PL"))

text.split(/([^A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]+)/)
        .collect { it.toLowerCase() }
        .groupBy { it }
        .collect { k, v -> [k, v.size()] }
        .sort { a, b -> collator.compare(a[0], b[0]) }
        .each { k, v -> println "$k: $v" }