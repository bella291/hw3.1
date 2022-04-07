package SmartHome;

public class Radio {

    // переключение станций

    private int fm; // инкапсуляция
    private int firstFm = 0;
    private int lastFm = 9;
    private int volume;
    private int firstVolume = 0;
    private int lastVolume = 10;

    public void setFm(int fm) { //ранний выход сделать
        if (fm < firstFm) {
            return;
        }
        if (fm > lastFm) {
            return;
        }
        this.fm = fm;
    }

    public int getFm() { // форматировать код
        return fm;
    }

    public int nextFm() { // ошибка переключения, найти в других местах
        if (fm < lastFm) {
            this.fm = fm + 1;
        } else {
            this.fm = firstFm;
        }
        return this.fm;
    }

    public int prevFm() { // здесь тоже была ошибка переключения
        if (fm > firstFm) {
            fm = this.fm - 1;
        } else {
            this.fm = lastFm;
        }
        return this.fm;
    }

// переключение громкости

    public void setVolume(int volume) {
        if (volume < firstVolume) {
            return;
        }
        if (volume > lastVolume) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int increaseVolume() {
        if (volume < lastVolume) {
            this.volume = volume + 1;
        } else {
            this.volume = lastVolume;
        }
        return this.volume;
    }

    public int decreaseVolume() {
        if (volume > firstVolume) {
            volume = volume - 1;
        } else {
            this.volume = firstVolume;
        }
        return this.volume;
    }
}
