import java.util.Scanner;
public class Validated {
    public static int height2(Scanner sc){
        while(true){
            int num = integer(sc);
            if(num >= 0 && num < 200){
                return num;
            }
            System.out.println("iveskite teisinga auksti");
        }
    }
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
    public static boolean bool(Scanner sc) {
        boolean input = false;
        boolean shouldGo = true;
        while (shouldGo) {
            try {
                input = sc.nextBoolean();
                shouldGo = false;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("iveskite teisinga varianta");
            }
        }
        return input;
    }
}
