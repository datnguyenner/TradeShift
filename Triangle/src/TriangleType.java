import java.util.Scanner;

/**
 * Created by Dat on 6/21/2016.
 * Determine the types of triangle by using scanner class to enter inputs for the length of sides
 */
public class TriangleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        int sides = triangle.sides; //Retrieve the number of sides property from Triangle object
        String[] arrayOfSides = new String[sides];
        for(int i = 0; i < sides; i++){
            System.out.println("Please enter length "+(i+1));
            arrayOfSides[i] = sc.next(); //sides property will determine the # of inputs
        }

        String length1 = arrayOfSides[0];
        String length2 = arrayOfSides[1];
        String length3 = arrayOfSides[2];

        try{//try catch block for invalid inputs - anything that is not a number

            triangle = new Triangle(Double.parseDouble(length1), Double.parseDouble(length2), Double.parseDouble(length3));
            System.out.println(triangle.triangleType()+" Triangle");

        }catch (Exception e){
            System.out.println("Invalid Length");
        }

    }
}
