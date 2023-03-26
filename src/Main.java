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
        c2.setName("Sosnovskio barštis");
        c2.setLatinName("Heracleum sosnowskyi");
        c2.setOneYear("Vientmetis");
        c2.setGrowthRegion( "Europa" );
        c2.setHeight(5);
        c2.setEdible("Ne");
        Plant.garden.add(c2);

        Plant d2 = new Plant();
        d2.setName("Sosnovskio barštis");
        d2.setLatinName("Heracleum sosnowskyi");
        d2.setOneYear("Vientmetis");
        d2.setGrowthRegion( "Europa" );
        d2.setHeight(5);
        d2.setEdible("Ne");
        Plant.garden.add(d2);
//        Plant.garden().add(new Plant("bambukas", "Bambugu", "not one year", "Azija", 38, "ne"));
//        Plant.garden().add(new Plant("Šermukšnis", "Sorbus", " not one year", "Europa", 20, "ne"));

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. pamatyti sarasa");
            System.out.println("2. prideti gyvuna");
            System.out.println("3. redaguoti gyvuna");
            System.out.println("4. istrinti gyvuna");
            System.out.println("5. iseiti is programos");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input){
                case 1:
                    for (int i = 0; i < Plant.garden.size(); i++) {
                        System.out.println(Plant.garden.get(i));
                    }
                    break;
                case 2:
                    Plant plant = new Plant();
                    System.out.println("iveskite augalo pavadinima");
                    plant.setName(sc.nextLine());
                    System.out.println("iveskite augalo lotyniska pavadinima");
                    plant.setLatinName(sc.nextLine());
                    System.out.println("iveskite ar gyvunas yra vienmetis");
                    plant.setOneYear(sc.nextLine());
                    System.out.println("iveskite kuriam zemyne auga augalas");
                    plant.setGrowthRegion(sc.nextLine());
                    System.out.println("iveskite augalo auksti metrais");
                    plant.setHeight(sc.nextInt());
                    System.out.println("iveskite ar augalas yra valgomas");
                    plant.setEdible(sc.nextLine());
                    Plant.garden.add(plant);
                    break;
            }
        }








    }
}