import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso("Curso Java", "Exemplo de descrição do curso Java", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Exemplo de descrição do curso JavaScript", 4);
        Curso curso3 = new Curso("Curso Python", "Exemplo de descrição do curso Python", 6);

        // Criando mentoria
        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Exemplo de descrição da mentoria de Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria de JavaScript", "Exemplo de descrição da mentoria de JavaScript", LocalDate.now().plusDays(1));

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Exemplo de descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        // Criando e inscrevendo Devs
        Dev dev1 = new Dev("Gustavo");
        dev1.inscreverBootcamp(bootcamp);
        Dev dev2 = new Dev("Gabriel");
        dev2.inscreverBootcamp(bootcamp);

        // Progresso dos Devs
        System.out.println("Progresso de " + dev1.getNome() + ":");
        System.out.println("------------");
        System.out.println("Conteúdos inscritos:");
        for (Conteudo conteudo : dev1.getConteudosInscritos()) {
            System.out.println("- " + conteudo.getTitulo() + ": " + conteudo.getDescricao());
        }
        System.out.println("------------");
        dev1.progredir();
        System.out.println("Progresso após progredir:");
        System.out.println("Conteúdos inscritos:");
        for (Conteudo conteudo : dev1.getConteudosInscritos()) {
            System.out.println("- " + conteudo.getTitulo() + ": " + conteudo.getDescricao());
        }
        System.out.println("Conteúdos concluídos:");
        for (Conteudo conteudo : dev1.getConteudosConcluidos()) {
            System.out.println("- " + conteudo.getTitulo() + ": " + conteudo.getDescricao());
        }
        System.out.println("XP total: " + dev1.calcularTotalXp());

        System.out.println("------------");

        System.out.println("Progresso de " + dev2.getNome() + ":");
        System.out.println("------------");
        System.out.println("Conteúdos inscritos:");
        for (Conteudo conteudo : dev2.getConteudosInscritos()) {
            System.out.println("- " + conteudo.getTitulo() + ": " + conteudo.getDescricao());
        }
        System.out.println("------------");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Progresso após progredir:");
        System.out.println("Conteúdos inscritos:");
        for (Conteudo conteudo : dev2.getConteudosInscritos()) {
            System.out.println("- " + conteudo.getTitulo() + ": " + conteudo.getDescricao());
        }
        System.out.println("Conteúdos concluídos:");
        for (Conteudo conteudo : dev2.getConteudosConcluidos()) {
            System.out.println("- " + conteudo.getTitulo() + ": " + conteudo.getDescricao());
        }
        System.out.println("XP total: " + dev2.calcularTotalXp());
    }
}
