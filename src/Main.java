import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setTitulo("descrição curso java");
        curso1.setCargaHoraria(58);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setTitulo("descrição curso js");
        curso1.setCargaHoraria(45);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDione = new Dev();

        devDione.setNome("Dione");
        devDione.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Dione" + devDione.getConteudosInscritos());
        devDione.progredir();
        devDione.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Dione" + devDione.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Dione" + devDione.getConteudosConcluidos());
        System.out.println("XP:" + devDione.calcularXp());

        System.out.println("------");

        Dev devSamira = new Dev();

        devSamira.setNome("Samira");
        devSamira.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Samira" + devSamira.getConteudosInscritos());
        devSamira.progredir();
        devSamira.progredir();
        devSamira.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Samira" + devSamira.getConteudosInscritos());
        System.out.println("Conteudos concluidos Scamira" + devSamira.getConteudosConcluidos());
        System.out.println("XP:" + devSamira.calcularXp());

    }
}
