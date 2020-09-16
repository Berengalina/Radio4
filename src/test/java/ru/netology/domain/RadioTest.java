package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(0, 10, 0, 100);

    @Test
    public void shouldGetMaxStation() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.getMaxStationNumber();
        assertEquals(10, radio.maxStationNumber);
    }

    @Test
    public void shouldIncreaseCurrentStation() {   //Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций, указанных при создании (см. п.1)
        radio.setCurrentStationNumber(4);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.increaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(5, radio.currentStationNumber);
    }

    @Test
    public void shouldDecreaseCurrentStation() {  //Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций, указанных при создании (см. п.1)
        radio.setCurrentStationNumber(3);
        System.out.println("StationNumber before decrease is " + radio.currentStationNumber);
        radio.decreaseStationNumber();
        System.out.println("StationNumber after decrease is " + radio.currentStationNumber);
        assertEquals(2, radio.currentStationNumber);
    }

    @Test
    public void shouldReloadCurrentStationToMin() {  //Если текущая радиостанция - максимальная, и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
        radio.setCurrentStationNumber(10);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.increaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(0, radio.currentStationNumber);

    }

    @Test
    public void shouldReloadCurrentStationToMax() {  //Если текущая радиостанция - 0, и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать максимальная
        radio.setCurrentStationNumber(0);
        System.out.println("StationNumber before increase is " + radio.currentStationNumber);
        radio.decreaseStationNumber();
        System.out.println("StationNumber after increase is " + radio.currentStationNumber);
        assertEquals(10, radio.currentStationNumber);
    }


    @Test
    public void shouldIncreaseCurrentVolume() {   //Клиент должен иметь возможность увеличивать уровень громкости звука (в пределах от 0 до 100)
        radio.setCurrentVolume(6);
        System.out.println("Volume before increase is " + radio.currentVolume);
        radio.increaseVolume();
        System.out.println("Volume after increase is " + radio.currentVolume);
        assertEquals(7, radio.currentVolume);

    }

    @Test
    public void shouldDecreaseCurrentVolume() {         //Клиент должен иметь возможность уменьшать уровень громкости звука (в пределах от 0 до 100)
        radio.setCurrentVolume(6);
        System.out.println("Volume before decrease is " + radio.currentVolume);
        radio.decreaseVolume();
        System.out.println("Volume after decrease is " + radio.currentVolume);
        assertEquals(5, radio.currentVolume);

    }

    @Test
    public void shouldNotReloadVolumeMax() {        //Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
        radio.setCurrentVolume(100);
        System.out.println("Volume before increase is " + radio.currentVolume);
        radio.increaseVolume();
        System.out.println("Volume after increase is " + radio.currentVolume);
        assertEquals(100, radio.currentVolume);

    }

    @Test
    public void shouldNotReloadVolumeMin() {        //Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
        radio.setCurrentVolume(0);
        System.out.println("Volume before decrease is " + radio.currentVolume);
        radio.decreaseVolume();
        System.out.println("Volume after decrease is " + radio.currentVolume);
        assertEquals(0, radio.currentVolume);

    }

}