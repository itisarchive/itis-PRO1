package LABO01

def nums = [
        "0": "zero",
        "1": "jeden",
        "2": "dwa",
        "3": "trzy",
        "4": "cztery",
        "5": "pięć",
        "6": "sześć",
        "7": "siedem",
        "8": "osiem",
        "9": "dziewięć"
]

def numToText = { num ->
    num.toString().collect { digit -> nums[digit] }.join(" - ")
}

println numToText(147)

// liczby na słowne odpowiedniki
