public class Circle{
    private double radius;

    public Circle(){
        this.radius = 0.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void display(){
        System.out.println("This radius is: "+radius);
    }
}