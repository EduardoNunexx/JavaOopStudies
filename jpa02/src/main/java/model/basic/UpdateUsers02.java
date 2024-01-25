package model.basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateUsers02 {
	//removing the object from manager state 	
	public static void main(String[] args) {
		//creating the entityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa02");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		//getting the user that we'll update 
		User user = em.find(User.class,4L);
		//setting the new values 
		user.setName("User04");
		user.setEmail("User04@gmail.com");
		//doing detach
		//now he will be modified just if you make the merge
		em.detach(user);
		
		em.getTransaction().commit();
	
	
	
		em.close();
		emf.close();
	}
	
	
}
