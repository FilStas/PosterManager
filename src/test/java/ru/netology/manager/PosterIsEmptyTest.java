package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterIsEmptyTest {
    private PosterManager manager = new PosterManager();

    @Test
    public void shouldPrintBlankPoster() {
        MoviePoster[] actual = manager.getAll();
        MoviePoster[] expected = new MoviePoster[]{};

        assertArrayEquals(expected, actual);

    }
}
