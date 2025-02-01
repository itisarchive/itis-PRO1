package LABO02

import static javax.swing.JOptionPane.showInputDialog

getData(Integer) { it > 0 }             // liczby całkowite większe od 0
println getData() { it.size() > 3 }     // słowa o długości większej od 3 (domyślny typ: String)
println getData()                       // dowolne napisy (słowa)
println getData(BigDecimal)             // dowolne liczby

List getData(def type = String, def check = { true }) {
    if (!(type instanceof Class)) {
        check = type
        type = String
    } // albo przeciążenie funkcji
    def input = showInputDialog "Wprowadź dane"
    while (true) {
        try {
            if (!input) throw new Exception()
            def values = input.tokenize().collect { it.asType(type) }
            if (!values.every(check)) throw new Exception()
            return values
        } catch (ignored) {
            input = showInputDialog(null, "Proszę poprawnie wprowadzić dane!", input)
        }
    }
}

// szereg zadanych obiektów spełniających zadany warunek jako lista
