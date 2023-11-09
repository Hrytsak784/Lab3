public class AddClass{
    // Щонайменше дві статичні змінні класу
    public static String Dealer;
    public static int year;

    // Статичний блок ініціалізації для іншої статичної змінної
    static {
        Dealer = "BMW";
    }

    // Перший статичний метод, використовує усі статичні змінні
    public static void setYear(int carYear) {
        year = carYear;
        System.out.println("dealer: " + Dealer);
        System.out.println("Year: " + year);
    }

    // Другий статичний метод, використовує результати роботи першого методу
    public static void printCarDetails() {
        setYear(2023);
        System.out.println("Car Details:");
        System.out.println("Dealer: " + Dealer);
        System.out.println("Year: " + year);
    }
}


