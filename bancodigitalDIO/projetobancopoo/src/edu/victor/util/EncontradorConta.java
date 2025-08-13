package edu.victor.util;

import java.util.List;
import edu.victor.modelos.Conta;

public class EncontradorConta {
    public static Conta encontrarConta(List<Conta> contas, int numero){
        for(Conta conta : contas){
            if(conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }
}
