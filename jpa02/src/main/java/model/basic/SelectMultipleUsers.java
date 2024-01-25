package model.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectMultipleUsers {
	public static void main(String[] args) {
		
		//creating the entityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa02");
		EntityManager em = emf.createEntityManager();
		//create the command
		String jpql ="select u from User u";
		//using the command to get the values and putting in this collenction
		TypedQuery<User> query = em.createQuery(jpql, User.class);

		query.setMaxResults(5);
		//putting the values in a list
		List <User> users = query.getResultList();
		//showing the values
		users.stream().forEach(x->System.out.println(x.getId()));
		em.close();
		emf.close();
	}
}
