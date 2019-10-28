package task02;

class SphereProduct extends Product {
    private static final String SHAPE = "sphere";
    private double radius;

    SphereProduct(double radius) {
        this.shape = SHAPE;
        this.radius = radius;
    }

    public static String getSHAPE() {
        return SHAPE;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
