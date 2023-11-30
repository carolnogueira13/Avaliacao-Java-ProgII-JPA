package orm.testes;

import java.util.List;

import orm.actions.BuscaAlunos;
import orm.modelo.Aluno;

public class TestaBuscaAlunos {
	
	public static void main(String[] args) {
		List<Aluno> alunos = BuscaAlunos.busca();

		
		if (alunos.isEmpty()) {
			System.out.println("Nenhum aluno encontrado!");
		} else {
			System.out.println("Alunos encontrados: ");
			alunos.stream().forEach(System.out::println);
		}
		
	}

}
