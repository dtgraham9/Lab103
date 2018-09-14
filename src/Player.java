/**
 * Creates Player class that stores a name, positionPlayed, and jersey number
 * @author Graham
 */
public class Player {
    /**
     * constructor for storing name, positionPlayed and jerseyNumber
     * @param name
     * @param positionPlayed
     * @param jerseyNumber 
     */
    public Player(String name, String positionPlayed, int jerseyNumber){
        this.name = name;
        this.positionPlayed = positionPlayed;
        this.jerseyNumber = jerseyNumber;
    }
    
    /**
     * Returns name of Player
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name of Player
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns position played of Player
     * @return the positionPlayed
     */
    public String getPositionPlayed() {
        return this.positionPlayed;
    }

    /**
     * Sets position played for Player
     * @param positionPlayed the positionPlayed to set
     */
    public void setPositionPlayed(String positionPlayed) {
        this.positionPlayed = positionPlayed;
    }

    /**
     * Returns jersey number of Player
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    /**
     * Sets jersey number of Player
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    
    /**
     * Tests if Object o if it is a Player and if it has the same name, 
     * positionPlayed, and jerseyNumber
     * @param o
     * @return 
     */
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
    /**
     * Returns string for Player containing its name, positionPlayed, and
     * jerseyNumber
     * @return 
     */
    @Override
    public String toString(){
        return this.getName()+ ", " + this.getPositionPlayed() + ", " + this.getJerseyNumber();
    }
    private String name;
    private String positionPlayed;
    private int jerseyNumber;
}
