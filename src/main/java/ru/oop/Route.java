package ru.oop;

/**
 * Путь из одной точки в другую с использованием транспорта посередине
 * (Начальная и/или конечная точка могут не совпадать с локацией транспорта)
 */
public class Route {
    private final Position startPosition;
    private final Position endPosition;

    private final Transport transport;

    public Route(Position startPosition, Position endPosition, Transport transport) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.transport = transport;
    }

    /**
     * Возвращает отправную точку данного маршрута
     * Она может не совпадать с точкой старта поездки на траспорте
     */
    public Position getStartPosition() {
        return startPosition;
    }

    /**
     * Возвращает конечную точку данного маршрута
     * Она может не совпадать с точкой конца поездки на траспорте
     */
    public Position getEndPosition() {
        return endPosition;
    }

    /**
     * Возвращает транспорт, на котором необходимо будет добраться для совершения данного маршрута
     */
    public Transport getTransport() {
        return transport;
    }
}
