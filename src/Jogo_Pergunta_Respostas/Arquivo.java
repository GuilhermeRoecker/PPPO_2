package Jogo_Pergunta_Respostas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Arquivo {


    
    //contaLinhas
    private int totalPerguntas = 0;


        public void contarLinhas(){
        try {
            FileReader fr = new FileReader("perguntas.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int qtLinhas = 0;
            while((linha = br.readLine()) != null){
                qtLinhas += 1;   
            }

            fr.close();
            br.close();

            setTotalPerguntas(qtLinhas);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Mostrar Pergunta
    public static void mostarPerguntas(){
        try {

            FileReader fr = new FileReader("perguntas");
            BufferedReader br = new BufferedReader(fr);

            String linha = "";


            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Arraylist <Perguntas>
    private ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

    int qtLinha = getTotalPerguntas();

    do{
        
    }while()
    
    //Path



    //Carregar arqivo
    //Sortear pergunta
    //Conferir


    public int getTotalPerguntas() {
        return this.totalPerguntas;
    }

    public void setTotalPerguntas(int totalPerguntas) {
        this.totalPerguntas = totalPerguntas;
    }




}
