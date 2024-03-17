package atividade_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

private List<contaBancaria> contas;

	public Banco() {
		contas = new ArrayList<>();
	}

	public void adicionarConta(contaBancaria conta) {
		contas.add(conta);
	}

	public List<contaBancaria> getContas() {
		return contas;
	}

}
