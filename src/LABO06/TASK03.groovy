package LABO06

def comparator = { a, b -> a > b ? -1 : a < b ? 1 : 0 }
def list = [1, 8, 23, 4, 5, 6, 7, 8, 9, 10]
list.sort(comparator).each { print it + " " }
println ""
list = [1, 8, 23, 4, 5, 6, 7, 8, 9, 10]
list.sort(Collections.reverseOrder())
list.each { print it + " " }

// sortowanie malejące własnym komparatorem
// odwrócony porządek sortowania z klasy Collections
