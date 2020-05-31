package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(-20);
        conditioner.setCurrentTemperature(19);
        conditioner.setOn(true);
        conditioner.increaseCurrentTemperature();
        int expected = 20;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(11);
        conditioner.setOn(true);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeDisabled() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(11);
        conditioner.setOn(false);
        conditioner.increaseCurrentTemperature();
        int expected = 11;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTemperatureMoreMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.setOn(false);
        conditioner.increaseCurrentTemperature();
        int expected = 20;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTemperatureMoreMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.setOn(false);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseTemperatureMoreMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.setOn(true);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldConditionerOn() {
        Conditioner condition = new Conditioner();
        condition.setName("LG");
        condition.setMaxTemperature(20);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(15);
        condition.setOn(true);
        int expected = 15;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void basicTemperatureMoreMax() {
        Conditioner condition = new Conditioner();
        condition.setName("LG");
        condition.setMaxTemperature(20);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(25);
        condition.setOn(true);
        int expected = 0;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void basicTemperatureMoreMin() {
        Conditioner condition = new Conditioner();
        condition.setName("LG");
        condition.setMaxTemperature(20);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(5);
        condition.setOn(true);
        int expected = 0;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}