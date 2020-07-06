package ru.netology.manager;

import ru.netology.domain.MoviePoster;

public class PosterManager {
    private int defaultPoster = 10;
    private int customPoster;

    public PosterManager(int customPoster) {
        this.customPoster = customPoster;
    }

    public PosterManager() {
    }

    private MoviePoster[] posters = new MoviePoster[0];

    public void add(MoviePoster poster) {
        int length = posters.length + 1;
        MoviePoster[] tmp = new MoviePoster[length];

        System.arraycopy(posters, 0, tmp, 0, posters.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public MoviePoster[] getAll() {
        int movieCount = posters.length;
        if ((defaultPoster < posters.length) && (customPoster == 0)) {
            movieCount = defaultPoster;
        } else if ((customPoster > 0) && (customPoster < posters.length)) {
            movieCount = customPoster;
        }
        MoviePoster[] result = new MoviePoster[movieCount];
        for (int i = 0; i < movieCount; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }
}
