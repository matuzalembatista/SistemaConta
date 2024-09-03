package com.example.conta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
        Agencia caixaLuizote = new Agencia("0205-08");
        Conta contaCorrente = new ContaCorrente(caixaLuizote, "1164-9", 500d, 1000);
        Conta contaPoupanca = new ContaPoupanca(caixaLuizote, "1324-9", 700d);
        Conta contaSalario = new ContaSalario(caixaLuizote, "1548-7", 1500d);

        caixaLuizote.addConta(contaPoupanca);
        caixaLuizote.addConta(contaCorrente);
        caixaLuizote.addConta(contaSalario);

        try {
            caixaLuizote.saque("1164-9", 1200);
            caixaLuizote.saque("1324-9", 1000);
            caixaLuizote.saque("1548-7", 500);

        } catch (ContaException e) {
            logger.error("Erro durante o saque: {}", e.getMessage());
        }

        caixaLuizote.cobrancaDeTarifas(); // código para chamar cobrança de tarifas para contas correntes

        logger.info("Saldo Conta Corrente ({}): {}", contaCorrente.getNumeroConta(), contaCorrente.getSaldo());
        logger.info("Saldo Conta Poupança ({}): {}", contaPoupanca.getNumeroConta(), contaPoupanca.getSaldo());
        logger.info("Saldo Conta Salário ({}): {}", contaSalario.getNumeroConta(), contaSalario.getSaldo());

    }
}
