package LABO04

def pmap = [Groovy: ['Asia', 'Jan'],
            Grails: ['Asia', 'Jan', 'Stefan', 'Mirek'],
            Java  : ['Asia', 'Stefan', 'Mirek'],
            JEE   : ['Slawek', 'Stefan', 'Janusz']]

pmap.each { k, v -> println "W projekcie $k jest ${v.size()} osob" }

def ile = 2
println "Projekty, w których jest więcej niż $ile osob: "
pmap.findAll { k, v -> v.size() > ile }.keySet().each { print it + " " }
println ""

pmap
        .collectMany { project, people -> people.collect { [it, project] } }
        .groupBy { it[0] }
        .collectEntries { person, projects -> [person, projects.collect { it[1] }] }
        .each { person, projects -> println "$person: $projects" }
