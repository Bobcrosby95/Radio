package ru.netology.javaqa;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int quantityRadioStation = 10;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int currentRadioStation = minNumberRadioStation;

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public Radio() {

    }

    public int getMaxNumberRadioStation() {

        return maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberRadioStation;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > quantityRadioStation - 1) {
            return;
        }
        if (newCurrentRadioStation < minNumberRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseRadioStation() {
        if (currentRadioStation < quantityRadioStation - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > minNumberRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == minNumberRadioStation) {
            currentRadioStation = 9;
        }
    }
}
