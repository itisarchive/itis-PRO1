package LABO07

import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.*

new SwingBuilder().edt {
    lookAndFeel 'javax.swing.plaf.nimbus.NimbusLookAndFeel'
    def layouts = ['BorderLayout', 'BoxLayout', 'FlowLayout', 'GridLayout', 'GridBagLayout']
    def sel = JOptionPane.showInputDialog(null,
            'Wybierz menedżera rozkładu:',
            'Wybór layoutu',
            JOptionPane.PLAIN_MESSAGE,
            null,
            layouts as Object[],
            layouts[0])
    if (!sel) {
        println 'Nie wybrano layoutu, aplikacja zostanie zamknięta.'
        System.exit(0)
    }
    frame(title: "Różne menedżery rozkładu - $sel",
            size: [640, 480],
            locationRelativeTo: null,
            visible: true,
            defaultCloseOperation: JFrame.EXIT_ON_CLOSE) {
        switch (sel) {
            case 'BorderLayout':
                borderLayout()
                button(text: 'Przycisk 1', constraints: BorderLayout.NORTH)
                button(text: 'Przycisk 2', constraints: BorderLayout.SOUTH)
                button(text: 'Przycisk 3', constraints: BorderLayout.WEST)
                button(text: 'Przycisk 4', constraints: BorderLayout.EAST)
                button(text: 'Przycisk 5', constraints: BorderLayout.CENTER)
                break
            case 'BoxLayout':
                boxLayout(axis: BoxLayout.Y_AXIS)
                5.times { button(text: "Przycisk ${it + 1}", alignmentX: Component.CENTER_ALIGNMENT) }
                break
            case 'FlowLayout':
                flowLayout(alignment: FlowLayout.CENTER)
                5.times { button(text: "Przycisk ${it + 1}") }
                break
            case 'GridLayout':
                gridLayout(rows: 2, columns: 3)
                5.times { button(text: "Przycisk ${it + 1}") }
                break
            case 'GridBagLayout':
                gridBagLayout()
                5.times {
                    button(text: "Przycisk ${it + 1}",
                            constraints: gbc(gridx: it % 2, gridy: (it / 2).toInteger(), weightx: 1, weighty: 1, fill: GridBagConstraints.BOTH))
                }
                break
        }
    }
}

// prezentacja zarządców rozkładu
