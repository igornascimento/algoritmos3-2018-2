package app;
import model.Movie;
import resposta.Recommendation;
import util.CSVReader;

public class ProvaFinal {

        /**
         * CONSIDERAÇÕES PARA O PROFESSOR:
         * Foram alteradas apenas as linhas "println" adicionando um "getTitle" 
         * para possibilitar que os resultados fossem impressos em tela 
         * de forma que pudessem ser lidos
         */
    
	public static void main(String[] args) {
		Movie[] movies = CSVReader.loadMovieDatabase(Recommendation.database);
		Movie src = movies[(int)(Math.random()*movies.length)];
		int count = 5;
		/* Se voce executar sem implementar nada, ocorrera um erro
		 * neste "for".
		 */
		for (Movie movie : Recommendation.recommend(src, count)) {
			System.out.println(movie.getTitle());
		}
		for (Movie movie : Recommendation.recommendInGenre(src, "Comedy", count)) {
			System.out.println(movie.getTitle());
		}
        System.out.println(Recommendation.recommendCloser(src, 2).getTitle());
	}

}
