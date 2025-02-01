package LABO05

def directory = /C:\Workspace\IdeaProjects\PRO1/

def listHtmlFiles = { directoryPath ->
    def index = 1
    new File(directoryPath).eachFileRecurse { file ->
        if (file.isFile() && file.name.endsWith(".html")) {
            println "${index++} ${file.absolutePath}"
        }
    }
}

listHtmlFiles(directory)

// wylistowanie plików html z podanego katalogu rekurencyjnie
