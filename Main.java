public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Engine engine1 = new Engine();
        Transmission transmission1 = new Transmission();

        car1.setBrand("BMW");
        car1.setYear(2022);
        car1.setMileage(10000);

        engine1.setSpeed(150);
        transmission1.setGears(6);

        car1.doubleMileage();
        transmission1.increaseGearsTwice();

        car1.complexLogic(engine1, transmission1);

        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());
        System.out.println("Speed: " + engine1.getSpeed());
        System.out.println("Gears: " + transmission1.getGears());
        System.out.println();


        // Виклик статичних методів через ім'я класу
        AddClass.setYear(2022);
        AddClass.printCarDetails();
    }
}