package task02;

class PackProduct {
    private Box[] boxes;
    private double remainingVolume;
    private int selectedBoxNumber;

    PackProduct(Box[] boxes) {
        this.boxes = boxes;
        this.remainingVolume = Double.MAX_VALUE;
        this.selectedBoxNumber = -1;
    }

    public Box[] getBoxes() {
        return boxes;
    }

    public void setBoxes(Box[] boxes) {
        this.boxes = boxes;
    }

    public double getRemainingVolume() {
        return remainingVolume;
    }

    public int getSelectedBoxNumber() {
        return selectedBoxNumber;
    }

    Box findBestBox(Product product) {

        //if (product.shape.equals(CuboidProduct.getSHAPE())) {
        if (product.getShape().equals(CuboidProduct.getSHAPE())) {
            for (int i = 0; i < boxes.length; i++) {
                //if (boxes[i].shape.equals(CuboidBox.getSHAPE())) {
                if (boxes[i].getShape().equals(CuboidBox.getSHAPE())) {
                    //cuboid into cuboid
                    if (fitProductIntoBox((CuboidProduct) product, (CuboidBox) boxes[i])) {
                        double difference = remainingVolume((CuboidProduct) product, (CuboidBox) boxes[i]);
                        if (difference < remainingVolume) {
                            selectBox(difference, i);
                        }
                    }
                //} else if (boxes[i].shape.equals(CylinderBox.getSHAPE())) {
                } else if (boxes[i].getShape().equals(CylinderBox.getSHAPE())) {
                    //cuboid into cylinder
                    if (fitProductIntoBox((CuboidProduct) product, (CylinderBox) boxes[i])) {
                        double difference = remainingVolume((CuboidProduct) product, (CylinderBox) boxes[i]);
                        if (difference < remainingVolume) {
                            selectBox(difference, i);
                        }
                    }
                } else {
                    System.out.println("Nieznane opakowanie w zestawie.");
                    break;
                }
            }

        //} else if (product.shape.equals(SphereProduct.getSHAPE())) {
        } else if (product.getShape().equals(SphereProduct.getSHAPE())) {
            for (int i = 0; i < boxes.length; i++) {
                //if (boxes[i].shape.equals(CuboidBox.getSHAPE())) {
                if (boxes[i].getShape().equals(CuboidBox.getSHAPE())) {
                    //sphere into cuboid
                    if (fitProductIntoBox((SphereProduct) product, (CuboidBox) boxes[i])) {
                        double difference = remainingVolume((SphereProduct) product, (CuboidBox) boxes[i]);
                        if (difference < remainingVolume) {
                            selectBox(difference, i);
                        }
                    }
                //} else if (boxes[i].shape.equals(CylinderBox.getSHAPE())) {
                } else if (boxes[i].getShape().equals(CylinderBox.getSHAPE())) {
                    //sphere into cylinder
                    if (fitProductIntoBox((SphereProduct) product, (CylinderBox) boxes[i])) {
                        double difference = remainingVolume((SphereProduct) product, (CylinderBox) boxes[i]);
                        if (difference < remainingVolume) {
                            selectBox(difference, i);
                        }
                    }
                } else {
                    System.out.println("Nieznane opakowanie w zestawie.");
                    break;
                }
            }

        } else
            System.out.println("Nieznany produkt.");

        int resultBoxNumber = selectedBoxNumber;
        setDefaultValues();
        return (resultBoxNumber > 0) ? boxes[resultBoxNumber] : null;
    }

    private boolean fitProductIntoBox(CuboidProduct cuboidProduct, CuboidBox cuboidBox) {
        return (cuboidProduct.getHeight() <= cuboidBox.getHeight() &&
                Math.sqrt(Math.pow(cuboidProduct.getBaseLength(), 2) + Math.pow(cuboidProduct.getBaseWidth(), 2))
                        <= Math.sqrt(Math.pow(cuboidBox.getBaseLength(), 2) + Math.pow(cuboidBox.getBaseWidth(), 2)));
    }

    private boolean fitProductIntoBox(CuboidProduct cuboidProduct, CylinderBox cylinderBox) {
        return (cuboidProduct.getHeight() <= cylinderBox.getHeight() &&
                Math.sqrt(Math.pow(cuboidProduct.getBaseLength(), 2) + Math.pow(cuboidProduct.getBaseWidth(), 2))
                        <= 2 * cylinderBox.getBaseRadius());
    }

    private boolean fitProductIntoBox(SphereProduct sphereProduct, CuboidBox cuboidBox) {
        return (sphereProduct.getRadius() * 2) <= cuboidBox.getHeight() &&
                (sphereProduct.getRadius() * 2) <= cuboidBox.getBaseWidth() &&
                (sphereProduct.getRadius() * 2) <= cuboidBox.getBaseLength();
    }

    private boolean fitProductIntoBox(SphereProduct sphereProduct, CylinderBox cylinderBox) {
        return (sphereProduct.getRadius() * 2 <= cylinderBox.getHeight()) &&
                (sphereProduct.getRadius() <= cylinderBox.getBaseRadius());
    }

    private double remainingVolume(CuboidProduct cuboidProduct, CuboidBox cuboidBox) {
        return (cuboidBox.getBaseLength() * cuboidBox.getBaseWidth() * cuboidBox.getHeight()) -
                (cuboidProduct.getBaseLength() * cuboidProduct.getBaseWidth() * cuboidProduct.getHeight());
    }

    private double remainingVolume(CuboidProduct cuboidProduct, CylinderBox cylinderBox) {
        return (Math.PI * Math.pow(cylinderBox.getBaseRadius(), 2) * cylinderBox.getHeight()) -
                (cuboidProduct.getBaseLength() * cuboidProduct.getBaseWidth() * cuboidProduct.getHeight());
    }

    private double remainingVolume(SphereProduct sphereProduct, CuboidBox cuboidBox) {
        return (cuboidBox.getBaseLength() * cuboidBox.getBaseWidth() * cuboidBox.getHeight()) -
                (4 * Math.PI * Math.pow(sphereProduct.getRadius(), 3) / 3);
    }

    private double remainingVolume(SphereProduct sphereProduct, CylinderBox cylinderBox) {
        return (Math.PI * Math.pow(cylinderBox.getBaseRadius(), 2) * cylinderBox.getHeight()) -
                (4 * Math.PI * Math.pow(sphereProduct.getRadius(), 3) / 3);
    }

    private void selectBox(double difference, int iterator) {
        remainingVolume = difference;
        selectedBoxNumber = iterator;
    }

    private void setDefaultValues (){
        remainingVolume = Double.MAX_VALUE;
        selectedBoxNumber = -1;
    }

}