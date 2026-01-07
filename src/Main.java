import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    int a = 10;

    static void display(){
        System.out.println(new Main().a);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(++obj.a);
        System.out.println(obj.a);

    }
}