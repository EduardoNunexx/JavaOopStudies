package class05App;

import java.util.List;

import class05NToN.Movie;
import infra.DAO;

public class GettingMoviesUsingNamedQuery {
	public static void main(String[] args) {
		DAO<Movie> dao = new DAO<>(Movie.class);
		List<Movie> movies = dao.getByQuery("moviesAvrgBiggerThan", "avr", 1.0);
		for (Movie movie : movies) {
			System.out.println("q");
			System.out.println(movie.getName()+"->"+movie.getAvrg());
		}
	}
}
