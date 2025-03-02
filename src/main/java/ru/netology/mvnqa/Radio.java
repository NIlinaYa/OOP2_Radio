package ru.netology.mvnqa;

public class Radio {
    private int currentStation; // поле текущая станция. privet-закрыта для всех, кроме метода.
    private int currentVolume;// поле текущая громкость


    public int getCurrentStation() {// берут значение  из поля и возвращают нам. получаем данные текущем значении поля
        return currentStation;
    }

    public int getCurrentVolume() {// берут значение  из поля и возвращают нам. получаем данные текущем значении поля
        return currentVolume;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void nextStation() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 100;
        }
    }

    public void nextVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }


    // проверка  сеттера на передаваемы в него параиетры. Если  не в заданном разрешенном диапахоне, то новое значение не присваивается
    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {// изначально проверка
            return;
        }
        this.currentStation = currentStation;
    }

    // проверка  сеттера на передаваемы в него параиетры. Если  не в заданном разрешенном диапахоне, то новое значение не присваивается
    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}
