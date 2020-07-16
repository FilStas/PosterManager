package ru.netology.manager;

import ru.netology.domain.PosterMovie;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private int defaultPoster = 10;
    private int customPoster;
    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public AfishaManager(int customPoster, AfishaRepository repository) {
        this.customPoster = customPoster;
        this.repository = repository;
    }

    public AfishaManager() {
    }

    public void add(PosterMovie movie) {
        repository.save(movie);
    }

    public PosterMovie[] getAll() {
        PosterMovie[] movies = repository.findAll();
        int movieCount = movies.length;
        if (defaultPoster <= movies.length & customPoster == 0) {
            movieCount = defaultPoster;
        } else if (customPoster > 0 & customPoster < movies.length) {
            movieCount = customPoster;
        }
        PosterMovie[] result = new PosterMovie[movieCount];

        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public PosterMovie[] findById(int id) {
       return repository.findById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

}
