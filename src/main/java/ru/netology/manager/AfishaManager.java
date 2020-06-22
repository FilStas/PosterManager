package ru.netology.manager;

import ru.netology.domain.PosterMovie;

public class AfishaManager {

    private PosterMovie[] posters = new PosterMovie[0];

    public void add(PosterMovie poster) {
        int length = posters.length + 1;
        PosterMovie[] tmp = new PosterMovie[length];

        System.arraycopy(posters, 0, tmp, 0, posters.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public PosterMovie[] getAll() {
        int defaultPoster = 10;
        int customPorter = posters.length;
        PosterMovie[] result = new PosterMovie[defaultPoster];

        if (customPorter < defaultPoster){
            result = new PosterMovie[posters.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

}
