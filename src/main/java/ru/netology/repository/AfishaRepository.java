package ru.netology.repository;

import ru.netology.domain.PosterMovie;

public class AfishaRepository {
    private PosterMovie[] movies = new PosterMovie[0];

    public void save(PosterMovie movie) {
        int length = movies.length + 1;
        PosterMovie[] tmp = new PosterMovie[length];

        System.arraycopy(movies, 0, tmp, 0, movies.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public PosterMovie[] findAll() {
        return movies;
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        PosterMovie[] tmp = new PosterMovie[length];
        int index = 0;
        for (PosterMovie movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
    }

    public PosterMovie findById(int id) {
        PosterMovie tmp = null;
        for (PosterMovie movie : movies) {
            if (movie.getId() == id) {
                tmp = movie;
            }
        }
        return tmp;
    }

    public void removeAll() {
        movies = new PosterMovie[0];
    }
}
