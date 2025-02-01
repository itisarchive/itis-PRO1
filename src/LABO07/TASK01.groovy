package LABO07

import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.*

new SwingBuilder().edt {
    lookAndFeel 'javax.swing.plaf.nimbus.NimbusLookAndFeel'

    actions {
        action(id: 'font', name: 'Zmień czcionkę', closure: {
            def fonts = GraphicsEnvironment.localGraphicsEnvironment.allFonts*.name
            def selectedFont = JOptionPane.showInputDialog(
                    null,
                    'Wybierz czcionkę',
                    'Zmiana czcionki',
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    fonts as Object[],
                    e.font.name
            )
            if (selectedFont) e.font = new Font(selectedFont, e.font.style, e.font.size)
        })
        action(id: 'size', name: 'Zmień rozmiar czcionki', closure: {
            def newSize = JOptionPane.showInputDialog(
                    null,
                    'Podaj rozmiar czcionki',
                    e.font.size.toString()
            )?.toInteger()
            if (newSize) e.font = e.font.deriveFont(newSize as float)
        })
        action(id: 'color', name: 'Zmień kolor czcionki', closure: {
            def newColor = JColorChooser.showDialog(null, 'Wybierz kolor czcionki', e.foreground)
            if (newColor) e.foreground = newColor
        })
        action(id: 'bg', name: 'Zmień kolor tła', closure: {
            def newBg = JColorChooser.showDialog(null, 'Wybierz kolor tła', e.background)
            if (newBg) e.background = newBg
        })
    }

    frame(title: 'Prosty edytor',
            pack: true,
            size: [400, 300],
            locationRelativeTo: null,
            visible: true,
            defaultCloseOperation: JFrame.EXIT_ON_CLOSE) {
        menuBar {
            menu('Formatowanie') {
                menuItem(font)
                menuItem(size)
                menuItem(color)
                menuItem(bg)
            }
        }
        scrollPane {
            textArea(id: 'e', rows: 15, columns: 40)
        }
    }
}

// prosty edytor tekstowy
