package SmartHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void switchNextFm0() {
        Radio radio = new Radio();

        radio.setFm(0);

        int actual = radio.nextFm();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void switchNextFm5() {
        Radio radio = new Radio();

        radio.setFm(5);

        int actual = radio.nextFm();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void switchNextFm9() {
        Radio radio = new Radio();

        radio.setFm(9);

        int actual = radio.nextFm();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test // тест для покрытия
    public void switchNextFm10() {
        Radio radio = new Radio();

        radio.setFm(10);

        int actual = radio.nextFm();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void prevFm0() {
        Radio radio = new Radio();

        radio.setFm(0);

        int actual = radio.prevFm();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevFmMinus6() {
        Radio radio = new Radio();

        radio.setFm(-6);

        int actual = radio.prevFm();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevFm9() {
        Radio radio = new Radio();

        radio.setFm(9);

        int actual = radio.prevFm();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void getFm() {
        Radio radio = new Radio();

        radio.setFm(9);

        int actual = radio.getFm();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void setFm() {
        Radio radio = new Radio();

        radio.setFm(9);

        int actual = radio.getFm();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    void setVolume() {
        Radio radio = new Radio();

        radio.setVolume(6);

        int actual = radio.getVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume0() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int actual = radio.increaseVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume10() {
        Radio radio = new Radio();

        radio.setVolume(10);

        int actual = radio.increaseVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume11() {
        Radio radio = new Radio();

        radio.setVolume(11);

        int actual = radio.increaseVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume0() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int actual = radio.decreaseVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume10() {
        Radio radio = new Radio();

        radio.setVolume(10);

        int actual = radio.decreaseVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMinus2() {
        Radio radio = new Radio();

        radio.setVolume(-2);

        int actual = radio.decreaseVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}