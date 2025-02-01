package LABO05

def loadFileContent(filename) {
    new File(filename).readLines()
}

def saveFileContent(filename, content) {
    new File(filename).withWriter { writer ->
        content.each { writer.writeLine(it) }
    }
}

def data = loadFileContent("Projekty.txt").collectEntries() {
    def tokens = it.split("\t")
    def projekt = tokens[0]
    def osoby = tokens[1..-1]
    [projekt, osoby]
}

data.findAll { it.value.size() > 3 }
        .keySet()
        .with { saveFileContent("ProjektyDuze.txt", it as List) }

def programmers = [:].withDefault { [] }
data.each { project, persons ->
    persons.each { person ->
        programmers[person] << project
    }
}

programmers.collect { osoba, projects ->
    "${osoba}\t${projects.join('\t')}"
}.with { saveFileContent("Programisci.txt", it) }

// wyciągnięnie z Projekty.txt danych wg formatu i eksport do ProjektyDuze.txt i Programisci.txt
