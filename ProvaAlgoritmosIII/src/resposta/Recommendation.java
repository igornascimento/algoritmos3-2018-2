package resposta;

import model.Movie;
import util.CSVReader;

public class Recommendation {

    public static final String database = "./src/files/movies.csv";
    // public static final String database = "./src/files/teste.csv";

    public static Movie[] recommend(Movie source, int count) {
        Movie[] similars = new Movie[source.getSimilar().length];
        int cnt = 0;
        // source = main movie (musn't be included in the resultset)
        for (Movie similar : source.getSimilar()) {
            if (cnt == count) {
                break;
            }
            if (!source.getTitle().equals(similar.getTitle())) {
                similars[cnt] = similar;
                cnt++;
            }
        }
        // debug(source, similars);
        return reduceVector(similars, cnt);
    }

    public static Movie[] recommendInGenre(Movie source, String genre, int count) {
        Movie[] similars = new Movie[source.getSimilar().length];
        int cnt = 0;
        // source = main movie (musn't be included in the resultset)
        for (Movie similar : source.getSimilar()) {
            if (cnt == count) {
                break;
            }
            if (!source.getTitle().equals(similar.getTitle()) &&
                // keeping the same genre
                similar.getGenre().equals(genre)) {
                similars[cnt] = similar;
                cnt++;
            }
        }
        
        debug(source, similars);
        return reduceVector(similars, cnt);
    }

    /**
     * Retorna a principal recomendacao com no máximo 'maxDistance'.
     */
    public static Movie recommendCloser(Movie source, int maxDistance) {
        Movie[] similars = new Movie[source.getSimilar().length];
        int cnt = 0;
        // source = main movie (musn't be included in the resultset)
        for (Movie similar : source.getSimilar()) {
            if (cnt == maxDistance) {
                break;
            }
            if (!source.getTitle().equals(similar.getTitle())) {
                similars[cnt] = similar;
                cnt++;
            }
        }
        similars = reduceVector(similars, cnt);
        
        double biggestRating = 0;
        int count = 0;
        Movie recommendation = null;
        
        for (Movie candidate : similars) {
            if (count == 0) {
                biggestRating = candidate.getRating();
                recommendation = candidate;
            } else {
                if (candidate.getRating() > biggestRating) {
                    biggestRating = candidate.getRating();
                    recommendation = candidate;
                }
            }
            count++;
        }
        // debug(source, similars);
        return recommendation;
    }
    
    public static void debug(Movie source, Movie[] similars) {
        System.out.println("SOURCE MOVIE: " + source.getTitle() + " | " + source.getGenre());
        for (Movie similar : similars) {
            if (similar != null) {
                System.out.println("SIMILAR: " + similar.getTitle() + " | " + similar.getGenre());
            }
        }
        System.out.println("");
    }
    
    public static Movie[] reduceVector(Movie[] similars, int count) {
        Movie[] newArray = new Movie[count];
        for (int i=0; i<count; i++) {
            newArray[i] = similars[i];
        }
        return newArray;
    }

}
