package ru.netology.domain;

public class Radio {
    int currentStationNumber;
    int minStationNumber;
    int maxStationNumber;
    int currentVolume;
    int minVolume;
    int maxVolume;


    public Radio(int minStationNumber, int maxStationNumber, int minVolume, int maxVolume) {
        this.minStationNumber = minStationNumber;
        this.maxStationNumber = maxStationNumber;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }


    public void setCurrentVolume(int volume) {
        this.currentVolume = volume;
    }


    public void increaseStationNumber() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber += 1;
        }
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = 0;
        }
    }

    public void decreaseStationNumber() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber -= 1;
        }
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = 10;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }

}