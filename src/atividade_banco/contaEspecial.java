package atividade_banco;


public class contaEspecial extends contaBancaria {

    private double limite;

    //Metodos
    @Override
    public boolean saque(double valor){
        if(valor <= getSaldo() + getLimite()){
            setSaldo(getSaldo() - valor);
            return true;
        } return false;
    }

    //Construtores
    public contaEspecial(int numeroConta , double saldo, double limite){
        super(numeroConta, saldo);
        setLimite(limite);
        }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
