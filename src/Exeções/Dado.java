package Exeções;

import javax.swing.JOptionPane;

public class Dado {
    int numero;

    public void lerNumero(){
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido");
        } System.out.println("Adeus");
    }
}
