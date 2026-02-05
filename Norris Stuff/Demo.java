import java.util.Scanner;

public class Demo {

    public static void main(String[] args)
    {
        System.out.println("What's you name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("Nice to meetcha, " + name);
    }
}