package SimpleCalculations;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class TrapezoidArea {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h =  Double.parseDouble(scanner.nextLine());
        double result = (b1 + b2) * h / 2;

        System.out.println(result);
    }

}