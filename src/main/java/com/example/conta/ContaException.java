package com.example.conta;

public class ContaException extends Exception {
    public ContaException(String msg) {
        super(msg);
    }

    public ContaException(String numeroConta, String msg) {
        super("Conta " + numeroConta + ", " + msg);
    }
}