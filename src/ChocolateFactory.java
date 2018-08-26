public class ChocolateFactory {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

        System.out.println("Filling chocolate milk");
        chocolateBoiler.fill();

        System.out.println("***");

        System.out.println("Boiling chocolate milk");
        chocolateBoiler.boil();

        System.out.println("***");

        System.out.println("Draining chocolate milk");
        chocolateBoiler.drain();

        System.out.println("***");

        System.out.println("Boiling chocolate milk");
        chocolateBoiler.boil();
        System.out.println("Chocolate Boiler won't boil because it's empty");

        System.out.println("***");

        chocolateBoiler.fill();

        System.out.println("Draining chocolate milk");
        chocolateBoiler.drain();
        System.out.println("Chocolate Boiler won't drain because it's not boiled");

        System.out.println("***");
    }
}
