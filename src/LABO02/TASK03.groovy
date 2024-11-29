package LABO02

List apply(List l, Closure c) {
    l.collect(c)
}

def l = [1, 2, 3, 4, 5]
def c = { it * it }
println apply(l, c)
def l2 = ['a', 'b', 'c']
def c2 = { it.toUpperCase() }
println apply(l2, c2)
def l3 = [1, 2, 3, 4, 5]
def c3 = { it.toString() + "!" }
println apply(l3, c3)