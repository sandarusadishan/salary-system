
import java.util.Scanner;

public class CourseWork_04_SalaryInfor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("|                 SALARY INFORMATION SYSTEM                      |");
        System.out.println("------------------------------------------------------------------");

        System.out.println("");
        System.out.println("");

        System.out.println("\t[1] Calculate Income Tax");
        System.out.println("\t[2] Calculate Annual Bonus");
        System.out.println("\t[3] Calculate Loan Amount");

        System.out.println("");

        System.out.print("Enter an option to continue > ");
        int option = input.nextInt();
        input.nextLine();

        switch (option) {

            case 1:
                System.out.println("------------------------------------------------------------------");
                System.out.println("|                   Calculate Income Tax                         |");
                System.out.println("------------------------------------------------------------------");
                System.out.println("");

                System.out.print("Input Employee name    - ");
                String emp = input.nextLine();

                System.out.print("Input Employee salary  - ");
                double salary = input.nextDouble();
                System.out.println("");

                if (salary <= 100000) {
                    System.out.print("You have to pay Income Tax per month : 0");
                } else if (salary <= 141667) {
                    double tax1 = (salary - 100000) * 6 / 100;
                    System.out.print("You have to pay Income Tax per month : " + tax1);
                } else if (salary <= 183333) {
                    double tax1 = 2500;
                    double tax2 = (salary - 141667) * 12 / 100;
                    System.out.print("You have to pay Income Tax per month : " + (tax1 + tax2));
                } else if (salary <= 225000) {
                    double tax2 = 7500;
                    double tax3 = (salary - 183333) * 18 / 100;
                    System.out.print("You have to pay Income Tax per month : " + (tax2 + tax3));
                } else if (salary <= 266667) {
                    double tax3 = 15000;
                    double tax4 = (salary - 225000) * 24 / 100;
                    System.out.print("You have to pay Income Tax per month : " + (tax3 + tax4));
                } else if (salary <= 308333) {
                    double tax4 = 25000;
                    double tax5 = (salary - 266667) * 30 / 100;
                    System.out.print("You have to pay Income Tax per month : " + (tax4 + tax5));
                } else {
                    double tax5 = 37500;
                    double tax6 = (salary - 308333) * 36 / 100;
                    System.out.print("You have to pay Income Tax per month : " + (tax5 + tax6));
                }
                break;

            case 2:
                System.out.println("------------------------------------------------------------------");
                System.out.println("|                   Calculate Annual Bonus                       |");
                System.out.println("------------------------------------------------------------------");
                System.out.println("");

                System.out.print("Input Employee name    - ");
                String name = input.nextLine();

                System.out.print("Input Employee salary  - ");
                double sal = input.nextDouble();
                System.out.println("");

                if (sal < 100000) {
                    double bonus = 5000;
                    sal = sal + bonus;
                    System.out.println("Anual bonus : " + sal);
                } else if (sal >= 100000 && sal <= 199999) {
                    double bonus = sal * 10 / 100;
                    sal = sal + bonus;
                    System.out.println("Anual bonus : " + sal);
                } else if (sal >= 200000 && sal <= 299999) {
                    double bonus = sal * 15 / 100;
                    sal = sal + bonus;
                    System.out.println("Anual bonus : " + sal);
                } else if (sal >= 300000 && sal <= 399999) {
                    double bonus = sal * 20 / 100;
                    sal = sal + bonus;
                    System.out.println("Anual bonus : " + sal);
                } else if (sal >= 400000) {
                    double bonus = sal * 35 / 100;
                    sal = sal + bonus;
                    System.out.println("Anual bonus : " + sal);
                }

                break;

            case 3:
                System.out.println("------------------------------------------------------------------");
                System.out.println("|                   Calculate Loan Amount                        |");
                System.out.println("------------------------------------------------------------------");
                System.out.println("");

                System.out.print("Input Employee name    - ");
                String nme = input.nextLine();

                System.out.print("Input Employee salary  - ");
                double sala = input.nextDouble();

                if (sala > 50000) {
                    System.out.print("Enter number of years  : ");
                    int years = input.nextInt();
                    System.out.println("");

                    double anualRate = 0.15;
                    int months = years * 12;
                    double monthlyRate = anualRate / 12;

                    double installement = sala * 0.6;

                    double powerV = Math.pow(1 + monthlyRate, months);
                    double divi = 1 / powerV;
                    double adj = 1 - divi;
                    double LoanAmount = installement * adj / monthlyRate;

                    LoanAmount = ((int)(LoanAmount + 500) / 1000) * 1000;

                    System.out.println("You can get Loan Amount  : " + LoanAmount);

                } else {
                    System.out.println("");
                    System.out.println("\tYou cannot get a loan because your salary is less than Rs.50,000...");
                }
                
                  case 4:

                        System.out.println("Exit");

                        break;

        }
    }
}
