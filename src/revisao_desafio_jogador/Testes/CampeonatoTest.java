package revisao_desafio_jogador.Testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import revisao_desafio_jogador.Campeonato;
import revisao_desafio_jogador.Jogador;
import revisao_desafio_jogador.Time;

public class CampeonatoTest {

	
    ArrayList<Time> times;
    
    @Before
    public void inicializa() {
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Jogador ("N1", 1, 1));
        jogadores.add(new Jogador ("N2", 2, 2));
        jogadores.add(new Jogador ("N3", 3, 3));
        jogadores.add(new Jogador ("N4", 4, 4));
        jogadores.add(new Jogador ("N5", 5, 5));
        Time t1 = new Time("Time 1 ", jogadores);
        ArrayList<Jogador> jogadores2 = new ArrayList<Jogador>();
        jogadores2.add(new Jogador ("N6", 6, 6));
        jogadores2.add(new Jogador ("N7", 7, 7));
        jogadores2.add(new Jogador ("N8", 8, 8));
        jogadores2.add(new Jogador ("N9", 9, 9));
        jogadores2.add(new Jogador ("N10", 10, 10));
        Time t2 = new Time("Time 2 ", jogadores2);
        ArrayList<Jogador> jogadores3 = new ArrayList<Jogador>();
        jogadores3.add(new Jogador ("Nxx", 99, 0));
        jogadores3.add(new Jogador ("Nyy", 99, 0));
        Time t3 = new Time("Time 3", jogadores3);
        times = new ArrayList<Time>();
        times.add(t1);
        times.add(t2);
        times.add(t3);
        }
    @Test
    public void timeMaisGolstest() {
        Time timemaisGols = Campeonato.timeComMaisGols(times);
        assertEquals("Time 2  (5)", timemaisGols.toString());
        
        
    }
    @Test
     public void artilheiroCampeonatoGolsTest(){
        Jogador artilheiro = Campeonato.artilheiroJogadorCampeonato(times);
        
        assertEquals("Jogador [nome=N10, camisa=10, gols=10]" , artilheiro.toString());
    }
}