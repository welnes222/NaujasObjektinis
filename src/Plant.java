import java.util.ArrayList;
import java.util.Scanner;

public class Plant {
    public static ArrayList<Plant> garden = new ArrayList<>();
    private static int idCount = 0;

    private int id;
    private String name;
    private String latinName;
    private String oneYear;
    private String growthRegion;
    private int height;
    private String edible;
//    public Plant() {
//
//    }

    public Plant() {
        this.id = ++idCount;
    }
    public Plant( String name, String latinName, String oneYear, String growthRegion, int height, String edible) {
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

    public String getOneYear() {
        return oneYear;
    }

    public void setOneYear(String oneYear) {
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

    public String getEdible() {
        return edible;
    }

    public void setEdible(String edible) {
        this.edible = edible;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latinName='" + latinName + '\'' +
                ", oneYear='" + oneYear + '\'' +
                ", growthRegion='" + growthRegion + '\'' +
                ", height=" + height +
                ", edible='" + edible + '\'' +
                '}';
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
    public static void addAnimal(Scanner sc){
        Plant plant = new Plant();
        System.out.println("iveskite augalo pavadinima");
        plant.setName(sc.nextLine());
        System.out.println("iveskite augalo lotyniska pavadinima");
        plant.setLatinName(sc.nextLine());
        System.out.println("iveskite ar augalas yra vienmetis");
        plant.setOneYear(sc.nextLine());
        System.out.println("iveskite kuriam zemyne auga augalas");
        plant.setGrowthRegion(sc.nextLine());
        System.out.println("iveskite augalo auksti metrais");
        plant.setHeight(sc.nextInt());
        sc.nextLine();
        System.out.println("iveskite ar augalas yra valgomas");
        plant.setEdible(sc.nextLine());
        Plant.garden.add(plant);
    }
}
