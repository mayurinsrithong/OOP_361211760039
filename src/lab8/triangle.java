package lab8;

public class triangle extends GraphicObjec {
    private double width;
    private double radius;

    public triangle(double base, double height){
        this.width=base;
        this.radius=height;

    }

    @Override
    public void findArea() {
        double area = 0.5 * width * radius;
        System.out.println("The area of Triangle "+width+"and heigt ="+radius+"= " + area);
    }//getter and setter

    public double getBase() {
        return width;
    }

    public void setBase(double base) {
        this.width = base;
    }

    public double getHeight() {
        return radius;
    }

    public void setHeight(double height) {
        this.radius = height;
    }
}