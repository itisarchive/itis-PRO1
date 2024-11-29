package LABO06

def inputList = [-9, 0, 1, -5, 4, 3, 2, 1, 0, -3, 5, 6, 7, 8]
def outputList = []

inputList.sort().each { print it + " " }.findAll() { it < 0 }.each { outputList << it }
println ""
outputList.each { print it + " " }