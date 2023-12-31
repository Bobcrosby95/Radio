package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadiostation) {
        if (newCurrentRadiostation > 9) {
            return;
        }
        if (newCurrentRadiostation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadiostation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseRadiostation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void decreaseRadiostation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }
}
