package class02;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectProducts {
public static void main(String[] args) {
		
		//creating the entityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa02");
		EntityManager em = emf.createEntityManager();
		//Using the command find 
		//giving to him the class type that you want to receive and the element primary Key's value 
		Product product = em.find(Product.class,3L);
		System.out.println(product.getName());
		
		em.close();
		emf.close(); 
	}
}
