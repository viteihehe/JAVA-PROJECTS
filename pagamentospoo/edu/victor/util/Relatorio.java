package edu.victor.util;


import edu.victor.models.Funcionario;
import edu.victor.models.Estagiario;

public class Relatorio {
  public static void relatorio(Funcionario funcionario){
         System.out.println("--------------------------");
        System.out.println("Relatorio:");
        double salario = funcionario.salario();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Cargo: "+funcionario.getCargo());
        if(!(funcionario instanceof Estagiario)){
            System.out.println("Função: "+funcionario.getFuncao());
            System.out.println("Salario: "+salario);
        }else{
            System.out.println("Salario: "+salario);
        }
        System.out.println("--------------------------");
  }
}