package LABO06

import static javax.swing.JOptionPane.showInputDialog

showInputDialog("Wprowadź ciąg liczb (oddzielone spacją):")?.split(" ")*.toInteger().collect { it * 2 }.each { print it + " " }
