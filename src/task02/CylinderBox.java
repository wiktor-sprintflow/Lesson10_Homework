package task02;

class CylinderBox extends Box {
    private static final String SHAPE = "cylinder";
    private double baseRadius;
    private double height;

    CylinderBox(double baseRadius, double height) {
        //this.shape = SHAPE;
        setShape(SHAPE);
        this.baseRadius = baseRadius;
        this.height = height;
    }

    public static String getSHAPE() {
        return SHAPE;
    }

    public double getBaseRadius() {
        return baseRadius;
    }

    public void setBaseRadius(double baseRadius) {
        this.baseRadius = baseRadius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Najbardziej pasujące opakowanie na produkt to walec (" + getShape() + ").\n" +
                "Promień podstawy: " + baseRadius + ", Wysokość: " + height;
    }
}