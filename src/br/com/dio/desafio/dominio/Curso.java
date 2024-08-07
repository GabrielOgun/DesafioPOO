package br.com.dio.desafio.dominio;


public class Curso extends Conteudo {

    private int cargaHoraria;

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        
       return XP_PADRAO * cargaHoraria;
    }

    public String obterInformacaoEspecifica(){
        return "Carga Horaria: " + getCargaHoraria();
    }



 
    @Override
    public String toString() {
        return "Curso{" +
               "titulo='" + titulo + '\'' +
               " , carga =" + getCargaHoraria() +
               ", descricao=" + getDescriçãO() +
               '}';
    }
    












}
