package ru.netology.manager;

import ru.netology.domain.MoviePoster;

public class PosterManager {
    private MoviePoster[] posters = new MoviePoster[0];

    public void add(MoviePoster poster) {
        // создаём новый массив размером на единицу больше
        int length = posters.length + 1;
        MoviePoster[] tmp = new MoviePoster[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public MoviePoster[] getAll() {
        MoviePoster[] result = new MoviePoster[posters.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

}
