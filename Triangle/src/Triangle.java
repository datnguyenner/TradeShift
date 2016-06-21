import java.util.Scanner;

/**
 * Created by Dat on 6/21/2016.
 * This class represents the Triangle object with 3 sides
 */
public class Triangle {

    public final int sides = 3;
    private double length1;
    private double length2;
    private double length3;

    public Triangle(){

    }

    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    /**
     * Isosceles - 2 equal sides out of the 3 sides
     * Equilateral - 3 equal sides out of the 3 sides
     * Scalene - 0 equal sides out of the 3 sides
     *
     * return the String representation of the types of triangle
     */
    public String triangleType(){
        if(length1==0 || length2 == 0 || length3==0){
            return "Invalid";
        }
        else if(length1==length2 && length1==length3){
            return "Equilateral";
        }else if(length1!=length2 && length1!=length3 && length2!=length3){
            return "Scalene";
        }else
            return "Isosceles";

    }

}
