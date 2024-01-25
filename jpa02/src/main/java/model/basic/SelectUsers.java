package model.basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.bytebuddy.matcher.CollectionItemMatcher;

public class SelectUsers {
	public static void main(String[] args) {
		
		//creating the entityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa02");
		EntityManager em = emf.createEntityManager();
		//Using the command find 
		//giving to him the class type that you want to receive and the element primary Key's value 
		User user = em.find(User.class,4L);
		System.out.println(user.getName());
		
		em.close();
		emf.close(); 
	}
}
