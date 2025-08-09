package edu.victor.app;

import edu.victor.models.Clt;
import edu.victor.models.Estagiario;
import edu.victor.models.Funcionario;
import edu.victor.models.Pj;
import edu.victor.util.Relatorio;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Victor Manuel
 * @version 1.0
 * @since 2023-10-01
 */

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, funcao;
        int cargo, totalFuncionarios = 0;
        boolean conti = true;

        Funcionario[] funcionarios = new Funcionario[50];

        do { 
                System.out.println("Calculadora de salario: ");   
                System.out.println("Insira o cargo do funcionario:");
                System.out.println("1 - CLT");
                System.out.println("2 - PJ");
                System.out.println("3 - Estagiario");
                System.out.println("4 - relatorio");
                System.out.println("5 -sair");
                try {
                    cargo = sc.nextInt();
                } catch (InputMismatchException e) {
                    throw new InputMismatchException("Deve se inserir um valor númerico");
                }

                switch (cargo){
                    case 1:
                    double salarioBase;
                        sc.nextLine();
                        System.out.println("Insira o nome do Funcionario:");
                        try{
                            nome = sc.nextLine();
                        }
                        catch(NullPointerException e){
                            throw new NullPointerException("Não se pode deixar esse espaço em branco");
                        }

                        System.out.println("Insira o salario base:");
                        try {
                           salarioBase  = sc.nextDouble();
                        } catch (InputMismatchException e) {
                            throw new InputMismatchException("O valor deve ser númerico e com . ao invés de virgulas");
                        }

                        sc.nextLine();
                        System.out.println("Insira a função dentro da empresa:");
                         try{
                           funcao = sc.nextLine();
                        }
                        catch(NullPointerException e){
                            throw new NullPointerException("Não se pode deixar esse espaço em branco");
                        }
                            
                        funcionarios[totalFuncionarios] = new Clt(nome, funcao ,salarioBase);
                            totalFuncionarios++;
                        
                        break;
                    case 2:
                    double valorHora;
                    int horasTrabalhadas;
                         sc.nextLine();
                         System.out.println("Insira o nome do Funcionario:");
                         try{
                            nome = sc.nextLine();
                        }
                        catch(NullPointerException e){
                            throw new NullPointerException("Não se pode deixar esse espaço em branco");
                        }

                         System.out.println("Insira a função dentro da empresa:");
                        try{
                           funcao = sc.nextLine();
                        }
                        catch(NullPointerException e){
                            throw new NullPointerException("Não se pode deixar esse espaço em branco");
                        }

                         System.out.println("Insira o valor por hora:");
                         try {
                           valorHora = sc.nextDouble();
                        } catch (InputMismatchException e) {
                            throw new InputMismatchException("O valor deve ser númerico e com . ao invés de virgulas");
                        }
                         

                         System.out.println("Insira o total de horas trabalhadas:");
                         try {
                           horasTrabalhadas = sc.nextInt();
                        } catch (InputMismatchException e) {
                            throw new InputMismatchException("O valor deve ser um número inteiro");
                        }
                       

                         funcionarios[totalFuncionarios] = new Pj(nome, funcao, valorHora, horasTrabalhadas);
                             totalFuncionarios++;
                        
                        break;
                    case 3:
                    double salarioFixo;
                         sc.nextLine();
                         System.out.println("Insira o nome do Funcionario:");
                         try{
                            nome = sc.nextLine();
                         }
                         catch(NullPointerException e){
                            throw new NullPointerException("Não se pode deixar esse espaço em branco");
                         }

                        System.out.println("Insira o salario fixo:");
                        try {
                           salarioFixo = sc.nextDouble();
                        } catch (InputMismatchException e) {
                            throw new InputMismatchException("O valor deve ser númerico e com . ao invés de virgulas");
                        }
                            funcao = "Estagiario";

                            funcionarios[totalFuncionarios] = new Estagiario(nome, funcao, salarioFixo);
                                totalFuncionarios++;
                        break;
                    case 4:
                       for(Funcionario auxi : funcionarios){
                           if(auxi != null){
                            Relatorio.relatorio(auxi);
                           } 
                        }
                        break;
                    case 5:
                        System.out.println("Até breve");
                        conti = false;
                        break;
                    default:
                    System.out.println("Valor invalido!");
                        break;
                    
                }

        } while (conti);
    

    }
}
