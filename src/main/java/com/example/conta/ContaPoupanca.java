package com.example.conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Agencia agencia, String numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
    }

    public void atualizarRendimento(Double taxaRendimento) {
        this.saldo += (this.saldo * taxaRendimento);
    }
}