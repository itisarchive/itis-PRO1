# Zadania

## Zad. 1  (3 punkty)

W dialogu wprowadzany jest ciąg liczb. Stworzyć  listę zawierającą ich podwojone wartości. Przedstawić możliwie najkrótszy kod realizujący to zadanie.

Pomoc: zastosuj spread-dot i collect.


## Zad. 2 (3 punkty)

Wypisać listę liczb posortowanych w porządku rosnącym. Z listy wejściowej  utworzyć oddzielną listę liczb mniejszych od zera.

Pomoc: zastosuj  sort i findAll


## Zad. 3 (5 punktów)

Posortuj listę liczb w porządku malejącym.
1. napisz własny komparator
2. zajrzyj do klasy Collections i zobacz czy nie ma tam cos ciekawego nt. odwrotnego porządku sortowania



## Zad. 4 (5 punktow)

Utwórz posortowany zbiór słów z pliku. Słowa mają być uporządkowane według ich długości, jeśli długość jest taka sama należy zastosować porządek alfabetyczny.

Pomoc:  
uzyj TreeSet z włąsciwie zdefiniowanym komparatorem


## Zad. 5 (5 punktów)

Policz liczbę wystąpień poszczególnych słów w pliku.  
Wypisz słowa alfabetycznie wraz z informacją o liczbie wystąpień każdego słowa  
Uwagi:  
1. co to są słowa? - uwzględnić znaki interpunkcji (+1 p.)
2. co to jest alfabetycznie? - uwzględnić porządek alfabetyczny dla danego języka (+2 p.)

Pomoc:  
uzyj TreeMap  
tokenize(sep) pozwala podać zestaw separatorów  
komparator alfabetyczny dla danego języka uzsykujemy przez: Collator.getInstance(new Locale(kod_języka))


## Zad. 6 (10 punktów)

Na liście słów z http://www.puzzlers.org/pub/wordlists/unixdict.txt znaleźć wszystkie anagramy.
1. wypisać je dla wszystkich słów w porządku liczby  anagramów danego słowa
2. dla słowa podanego w dialogu wypisać anagramy w porządku alfabetycznym.

Uwaga: lista słów jest tylko angielska.

Pomoc:  
wczytywanie calego tekstu z URL:  
def txt = new URL(... adres ...).text  
lista wierszy:  
def llist = new URL(... adres ...).readLines()  

anagramy = słowa składające się z tych samych znaków
