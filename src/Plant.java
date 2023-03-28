import java.util.ArrayList;
import java.util.Scanner;



public class Plant {
    public static ArrayList<Plant> garden = new ArrayList<>();
    private static int idCount = 0;

    private int id;
    private String name;
    private String latinName;
    private boolean oneYear;//b
    private String growthRegion;
    private int height;
    private boolean edible;//b

    public Plant() {
        this.id = ++idCount;
    }
    public Plant(int id){
        this.id = id;
    }
    public Plant( String name, String latinName, boolean oneYear, String growthRegion, int height, boolean edible) {
        this.id = ++idCount;
        this.name = name;
        this.latinName = latinName;
        this.oneYear = oneYear;
        this.growthRegion = growthRegion;
        this.height = height;
        this.edible = edible;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public boolean getOneYear() {
        return oneYear;
    }

    public void setOneYear(boolean oneYear) {
        this.oneYear = oneYear;
    }

    public String getGrowthRegion() {
        return growthRegion;
    }

    public void setGrowthRegion(String growthRegion) {
        this.growthRegion = growthRegion;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

//    @Override
//    public String toString() {
//        return "Plant{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", latinName='" + latinName + '\'' +
//                ", oneYear='" + oneYear + '\'' +
//                ", growthRegion='" + growthRegion + '\'' +
//                ", height=" + height +
//                ", edible='" + edible + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latinName='" + latinName + '\'' +
                ", oneYear=" + (oneYear ? "taip" : "ne") +
                ", growthRegion='" + growthRegion + '\'' +
                ", height=" + height +
                ", edible=" + (edible ? " taip " : "Ne");

    }

    public static void info(){
        System.out.println("1. pamatyti sarasa");
        System.out.println("2. prideti augala");
        System.out.println("3. redaguoti augala");
        System.out.println("4. istrinti augala");
        System.out.println("5. iseiti is programos");
    }
    public static void printGarden(){
        for (int i = 0; i < Plant.garden.size(); i++) {
            System.out.println(Plant.garden.get(i));
        }
    }
    public static void addPlant(Scanner sc){
        Plant plant = new Plant();
        System.out.println("iveskite augalo pavadinima");
        plant.setName(sc.nextLine());
        System.out.println("iveskite augalo lotyniska pavadinima");
        plant.setLatinName(sc.nextLine());
        System.out.println("iveskite ar augalas yra vienmetis: jei taip - true, jeigu ne -false ");
        plant.setOneYear(sc.nextBoolean());
        sc.nextLine();
        System.out.println("iveskite kuriam zemyne auga augalas");
        plant.setGrowthRegion(sc.nextLine());
        System.out.println("iveskite augalo auksti metrais");
        plant.setHeight(sc.nextInt());
        sc.nextLine();
        System.out.println("iveskite ar augalas yra valgomas:  jei taip - true, jeigu ne -false");
        plant.setEdible(sc.nextBoolean());
        sc.nextLine();
        Plant.garden.add(plant);
    }
    public static void editPlant(Scanner sc){
        System.out.println("kuri augala norite redaguoti:");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).id == id){
                Plant a = new Plant(id);
                    System.out.println("iveskite augalo pavadinima");
                    a.setName(sc.nextLine());
                    System.out.println("iveskite augalo lotyniska pavadinima");
                    a.setLatinName(sc.nextLine());
                    System.out.println("iveskite ar augalas yra vienmetis: jei taip - true, jeigu ne -false ");
                    a.setOneYear(sc.nextBoolean());
                    sc.nextLine();
                    System.out.println("iveskite kuriam zemyne auga augalas");
                    a.setGrowthRegion(sc.nextLine());
                    System.out.println("iveskite augalo auksti metrais");
                    a.setHeight(sc.nextInt());
                    sc.nextLine();
                    System.out.println("iveskite ar augalas yra valgomas:  jei taip - true, jeigu ne -false");
                    a.setEdible(sc.nextBoolean());
                    sc.nextLine();
                    garden.set(i,a);
                    return;
                }
            }

        }
    public static void deletePlant(Scanner sc){
        System.out.println("kuri augala norite panaikinti:");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).id == id){
                garden.remove(i);
                return;
            }
        }

    }
}
