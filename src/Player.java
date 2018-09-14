/**
 *
 * @author Graham
 */
public class Player {

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the positionPlayed
     */
    public String getPositionPlayed() {
        return this.positionPlayed;
    }

    /**
     * @param positionPlayed the positionPlayed to set
     */
    public void setPositionPlayed(String positionPlayed) {
        this.positionPlayed = positionPlayed;
    }

    /**
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Player)){
            return false;
        }
        Player a = (Player) o;
        return this.getName().equals(a.getName()) 
                && this.getPositionPlayed().equals(a.getPositionPlayed())
                && this.getJerseyNumber() == a.getJerseyNumber();
    }
    
    @Override
    public String toString(){
        return this.getName()+ ", " + this.getPositionPlayed() + ", " + this.getJerseyNumber();
    }
    private String name;
    private String positionPlayed;
    private int jerseyNumber;
}
