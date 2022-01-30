package br.com.dio;

import java.time.LocalDate;

import br.com.dio.models.Bootcamp;
import br.com.dio.models.Curso;
import br.com.dio.models.Dev;
import br.com.dio.models.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição do Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao da Mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp de Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRoberto = new Dev();
		devRoberto.setNome("Roberto");
		devRoberto.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de Roberto = " + devRoberto.getConteudosInscritos());
		devRoberto.progredir();
		System.out.println("Conteudos inscritos de Roberto = " + devRoberto.getConteudosInscritos());
		System.out.println("Conteudos concluidos de Roberto = " + devRoberto.getConteudosConcluidos());
		System.out.println("Total de xp adquirido = " + devRoberto.calcularTotalXP());
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Dev devJuliana = new Dev();
		devJuliana.setNome("Juliana");
		devJuliana.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de Juliana = " + devJuliana.getConteudosInscritos());
		devJuliana.progredir();
		devJuliana.progredir();
		System.out.println("Conteudos inscritos de Juliana = " + devJuliana.getConteudosInscritos());
		System.out.println("Conteudos concluidos de Juliana = " + devJuliana.getConteudosConcluidos());
		System.out.println("Total de xp adquirido = " + devJuliana.calcularTotalXP());
		
		System.out.println("-------------------------------------------------------------------------------------------");
		//Criação de um dev que terminou todos os cursos e tentou progredir mais dando o erro de não ter mais cursos inscritos
		Dev devJatobias= new Dev();
		devJatobias.setNome("Jatobias");
		devJatobias.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de Jatobias = " + devJatobias.getConteudosInscritos());
		devJatobias.progredir();
		devJatobias.progredir();
		devJatobias.progredir();
		devJatobias.progredir();
		System.out.println("Conteudos inscritos de Jatobias = " + devJatobias.getConteudosInscritos());
		System.out.println("Conteudos concluidos de Jatobias = " + devJatobias.getConteudosConcluidos());
		System.out.println("Total de xp adquirido = " + devJatobias.calcularTotalXP());
	}

}
