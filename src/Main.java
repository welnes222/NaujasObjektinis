import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Plant a2 = new Plant();
        a2.setName("Blakine kalendra");
        a2.setLatinName("Coriandrum sativum");
        a2.setOneYear("Vientmetis");
        a2.setGrowthRegion("Europa");
        a2.setHeight(1);
        a2.setEdible("taip");
        Plant.garden.add(a2);

        Plant b2 = new Plant();
        b2.setName("Sosnovskio barštis");
        b2.setLatinName("Heracleum sosnowskyi");
        b2.setOneYear("Vientmetis");
        b2.setGrowthRegion( "Europa" );
        b2.setHeight(5);
        b2.setEdible("Ne");
        Plant.garden.add(b2);

        Plant c2 = new Plant();
        c2.setName("bambukas");
        c2.setLatinName("Bambugu");
        c2.setOneYear("not one year");
        c2.setGrowthRegion( "Azija" );
        c2.setHeight(38);
        c2.setEdible("Ne");
        Plant.garden.add(c2);

        Plant d2 = new Plant();
        d2.setName("Šermukšnis");
        d2.setLatinName("Sorbus");
        d2.setOneYear("not one year");
        d2.setGrowthRegion( "Europa" );
        d2.setHeight(20);
        d2.setEdible("Ne");
        Plant.garden.add(d2);
//        Plant.garden().add(new Plant("Ženšenis", "Panax", "not one year", "Azija", 1, "taip"));
//        Plant.garden().add(new Plant("Nendrė ", "Phragmites", " vienmetis", "Europa", 2, "ne"));

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
            }
        }
    }
}