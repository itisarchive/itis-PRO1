package LABO07

import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.*

new SwingBuilder().edt {
    lookAndFeel 'javax.swing.plaf.nimbus.NimbusLookAndFeel'

    def chooser = new JFileChooser()
    chooser.fileSelectionMode = JFileChooser.FILES_AND_DIRECTORIES
    def result = chooser.showOpenDialog null

    if (result != JFileChooser.APPROVE_OPTION) {
        println "Nie wybrano katalogu, program zostanie zamknięty."
        System.exit 0
    }

    def selectedDir = chooser.selectedFile
    def imageFiles = selectedDir.listFiles({ file ->
        file.name.toLowerCase().endsWith('.png') || file.name.toLowerCase().endsWith('.jpg')
    } as FileFilter)

    if (!imageFiles || imageFiles.size() == 0) {
        println "Wybrany katalog nie zawiera plików PNG ani JPG."
        System.exit 0
    }

    def currentIndex = 0
    def updateImage = { label ->
        label.icon = new ImageIcon(imageFiles[currentIndex].absolutePath)
    }

    frame(
            title: "Przeglądarka obrazków",
            size: [800, 600],
            locationRelativeTo: null,
            visible: true,
            pack: true,
            defaultCloseOperation: JFrame.EXIT_ON_CLOSE
    ) {
        borderLayout()
        def imageLabel = label(horizontalAlignment: JLabel.CENTER, constraints: BorderLayout.CENTER)
        updateImage(imageLabel)

        panel(constraints: BorderLayout.SOUTH) {
            button(
                    text: "Next",
                    actionPerformed: {
                        currentIndex = (currentIndex + 1) % imageFiles.size()
                        updateImage(imageLabel)
                    }
            )
        }
    }
}

// galeria zdjęć z folderu
