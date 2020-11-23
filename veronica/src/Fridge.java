public class Fridge {
    double size;
    boolean type;
    String color;

    public Fridge(double size, boolean type, String color) {

        this.size = size;
        this.type = type;
        this.color = color;

    }

    public String toString() {
        String freezer = " with Freezer";
        if (!type) {
            freezer = " ";
        }

        return size + " cubic foot Fridge" + freezer + "(" + color + ")";


    }


}
