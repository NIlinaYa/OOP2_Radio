import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.mvnqa.Radio;

public class RadioTest {

    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStationMoreThan() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // *************   граничное значение -1,0,1  *******************
    // граничное значение -1
    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStatioNear__1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // граничное значение 0
    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStatioNear_0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // граничное значение +1
    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStatioNear_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // граничное значение 8,9,10
    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStatioNear_10() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // граничное значение 9
    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStatioNear_9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // граничное значение 8
    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentStatioNear_8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//класс эквивалентности  среднее значение
    public void shouldSetCurrentVolumeMoreThan() {
        Radio radio = new Radio();
        radio.setCurrentVolume(166);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// звук класс эквивалентности  среднее значение
    public void shouldSetCurrentVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-6);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// звук граничные значения минимальные -1/0/1
    public void shouldSetCurrentVolumeNearMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// звук граничные значения минимальные -1/0/1
    public void shouldSetCurrentVolumeNearMin_0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// звук граничные значения минимальные -1/0/1
    public void shouldSetCurrentVolumeNearMin_1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test// звук граничные значения минимальные 99/100/101
    public void shouldSetCurrentVolumeNearMax_99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// звук граничные значения минимальные 99/100/101
    public void shouldSetCurrentVolumeNearMax_100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// звук граничные значения минимальные 99/100/101
    public void shouldSetCurrentVolumeNearMax_101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test//переключаем на следующую станцию
    public void nextCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
//переключаем на следующую станцию граничные значения 8/9/  10  -  не тестируем, тюк  значение 10 недостежимо, уже проверяли ранее
    public void nextCurrentStationNear_8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключаем на следующую станцию граничные значения 8/9/10
    public void nextCurrentStationNear_9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключаем на следующую станцию граничные значения 1/0/
    public void nextCurrentStationNear_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключаем на следующую станцию граничные значения 0/1/
    public void nextCurrentStationNear_0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Предудущие  станции 0/1/8/9

    @Test//переключаем на предыдущую станцию граничные значения 0/1/8/9
    public void prevCurrentStationNear_0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключаем на предыдущую станцию граничные значения 0/1/8/9
    public void prevCurrentStationNear_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключаем на предыдущую станцию граничные значения 0/1/8/9
    public void prevCurrentStationNear_8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключаем на предыдущую станцию граничные значения 0/1/8/9
    public void prevCurrentStationNear_9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверка звука переключение предыдущего и последующего значения 0/1/50/99/100
    @Test//
    public void prevCurrentVolumeNear_0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//
    public void prevCurrentVolumeNear_1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//
    public void prevCurrentVolumeNear_51() {
        Radio radio = new Radio();
        radio.setCurrentVolume(51);

        radio.prevVolume();

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//
    public void prevCurrentVolumeNear_100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.prevVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//
    public void prevCurrentVolumeNear_99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.prevVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//0/1/50/99/100
    public void nextCurrentVolumeNear_0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//0/1/50/99/100
    public void nextCurrentVolumeNear_1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.nextVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//0/1/50/99/100
    public void nextCurrentVolumeNear_50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.nextVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//0/1/50/99/100
    public void nextCurrentVolumeNear_99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test//0/1/50/99/100
    public void nextCurrentVolumeNear_100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.nextVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //передача  данных максимальное  и минимальное значение звука и станций, через параметры


  /*  @Test//0/1/50/99/100  volumeCounts
    public void CurrentVolume_param() {
        Radio radio = new Radio(120);
        radio.setCurrentVolume(115);

        int expected = 115;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }*/

    @Test//
    public void CurrentStation_param() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}