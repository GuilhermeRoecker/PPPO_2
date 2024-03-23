package leitura_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import atividade_banco.contaBancaria;
import atividade_banco.contaCorrente;
import atividade_banco.contaEspecial;
import atividade_banco.contaPoupanca;

public class arquivoContas {
    public static void main(String[] args) {
        ArrayList<contaBancaria> contas = new ArrayList<contaBancaria>();
        try {
            FileReader fr = new FileReader("contas.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linha= "";
            while((linha = br.readLine()) != null){
                //System.out.println(linha);
                String v[] = linha.split(",");
                if(v[0].equals("0")){
                    int nr = Integer.parseInt(v[1]);
                    double saldo = Double.parseDouble(v[2]);
                    contas.add(new contaCorrente(0, 0));

                    if(v[0].equals("0")){
                        contas.add(new contaCorrente(nr, saldo));
                    }
                    if(v[1].equals("1")){
                        contas.add(new contaPoupanca(nr, saldo));
                    }
                    if(v[2].equals("2")){
                        double limite = Double.parseDouble(v[3]);
                        contas.add(new contaEspecial(nr, saldo, limite));
                    }
                }
            }

            br.close();
            fr.close();

            for(contaBancaria c : contas){
                System.out.println(c);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

