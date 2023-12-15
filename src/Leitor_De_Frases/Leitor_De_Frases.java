package Leitor_De_Frases;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Leitor_De_Frases {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        for (int i = 1; i <= 2; i++) {

            String frase = JOptionPane.showInputDialog("Digite uma Frase:");
            JOptionPane.showMessageDialog(frame, frase);

        }

    }

}
