public class Science extends Course implements Registrale{
     public Science(String name,String code,int maxs,int cns){
        super(name,code,maxs,cns);
     }
     public void dropStudent(int num){
        getCNS()-=num;
     }
     public boolean registerStudent(){
        if(isFull()){
            return false;
        }
        else{
            return true;
        }
     }
    public String getCourseType(){
        return getName();
    }
    public int calcFinalGrade(int exam,int as){
        exam*=0.1;
        as/=0.1;
        return exam+as;
    }
    public String toString(){
        return super.toString()+ calcFInaGrade()+getCOurseType()+registerStudent();
    }
}
