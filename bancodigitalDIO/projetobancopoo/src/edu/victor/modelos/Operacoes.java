package edu.victor.modelos;

import javax.naming.directory.InvalidAttributesException;

public interface Operacoes {
    void sacar(double valor) throws InvalidAttributesException;
    void depositar(double valor) throws InvalidAttributesException;
    void tranferir(double valor, Conta conta) throws InvalidAttributesException;
}
