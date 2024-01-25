package app.basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.basic.User;

public class NewUser {

	public static void main(String[] args) {
		//creating the entity manager factory and setting the persistence unity (this project that have all the mapped entitys)
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa02");
		//using the method to crate the entity manager seted
		EntityManager em=emf.createEntityManager();
		
		//inserting new elements using persist
		User u1 = new User("user01","User01@gmail.com");
		//starting the transaction
		em.getTransaction().begin();
		//doing the changes (adding new user in the table)
		em.persist(u1);
		//sending the changes 
		em.getTransaction().commit();
		
		//closing the EM and EMF
		em.close();
		emf.close();
		
	}

}
