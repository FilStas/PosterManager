package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.PosterMovie;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {

    @Mock
    private AfishaRepository repository;

    @InjectMocks
    private AfishaManager manager;
    private PosterMovie first = new PosterMovie(11, "https://", "Побег из Шоушенка", 1994, "драма");
    private PosterMovie second = new PosterMovie(12, "https://", "Зелёная миля", 2000, "фантастика, драма");
    private PosterMovie third = new PosterMovie(13, "https://", "Форрест Гамп", 1994, "драма, мелодрама");
    private PosterMovie fourth = new PosterMovie(14, "https://", "Список Шиндлера", 1994, "драма, биография");
    private PosterMovie fifth = new PosterMovie(15, "https://", "1 + 1", 2012, "драма, комедия");
    private PosterMovie sixth = new PosterMovie(16, "https://", "Иван Васильевич меняет профессию", 1973, "фантастика, комедия");
    private PosterMovie seventh = new PosterMovie(17, "https://", "Крестный отец", 1972, "драма");
    private PosterMovie eighth = new PosterMovie(18, "https://", "В бой идут одни старики", 1974, "драма, комедия");
    private PosterMovie ninth = new PosterMovie(19, "https://", "Операция Ы и другие приключения Шурика", 1965, "мелодрама, комедия");
    private PosterMovie tenth = new PosterMovie(20, "https://", "Леон", 1994, "боевик, триллер");
    private PosterMovie eleventh = new PosterMovie(21, "https://", "Начало", 2010, "фантастика, боевик");
    private PosterMovie twelfth = new PosterMovie(22, "https://", "Бойцовский клуб", 2000, "триллер, драма");

    @Test
    void shouldAddMovie() {
        PosterMovie[] returned = new PosterMovie[]{twelfth};
        doReturn(returned).when(repository).findAll();

        manager.add(twelfth);
        PosterMovie[] expected = new PosterMovie[]{twelfth};
        PosterMovie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
        verify(repository).save(any());
        verify(repository).findAll();
    }

    @Test
    void shouldAddMoviesAndRevertBackToDefault() {
        PosterMovie[] movies = new PosterMovie[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        doReturn(movies).when(repository).findAll();

        PosterMovie[] expected = new PosterMovie[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        PosterMovie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }

    @Test
    void shouldRemoveById() {
        int moveId = 15;
        PosterMovie[] movies = new PosterMovie[]{first, second, third, fourth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        doReturn(movies).when(repository).findAll();

        manager.removeById(moveId);
        PosterMovie[] expected = new PosterMovie[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fourth, third, second};
        PosterMovie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
        verify(repository).removeById(moveId);
    }


    @Test
    void shouldFindById() {
        int movieId = 15;
        PosterMovie returned = fifth;
        doReturn(returned).when(repository).findById(movieId);

        PosterMovie expected = fifth;
        PosterMovie actual = manager.findById(movieId);

       assertEquals (expected, actual);
        verify(repository).findById(movieId);
    }

    @Test
    void shouldRemoveAll() {
        PosterMovie[] returned = new PosterMovie[]{};
        doReturn(returned).when(repository).findAll();

        manager.removeAll();
        PosterMovie[] expected = new PosterMovie[]{};
        PosterMovie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
        verify(repository).removeAll();
        verify(repository).findAll();
    }
}