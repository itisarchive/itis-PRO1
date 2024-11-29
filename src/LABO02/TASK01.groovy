package LABO02

def maximum(list) {
    list.max()
    def indices = list.indices.findAll { list[it] == list.max() }
    return [list.max(), indices]
}

(maxVal, indList) = maximum([5, 3, 5, 5, 1, 5])
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"