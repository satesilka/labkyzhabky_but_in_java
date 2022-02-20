public record Cup(int volume, String material, String colour, String brand, int diameter, boolean isForBeer) {
    public Cup() {
        this(0, "", "", "", 0, true);
    }

    public Cup(int volume, String material, String colour) {
        this(volume, material, colour, "", 0, true);
    }

    public String toString() {
        return String.format("Cup(%d, %s, %s, %s, %d, %b)", volume, material, colour, brand, diameter, isForBeer);
    }

    static String bestBrand;

    public static String getBestBrand() {
        return bestBrand;
    }
}
