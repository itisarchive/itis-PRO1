package LABO01

import static javax.swing.JOptionPane.showInputDialog

def inputs = []
while (true) {
    def input = showInputDialog "Wprowadź dane w formie: pozycja = koszt"
    if (!input) break
    inputs << input
}

def costs = [:].withDefault { 0 }
inputs.each {
    def (position, costStr) = it.split(' = ')
    costs[position] += costStr.toInteger()
}

println costs

// suma napisów pozycja = koszt z dialogów
