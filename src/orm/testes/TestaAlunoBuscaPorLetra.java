package orm.testes;

import java.util.List;
import java.util.Scanner;

import orm.actions.BuscaUmAlunoPorLetra;
import orm.modelo.Aluno;

public class TestaAlunoBuscaPorLetra {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma letra para buscar alunos iniciados por ela: ");
		String letra = sc.nextLine();
		
		List<Aluno> alunos = BuscaUmAlunoPorLetra.buscaLetra(letra);

		
		if (alunos.isEmpty()) {
			System.out.println("Nenhum aluno encontrado!");
		} else {
			System.out.println("Alunos encontrados com nome iniciado por " + letra.toUpperCase() + " : ");
			alunos.stream().forEach(System.out::println);
		}
	}
	
	

}
