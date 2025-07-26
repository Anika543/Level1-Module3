package _04_netflix;

public class ListOfMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie("Finding Nemo", 4);
		Movie movie2 = new Movie("Twilight", 3);
		Movie movie3 = new Movie("SpiderMan", 5);
		Movie movie4 = new Movie("Titanic", 4);
		Movie movie5 = new Movie("Iron Man", 5); 
		
		movie1.getTicketPrice();
		
		NetflixQueue x = new NetflixQueue(); 
		x.addMovie(movie1);
		x.addMovie(movie2);
		x.addMovie(movie3);
		x.addMovie(movie4);
		x.addMovie(movie5);
		
		x.printMovies();

	}

}
