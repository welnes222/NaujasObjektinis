import java.util.ArrayList;

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
}
