package Banco_de_Dados.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import Banco_de_Dados.model.cidade;
import Banco_de_Dados.model.cliente;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import Banco_de_Dados.cidadeService;
import Banco_de_Dados.clienteService;
import Banco_de_Dados.conexao;

public class bancoDeDados_Test {
    
    @BeforeAll
    public void inicializa(){
        clienteService.limpaTblCliente();
        cidadeService.limapTblCidade();
    }

    @Test
    public void conexaoTest() {
        assertNotNull(conexao.conectaMySql());
    }

    @Test
    public void insereCidadeTest(){
        cidade c = new cidade(0, "Laguna", "SC");
        assertEquals(1, cidadeService.insereCidade(c));
    }

    @Test
    public void listaCidadeTest(){
        ArrayList<cidade> lista = cidadeService.listAll();
        for(cidade c: lista){
            System.out.println(c);
            assertEquals(1,cidadeService.insereCidade(c));
        }
    }

/*
    @Test
    public void alteraCidadeExistente(){
        cidade c = new cidade(5, "Brasilia", "DF");
        assertEquals(1, cidadeService.alteraCidade(c));
    }

    @Test
    public void alteraCidadeInexistente(){
        cidade c = new cidade(25, "Brasilia", "DF");
        assertEquals(0, cidadeService.alteraCidade(c));
    }
    

    @Test
    public void excluiCidadeExistente(){
        cidade c = new cidade(1,"","");
        assertEquals(1, cidadeService.excluiCidade(c));
    }


    @Test
    public void excluiCidadeInexistente(){
        cidade c = new cidade(1,"","");
        assertEquals(0, cidadeService.excluiCidade(c));
    }

    @Test
    public void insereCliente(){
        cliente c = new cliente(0, "A", 11, "M", new cidade(2, "Orleans","SC"));
        assertEquals(1, clienteService.insereCliente(c));
    }

    @Test
    public void alteraClienteExistente(){
        cliente c = new cliente(1, "A", 11, "M", new cidade(3, "São Paulo", "SP"));
        assertEquals(1, clienteService.alteraCidade(c));
    }

    @Test
    public void listaClienteTest(){
        ArrayList<cliente> lista = clienteService.listAll();
        for(cliente c: lista){
            System.out.println(c);
        }
    }
    */

}
