package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa(null,"Carlos da Silva","carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null,"Joaquim Torres" ,"joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null,"Ana Maria", "ana@gmail.com");
		
		//instancia do EntityManagerFactory e EntityManager 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Consulta no bd
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
		
		//remover do bd
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		
		
		
		
		
		//Adicionando no bd
		//em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit();
		System.out.println("Pronto");
	
		
	}

}
