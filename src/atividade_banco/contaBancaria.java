package atividade_banco;

public class contaBancaria {

    private int numeroConta;
    private double saldo;

        //Metodos
        public void deposito(double valor){
             setSaldo(getSaldo() + valor);
            
        }

        public boolean saque(double valor){
            if(valor <= getSaldo()){
                setSaldo(getSaldo() - valor);
                return true;
            } 
            return false;
        }
 
        public boolean transferencia(contaBancaria contaDestino, double valor){
            if(valor <= getSaldo()){
                setSaldo( getSaldo() - valor);
                contaDestino.deposito(valor);
                return true;
            } return false;
        }
    
        //Contrutor com paramentro
        public contaBancaria(int numeroConta, double saldo) {
            setNumeroConta(numeroConta);
            setSaldo(saldo);
        }
        
        //Gets and Setters
        public int getNumeroConta() {
            return numeroConta;
        }
        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }
        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    
        //toString
        @Override
        public String toString() {
            return numeroConta + " - " + saldo;
        }

}
