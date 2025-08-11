import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        int parametro2, parametro1;

        System.out.println("Seja bem vindo!!!");
        System.out.println("Insira o primeiro parâmetro inteiro:");
        parametro1 = sc.nextInt();
        System.out.println("Insira o segundo parâmetro inteiro");
        parametro2 = sc.nextInt();
        
        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro2 < parametro1){
            throw new ParametrosInvalidosException();
        }else{
            int temp = parametro2-parametro1;
            for(int i = 1; i <= temp; i ++){
                System.out.println("Imprimindo o número "+i);
            }
        }
    }
    

}