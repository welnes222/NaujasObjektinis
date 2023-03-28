import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Plant a2 = new Plant();
        a2.setName("Blakine kalendra");
        a2.setLatinName("Coriandrum sativum");
        a2.setOneYear(true);
        a2.setGrowthRegion("Europa");
        a2.setHeight(1);
        a2.setEdible(true);
        Plant.garden.add(a2);

        Plant b2 = new Plant();
        b2.setName("Sosnovskio barštis");
        b2.setLatinName("Heracleum sosnowskyi");
        b2.setOneYear(true);
        b2.setGrowthRegion( "Europa" );
        b2.setHeight(5);
        b2.setEdible(false);
        Plant.garden.add(b2);

        Plant c2 = new Plant();
        c2.setName("bambukas");
        c2.setLatinName("Bambugu");
        c2.setOneYear(false);
        c2.setGrowthRegion( "Azija" );
        c2.setHeight(38);
        c2.setEdible(false);
        Plant.garden.add(c2);

        Plant d2 = new Plant();
        d2.setName("Šermukšnis");
        d2.setLatinName("Sorbus");
        d2.setOneYear(false);
        d2.setGrowthRegion( "Europa" );
        d2.setHeight(20);
        d2.setEdible(false);
        Plant.garden.add(d2);
        Plant.garden.add(new Plant("Ženšenis", "Panax", false, "Azija", 1, true));
        Plant.garden.add(new Plant("Nendrė ", "Phragmites", true, "Europa", 2, false));

        Scanner sc = new Scanner(System.in);

        while(true){
         Plant.info();
            int input = sc.nextInt();
            sc.nextLine();
            switch (input){
                case 1:
                Plant.printGarden();
                    break;
                case 2:
                    Plant.addPlant(sc);
                    break;
                case 3:
                    Plant.editPlant (sc);
                    break;
                case 4:
                    Plant.deletePlant(sc);
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        }
    }
}