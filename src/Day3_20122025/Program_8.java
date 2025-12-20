package Day3_20122025;

// Employee access and salary processing system


import java.util.Locale;
import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1 : Input Details
        System.out.print("Enter Employee ID : ");
        int EmpID = input.nextInt(); // Employee ID
        input.nextLine();
        System.out.print("Enter Employee Name : ");
        String EmpName = input.nextLine(); // Employee Name
        System.out.print("Enter Employee Age : ");
        int age = input.nextInt(); // age

        // Step 2 : Age Validation
        if(age > 21){
            System.out.print("Enter Employee Department {1-IT; 2-HR; 3-Finance} : ");
            int department = input.nextInt(); // 1-IT, 2-HR, 3-Finance
            System.out.print("Enter Employee salary : ");
            double salary = input.nextDouble(); // salary
            String role = "";
            String access = "";
            double basic = salary;

            // selecting employee role and updating  the salary based on the allowance
            switch (department){
                case 1:
                    System.out.print("Select either Developer or  Tester : ");
                    String role1 = input.next().toLowerCase();
                    switch (role1){
                        case "developer":
                            role=role1;
                            salary = salary + (salary* (0.3/100));

                            break;
                        case "tester":
                            role = role1;
                            salary = salary + (salary* (0.25/100));
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Select either Recruiter or Payroll : ");
                    String role3 = input.next().toLowerCase();
                    switch (role3){
                        case "recruiter":
                            role=role3;
                            salary = salary + (salary* (0.2/100));
                            break;
                        case "payroll":
                            role = role3;
                            salary = salary + (salary* (0.22/100));
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Select either Accountant or Auditor : ");
                    String role4 = input.next().toLowerCase();
                    switch (role4){
                        case "accountant":
                            role=role4;
                            salary = salary + (salary* (0.28/100));
                            break;
                        case "auditor":
                            role = role4;
                            salary = salary + (salary* (0.26/100));
                            break;
                    }
                    break;
            }

            // Deciding the access level based on salary and decision
            if(salary >= 60000 && department == 1) access = "Admin Access";
            else if(salary >= 60000 && department != 1) access = "Manager Access";
            else access = "Employee Access";

            System.out.println("================================");

            System.out.println("Employee ID : "+EmpID);
            System.out.println("Employee Name : "+EmpName);
            System.out.print("Employee Department : ");
            if(department == 1) System.out.println("IT");
            else if(department == 2) System.out.println("HR");
            else if(department == 3) System.out.println("Finance");
            System.out.println("Employee Role : "+role);
            System.out.println("Basic Salary : "+basic);
            System.out.println("Final salary : "+salary);
            System.out.println("Access Level : "+ access);

        }

        else System.out.println("Sorry!! Employee is not of age to join the company.");


    }
}
