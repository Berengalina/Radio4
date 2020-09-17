package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    int currentStationNumber;
    int minStationNumber;
    int maxStationNumber;
    int currentVolume;
    int minVolume;
    int maxVolume;


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