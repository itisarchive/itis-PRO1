package LABO02


import static javax.swing.JOptionPane.showInputDialog

List getInts() {
    def ints = []
    while (true) {
        String input = showInputDialog("Wprowadź liczbę całkowitą")
        if (input == null || input == "") {
            break
        }
        while (!input.isInteger()) {
            input = showInputDialog(null, "Proszę poprawnie wprowadzić liczbę całkowitą!", input)
        }
        ints << input.toInteger()
    }
    return ints
}

println getInts()