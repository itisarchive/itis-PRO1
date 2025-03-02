# Zadania


## Zad. 1

Dla poniższych definicji list:

```
def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]
```

za pomocą metody each(Closure)
1. wypisać wszystkie elementy (2 p.),
2. stworzyć nowe listy list11 i list12 zawierające podwojone wartości list oryginalnych (3 p.).


## Zad. 2

Firma software'owa prowadzi projekty w:  
Groovy, Grails, Java, JEE  
Do każdego projektu przypisani są programiści, co pokazuje poniższa mapa:  

```
def pmap = [ Groovy: [ 'Asia', 'Jan' ],
                     Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
                     Java: [ 'Asia', 'Stefan', 'Mirek' ],
                     JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
                   ]
```

Wypisać:
1. ile osób pracuje w każdym z projektów  (3 p)
2. projekty, które mają więcej niż dwóch programistów (3p )
3. w jakich projektach biorą udzial poszczególni programisci (6 p.)


## Zad. 3 (Regex) - 8 p.

Daty w tekście maja postać YYYY-MM-DD (rok- miesiac- dzien). Wypisać wszystkie poprawne daty.  
czyli: po wyróznieniu wszytskicgh fragmentów, które mogą być datami sprawdizc ich poprawnośc (np. czy właściwa jest liczba dni w miesiącu)


## Zad. 4 (Regex) - 8 p.

1. Napisać wyrażenie regularne, za pomoca którego mozna odnaleźć w tekście dowolne liczby rzeczywiste.
2. Zastosować je do przetwarzania tekstu zawierającego (posród innych) napisy w postaci liczba PLN, w taki sposób, aby zamienić te fragmenty na liczba EUR (po aktualnym kursie)
