package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterMovie;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    private AfishaRepository repository = new AfishaRepository();
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

    @BeforeEach
    public void setUp() {
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);
        repository.save(twelfth);
    }

    @Test
    void save() {

    }

    @Test
    void findAll() {
    }

    @Test
    void removeById() {
    }

    @Test
    void findById() {
    }

    @Test
    void removeAll() {
    }
}