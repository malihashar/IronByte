

public abstract class Vehicle {
    private String brand;
    private String model;
    private int ppd;
    public Vehicle(String brand,String model,int ppd){
        this.brand=brand;
        this.model=model;
        this.ppd=ppd;
    }
    public int getPPD(){
        return ppd;
    }
    public abstract int CalcCost(int days);
    public String toString(){
        return brand+model+ppd;
    }
}
