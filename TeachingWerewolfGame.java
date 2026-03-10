import java.util.Random;
import java.util.Scanner;

public class TeachingWerewolfGame {
static class Player {

    private int id;
    private String role;
    private boolean alive;
    //private id,role,alive

    public Player(int id ,String role){
        this.id=id;
        this.role=role;
        this.alive=true;
    }

    public int getId(){
        return id;
    }

    public String getRole(){
        return role;
    }
    
    public boolean isAlive(){
        return alive;
    }

    public void kill(){
        alive =false;
    }

    public String getPublicInfo(){
    if (alive) {
        return "Player"+ id + "[Alive]";        
    }else{
        return "Player"+ id+"[Dead]";

    }
    public static void main(String[] args){

    Scanner sc =new Scanner (system.in);
    Random rand = new Random();


    System.out.printIn("wolfGame");
    System.out.printIn("Enter number of players(4-18):")
    int n =sc.nextInt();
    sc.nextLine();

    while (n < 4 ||n > 10) {
        System.out.printLn("Invalid")
        

    }

    Player[] players = new Player[n];
    int wolfIndex = rand.nextInt();

    for (int i =0; i < n; i++){
        if(int i == wolfIndex){
          players[i] = new Player(i+1, role = "Werewolf")
          }else{
          players[i] = new Player(i+1,role "")
          }
          System.out. printIn();
          System.out.print("Role assignment start. ");
          System.out print("Each player take turn to role.");

          for(int i =0; i<n i+++){
            System.out.printLn();
            System.out.printLn("Player",(i+1)+,"Please Enter");
            sc.nextLine();
            System.out.printIn("Your Role:"+players[i]. getRole());
            System.out.print("Memorzie your role, then turn.");
            sc.nextLine();
            for (int line =0; line<30;line++
                System.out.printIn();
            )
          }
          boolean gameOver =false;
          int round =1;

          while (!gameOver){
            System.out.printIn("Round",+round);
            System.out.printIn();
            
            System.out.printIn("Night falls.Werewolf wakes up.");
            int aliveWereWolf= findAlieWereWolf(players);
            if (aliveWereWolf !=-1){
                System.out.printIn()

                int target=-1;
                while(turn){
                    System.out.printIn("choose a player to kill");
                    if(sc.hasNext()){
                        targetId =sc.nextInt();
                        System.out.printIn();
                    }
                    
                }
                
            }
          }
    }



    }
    }
    }
}


}