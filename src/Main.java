import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r,alpha;
        double pi = 3.14,area,perimeter,segmentArea;


        System.out.print("Write The Radius Of Circle : ");
        r = input.nextInt();
        System.out.print("Write The Measure Of The Center Angle : ");
        alpha = input.nextInt();


        pi = 3.14;
        area = pi * r * r ;
        System.out.println("The Area : " + area);

        perimeter = 2 * pi * r;
        System.out.println("The Perimeter : " + perimeter);

        //Circle Segment Area
        segmentArea = (pi * (r*r)*alpha)/360;
        System.out.print("The Circle Segment Area: " + segmentArea);

    }
}