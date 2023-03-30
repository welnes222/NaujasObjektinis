import java.util.Scanner;
public class Validated {
    public static int integer(Scanner sc) {
        int input = 0;
        boolean shouldGo = true;
        while (shouldGo) {
            try {
                input = sc.nextInt();
                shouldGo = false;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("pasirinkite teisinga varianta");
            }
        }
        return input;
    }
}
