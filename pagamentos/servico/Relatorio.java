package servico;


import domain.Clt;
import domain.Estagiario;
import domain.Pj;

public class Relatorio {
    public static void relatorioClt(Clt clt){
        System.out.println("--------------------------");
        System.out.println("Relatorio:");
        double salario = clt.salario();
        System.out.println("Nome: "+clt.getNome());
        System.out.println("Cargo: "+clt.getCargo());
        System.out.println("Função: "+clt.getFuncao());
        System.out.println("Salario: "+salario);
        System.out.println("--------------------------");
    }
    public static void relatorioPj(Pj pj){
        System.out.println("--------------------------");
        System.out.println("Relatorio:");
        double salario = pj.salario();
        System.out.println("Nome: "+pj.getNome());
        System.out.println("Cargo: "+pj.getCargo());
        System.out.println("Função: "+pj.getFuncao());
        System.out.println("Salario: "+salario);
        System.out.println("--------------------------");
    }
    public static void relatorioEstagiario(Estagiario estagiario){
        System.out.println("--------------------------");
        System.out.println("Relatorio:");
        double salario = estagiario.salario();
        System.out.println("Nome: "+estagiario.getNome());
        System.out.println("Salario: "+salario);
        System.out.println("Função: "+estagiario.getFuncao());
        System.out.println("--------------------------");
    }
}
