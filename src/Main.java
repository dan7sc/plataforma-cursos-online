import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desenvolvimento usando Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev danDev = new Dev();
        danDev.setNome("Dan");
        danDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + danDev.getNome() + ": " + danDev.getConteudosInscritos());
        danDev.progredir();
        danDev.progredir();
        System.out.println("Conteudos Inscritos " + danDev.getNome() + ": " + danDev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos :" + danDev.getNome() + ": " + danDev.getConteudosConcluidos());
        System.out.println("XP: " + danDev.calcularTotalXp());

        Dev jinDev = new Dev();
        jinDev.setNome("Jin");
        jinDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + jinDev.getNome() + ": " + jinDev.getConteudosInscritos());
        jinDev.progredir();
        jinDev.progredir();
        jinDev.progredir();
        System.out.println("Conteudos Inscritos " + jinDev.getNome() + ": " + jinDev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos :" + jinDev.getNome() + ": " + jinDev.getConteudosConcluidos());
        System.out.println("XP: " + jinDev.calcularTotalXp());
    }
}
