public class Main {
    public static void main(String[] args) {
        Desktop d = new Desktop(3.5, 8, 500, true);
        System.out.println(d.toString());
        Laptop l = new Laptop(3.1, 32, 500, true, 7);
        System.out.println(l.toString());
        Fridge f = new Fridge(15.6, false, "gray");
        System.out.println(f.toString());
        ElectronicStore e = new ElectronicStore("veronica's store");
        e.printStock();
        System.out.println(e.searchStock("HDD"));
        System.out.println(e.ElectricStoreTester());


    }
}
