package task02;

class CuboidBox extends Box {
    private static final String SHAPE = "cuboid";
    private double baseWidth;
    private double baseLength;
    private double height;

    CuboidBox(double baseWidth, double baseLength, double height) {
        //this.shape = SHAPE;
        setShape(SHAPE);
        this.baseWidth = baseWidth;
        this.baseLength = baseLength;
        this.height = height;
    }

    public static String getSHAPE() {
        return SHAPE;
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Najbardziej pasujące opakowanie na produkt to prostopadłościan (" + getShape()  + ").\n" +
                "Szerokość podstawy: " + baseWidth + ", Długość podstawy: " + baseLength + ", Wysokość: " + height;
    }
}
