import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Plant {
    public static ArrayList<Plant> garden = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
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
        System.out.println("2. filtruoti sarasa");
        System.out.println("3. prideti augala");
        System.out.println("4. redaguoti augala");
        System.out.println("5. istrinti augala");
        System.out.println("6. iseiti is programos");
    }
    public static void printGarden(){
        for (int i = 0; i < Plant.garden.size(); i++) {
            System.out.println(Plant.garden.get(i));
        }
    }
    public static void addPlant(){
        Plant.garden.add(createPlant(0));
    }
    public static void editPlant(Scanner sc){
        System.out.println("kuri augala norite redaguoti:");
        int id = Validated.integer(sc);
        sc.nextLine();
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).id == id){
                    garden.set(i,createPlant(id));
                    return;
                }
            }
        System.out.println("tokio id neradome");
    }
        public static Plant createPlant(int id){
        Plant a;
        if(id == 0) {
             a = new Plant();
        }else{
             a = new Plant(id);
        }
            System.out.println("iveskite augalo pavadinima");
            a.setName(sc.nextLine());
            System.out.println("iveskite augalo lotyniska pavadinima");
            a.setLatinName(sc.nextLine());
            System.out.println("iveskite ar augalas yra vienmetis: jei taip - true, jeigu ne -false ");
            a.setOneYear(Validated.bool(sc));
            sc.nextLine();
            System.out.println("iveskite kuriam zemyne auga augalas");
            a.setGrowthRegion(sc.nextLine());
            System.out.println("iveskite augalo auksti metrais");
            a.setHeight(Validated.height2(sc));
            System.out.println("iveskite ar augalas yra valgomas:  jei taip - true, jeigu ne -false");
            a.setEdible(Validated.bool(sc));
            sc.nextLine();
        return a;
        }
    public static void deletePlant(Scanner sc){
        System.out.println("kuri augala norite panaikinti:");
        int id = Validated.integer(sc);
        sc.nextLine();
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).id == id){
                garden.remove(i);
                return;
            }
        }
        System.out.println("tokio id neradome");
    }
    public static void filter(){
        System.out.println("pasirinkite pagal kuri filtra filtruosime: ");
        System.out.println("1. pavadinima");
        System.out.println("2. lotyniska pavadinima");
        System.out.println("3. ar augalas vienmetis");
        System.out.println("4. kokiame zemyne auga");
        System.out.println("5. pagal auksti");
        System.out.println("6. ar augalas valgomas");
        System.out.println("7. filtruoja tik silpni. Grizti atgal");
        int input = Validated.integer(sc);
        sc.nextLine();
        switch (input){
            case 1:
                filterByName();
                break;
            case 2:
                filterByLatinName();
                break;
            case 3:
                filterByOneYear();
                break;
            case 4:
                filterByGrowthRegion();
                break;
            case 5:
                filterByHeight();
                break;
            case 6:
                filterByEdible();
                break;
            case 7:
                return;
            default:
                System.out.println("tokios opcijos nera");
                break;
        }
    }
public static void filterByName(){
    System.out.println("iveskite pavadinima: ");
    String input = sc.nextLine().toLowerCase();
    int count = 0;
    for (int i = 0; i < garden.size(); i++) {
        if(garden.get(i).name.toLowerCase().contains(input)) {
            System.out.println(garden.get(i));
            count++;
        }
    }
    if(count == 0){
        System.out.println("augalo nera. Matyt, augalas nepalaistytas nuvyto");
    }
}
    public static void filterByLatinName(){
        System.out.println("iveskite lotyniska pavadinima: ");
        String input = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).latinName.toLowerCase().contains(input)){
                System.out.println(garden.get(i));
                count++;
            }
        }
        if(count == 0){
            System.out.println("augalo nera. Matyt, augalas nepalaistytas nuvyto");
        }
    }
    public static void filterByOneYear(){
        System.out.println("ar augalas vienmetis: ");
        String input = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).oneYear){
                System.out.println(garden.get(i));
                count++;
            }
        }
        if(count == 0){
            System.out.println("irasykite teisinga varianta");
        }
    }
    public static void filterByGrowthRegion(){
        System.out.println("iveskite zemynus kur augalas auga: ");
        String input = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).growthRegion.toLowerCase().contains(input)){
                System.out.println(garden.get(i));
                count++;
            }
        }
        if(count == 0){
            System.out.println("tokiam zemyne augalai neauga");
        }
    }
    public static void filterByHeight(){
        System.out.println("iveskite auksti metrais: ");
        int input = Validated.height2(sc);
        sc.nextLine();
        int count = 0;
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).height == input){
                System.out.println(garden.get(i));
                count++;
            }
        }
        if(count == 0){
            System.out.println("tokio dydzio augalo nera");
        }
    }
    public static void filterByEdible(){
        System.out.println("iveskite ar augalas valgomas: ");
        String input = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).edible){
                System.out.println(garden.get(i));
                count++;
            }
        }
        if(count == 0){
            System.out.println("iveskite teisinga pasirinkima");
        }
    }
}
