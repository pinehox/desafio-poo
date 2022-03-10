import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso cursoRedes = new Curso();
		cursoRedes.setTitulo("Redes de Computadores");
		cursoRedes.setDescricao("Sistemas e dispositivos de computadores.");
		cursoRedes.setCargaHoraria(5);
		
		Curso cursoModelagem = new Curso();
		cursoModelagem.setTitulo("Modelagem de Dados");
		cursoModelagem.setDescricao("Estruturas orientadas a dados.");
		cursoModelagem.setCargaHoraria(1);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(cursoRedes);
		System.out.println(cursoModelagem);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(cursoRedes);
		bootcamp.getConteudos().add(cursoModelagem);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGuilherme = new Dev();
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devGuilherme.getConteudosInscritos());
		
		devGuilherme.progredir();
		System.out.println("Conteúdos Inscritos" + devGuilherme.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devGuilherme.getConteudosConcluidos());
		System.out.println("XP" + devGuilherme.calcularTotalXp());

		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
		System.out.println("XP" + devCamila.calcularTotalXp());

	}

}