package projeto.src.br.com.dio.desafio.domain;

import java.util.Iterator;
import java.util.Optional;

public class Usuario extends Devs{

    private String senha;
    public Usuario() {
        super();
        this.senha = null;
    }

    @Override
    public void inscreverNoBootCamp(BootCamp bootCamp) {
        this.conteudosIniciados.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    @Override
    public void progredir() {
        Optional<br.com.dio.desafio.domain.Conteudo> conteudo = this.conteudosIniciados.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosFinalizados.add(conteudo.get());
            this.conteudosIniciados.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteudo!!!");
        }
    }

    @Override
    public double calcularXp() {
        this.conteudosFinalizados.stream()
                .mapToDouble(br.com.dio.desafio.domain.Conteudo::calcularXp);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


        public void imprimir(Usuario this){
            System.out.println("====Informações sobre a conta====");
            System.out.println("Nome: "+this.getNome());
            System.out.println("Cursos Iniciados:");
            Iterator <br.com.dio.desafio.domain.Conteudo> iterator = this.getConteudosIniciados().iterator();
                while(iterator.hasNext()) {
                    br.com.dio.desafio.domain.Conteudo temp = iterator.next();
                    System.out.println(temp.getTitulo());
                    System.out.printf(temp.getDescricao());
                }
            System.out.println("Cursos finalizados:");
            Iterator <br.com.dio.desafio.domain.Conteudo> iterator2 = this.getConteudosFinalizados().iterator();
            while(iterator.hasNext()) {
                br.com.dio.desafio.domain.Conteudo temp = iterator.next();
                System.out.println(temp.getTitulo());
                System.out.printf(temp.getDescricao());
            }
            System.out.printf("Xp: "+this.calcularXp());
            System.out.println("===================================");
        }


}
