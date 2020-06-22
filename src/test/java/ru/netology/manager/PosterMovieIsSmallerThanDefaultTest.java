package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterMovie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterMovieIsSmallerThanDefaultTest {
    private AfishaManager manager = new AfishaManager();
    private PosterMovie first = new PosterMovie(11, "https://", "Побег из Шоушенка", 1994, "драма");
    private PosterMovie second = new PosterMovie(12, "https://", "Зелёная миля", 2000, "фантастика, драма");
    private PosterMovie third = new PosterMovie(13, "https://", "Форрест Гамп", 1994, "драма, мелодрама");
    private PosterMovie fourth = new PosterMovie(14, "https://", "Список Шиндлера", 1994, "драма, биография");
    private PosterMovie fifth = new PosterMovie(15, "https://", "1 + 1", 2012, "драма, комедия");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
    }

    @Test
    public void shouldBring5FilmsToPoster(){
        PosterMovie[] actual = manager.getAll();
        PosterMovie[] expected = new PosterMovie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
