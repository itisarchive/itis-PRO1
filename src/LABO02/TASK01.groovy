package LABO02

def maximum(list) {
    def maxVal = list.max()
    def indices = []
    list.eachWithIndex { element, index ->
        if (element == maxVal) indices << index
    }
    [maxVal, indices]
}

(maxVal, indList) = maximum([5, 3, 5, 5, 1, 5])
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"

// znalezienie maksimum i jego indeksów w liście, z eachWithIndex
