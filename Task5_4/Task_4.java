package Task5_4;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String input = scanner.nextLine();
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.parse(input);
        Period period = Period.between(birthdate, today);

        //It helps to display the calculated age
        System.out.println("Your age is: " + period.getYears()+ " years, " + period.getMonths() + " months, and " + period.getDays() + " days.");

        scanner.close();
    }
}
