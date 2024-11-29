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

def eachTuple(iterable, closure) {
    def arg_count = closure.maximumNumberOfParameters
    def args = new Object[arg_count]
    def i = 0
    def it = iterable.iterator()
    while (it.hasNext()) {
        args[i++] = it.next()
        if (i == arg_count) {
            closure(*args)
            i = 0
        }
    }
}