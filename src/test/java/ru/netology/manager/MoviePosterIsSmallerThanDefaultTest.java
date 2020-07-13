package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviePosterIsSmallerThanDefaultTest {
    private PosterManager manager = new PosterManager();
    private MoviePoster first = new MoviePoster(11, "https://", "Побег из Шоушенка", 1994, "драма");
    private MoviePoster second = new MoviePoster(12, "https://", "Зелёная миля", 2000, "фантастика, драма");
    private MoviePoster third = new MoviePoster(13, "https://", "Форрест Гамп", 1994, "драма, мелодрама");
    private MoviePoster fourth = new MoviePoster(14, "https://", "Список Шиндлера", 1994, "драма, биография");
    private MoviePoster fifth = new MoviePoster(15, "https://", "1 + 1", 2012, "драма, комедия");

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
int custom = 5;

        MoviePoster[] actual = manager.getAll();
        MoviePoster[] expected = new MoviePoster[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
