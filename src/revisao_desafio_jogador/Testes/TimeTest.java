package revisao_desafio_jogador.Testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import revisao_desafio_jogador.Jogador;
import revisao_desafio_jogador.Time;

public class TimeTest {
	
	Time t1;
	Time t2;
	@Before
	public void inicialização() {
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new Jogador ("N1", 1, 1));
		jogadores.add(new Jogador ("N2", 2, 2));
		jogadores.add(new Jogador ("N3", 3, 3));
		jogadores.add(new Jogador ("N4", 4, 4));
		jogadores.add(new Jogador ("N5", 5, 5));

		t1 = new Time("Time 1 ", jogadores);
		t2 = new Time();
	}
	
	
	@Test
	public void listaJogadoresTest() {
		String retorno = t1.listaJogadores();
		assertEquals("Jogador [nome=N1, camisa=1, gols=1]\n" +
				"Jogador [nome=N2, camisa=2, gols=2]\n" +
				"Jogador [nome=N3, camisa=3, gols=3]\n" +
				"Jogador [nome=N4, camisa=4, gols=4]\n" +
				"Jogador [nome=N5, camisa=5, gols=5]\n"
				, t1.listaJogadores());
		assertEquals("" , t2.listaJogadores());
		}
	@Test
	public void toStringTest() {
		assertEquals(" (0)", t2.toString());
		assertEquals("Time 1  (5)", t1.toString());
	}
	
	@Test
	public void artilheiroTest() {
		assertEquals("Jogador [nome=N5, camisa=5, gols=5]", t1.artilheiroTime().toString());
		assertEquals("Jogador [nome=, camisa=999, gols=-1]", t2.artilheiroTime().toString());
		
	}
	
	@Test 
	public void qtGolsTest() {
		assertEquals(15, t1.qtGolsTime());
		assertEquals(0, t2.qtGolsTime());
	}
}
