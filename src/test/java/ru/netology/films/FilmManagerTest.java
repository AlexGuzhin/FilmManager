package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    @Test
    public void addFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAllFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastFilm() {
        FilmManager manager = new FilmManager(3);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли.Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
