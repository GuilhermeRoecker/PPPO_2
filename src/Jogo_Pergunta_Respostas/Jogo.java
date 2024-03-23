package Jogo_Pergunta_Respostas;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        
        String menu = "1 - Sortear e Responder \n" +
                      "2 - Ver Resultados \n\n" +
                      "3 - Sair";

                      int op = 0;
                      

                      do{

                       op= Integer.parseInt(JOptionPane.showInputDialog(menu));
                        if(op ==1);
                        


                    }while(op != 3);
    }
}
