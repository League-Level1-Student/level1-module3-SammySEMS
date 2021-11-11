package _05_netflix;

public class Challenges {
public static void main(String[] args) {
	Movie movie = new Movie("HP", 3);
	Movie movie2 = new Movie("Decendents",4);
	
	movie.getTicketPrice();
	movie2.getTicketPrice();
	
	NetflixQueue netflexQueue = new NetflixQueue();
	netflexQueue.addMovie(movie2);
	netflexQueue.addMovie(movie);
	netflexQueue.printMovies();
	System.out.println("The best movie is " + netflexQueue.getBestMovie());
	netflexQueue.sortMoviesByRating();
	System.out.println("The 2nd best movie is "+netflexQueue.getMovie(1));
	
	
	
	
}
}
