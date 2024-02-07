package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

//this class should be generic to can get all entity types that i want to use 
//and i will set this interface that guarantee that a entity will be used here 
public class DAO <E>{
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> clas;
	static {
		try {
			emf = Persistence.createEntityManagerFactory("jpa02");
		} catch (Exception e) {
			//put in some log achieve
		}
	}
	//starting the entity manager in the constructor 
	public DAO(Class<E> clas) {
		this.clas = clas;
		em = emf.createEntityManager();
	}
	public DAO() {
		this(null);
	}
	//creating the transactions methods 
	public DAO<E> openTransaction(){
		em.getTransaction().begin();
		return this;
	}
	public DAO<E> closeTransaction(){
		em.getTransaction().commit();;
		return this;
	}
	//method to add some element
	public DAO<E>include (E entity){
		em.persist(entity);
		return this;
	}
	//this method start, include and commit the transaction 
	public DAO<E> includeWithEverything(E entity){
		return this.openTransaction().include(entity).closeTransaction();
	}
	//method to get one specify value from the table 
	public E getById(Long id) {
		return em.find(clas,id);
	}
	//method to get all table values 
	public List<E> getAll(int quantity, int desloc){
		if(clas==null) {
			throw new UnsupportedOperationException("null class");
		}
		String jpql = "SELECT e FROM " + clas.getName()+ " e";
		TypedQuery<E> query= em.createQuery(jpql, clas);
		query.setMaxResults(quantity);
		query.setFirstResult(desloc);
		return query.getResultList();
	}
	public List<E> getAll(){
		if(clas==null) {
			throw new UnsupportedOperationException("null class");
		}
		String jpql = "SELECT e FROM " + clas.getName()+ " e";
		TypedQuery<E> query = em.createQuery(jpql, clas);
		return query.getResultList();
	} 
	//method to use named query
	public List<E> getByQuery(String Nmequery, Object... params){
		TypedQuery<E> query = em.createNamedQuery(Nmequery, clas);
		for (int i = 0; i < params.length; i+=2) {
			query.setParameter(params[i].toString(), params[i+1]);
		}
		return query.getResultList();
	}
	//method that are using using the native named query that i'd create
	public E getOneByQuery(String Nmequery, Object... params){
		List<E> list = getByQuery(Nmequery, params);
		return list ==null ? null: list.get(0);
	}
	public DAO<E> close(){
		em.close();
		return this;
	}
	
 }
