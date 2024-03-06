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

public class conta_corrente {
    private int numeroConta;
    private double saldo;

    
    public conta_corrente() {
        this.numeroConta = 99999999;
        this.saldo = 0;
    }

    public conta_corrente(int numeroConta, int saldo) {
        super();
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void deposito(){
        double valorDeposito =-1;
        if(valorDeposito >= 0){
            saldo += valorDeposito;
                    }
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "O nuumero da conta é " + numeroConta + ", saldo = R$" + saldo;
    }
}
