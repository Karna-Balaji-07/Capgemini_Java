package Day3_20122025;

import java.util.Scanner;

// Travel ticket booking and fare processing system
public class Program_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Passenger input
        System.out.print("Enter Passenger ID : ");
        int PID = input.nextInt();
        input.nextLine();
        System.out.print("Enter Passenger Name : ");
        String name = input.nextLine();
        System.out.print("Enter Passenger Age : ");
        int age = input.nextInt();


        if(age <5) {
            System.out.println("Free Ticket : No Booking required");
            return;
        }
        else if(age > 80){
            System.out.println("Medical clearance required");
            return;
        }
        else{
            System.out.print("Enter Travel Type ( 1->Bus ; 2->Train ; 3->Flight) : ");
            int travel = input.nextInt();
            System.out.print("Enter Travel Fare : ");
            double fare = input.nextDouble();
            System.out.print("Is passenger a government Employee or not : ");
            boolean govt = input.nextBoolean();
            String TravelType = "";
            double base = fare;
            switch (travel){
                case 1:
                    System.out.print("Enter Bus seat type ( 1-> Sleeper ; 2->Seater ) : ");
                    int bus = input.nextInt();
                    switch (bus){
                        case 1:
                            TravelType = "Sleeper";
                            fare *= 1.2;
                            break;
                        case 2:
                            TravelType = "Seater";
                            fare *= 1.0;
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter Train seat type ( 1->General ; 2->Sleeper ; 3->AC ): ");
                    int train = input.nextInt();
                    switch (train){
                        case 1:
                            TravelType = "General";
                            fare *= 1.0;
                            break;
                        case 2:
                            TravelType = "Sleeper";
                            fare *= 1.3;
                            break;
                        case 3:
                            TravelType = "AC";
                            fare *= 1.6;
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Enter Plane seat type ( 1->Economy ; 2->Business) : ");
                    int Plane = input.nextInt();
                    switch (Plane){
                        case 1:
                            TravelType = "Economy";
                            fare *= 2.5;
                            break;
                        case 2:
                            TravelType = "Business";
                            fare *= 3.5;
                            break;

                    }
                    break;
            }

            // Discount applied
            int discount = 0;
            if(age >= 60){
                fare = fare - 0.3*fare;
                discount = 30;
            }
            else if(govt){
                fare = fare - 0.15*fare;
                discount = 15;
            }
            else if(age > 5 && age < 12) {
                fare = fare - 0.5*fare;
            discount = 50;
            }

            // Booking status
            String Booking = "";

            if(fare >= 10000){
                if(travel == 3) Booking = "Confirmed";
                else Booking = "Waiting List";
            }
            else Booking = "Confirmed";

            System.out.println();
            System.out.println("Passenger ID               : "+PID);
            System.out.println("Passenger Name             : "+name);
            System.out.println("Travel Type                : "+travel);
            System.out.println("Travel class               : "+TravelType);
            System.out.println("Travel Base Fare           : "+base);
            System.out.println("Travel Final Fare          : "+fare);
            System.out.println("Travel Discount Applied    : "+discount);
            System.out.println("Booking Status             : "+Booking);

        }
    }
}
