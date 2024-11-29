package LABO07

import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.*

def colors = [Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLACK, Color.WHITE]
def colorIndex = 0

new SwingBuilder().edt {
    lookAndFeel('javax.swing.plaf.nimbus.NimbusLookAndFeel')

    frame(
            title: 'Zmiana kolorów przycisku',
            size: [320, 240],
            locationRelativeTo: null,
            visible: true,
            defaultCloseOperation: JFrame.EXIT_ON_CLOSE
    ) {
        gridBagLayout()
        button(
                text: 'Kliknij mnie!',
                preferredSize: [150, 50],
                constraints: gbc(weightx: 0, weighty: 0, gridx: 0, gridy: 0, anchor: GridBagConstraints.CENTER),
                actionPerformed: {
                    it.source.background = colors[colorIndex]
                    colorIndex = (colorIndex + 1) % colors.size()
                }
        )
    }
}
