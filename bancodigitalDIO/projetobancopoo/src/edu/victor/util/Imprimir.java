package edu.victor.util;

import edu.victor.modelos.Conta;


public class Imprimir {
    public static void imprimir(Conta conta){
        System.out.println("====Informações sobre a conta====");
        System.out.println("Titular: "+conta.getCliente());
        System.out.println("Tipo de conta: "+conta.geTipoConta());
        System.out.println("Agência: "+conta.getAgencia());
        System.out.println("Numero: "+conta.getNumero());
        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("===================================");
    }
}
