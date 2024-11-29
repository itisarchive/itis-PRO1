package LABO01

import static javax.swing.JOptionPane.showInputDialog


def inputs = []

while (true) {
    def input = showInputDialog("Wprowadź dane w formie: pozycja = koszt")
    if (input == null || input == "") {
        break
    }
    inputs << input
}

costs = [:].withDefault { 0 }
inputs.each {
    def parts = it.split(" = ")
    def position = parts[0]
    def cost = parts[1] as Integer
    costs[position] += cost
}

println costs