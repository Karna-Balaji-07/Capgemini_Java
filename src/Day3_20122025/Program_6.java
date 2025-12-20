package Day3_20122025;

import java.util.Scanner;
// WAJP to display an emloyees designation based on the department and role selected by user
public class Program_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // you are working as "  " in " " department
        System.out.print("Enter Department : ");
        String department = input.nextLine().toLowerCase();
        switch (department){
            case "it":
                System.out.print("Enter Role : ");
                String role = input.nextLine().toLowerCase();
                switch (role){
                    case "developer":
                        System.out.println("You are working as developer role in IT department");
                        break;
                    case "tester":
                        System.out.println("You are working as tester role in IT department");
                        break;
                    case "devops engineer":
                        System.out.println("You are working as DevOps Engineer in IT department");
                        break;
                }
                break;
            case "hr":
                System.out.print("Enter Role : ");

                String role2 = input.nextLine().toLowerCase();
                switch (role2){
                    case "recruiter":
                        System.out.println("You are working as "+role2+ " role in HR department");
                        break;
                    case "hr executive":
                        System.out.println("You are working as "+role2+" role in HR department");
                        break;
                    case "payroll officer":
                        System.out.println("You are working as "+role2+" in HR department");
                        break;
                }
                break;
            case "finance":
                System.out.print("Enter Role : ");

                String role3 = input.nextLine().toLowerCase();
                switch (role3){
                    case "accountant":
                        System.out.println("You are working as "+role3+ " role in Finance department");
                        break;
                    case "financial analyst":
                        System.out.println("You are working as "+role3+" role in Finance department");
                        break;
                    case "auditor":
                        System.out.println("You are working as "+role3+" in Finance department");
                        break;
                }
                break;
            case "operations":
                System.out.print("Enter Role : ");

                String role4 = input.nextLine().toLowerCase();
                switch (role4){
                    case "operation executive":
                        System.out.println("You are working as "+role4+ " role in Operations department");
                        break;
                    case "team lead":
                        System.out.println("You are working as "+role4+" role in Operations department");
                        break;
                    case "manager":
                        System.out.println("You are working as "+role4+" role in Operations department");
                        break;
                }
                break;
        }
    }
}
