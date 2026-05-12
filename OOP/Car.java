

public class Car extends Vehicle implements Insurable {
    private int insurance;
    private boolean luxury;
    public Car(String name,String brand,int ppd,int insurance){
        super(brand,name,ppd);
        this.insurance=insurance;
        if(ppd+isnurance>=100000){
        this.luxury=true;
    }
    else{
       this.luxury=false;
    }
    }
    
    public boolean isLuxury(){
        return luxury;
    }
    public int getInsuranceCost(){
        return insurance;
    }
    public int CalcCost(int days){
        return (days*getPPD())+insurance;
    }
    public String toString(){
        super.toString+ insurance+luxury
    }
    }

