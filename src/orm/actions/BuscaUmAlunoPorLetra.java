package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Aluno;

public class BuscaUmAlunoPorLetra {
	public static List<Aluno> buscaLetra(String letra) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		//Query em JPQL que é traduzida para o SQL do banco definido no persistence.xml
		Query query = manager.createQuery("select a from Aluno as a where a.nome like :parametro");
		query.setParameter("parametro", letra + "%");
				
		@SuppressWarnings("unchecked")
		List<Aluno> alunos = query.getResultList();
		
		manager.close();
		factory.close();
		
		return alunos;
		
		
	}

}
