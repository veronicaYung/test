public class Desktop {

    double cpuSpeed;
    int ram;
    int storage;
    boolean ssd;

    public Desktop(double cpuSpeed, int ram, int storage, boolean ssd) {
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.storage = storage;
        this.ssd = ssd;

    }

    public String toString() {
        String ssdVal = "SSD drive";
        if (!ssd) {
            ssdVal = "HDD drive";
        }
        return "Desktop PC with " + cpuSpeed + "ghz," + ram + "GB RAM," + storage + "GB," + ssdVal;


    }
}



