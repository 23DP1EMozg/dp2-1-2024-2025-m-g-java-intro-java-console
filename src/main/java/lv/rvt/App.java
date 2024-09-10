package lv.rvt;


import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("name: ");
        String name = scanner.nextLine();

        System.out.print("last name: ");
        String lastname = scanner.nextLine();

        System.out.print("grupa: ");
        String group = scanner.nextLine();

        System.out.println();

        System.out.println("your name is " + name + ", your last name is " + lastname + " and your group is " + group);


        scanner.close();


    }

}
