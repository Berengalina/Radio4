package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(4, 0, 10, 6, 0, 100);

    @Test
    public void shouldGetMaxStation() {
        radio.getMaxStationNumber();
        assertEquals(10, radio.maxStationNumber);
    }

    @Test
    public void shouldGetMinStation() {
        radio.getMinStationNumber();
        assertEquals(0, radio.minStationNumber);
    }

    @Test
    public void shouldGetCurrentStation() {
        radio.getCurrentStationNumber();
        assertEquals(4, radio.currentStationNumber);
    }

    @Test
    public void shouldGetMaxVolume() {
        radio.getMaxVolume();
        assertEquals(100, radio.maxVolume);
    }

    @Test
    public void shouldGetMinVolume() {
        radio.getMinVolume();
        assertEquals(0, radio.minVolume);
    }

    @Test
    public void shouldGetCurrentVolume() {
        radio.getCurrentVolume();
        assertEquals(6, radio.currentVolume);
    }

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxStationNumber(25);
        assertEquals(25, radio.maxStationNumber);
    }

    @Test
    public void shouldSetMinStation() {
        radio.setMinStationNumber(2);
        assertEquals(2, radio.minStationNumber);
    }

    @Test
    public void shouldSetCurrentStation() {
        radio.setCurrentStationNumber(8);
        assertEquals(8, radio.currentStationNumber);
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setMaxVolume(200);
        assertEquals(200, radio.maxVolume);
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setMinVolume(11);
        assertEquals(11, radio.minVolume);
    }

    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(99);
        assertEquals(99, radio.currentVolume);
    }

    @Test
    public void shouldIncreaseCurrentStation() {
        radio.setCurrentStationNumber(4);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.increaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(5, radio.currentStationNumber);
    }

    @Test
    public void shouldDecreaseCurrentStation() {
        radio.setCurrentStationNumber(3);
        System.out.println("StationNumber before decrease is " + radio.currentStationNumber);
        radio.decreaseStationNumber();
        System.out.println("StationNumber after decrease is " + radio.currentStationNumber);
        assertEquals(2, radio.currentStationNumber);
    }

    @Test
    public void shouldReloadCurrentStationToMin() {
        radio.setCurrentStationNumber(10);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.increaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(0, radio.currentStationNumber);

    }

    @Test
    public void shouldReloadCurrentStationToMax() {
        radio.setCurrentStationNumber(0);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.decreaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(10, radio.currentStationNumber);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(6);
        System.out.println("Volume before increase is " + radio.currentVolume);
        radio.increaseVolume();
        System.out.println("Volume after increase is " + radio.currentVolume);
        assertEquals(7, radio.currentVolume);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(6);
        System.out.println("Volume before decrease is " + radio.currentVolume);
        radio.decreaseVolume();
        System.out.println("Volume after decrease is " + radio.currentVolume);
        assertEquals(5, radio.currentVolume);
    }

    @Test
    public void shouldNotReloadVolumeMax() {
        radio.setCurrentVolume(100);
        System.out.println("Volume before increase is " + radio.currentVolume);
        radio.increaseVolume();
        System.out.println("Volume after increase is " + radio.currentVolume);
        assertEquals(100, radio.currentVolume);
    }

    @Test
    public void shouldNotReloadVolumeMin() {
        radio.setCurrentVolume(0);
        System.out.println("Volume before decrease is " + radio.currentVolume);
        radio.decreaseVolume();
        System.out.println("Volume after decrease is " + radio.currentVolume);
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void testDefaultConstructor() {   //тест на проверку дефолтного коструктора
        Radio radio1 = new Radio();
        radio1.setCurrentVolume(50);
        assertEquals(50, radio1.currentVolume);
    }
}