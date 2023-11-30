package orm.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// classe responsavel por fazer o DDL no banco
// relativo a classe Tabela
public class GeraTabelaAlunos {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
	}
}
