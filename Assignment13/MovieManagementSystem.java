class MovieManagementSystem {
    public static void main(String[] args) {
        Movie movie = new Movie("3 Idiots", "Mr kunal ji", 2000, 9);
        movie = movie.addMovieAtBeginning("Dangal", "Mr Arush", 2000, 8, movie);
        movie = movie.addMovieAtBeginning("Zindagi Na Milegi Dobara", "ayush", 2010, 9, movie);
        movie = movie.addMovieAtEnd("Lagaan", "Ashutosh", 2010, 8, movie);
        movie = movie.addMovieAtEnd("Sholay", "anuj", 1900, 10, movie);

        movie.displayMoviesForward(movie);
        movie.displayMoviesReverse(movie);

        movie.searchMovieByDirector("Mr Arush", movie);
        movie.searchMovieByRating(9, movie);

        movie.updateMovieRating("Dangal", 9, movie);
        movie.displayMoviesForward(movie);

        movie = movie.removeMovie("Zindagi Na Milegi Dobara", movie);
        movie.displayMoviesForward(movie);
    }
}

class Movie {
    String Title, Director;
    int YearOfRelease, Rating;
    Movie next, prev;

    Movie(String Title, String Director, int YearOfRelease, int Rating) {
        this.Title = Title;
        this.Director = Director;
        this.YearOfRelease = YearOfRelease;
        this.Rating = Rating;
        this.next = null;
        this.prev = null;
    }

    public static Movie addMovieAtBeginning(String title, String director, int year, int rating, Movie movie) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (movie != null) {
            newMovie.next = movie;
            movie.prev = newMovie;
        }
        return newMovie;
    }

    public static Movie addMovieAtEnd(String title, String director, int year, int rating, Movie movie) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (movie == null) 
            return newMovie;

        Movie temp = movie;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newMovie;
        newMovie.prev = temp;
        return movie;
    }

    public static Movie removeMovie(String title, Movie movie) {
        Movie temp = movie;
        while (temp != null && !temp.Title.equals(title))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Movie \"" + title + "\" not found.");
            return movie;
        }

        if (temp.prev != null)
            temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp == movie)
            movie = temp.next;

        System.out.println("Movie \"" + title + "\" removed successfully.");
        return movie;
    }

    public static void searchMovieByDirector(String director, Movie movie) {
        while (movie != null) {
            if (movie.Director.equals(director)) {
                System.out.println("Movie Found: " + movie.Title + " (" + movie.YearOfRelease + ")");
            }
            movie = movie.next;
        }
    }

    public static void searchMovieByRating(int rating, Movie movie) {
        while (movie != null) {
            if (movie.Rating == rating) {
                System.out.println("Movie Found: " + movie.Title + " (" + movie.YearOfRelease + ")");
            }
            movie = movie.next;
        }
    }

    public static void updateMovieRating(String title, int newRating, Movie movie) {
        while (movie != null && !movie.Title.equals(title))
            movie = movie.next;

        if (movie != null) {
            movie.Rating = newRating;
            System.out.println("Movie \"" + title + "\" rating updated to " + newRating);
        } else {
            System.out.println("Movie not found.");
        }
    }

    public static void displayMoviesForward(Movie movie) {
        System.out.println("Movies List (Forward Order):");
        while (movie != null) {
            System.out.println(movie.Title + " | " + movie.Director + " | " + movie.YearOfRelease + " | Rating: " + movie.Rating);
            movie = movie.next;
        }
        System.out.println();
    }

    public static void displayMoviesReverse(Movie movie) {
        if (movie == null)
            return;

        while (movie.next != null)
            movie = movie.next;

        System.out.println("Movies List (Reverse Order):");
        while (movie != null) {
            System.out.println(movie.Title + " | " + movie.Director + " | " + movie.YearOfRelease + " | Rating: " + movie.Rating);
            movie = movie.prev;
        }
        System.out.println();
    }
}