package ru.netology.mvnqa;

public class Main {

    private int currentStation;
    private int volume;

    public void Radio() {
        this.currentStation = 0; // По умолчанию устанавливаем первую станцию
        this.volume = 50; // Средняя громкость по умолчанию
        System.out.println("текущая станция " +  currentStation );
        System.out.println("текущая громкость " +  volume );
    }

}