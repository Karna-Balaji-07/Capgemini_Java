package Day6_26122025;

public class SmartTracker {

    // Activity 1 : Average temperature
    public static void average(int[] temp){
        double sum = 0;
        for(int i : temp){
            sum += i;
        }
        double avg = (double) (sum/ temp.length);
        System.out.printf("Average temperature : %.2f",avg);
        System.out.println();
    }

    // Activity 2 : Hottest and coldest day
    public static void hotcold(int[] temp){
        int hottest = Integer.MIN_VALUE;
        int hotday = 0;
        int coldday = 0;
        int coldest = Integer.MAX_VALUE;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] > hottest) {
                hottest = temp[i];
                hotday = i+1;
            }
            if(temp[i] < coldest){
                coldest = temp[i];
                coldday = i+1;
            }

        }
        System.out.println("Highest Temperature is "+hottest+" on "+ hotday+" day");
        System.out.println("Lowest Temperature is "+ coldest+" on "+ coldday+" day");
    }

    // Activity 3 : count hot days
    public static void countHot(int[] temp){
        int count = 0;
        for(int i : temp){
            if(i > 30) count++;
        }
        System.out.println("Number of hot days (>30C) : "+count);
    }

    // Activity 4 : Total and average sales
    public static void TotalAverage(int[] sales){
        int sum = 0;
        double ag = 0;
        for(int i : sales){
            sum += i;
        }
        ag = (double)sum / sales.length;
        System.out.println("Total sale : "+sum);
        System.out.printf("Aerage sale : %.2f",ag);
        System.out.println( );
    }

    // Activity 5 : Record breaking sales
    public static void HighLowSales(int[] sales){
        int hottest = Integer.MIN_VALUE;
        int hotday = 0;
        int coldday = 0;
        int coldest = Integer.MAX_VALUE;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] > hottest) {
                hottest = sales[i];
                hotday = i+1;
            }
            if(sales[i] < coldest){
                coldest = sales[i];
                coldday = i+1;
            }

        }
        System.out.println("Highest sale is "+hottest+" on "+ hotday+" day");
        System.out.println("Lowest sale is "+ coldest+" on "+ coldday+" day");
    }

    // activity 6 : Count high sale days
    public static void count(int[] sales){
        int count = 0;
        for(int i : sales){
            if(i > 100) count++;
        }
        System.out.println("Number of high sale days (>100) : "+count);
    }

    // Activity 7 : Search for specific sale
    public static void search(int[] sales, int price){
        int day = 0;
        int sale = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] == price){
                day = i+1;
            }
        }
        System.out.println("Sale "+ price+" found on day "+day);
    }

    // Update sales record
    public static void update(int[] sales, int sale, int day){
        for (int i = 0; i < sales.length; i++) {
            if(day == i+1){
                sales[i] = sale;
            }
        }
        System.out.println("Updated sales on day "+ day+" is "+ sale);
    }

    public static void main(String[] args) {
        int[] sales = {120, 80, 150, 90, 200, 75, 110}; // Sales for 7 days (in ₹)
        int[] temp = {32, 28, 31, 29, 35, 27, 30}; // Temperatures (°C) for 7 days
        average(temp);
        hotcold(temp);
        countHot(temp);
        TotalAverage(sales);
        HighLowSales(sales);
        count(sales);
        search(sales, 150);
        update(sales, 95,2);

    }

}
