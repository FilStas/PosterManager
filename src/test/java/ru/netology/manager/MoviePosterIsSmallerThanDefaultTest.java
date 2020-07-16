package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviePosterIsSmallerThanDefaultTest {
    private PosterManager manager = new PosterManager(3);
    private MoviePoster first = new MoviePoster(11, "https://", "Побег из Шоушенка", 1994, "драма");
    private MoviePoster second = new MoviePoster(12, "https://", "Зелёная миля", 2000, "фантастика, драма");
    private MoviePoster third = new MoviePoster(13, "https://", "Форрест Гамп", 1994, "драма, мелодрама");
    private MoviePoster fourth = new MoviePoster(14, "https://", "Список Шиндлера", 1994, "драма, биография");
    private MoviePoster fifth = new MoviePoster(15, "https://", "1 + 1", 2012, "драма, комедия");
    private MoviePoster sixth = new MoviePoster(16, "https://", "Иван Васильевич меняет профессию", 1973, "фантастика, комедия");
    private MoviePoster seventh = new MoviePoster(17, "https://", "Крестный отец", 1972, "драма");
    private MoviePoster eighth = new MoviePoster(18, "https://", "В бой идут одни старики", 1974, "драма, комедия");
    private MoviePoster ninth = new MoviePoster(19, "https://", "Операция Ы и другие приключения Шурика", 1965, "мелодрама, комедия");
    private MoviePoster tenth = new MoviePoster(20, "https://", "Леон", 1994, "боевик, триллер");
    private MoviePoster eleventh = new MoviePoster(21, "https://", "Начало", 2010, "фантастика, боевик");
    private MoviePoster twelfth = new MoviePoster(22, "https://", "Бойцовский клуб", 2000, "триллер, драма");

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
        MoviePoster[] actual = manager.getAll();
        MoviePoster[] expected = new MoviePoster[]{fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }
}
