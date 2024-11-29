package LABO03

String reverseWords(String s) {
    s.split(/\s/).collect { it.reverse() }.join(" ")
}

def s = "Ala ma kota i psa"
println reverseWords(s)