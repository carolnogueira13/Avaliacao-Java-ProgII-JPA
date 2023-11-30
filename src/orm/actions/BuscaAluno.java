package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;


public class BuscaAluno {
	public static Aluno busca(long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		Aluno a1 = manager.find(Aluno.class, id);
		
		manager.close();
		factory.close();
		
		return a1;
	}
	
}
