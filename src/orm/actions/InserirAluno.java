package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class InserirAluno {
	public static void inserir(Aluno aluno) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin(); // Iniciar transação
		manager.persist(aluno); // linha que faz o hibernate inserir um objeto no banco
		manager.getTransaction().commit(); // Encerramento da transação
		
		manager.close();
		factory.close();
		
	}
}
