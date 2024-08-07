import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {


    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setCargaHoraria(8);
        curso1.setDescriçãO("Descrição curso");



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescriçãO("Descriçao mentoria java");
        mentoria1.setData(LocalDate.now());


        //mentoria1.imprimirInformaçoes();
        //curso1.imprimirInformaçoes();

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Gabriel");

        bootcamp.setDescricao("Bootcamp teste criando um bootcamp ");

        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(curso1);


        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscriverBootCamp(bootcamp);
        
        System.out.println("Conteudos Inscritos"  + devGabriel.getConteudosInscritos() );
        devGabriel.progredir();
        System.out.println("Conteudos finalizados "  + devGabriel.getConteudosConcluidos() );
        System.out.println("Conteudos Inscritos"  + devGabriel.getConteudosInscritos() );
        System.out.println("XP " + devGabriel.calcularTotalXp() );



        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscriverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir(); //teste pra ver se progride algo q nao existe
        System.out.println("Conteudos finalizados" + devCarlos.getConteudosConcluidos());
        System.out.println("Conteudos inscritos" + devCarlos.getConteudosInscritos());
        System.out.println("XP " + devCarlos.calcularTotalXp() );






        





    }
}
