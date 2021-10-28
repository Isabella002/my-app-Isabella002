package testing;

public class MeasurementTest {
}
public static void intro(){
        System.out.println();
        System.out.println("=========================================");
        System.out.println(" \t \t \t  W  E  L  C  O  M  E");
        System.out.println(" \t \t This is Measurement Test");
        System.out.println("=========================================");
        System.out.println();
    }

    public static double rectangleArea(double width, double height){
        return width * height;
    }


    public static void main(String[] args) {
        intro();

        // Make Scanner for Input in Console
        Scanner console = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter width: ");
        double width = console.nextDouble();

        System.out.println("Enter height: ");
        double height = console.nextDouble();

        System.out.printf("Rectangle Area: %.2f", rectangleArea(width, height));

    }
}
class circleArea
{
    public static void main(String[] args)
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);
    }
}

class VolumeOfSphere {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of sphere:");
        double r = s.nextDouble();


        double volume = VolumeOfSphere.area(r);

        System.out.println("Volume Of Sphere is:" + volume);
    }

    public static double area(double r) {

        return (4 * 22 * r * r * r) / (3 * 7);
    }

}
class toCelsius
{
    public static void main(String[] arg) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature");
        a = sc.nextDouble();
        System.out.println("Celsius temperature is = " + celsius(a));
    }
    static double celsius(double f) {
        return (f - 32) * 5 / 9;

    }
static class toFahrenheit
{
    public static void main(String[] arg)
    {
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Celsius temperature");
        a=sc.nextDouble();
        System.out.println("Fahrenheit temperature is = " + fahrenheit(a));
    }
        static double fahrenheit(double c) {
        return ((9 * c) / 5) + 32;


        }}}
class distanceTo
{
    public static void main(String[] args)
    {
        double res1 = distance(1, 0, 4, 4);
        double res2 = distance(10, 2, 3, 5);

        System.out.println("distance(1, 0, 4, 4): " + res1);
        System.out.println("distance(10, 2, 3, 5): " + res2);
    }

    public static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
