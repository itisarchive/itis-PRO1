package LABO02

import static javax.swing.JOptionPane.showInputDialog

List getInts() {
    def input = showInputDialog "Wprowadź ciąg liczb całkowitych (oddzielonych spacją):"
    while (!input || !input.tokenize().every { it.isInteger() })
        input = showInputDialog(null, "Proszę poprawnie wprowadzić ciąg liczb całkowitych!", input)
    input.tokenize()*.toInteger()
}

println getInts()

// szereg integerów z dialogu do listy
