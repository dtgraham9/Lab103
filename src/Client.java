import java.util.Scanner;

/**
 * Creates ArrayBag objects that run through operations involving removing 
 * elements, adding elements, and printing out the string.  The elements can be
 * added by keyboard or auto generated controlled by debug. It also uses 
 * LinkedBag object that runs through similar operations to ArrayBag.  
 * @author Graham Thompson
 * @version
 */
public class Client {

    /**
     * Returns a Player instance after going through input made via keyboard
     * @param input
     * @return 
     */
    public static Player getPlayer(Scanner input){
        System.out.print("Please enter in player's name: ");
        String name = input.nextLine();
        System.out.print("\nPlease enter position: ");
        String position = input.nextLine();
        int jerseyNumber = 0;
        System.out.print("\nPlease enter in jersey number between 1 to 99: ");
        boolean jersey = false;
        while(!(jersey)){
            if(input.hasNextInt()){
                jerseyNumber = input.nextInt();
                input.nextLine();
                if(jerseyNumber> 0 && jerseyNumber <100){
                    jersey = true;
                }
                else{
                    System.out.print("\nPlease enter value between 1 to 99: ");
                }
                    
            }
            else{
                System.out.print("\nValue isn't int please enter int: ");
                input.nextLine();
            }
        }
        System.out.print("\n");
        return new Player(name, position, jerseyNumber);
    }
    
    /**
     * Creates a team for any class that uses the Bag interface
     * It allows to auto generate by debug or entered via keyboard
     * @param team
     * @param debug
     * @param input 
     */
    public static void generateTeam(Bag<Player> team, boolean debug, Scanner input){
        System.out.print("Number of players, at least 6: ");
        boolean players = false;
        int numberPlayers = 0;
        while(!(players)){
            if(input.hasNextInt()){
                numberPlayers = input.nextInt();
                input.nextLine();
                if(numberPlayers> 5){
                    players = true;
                }
                else{
                    System.out.print("\nPlease enter at least 6: ");
                }
                       
            }
            else{
                System.out.print("\nPlease enter an int at least 6: ");
                input.nextLine();
            }
        }
        if(debug){
            Player player1 = new Player("Bob", "QB", 2);
            Player player2 = new Player("Sam", "QB", 3);
            Player player3 = new Player("Devin", "QB", 4);
            Player player4 = new Player("Nik", "QB", 5);
            Player player5 = new Player("Evan", "QB", 6);
            Player player6 = new Player("Marty", "I know nothing of football", 7);
            team.add(player1);
            team.add(player2);
            team.add(player3);
            team.add(player4);
            team.add(player5);
            team.add(player6);

            
        }
        else{
            for(int i = 0; i<numberPlayers; i++){
            team.add(getPlayer(input));
            }
        }
    }
    
    /**
     * Runs operations printing Bag, then randomly removes an element of Bag.
     * Then adds Player kyle and prints out Bag.
     * Finally removes kyle and prints out Bag
     * @param team 
     */
    public static void runOperations(Bag<Player> team){
        System.out.println(team.toString());
        team.remove();
        System.out.println(team.toString());
        Player kyle = new Player("Kyle", "QB", 10);
        team.add(kyle);
        System.out.println(team.toString());
        team.remove(kyle);
        System.out.println(team.toString());
        
    } 
    
    /**
     * Creates a Bag of strings that added courses
     * @param courses 
     */
    public static void createCourses(Bag<String> courses){
        courses.add("EE 206");
        courses.add("PHYS 252");
        courses.add("CSCI 161");
        courses.add("ECE 275");
        courses.add("CSCI 222");
    }
    
    /**
     * Prints the Bag of strings and then removes one randomly and print 
     * it out again
     * @param courses 
     */
    public static void runCourses(Bag<String> courses){
        System.out.println(courses.toString());
        courses.remove();
        System.out.println(courses.toString());
    }
    
    /**
     * Creates ArrayBag footballTeam of Players that calls generateTeam and 
     * runOperations methods.  Creates ArrayBag courses of Strings and calls 
     * createCourses and runCourses.  Finally creates a LinkedBag basketballTeam
     * that calls generateTeam and runOperations
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayBag<Player> footballTeam = new ArrayBag(2);
        Scanner input = new Scanner(System.in);
        boolean debug = false;
        generateTeam(footballTeam, debug, input);
        runOperations(footballTeam);
        ArrayBag<String> courses = new ArrayBag(2);
        createCourses(courses);
        runCourses(courses);
        LinkedBag<Player> basketballTeam = new LinkedBag();
        generateTeam(basketballTeam, debug, input);
        runOperations(basketballTeam);
    }
    
}
