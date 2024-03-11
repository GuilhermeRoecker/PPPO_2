package atividade_banco;

/*
Você foi designado para desenvolver um sistema bancário simples para gerenciar diferentes tipos de contas.
Requisitos:
Defina uma classe ContaBancaria com os seguintes atributos:
numeroConta: um identificador único para cada conta.
saldo: o saldo disponível na conta.
Crie uma classe Banco que será responsável por gerenciar as contas bancárias. Esta classe deve conter uma lista de
contas disponíveis.
Implemente os métodos de operação bancária na classe ContaBancaria:
deposito(valor): adiciona um valor ao saldo da conta.
saque(valor): subtrai um valor do saldo da conta.
transferencia(contaDestino, valor): transfere um valor de uma conta para outra.
Conta Corrente: Essa conta permite saques ilimitados, desde que o saldo seja suficiente.
Conta especial: Possui um limite, de modo que os saques podem ser feitos de acordo com o limite disponível.
Conta Poupança: Conta destinada a economias, com foco em rendimentos. Permite depósitos e saques, porém com
limitações (LIMITE DE 5 SAQUES POR MÊS).
 */

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
            } else return false;
        }

        public boolean transferencia(contaBancaria contaDestino, double valor){
            if(valor <= getSaldo()){
                setSaldo( getSaldo() - valor);
                contaDestino.deposito(valor);
                return true;
            } return false;
        }

        //Constutor Vazio
        public contaBancaria(){
            setNumeroConta(0000);
            setSaldo(0);;
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
            return "O nuumero da conta é " + numeroConta + ", saldo = R$" + saldo;
        }

}
