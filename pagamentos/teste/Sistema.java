package teste;

import domain.Cargo;
import domain.Clt;
import domain.Estagiario;
import domain.Funcionario;
import domain.Pj;
import java.util.Scanner;
import servico.Relatorio;

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
                cargo = sc.nextInt();

                switch (cargo){
                    case 1:
                        sc.nextLine();
                        System.out.println("Insira o nome do Funcionario:");
                        nome = sc.nextLine();

                        System.out.println("Insira o salario base:");
                        double salarioBase = sc.nextDouble();

                        sc.nextLine();
                        System.out.println("Insira a função dentro da empresa:");
                        funcao = sc.nextLine();

                        funcionarios[totalFuncionarios] = new Clt(nome, funcao ,salarioBase);
                        totalFuncionarios++;
                        
                        break;
                    case 2:
                         sc.nextLine();
                         System.out.println("Insira o nome do Funcionario:");
                         nome = sc.nextLine();

                         System.out.println("Insira a função dentro da empresa:");
                        funcao = sc.nextLine();

                         System.out.println("Insira o valor por hora:");
                         double valorHora = sc.nextDouble();

                         System.out.println("Insira o total de horas trabalhadas:");
                         int horasTrabalhadas = sc.nextInt();

                         funcionarios[totalFuncionarios] = new Pj(nome, funcao, valorHora, horasTrabalhadas);
                         totalFuncionarios++;
                        
                        break;
                    case 3:
                         sc.nextLine();
                         System.out.println("Insira o nome do Funcionario:");
                        nome = sc.nextLine();

                        System.out.println("Insira o salario fixo:");
                        double salarioFixo = sc.nextDouble();

                        funcao = "Estagiario";

                        funcionarios[totalFuncionarios] = new Estagiario(nome, funcao, salarioFixo);
                        totalFuncionarios++;
                        break;
                    case 4:
                        for(Funcionario auxi : funcionarios){
                           if(auxi != null){
                            if(auxi.getCargo() == Cargo.CLT){
                                Relatorio.relatorioClt((Clt) auxi);
                            }else if (auxi.getCargo() == Cargo.PJ) {
                                Relatorio.relatorioPj((Pj) auxi);
                            }else{
                                Relatorio.relatorioEstagiario((Estagiario) auxi);
                            }
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
