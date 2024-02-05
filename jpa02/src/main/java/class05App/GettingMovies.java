package class05App;

import java.util.List;

import class05NToN.Movie;
import infra.DAO;

public class GettingMovies {
	public static void main(String[] args) {
		DAO<Movie> dao = new DAO<>(Movie.class);
		List<Movie> movies = dao.getByQuery("moviesAvrgBiggerThan", "avrg", 9.9);
		for (Movie movie : movies) {
			System.out.println(movie.getName()+"->"+movie.getAvrg());
		}
	}
}
