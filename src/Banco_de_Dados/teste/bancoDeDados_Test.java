package Banco_de_Dados.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import Banco_de_Dados.model.cidade;

import org.junit.Test;

import Banco_de_Dados.cidadeService;
import Banco_de_Dados.conexao;

public class bancoDeDados_Test {

    @Test
    public void conexaoTest() {
        assertNotNull(conexao.conectaMySql());
    }

    /*  @Test
    public void insereCidadeTest(){
        cidade c = new cidade(0, "Laguna", "SC");
        assertEquals(1, cidadeService.insereCidade(c));
    }
    */

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
    public void listaCidadeTest(){
        ArrayList<cidade> lista = cidadeService.listAll();
        for(cidade c: lista){
            System.out.println(c);
        }
    }
}
