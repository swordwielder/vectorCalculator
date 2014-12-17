
/**
 * Write a description of class Vector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Vector
{
    private double x,y,z;
    private Vector result;

    public Vector(double x, double y, double z)
    {
        this.x = x;
        this.y =y;
        this.z=z;
    }

    public static void choice(Vector one, Vector two)
    {
        System.out.println("press 1 for dot product and 2 for cross product");
        Scanner input  = new Scanner(System.in);
        int choice = input.nextInt();

        if( choice ==1)
            one.dot(two);
        else if( choice ==2)
            System.out.println(one.cross(two));
    }

    public void dot(Vector a)
    {
        double answer =   x*a.x + y*a.y + z*a.z;
        System.out.println("The answer is: " +  answer);
    }

    public Vector cross(Vector a)
    {
        double i,j,k;
        i = (y*a.z) - (a.y*z);
        j = -((x*a.z)-(a.x*z));
        k = (x*a.y) - (a.x*y);
        return new Vector(i,j,k);
    }

    public String toString()
    {
        String s= "";
        s+= "< " + x + " , "+ y + " , " + z + " > ";
        return s;
    }

    public static void main (String [] args)
    {
        double [] v, v2;
        v = new double [3];
        v2 = new double [3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for x");
        v[0] = input.nextDouble();
        System.out.println("Enter a value for y");
        v[1] = input.nextDouble();
        System.out.println("Enter a value for z");
        v[2] = input.nextDouble();
        Vector one= new Vector(v[0],v[1],v[2]);
        System.out.println(one);

        System.out.println("Enter a value for x");
        v2[0] = input.nextDouble();
        System.out.println("Enter a value for y");
        v2[1] = input.nextDouble();
        System.out.println("Enter a value for z");
        v2[2] = input.nextDouble();
        Vector two = new Vector(v2[0],v2[1],v2[2]);
        System.out.println(two);
        
        int repeat;
        do
        {
            choice(one, two);
            System.out.println("try another? press 1");
            repeat = input.nextInt();
        } while (repeat ==1);

    }
}
