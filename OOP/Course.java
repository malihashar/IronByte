public abstract class Course {
    private String name;
    private String code;
    private int maxs;
    private int cns;
    public Course(String name,String code,int maxs,int cns){
        this.name=name;
        this.code=code;
        this.maxs=maxs;
        this.cns=cns;
    }
    public  abstract int calcFinalGrade(int exam,int as);
    public boolean isFull(){
        if(cns>maxs){
            return true;
        }
        else{
            return false;
        }
    }
    public int getCNS(){
        return cns;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return isFull()+name+code+maxs+cns;
    }
}
