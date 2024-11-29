package LABO02


import static javax.swing.JOptionPane.showInputDialog

getData(Integer) { it > 0 }            // liczby całkowite większe od 0
println getData() { it.size() > 3 }   // słowa o długości większej od 3 (domyślny typ: String)
println getData()                          // dowolne napisy (słowa)
println getData(BigDecimal)         // dowolne liczby

List getData(def type = String, def check = { true }) {
    if (!(type instanceof Class)) {
        check = type
        type = String
    }
    def ints = []
    while (true) {
        def input = showInputDialog("Wprowadź dane")
        if (input == null || input == "") {
            break
        }
        while (true) {
            try {
                input = input.asType type
                if (!check(input)) throw new Exception()
                break
            } catch (Exception ignored) {
                input = showInputDialog(null, "Proszę poprawnie wprowadzić dane!", input)
            }
        }
        ints << input
    }
    return ints
}