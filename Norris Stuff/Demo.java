import java.util.Scanner;

public class Demo {

    public static void main(String[] args)
    {
        System.out.println("What's you name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("Nice to meetcha, " + name);

        int chips = 100;
        System.out.println(" well, " + name + " you start with " + chips + " chips");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("Rolling dice");
            int roll = roll();
            System.out.println("Rolled a " + roll);
        }
        
        scanner.close();
    }

    public static int roll()
    {
        int random = (int) (Math.floor(Math.random() * 6)) + 1;
        return random;
    }
}