package LABO06

def inputList = [-9, 0, 1, -5, 4, 3, 2, 1, 0, -3, 5, 6, 7, 8]

def sortedList = inputList.sort()
println sortedList.join(" ")

def outputList = sortedList.findAll() { it < 0 }
println outputList.join(" ")

// lista liczb posortowanych w porządku rosnącym
// z listy wejściowej utworzyć oddzielną listę liczb mniejszych od zera
