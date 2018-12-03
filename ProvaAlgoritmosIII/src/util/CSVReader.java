package util;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.Movie;

public class CSVReader {
	public static Movie[] loadMovieDatabase(String filename) {
		ArrayList<Movie> result = new ArrayList<>();
		ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

		try (Scanner file = new Scanner(new FileReader(filename))) {
			while (file.hasNext()) {
				try (Scanner sc = new Scanner(file.nextLine())) {
					sc.useLocale(Locale.US);
					sc.useDelimiter(",");
					Movie movie = new Movie(sc.next(),sc.next(),sc.nextDouble());
					ArrayList<Integer> ed = new ArrayList<>();
					while (sc.hasNext())
						ed.add(sc.nextInt());
					result.add(movie);
					edges.add(ed);
				}
			}
			for (int i = 0; i < result.size(); i++) {
				Movie movie = result.get(i);
				ArrayList<Integer> ed = edges.get(i);
				ArrayList<Movie> mvs = new ArrayList<>();
				for (int j = 0; j < ed.size(); j++) {
                    int x = ed.get(j);
                    if (x < result.size())
					   mvs.add(result.get(x));
				}
				movie.setSimilar(mvs.toArray(new Movie[mvs.size()]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return result.toArray(new Movie[result.size()]);
	}
}
