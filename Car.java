public class Car {
    private String brand;
    private int year;
    private int mileage;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void doubleMileage() {
        mileage *= 2;
    }

    public void complexLogic(Engine engine, Transmission transmission) {
        int speed = engine.getSpeed();
        int gears = transmission.getGears();
        System.out.println("Автомобіль їде зі швидкістю " + speed + " км/год на " + gears + " передачі.");
    }


}
