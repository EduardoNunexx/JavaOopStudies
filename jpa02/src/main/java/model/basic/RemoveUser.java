package model.basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveUser {
	public static void main(String[] args) {
		//creating the entityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa02");
		EntityManager em = emf.createEntityManager();
		//getting the user that we'll update 
		User user = em.find(User.class,4L);
		//doing the null validity 
		if(user!=null) {
			//creating the transaction context
			em.getTransaction().begin();
			//deleting the element
			em.remove(user);
			em.getTransaction().commit();
		}
		em.close();
		emf.close();
	}
	
	
}
