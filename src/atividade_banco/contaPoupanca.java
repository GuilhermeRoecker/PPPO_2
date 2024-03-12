package atividade_banco;

import java.time.LocalDate;

public class contaPoupanca extends contaBancaria {
    
    private int qtSaqueMes;
    private int mesAtual;

    public contaPoupanca(int numeroConta,double saldo ){
        super();
        qtSaqueMes = 5;
        mesAtual = LocalDate.now().getMonthValue();
    }

    @Override
    public boolean saque(double valor){
        LocalDate hoje = LocalDate.now();
            if(hoje.getMonthValue() != mesAtual){
                qtSaqueMes = 0;
        if(valor <= getSaldo() && getQtSaqueMes() <=5 && getQtSaqueMes() > 0){
            setSaldo(getSaldo() - valor);
            qtSaqueMes -=1;
            return true;
        }
    }
            return false;
}

    @Override
    public String toString() {
        return super.toString();
    }

    public int getQtSaqueMes() {
        return qtSaqueMes;
    }

    public void setQtSaqueMes(int qtSaqueMes) {
        this.qtSaqueMes = qtSaqueMes;
    }
}
