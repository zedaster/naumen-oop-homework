package ru.oop;

import ru.oop.transport.Transport;

import java.util.List;

/**
 * Путь из одной точки в другую с использованием цепочки из транспорта посередине.
 * Начальная и/или конечная точка пути могут не совпадать с локациями отправления/приезда транспорта.
 * От одного траспорта до другого в цепочке возможно придется дойти пешком
 */
public class Route {
    private final Position startPosition;
    private final Position endPosition;

    private final List<Transport> transportList;

    public Route(Position startPosition, Position endPosition, List<Transport> transportList) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.transportList = transportList;
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
     * Возвращает цепочку транспорта, на которых необходимо по порядку будет добраться для совершения данного маршрута
     * Начальная и/или конечная точка пути могут не совпадать с локациями отправления/приезда транспорта.
     * Возможно понадобиться дойти пешком от одного траспорта к другому
     */
    public List<Transport> getTransportList() {
        return transportList;
    }
}
