package ru.netology.manager;

import ru.netology.domain.MoviePoster;

public class PosterManager {

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
        int defaultPoster = 10;
        int customPorter = posters.length;
        MoviePoster[] result = new MoviePoster[defaultPoster];

        if (customPorter < defaultPoster){
            result = new MoviePoster[posters.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

}
