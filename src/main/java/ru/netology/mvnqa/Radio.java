package ru.netology.mvnqa;

public class Radio {
    private int currentStation; // поле текущая станция. privet-закрыта для всех, кроме метода.
    private int currentVolume;// поле текущая громкость
    private int maxStation;
    private int maxVolume;

    public Radio() {
        this.currentStation = 1; // По умолчанию устанавливаем первую станцию
        this.currentVolume = 50; // Средняя громкость по умолчанию
        this.maxStation = 9;
        this.maxVolume = 100;
    }

    public Radio(int stationsCount) {//передача  зачение максимальной величины станций  =- черехз конструктор
        this.maxStation = stationsCount - 1;
        this.currentStation = 1; // По умолчанию устанавливаем первую станцию
    }

    /*public Radio(int volumeCounts) {
        this.maxVolume = volumeCounts - 1;
        //this.currentVolume = 50; // Средняя громкость по умолчанию

    }*/


    //1
    public int getCurrentStation() {// берут значение  из поля и возвращают нам. получаем данные текущем значении поля
        return currentStation;
    }


    //1
    public int getCurrentVolume() {// берут значение  из поля и возвращают нам. получаем данные текущем значении поля
        return currentVolume;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void nextVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }


    // проверка  сеттера на передаваемы в него параиетры. Если  не в заданном разрешенном диапахоне, то новое значение не присваивается
//1
    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    //1
// проверка  сеттера на передаваемы в него параиетры. Если  не в заданном разрешенном диапахоне, то новое значение не присваивается
    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


  /*  public void setToMaxStation() { //выставление максимального значения станции
        currentStation = 9;
    }*/

    /*  public void setToMinStation() { //выставление минимального значения станции
          currentStation = 0;
      }
  */


}
