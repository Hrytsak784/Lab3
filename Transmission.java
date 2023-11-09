public class Transmission {
    private int gears;

    public Transmission() {
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void increaseGearsTwice() {
        gears *= 2;
    }

}
