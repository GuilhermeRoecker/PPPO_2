package atividade_banco.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import atividade_banco.Banco;
import atividade_banco.contaBancaria;
import atividade_banco.contaCorrente;
import atividade_banco.contaEspecial;
import atividade_banco.contaPoupanca;

public class BancoTestArquivo {

    private Banco banco = new Banco();
    	
    @Before
    public void criarContas(){

    
    try{

        FileReader fr = new FileReader("src\\contas.txt");
        BufferedReader br = new BufferedReader(fr);

        String linha = "";

        while((linha  = br.readLine()) != null){
            String contas[] = linha.split(",");

            int numeroConta = Integer.parseInt(contas[1]);
            double saldo = Double.parseDouble(contas[2]);

            if(contas[0].equals("0")){
                banco.adicionarConta(new contaCorrente(numeroConta, saldo));
            }
            if(contas[0].equals("1")){
                banco.adicionarConta(new contaPoupanca(numeroConta, saldo));
            }
            if(contas[0].equals("2")){
                double limite = Double.parseDouble(contas[3]);
                banco.adicionarConta(new contaEspecial(numeroConta, saldo, limite));
            }
        }

        br.close();
        fr.close();
    } catch (Exception e){
        e.printStackTrace();
    }
}

    @Test
    public void depositoTest(){
        List<contaBancaria> contas =  banco.getContas();

        contas.get(0).deposito(200);
        contas.get(1).deposito(200);
        contas.get(2).deposito(200);
        assertEquals("10 - 300.0", contas.get(0).toString());
        assertEquals("20 - 300.0", contas.get(1).toString());
        assertEquals("30 - 300.0", contas.get(2).toString());     
    }

    @Test
    public void saqueContaCorrenteOk(){
        List<contaBancaria> contas = banco.getContas();

        assertTrue(contas.get(0).saque(50));
        assertEquals("10 - 50.0", contas.get(0).toString());
    }

    @Test
    public void saquecContaCorrenteFail(){
        List<contaBancaria> contas = banco.getContas();

        assertFalse(contas.get(0).saque(150));
        assertEquals("10 - 100.0", contas.get(0).toString());
    }

    @Test
    public void saqueContaPoupancaOkTest(){
    List<contaBancaria> contas = banco.getContas();

    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertEquals("20 - 75.0", contas.get(1).toString());
    }

    @Test
    public void saqueContaPoupancaFailTest(){
    List<contaBancaria> contas = banco.getContas();

    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertTrue(contas.get(1).saque(5));
    assertFalse(contas.get(1).saque(5));
    assertEquals("20 - 75.0", contas.get(1).toString());
    }

    @Test
    public void saqueContaPoupancaFail2Test(){
    List<contaBancaria> contas = banco.getContas();

    assertFalse(contas.get(1).saque(500));
    assertEquals("20 - 100.0", contas.get(1).toString());
    }

    @Test
    public void saqueContaEspecialOk(){
        List<contaBancaria> contas =  banco.getContas();

        assertTrue(contas.get(2).saque(600));
        assertEquals("30 - -500.0", contas.get(2).toString());
    }

    @Test
    public void saqueContaEspecialFail(){
        List<contaBancaria> contas=  banco.getContas();

        assertFalse(contas.get(2).saque(700));
        assertEquals("30 - 100.0", contas.get(2).toString());
    }

    @Test
    public void transferenciaTestOk(){
        List <contaBancaria> contas = banco.getContas();

        assertTrue(contas.get(0).transferencia(contas.get(1), 50));
        assertEquals("10 - 50.0", contas.get(0).toString());
        assertEquals("20 - 150.0", contas.get(1).toString());
    }

    @Test
    public void transferenciaTestFail(){
        List <contaBancaria> contas = banco.getContas();

        assertFalse(contas.get(0).transferencia(contas.get(1), 150));
        assertEquals("10 - 100.0", contas.get(0).toString());
        assertEquals("20 - 100.0", contas.get(1).toString());
    }

    @Test
    public void transferenciaDestinoTestFail(){
        List <contaBancaria> contas = banco.getContas();

        assertFalse(contas.get(0).transferencia(null, 150));
        assertEquals("10 - 100.0", contas.get(0).toString());
    }

}
