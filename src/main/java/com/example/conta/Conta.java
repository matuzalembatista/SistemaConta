package com.example.conta;
public abstract class Conta {
    private Agencia agencia;
    private String numeroConta;
    protected double saldo;

    protected Conta(Agencia agencia, String numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void deposito(double valor) throws ContaException {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new ContaException("Valor inválido para depósito " + valor);
        }
    }

    public void saque(double valor) throws ContaException {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                throw new ContaException(this.getNumeroConta(), "sem saldo suficiente: " + this.saldo);
            }
        } else {
            throw new ContaException(this.getNumeroConta(), "Valor inválido para saque: " + valor);
        }
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void cobrancaDeTarifa() {
      
    }
}
