package LABO04

def pmap = [
        Groovy: ['Asia', 'Jan'],
        Grails: ['Asia', 'Jan', 'Stefan', 'Mirek'],
        Java  : ['Asia', 'Stefan', 'Mirek'],
        JEE   : ['Slawek', 'Stefan', 'Janusz']
]

pmap.each { project, programmers ->
    println "W projekcie $project jest ${programmers.size()} osob"
}

println ""

def threshold = 2
println "Projekty, w których jest więcej niż $threshold osob: "
pmap.findAll { project, programmers -> programmers.size() > threshold }
        .keySet()
        .each { print it + " " }
println "\n"

def projectsByProgrammer = [:].withDefault { [] }
pmap.each { project, programmers ->
    programmers.each { projectsByProgrammer[it] << project
    }
}
projectsByProgrammer.each { person, projects ->
    println "$person: $projects"
}

// ile osób pracuje w każdym projekcie
// projekty z >2 programistami
// mapa programista -> projekty
