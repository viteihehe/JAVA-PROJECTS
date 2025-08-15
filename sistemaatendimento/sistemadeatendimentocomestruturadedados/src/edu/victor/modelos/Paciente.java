package edu.victor.modelos;

public class Paciente {
    
    private String nome;
    private String especialidadeMedica;
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the especialidadeMedica
     */
    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    /**
     * @param especialidadeMedica the especialidadeMedica to set
     */
    public void setEspecialidadeMedica(String especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    @Override
    public String toString() {
    return "Paciente: " + nome + " - Especialidade: " + especialidadeMedica;
}


}
