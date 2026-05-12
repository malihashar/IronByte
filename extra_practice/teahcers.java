public class teahcers extends employees implements payment {
    public teacher(string name;int salary){
        super(name,salary);
    }
    public void updatesal(int num){
        salary+=num
    }
    public void changeSal(int num){
        salary=num;
    }
    public duties(String duties){
        return duties;
    }
}
