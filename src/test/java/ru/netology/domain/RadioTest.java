package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(4, 0, 10, 6, 0, 100);

    @Test
    public void shouldGetMaxStation() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.getMaxStationNumber();
        assertEquals(10, radio.maxStationNumber);
    }

    @Test
    public void shouldGetMinStation() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.getMinStationNumber();
        assertEquals(0, radio.minStationNumber);
    }

    @Test
    public void shouldGetCurrentStation() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.getCurrentStationNumber();
        assertEquals(4, radio.currentStationNumber);
    }

    @Test
    public void shouldGetMaxVolume() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.getMaxVolume();
        assertEquals(100, radio.maxVolume);
    }

    @Test
    public void shouldGetMinVolume() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.getMinVolume();
        assertEquals(0, radio.minVolume);
    }

    @Test
    public void shouldGetCurrentVolume() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.getCurrentVolume();
        assertEquals(6, radio.currentVolume);
    }

    @Test
    public void shouldSetMaxStation() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.setMaxStationNumber(25);
        assertEquals(25, radio.maxStationNumber);
    }

    @Test
    public void shouldSetMinStation() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.setMinStationNumber(2);
        assertEquals(2, radio.minStationNumber);
    }

    @Test
    public void shouldSetCurrentStation() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.setCurrentStationNumber(8);
        assertEquals(8, radio.currentStationNumber);
    }

    @Test
    public void shouldSetMaxVolume() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.setMaxVolume(200);
        assertEquals(200, radio.maxVolume);
    }

    @Test
    public void shouldSetMinVolume() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.setMinVolume(11);
        assertEquals(11, radio.minVolume);
    }

    @Test
    public void shouldSetCurrentVolume() {  //Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
        radio.setCurrentVolume(99);
        assertEquals(99, radio.currentVolume);
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

    @Test
    public void testToString() {
        String expected = "Radio(currentStationNumber=4, minStationNumber=0, maxStationNumber=10, currentVolume=6, minVolume=0, maxVolume=100)";
        assertEquals(expected, radio.toString());
    }

    @Test
    public void testCanEqual (){
       boolean expected = false;
       assertEquals(expected, radio.canEqual(radio.currentStationNumber));
    }

    @Test
    public void sholdTestEqual (){
        boolean expected = radio.equals(5);
        assertEquals(false, radio.canEqual(radio.currentStationNumber));
    }

    @Test
    public void testDefaultConstructor (){
        Radio radio = new Radio ();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.currentVolume);

    }

}