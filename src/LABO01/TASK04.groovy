package LABO01

nums = [
    0 : "zero",
    1 : "jeden",
    2 : "dwa",
    3 : "trzy",
    4 : "cztery",
    5 : "pięć",
    6 : "sześć",
    7 : "siedem",
    8 : "osiem",
    9 : "dziewięć"
]

def numToText = { num ->
    def result = ""
    num.toString().each {
        result += nums[it.toInteger()] + " - "
    }
    return result[0..-4]
}

println numToText(147)