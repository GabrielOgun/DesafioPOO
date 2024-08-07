package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    
    protected String titulo;
    protected String descrição;
    public static final double XP_PADRAO = 10d;

    public abstract double calcularXp();
 



    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriçãO() {
        return this.descrição;
    }

    public void setDescriçãO(String descrição) {
        this.descrição = descrição;
    }


    protected abstract String obterInformacaoEspecifica();


    public void imprimirInformaçoes(){

        System.out.println("este é o titulo: " + this.getTitulo());
        System.out.println("esta é o Descricao: " + this.getDescriçãO());
        System.out.println(obterInformacaoEspecifica());
        

    }

    




}
