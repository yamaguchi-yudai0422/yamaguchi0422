package model;

public class 都道府県 {
    private String name;
    private String capital;
    private double area;

    public 都道府県(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }
}
