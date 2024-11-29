package LABO04

def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]

list1.each { print it + " " }
println ""
list2.each { print it + " " }

def list11 = list1.collect { it * 2 }
def list22 = list2.collect { it + 1 }

println ""
list11.each { print it + " " }
println ""
list22.each { print it + " " }