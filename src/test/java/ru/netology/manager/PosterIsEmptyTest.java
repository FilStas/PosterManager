package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterMovie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterIsEmptyTest {
    private AfishaManager manager = new AfishaManager();

    @Test
    public void shouldPrintBlankPoster() {
        PosterMovie[] actual = manager.getAll();
        PosterMovie[] expected = new PosterMovie[]{};

        assertArrayEquals(expected, actual);

    }
}
