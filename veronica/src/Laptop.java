public class Laptop {

    double cpuSpeed;
    int ram;
    int storage;
    boolean ssd;
    int screenSize;

    public Laptop(double cpuSpeed, int ram, int storage, boolean ssd, int screenSize) {
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.storage = storage;
        this.ssd = ssd;
        this.screenSize = screenSize;
    }

    public String toString() {
        String ssdVal = "SSD drive";
        if (!ssd) {
            ssdVal = "HDD drive";
        }
        return screenSize + " inch" + " Laptop PC with " + cpuSpeed + "ghz," + ram + "GB RAM," + storage + "GB," + ssdVal;


    }


}
