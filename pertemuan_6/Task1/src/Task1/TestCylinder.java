package Task1;

public class TestCylinder { 
    public static void main (String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1.toString());  

        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2.toString());  

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3.toString());  
    }
}
