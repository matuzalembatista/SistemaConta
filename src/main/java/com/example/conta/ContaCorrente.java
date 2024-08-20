package com.example.conta;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;
    private double tarifa = 25.0;
 
    public ContaCorrente(Agencia agencia, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(agencia, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
 
    @Override
    public void cobrancaDeTarifa() {
        this.saldo -= tarifa;
    }
 }