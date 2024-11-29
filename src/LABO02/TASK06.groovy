package LABO02

def memo_calls = [:].withDefault { 0 }
def calls = 0

knapsack = { items, capacity, index ->
    memo_calls[["items": items, "capacity": capacity, "index": index]]++
    calls++
    if (index >= items.size() || capacity <= 0) {
        return 0
    }
    def (weight, value) = items[index]
    if (weight > capacity) {
        return knapsack(items, capacity, index + 1)
    } else {
        def include = value + knapsack(items, capacity - weight, index + 1)
        def exclude = knapsack(items, capacity, index + 1)
        return Math.max(include, exclude)
    }
}

test = { func, items, capacity, index ->
    calls = 0
    memo_calls = [:].withDefault { 0 }
    def start = System.currentTimeMillis()
    println "Maksymalna wartość: ${func(items, capacity, index)}"
    println "Czas wykonania: ${System.currentTimeMillis() - start} ms"
    println "Liczba wywołań: $calls"
    println "Liczniki wywołań dla unikatowych argumentów:"
    memo_calls.values().each { print it + " " }
    println ""
}

def items = [[1, 1], [2, 6], [3, 18], [4, 22], [5, 28], [6, 40], [7, 60], [8, 75], [9, 90], [10, 100]]
def capacity = 15

println "===== PURE KNAPSACK ====="
test(knapsack, items, capacity, 0)

knapsack = knapsack.trampoline()

println "===== TRAMPOLINE ====="
test(knapsack, items, capacity, 0)

knapsack = knapsack.memoize()

println "===== TRAMPOLINE + MEMOIZATION ====="
test(knapsack.memoize(), items, capacity, 0)