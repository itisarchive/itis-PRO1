package LABO04

def list1 = ['a', 'b', 'c']
def list2 = [1, 8, 23]

list1.each { print it + " " }
println ""
list2.each { print it + " " }
println ""

def list11 = []
def list12 = []

list1.each { list11 << (it * 2) }
list2.each { list12 << (it * 2) }

list11.each { print it + " " }
println ""
list12.each { print it + " " }
println ""

// wypisanie elementów listy i podwojenie elementów w liście za pomocą each
