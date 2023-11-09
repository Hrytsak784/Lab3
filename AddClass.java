public class AddClass{
    public static String Dealer;
    public static int year;

    static {
        Dealer = "BMW";
    }

    // Перший статичний метод, використовує усі статичні параметри
    public static void setYear(int carYear) {
        year = carYear;
        System.out.println("dealer: " + Dealer);
        System.out.println("Year: " + year);
    }

    // Другий статичний метод, використовує результат роботи першого методу
    public static void printCarDetails() {
        setYear(2023);
        System.out.println("Car Details:");
        System.out.println("Dealer: " + Dealer);
        System.out.println("Year: " + year);
    }
}


