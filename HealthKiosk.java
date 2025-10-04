        //Task 0
import java.util.Scanner;
import java.util.Random;
public class HealthKiosk{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Project setup!");

        //Task 1
        String P="Pharmacy";
        String L="Lab";
        String T="Triage";
        String C="Counseling";
        System.out.println("Enter a service code(P/L/T/C): ");
        char single_letter = input.next().charAt(0);
        single_letter=Character.toUpperCase(single_letter);
        switch (single_letter){
            case 'P':
                System.out.println("Go to: Pharmacy Desk");
                break;
            case 'L':
                System.out.println("Go to: Lab Desk");
                break;
            case 'T':
                System.out.println("Go to: Triage Desk");
                break;
            case 'C':
                System.out.println("Go to: Counselling Desk");
                break;
            default:
                System.out.println("Invalid service code");
                break;
        }

        //Task 2
        if(single_letter=='T'){System.out.println("Enter a health metric 1/2/3.");}
        int choice=input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Computation of the BMI.");
                System.out.println("Enter your weight in kg.");
                double weight = input.nextDouble();
                System.out.println("Enter your height in meters.");
                double height = input.nextDouble();
                double BMI = (weight / (height * height));
                BMI = Math.round(BMI * 10) / 10.0;
                if (BMI < 18.5) {
                    System.out.println("Underweight");
                } else if (BMI >= 18.5 && BMI <= 24.9) {
                    System.out.println("Normal");
                } else if (BMI >= 25.0 && BMI <= 29.9) {
                    System.out.println("Overweight");
                } else if (BMI >= 30.0) {
                    System.out.println("Obese");
                }
                break;

            case 2:
                System.out.println("Enter the required dosage in mg.");
                double dosage = input.nextDouble();
                int tablets = (int) Math.ceil(dosage / 250.0);
                System.out.println("Required dosage: " + tablets);
                break;
            case 3:
                System.out.println("Enter an angle in degrees.");
                double angle = input.nextDouble();
                double radians = Math.toRadians(angle);
                double sin_of_angle = (Math.round(Math.sin(radians) * 1000) / 1000.0);
                double cos_of_angle = (Math.round(Math.cos(radians) * 1000) / 1000.0);
                System.out.println("The sine of the angle in radians is: " + sin_of_angle);
                System.out.println("The cosine of the angle in radians is: " + cos_of_angle);
                break;
            default:
                System.out.println("Invalid code");
                break;
        }

        //Task 3
            Random random=new Random();
            char letter=(char)(random.nextInt(26)+'A');
            int first_number=3+random.nextInt(9);
            int second_number=3+random.nextInt(9);
            int third_number=3+random.nextInt(9);
            int fourth_number=3+random.nextInt(9);
            String student_code=""+ letter + first_number+second_number+third_number+fourth_number;
            System.out.println("The student ID is"+ student_code);
            if (student_code.length()!=5){System.out.println("Length is not valid");}
            else if(!Character.isLetter(student_code.charAt(0))){System.out.println("First character is not a letter,try again");}
            else if((Character.isDigit(student_code.charAt(1))&&
                    Character.isDigit(student_code.charAt(2))&&
                    Character.isDigit(student_code.charAt(3))&&
                    Character.isDigit(student_code.charAt(4))))
             {System.out.println("ID OK");}
        //Task 4
            input.nextLine();
            double metric=0;
            System.out.println("Enter your first name: ");
            String name=input.nextLine();
            char base_code=Character.toUpperCase((name.charAt(0)));
            char shifted_letter=(char)('A'+ (base_code-'A'+2)%26);
            String last_characters=student_code.substring(student_code.length()-2);
            String final_code= ""+ shifted_letter+ last_characters+"-"+(int)metric;

        //Task 5
        switch(single_letter) {
            case 'P':
                name = " Pharmacy Desk";
                break;
            case 'L':
                name = " Lab Desk";
                break;
            case 'T':
                name = " Triage Desk";
                break;
            case 'C':
                name = " Counselling Desk";
                break;
            default:
                name = "Invalid service code";
                break;
        }

        if(single_letter=='T'){System.out.println("Summary=" + name + " | ID="+ student_code +"|Metric="+
                metric+"|Code="+ final_code);}
        else{System.out.println("Summary=" + name + " | ID="+ student_code +"|Code="+ final_code);}




        }
    }
