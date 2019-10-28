package task02;

class ShopApp {
    public static void main(String[] args) {
        CuboidBox cuboidBox1 = new CuboidBox(10,20,0);
        CuboidBox cuboidBox2 = new CuboidBox(10,10,20);
        CuboidBox cuboidBox3 = new CuboidBox(10,10,10);
        CylinderBox cylinderBox1 = new CylinderBox(5,20);
        CylinderBox cylinderBox2 = new CylinderBox(10,20);

        CuboidProduct cuboidProduct1 = new CuboidProduct(8,8,20);
        SphereProduct sphereProduct1 = new SphereProduct(5);
        SphereProduct sphereProduct2 = new SphereProduct(6);

        Box[] boxes = new Box[5];
        boxes[0] = cuboidBox1;
        boxes[1] = cuboidBox2;
        boxes[2] = cuboidBox3;
        boxes[3] = cylinderBox1;
        boxes[4] = cylinderBox2;

        PackProduct packProduct = new PackProduct(boxes);

        System.out.println(packProduct.findBestBox(cuboidProduct1));
        System.out.println();
        System.out.println(packProduct.findBestBox(sphereProduct1));
        System.out.println();
        System.out.println(packProduct.findBestBox(sphereProduct2));
    }
}