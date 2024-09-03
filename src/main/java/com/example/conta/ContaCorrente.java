package com.example.conta;

public class ContaCorrente extends Conta {

    private double tarifa = 25.0;
 
    public ContaCorrente(Agencia agencia, String numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
    }
 
    @Override
    public void cobrancaDeTarifa() {
        this.saldo -= tarifa;
    }
 }