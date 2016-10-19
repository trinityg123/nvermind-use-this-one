
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
    // fields
    String name;
    private int x;
    private int y;
    private int dir;// 0=North, 1=East, 2=South, 3=West
    private int distance;
    boolean running = true;
    private int pics;
    String face;
    
    public Rover(String name)
    {
        this.name = name;
        this.dir = 0;
    }
    
    /**
     * Changes the varible face to a direction name.
     * 
     * takes the value of the dir and checks it for a specific direction 
     * 
     */
    public void getDirectionName()
    {
        if (dir == 0)
        {
            face = "North";
        }
        else if (dir == 1)
        {
            face = "North East";
        }
        else if (dir == 2)
        {
            face = "East";
        }
        else if (dir == 3)
        {
            face = "South East";
        }
        else if (dir == 4)
        {
            face = "South";
        }
        else if (dir == 5)
        {
            face = "South West";
        }
        else if (dir == 6)
        {
            face = "West";
        }
        else if (dir == 7)
        {
            face = "North West";
        }
        else{
            System.out.println("ahIOSDUGAOFIUSG");
        }
    }
    
    /**
     * causes the robot to not move if the robot is dead.
     * the robot can be dead if it is killed or it runs out of power.
     *  
     * if the boolean of running is true the rover is alive if not the rover is dead
     * when the rover is alive the rover functions normally
     * when the rover is dead the rover does not runction at all.
     */
    public void move()
    {
        getDirectionName();
        if (running) 
        {          
            System.out.println(name + " is facing " + face);
        }
        else 
        {
            System.out.println(name + " can't move. It's dead!");
        }
    }
    
    /**
     * Turns the rover to the left.
     * 
     * substracts one from the dir int everytime the function is called. 
     * if the dir int is less than 0, the dir int is set to a value of 7.
     */
    public void rotateLeft() 
    {
        dir -= 1;
        
        if (dir < 0)//has the rover change direction so it is not negative
        {
            dir = 7;
        }
        
        System.out.println(name + " turned to the left");
        getDirectionName();
        System.out.println(name + " is facing " + face);
        move();
    }
    
    /**
     * Turns the rover to the right.
     * 
     * adds one from the dir int everytime the function is called. 
     * if the dir int is greater than 8, the dir int is set to a value of 0.
     */
    public void rotateRight()
    {
        dir += 1;
        
        if (dir == 8)//has the rover change direction so the value does not go over 8
        {
            dir = 0;
        }
        
        System.out.println(name + " turned to the right");
        getDirectionName();
        System.out.println(name + " is facing " + face);
        move();
    }
    
    /**
     * cuntes the number of pictures taken while the program is running.
     * 
     * adds one to the pics value
     * prints a line saying the rover has taken a number of pictures
     */
    public void takePicture(){
        this.pics += 1;
        System.out.println(name + " has taken " + pics + " picture");
    }
    
    /**
     * sends all of the rovers pictures back to earth.
     * 
     * prints a line that says the rover has sent back all of its pictures to earth
     * sets the pics value to  0
     * prints a line that basically tells the person that theri pictures have been set to 0.
     */
    public void transmitPictures(){
        System.out.println(name + " has sent all pictures back to earth.");
        this.pics = 0;
        System.out.println(name + " has taken " + pics + " picture since last transmit.");
    }
    
    /**
     * decides how the other robot is going to attack the players robot
     * 
     * takes a random number and finds the mod of it/
     * if the mod is 2 then the robot will use its lazer
     * 
     * if the mod is anything else the robot wiill throw rocks.
     * 
     * 
     * at the end a line is printed with the ammount of dammage the rover has done to the player.
     */
    public void otherRobot(){
        int randomNum = 0 + (int)(Math.random() * 50);
        if (randomNum % 10 >= 2){
            System.out.println("The robot has used its lazer against " + name + ".");
        }
        else{
            System.out.println("The robot has thrown rocks at " + name + ".");
        }
        
        System.out.println("The rover has damaged " + name + " by " + randomNum + " percent.");
    }
    
    public void collectRocks(){
        int rocks = 0;
        if (rocks > 5){
            toEarth();
        }
        else{
            rocks += 1;
        }
    }
    
    /**
     * has the robot return to earth and ends the game.
     * 
     * when called a line is printed that tells the player their rover has returned to earth saftely
     */
    public void toEarth(){
        System.out.println(name + "returned to earth safely.");
    }
        
}
