package org.certificatic.spring.core.practica4.test.movies;

import org.certificatic.spring.core.practica4.movies.api.impl.MovieFinderImpl;
import org.certificatic.spring.core.practica4.movies.model.Movie;
import org.certificatic.spring.core.practica4.movies.service.MovieListener;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoviesNoSpringTest {

	@Test
	public void moviesNoSpringTest() {

		log.info("moviesNoSpringTest -------------------");

		// Implementa

		MovieListener movieListener = new MovieListener();

		Assert.assertNotNull(movieListener);

		movieListener.setMovieFinder(new MovieFinderImpl());

		Assert.assertNotNull(movieListener.getMovieFinder());

		Movie movie = movieListener.buscarPelicula("Titanic");

		Assert.assertEquals(Movie.builder().titulo("Titanic").build(), movie);

		log.info("{}", movie);

	}
}
