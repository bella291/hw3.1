package SmartHome;

public class Radio {

    private int currentFm;
    private int numberOfStations;
    private int lastFm = 9;
    private int firstFm = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentFm() {
        return currentFm;
    }

    public int getLastFm() {
        return lastFm;
    }

    public int getFirstFm() {
        return firstFm;
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

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentFm(int currentFm) {
        if (currentFm > numberOfStations) {
            return;
        }
        if (currentFm < firstFm) {
            return;
        }
        this.currentFm = currentFm;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextFm() {
        int currentFm = this.currentFm;
        if (currentFm >= numberOfStations) {
            this.currentFm = firstFm;
        } else {
            this.currentFm = currentFm + 1;
        }
    }

    public void prevFm() {
        int currentFm = this.currentFm;
        if (currentFm <= firstFm) {
            this.currentFm = lastFm;
        } else {
            this.currentFm = currentFm - 1;
        }
    }

    public void nextVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void prevVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}

