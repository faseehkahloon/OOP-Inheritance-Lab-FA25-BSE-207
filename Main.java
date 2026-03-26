public class Main {
    public static void main(String[] args) {

        System.out.println("----- Device Object -----");

        Device d1 = new Device("Samsung", "Basic", false);
        d1.powerOn();
        d1.displayInfo();

        System.out.println("\n----- Computer Object -----");

        Computer c1 = new Computer("Dell", "Optiplex", true,
                "Intel i5", 8, 512);

        c1.displayInfo();

        System.out.println("Computer Specs:");
        c1.showSpecs();

        int power = c1.calculatePowerUsage();
        System.out.println("Power Usage: " + power);

        System.out.println("\n----- Laptop Object -----");

        Laptop l1 = new Laptop("HP", "EliteBook", true,
                "Intel i7", 16, 1024, 75, 15.6);

        l1.displayInfo();
        l1.chargeBattery();
    }
}

