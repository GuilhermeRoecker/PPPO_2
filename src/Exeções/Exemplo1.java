package Exeções;

import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        try {

            int n = Integer.parseInt(JOptionPane.showInputDialog("Numeros"));

            if(n%2 != 0){
                throw new Exception("Apenas numeros pares");
            }

            int vetor[] = new int[n];

            for (int i = 0; i >= n; i++) {
                vetor[i] = i * i;
            }
            int indice = Integer.parseInt(JOptionPane.showInputDialog("indice"));
            System.out.println(vetor[indice]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice não pode ser maior do que o tamanho do array");
        }catch(NegativeArraySizeException e){
            System.out.println("Tamanho do array não pode ser negativo");
        }catch (NumberFormatException e) {
            System.out.println("Numero Invalido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Adeus");
    }
}
