package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(4);
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.increaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(5, radio.currentStationNumber);

    }

    @Test
    public void shouldDecreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(3);
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        System.out.println("StationNumber before decrease is " + radio.currentStationNumber);
        radio.decreaseStationNumber();
        System.out.println("StationNumber after decrease is " + radio.currentStationNumber);
        assertEquals(2, radio.currentStationNumber);

    }

    @Test
    public void shouldReloadCurrentStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.increaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(0, radio.currentStationNumber);

    }

    @Test
    public void shouldReloadCurrentStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.decreaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(9, radio.currentStationNumber);

    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        System.out.println("Volume before increase is " + radio.currentVolume);
        radio.increaseVolume();
        System.out.println("Volume after increase is " + radio.currentVolume);
        assertEquals(7, radio.currentVolume);

    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        System.out.println("Volume before decrease is " + radio.currentVolume);
        radio.decreaseVolume();
        System.out.println("Volume after decrease is " + radio.currentVolume);
        assertEquals(0, radio.currentVolume);

    }

    @Test
    public void shouldNotReloadVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        System.out.println("Volume before increase is " + radio.currentVolume);
        radio.increaseVolume();
        System.out.println("Volume after increase is " + radio.currentVolume);
        assertEquals(10, radio.currentVolume);

    }

    @Test
    public void shouldNotReloadVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        System.out.println("Volume before decrease is " + radio.currentVolume);
        radio.decreaseVolume();
        System.out.println("Volume after decrease is " + radio.currentVolume);
        assertEquals(0, radio.currentVolume);

    }

}