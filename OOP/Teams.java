

public abstract class Teams {
    private String name;
    private int wins;
    public Team(String name,int wins){
        this.name=name;
        this.wins=wins;
    }
    public abstract void playGame();
}
