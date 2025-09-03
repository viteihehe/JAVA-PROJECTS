package projeto.src.br.com.dio.desafio.domain;

import br.com.dio.desafio.domain.Conteudo;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Optional;

public abstract class Devs implements DevsProcessos {
    protected String nome;
    protected Set<Conteudo> conteudosIniciados = new LinkedHashSet<>();
    protected Set<Conteudo> conteudosFinalizados = new LinkedHashSet<>();


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIniciados() {
        return conteudosIniciados;
    }

    public void setConteudosIniciados(Set<Conteudo> conteudosIniciados) {
        this.conteudosIniciados = conteudosIniciados;
    }

    public Set<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }

    public String getNome() {
        return nome;
    }

    public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
        this.conteudosFinalizados = conteudosFinalizados;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudosIniciados, devs.conteudosIniciados) && Objects.equals(conteudosFinalizados, devs.conteudosFinalizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIniciados, conteudosFinalizados);
    }
}
