package ru.oop;

// TODO Реализовать данный интерфейс
public interface Transport extends Positioned {
    /**
     * Передивгает траснпорт и его пассажиров как можно ближе к position
     */
    void goCloseTo(Position position);

    /**
     * Добавляет пассажира в транспорт
     */
    void addPassenger(Person person);

    /**
     * Удаляет пассажира из транспорта
     */
    void removePassenger(Person person);
}
