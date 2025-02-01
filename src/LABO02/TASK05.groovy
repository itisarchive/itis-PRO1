package LABO02

def list = (1..40)

eachTuple(list) { e1, e2, e3, e4 ->
    println "$e1 $e2 $e3 $e4"
}

def s = 'asia ma kota i psa'

def out = new StringBuffer()
eachTuple(s) { a,b ->
    out << b << a
}
println out

def eachTuple(iterable, Closure closure) {
    def tupleSize = closure.maximumNumberOfParameters
    def tuple = []
    iterable.each { element ->
        tuple << element
        if (tuple.size() == tupleSize) {
            closure(*tuple)
            tuple.clear()
        }
    }
}

// działanie closure na kolejnych n elementach iterable
