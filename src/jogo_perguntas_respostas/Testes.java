package jogo_perguntas_respostas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testes {

    private Arquivo jogo = new Arquivo();

    @Test
    public void carregaArquivoTest(){
        jogo.lerArquivo();
        assertEquals(50, jogo.getPerguntas().size());
        Pergunta quarta = jogo.getPerguntas().get(3);
        assertEquals("A água ferve a 90 graus Celsius ao nível do mar", quarta.getTitulo());
        assertEquals(false, quarta.isRespostaCorreta());
    }

    @Test
    public void fazCorrecao(){
        Pergunta pergunta = new Pergunta("ABC e igual a FGH, falso");
        Resposta r = new Resposta(pergunta, true);
        assertEquals("erro", r.correcao());
    }
}
