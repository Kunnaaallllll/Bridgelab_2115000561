public class Circle {
    private double radius;
    private double area;
    private double  circumference;
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public void  calculate(){
        area =  Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
    }

    public void displayDetails(){
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
}
