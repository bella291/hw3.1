package SmartHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio(9, 0, 10, 100, 0);

    @Test
    public void nextFmTestNormal() {
        radio.setCurrentFm(4);
        radio.nextFm();
        assertEquals(5, radio.getCurrentFm());
    }

    @Test
    public void nextFmTestMaxBorder() {
        radio.setCurrentFm(10);
        radio.nextFm();
        assertEquals(0, radio.getCurrentFm());
    }

    @Test
    public void prevFmTestNormal() {
        radio.setCurrentFm(4);
        radio.prevFm();
        assertEquals(3, radio.getCurrentFm());
    }

    @Test
    public void prevFmTestMinBorder() {
        radio.setCurrentFm(0);
        radio.prevFm();
        assertEquals(9, radio.getCurrentFm());
    }

    @Test
    public void nextVolumeTestNormal() {
        radio.setCurrentVolume(4);
        radio.nextVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextVolumeTestMaxBorder() {
        radio.setCurrentVolume(100);
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void previousVolumeTestNormal() {
        radio.setCurrentVolume(4);
        radio.prevVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void prevVolumeTestMinBorder() {
        radio.setCurrentVolume(0);
        radio.prevVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMax() {
        radio.setCurrentVolume(90);
        radio.setCurrentVolume(102);
        assertEquals(90, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMin() {
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(-1);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentFmTestOverMax() {
        radio.setCurrentFm(5);
        radio.setCurrentFm(12);
        assertEquals(5, radio.getCurrentFm());
    }

    @Test
    public void setCurrentFmTestUnderMinStation() {
        radio.setCurrentFm(5);
        radio.setCurrentFm(-1);
        assertEquals(5, radio.getCurrentFm());
    }
}
