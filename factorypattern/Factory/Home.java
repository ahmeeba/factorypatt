import java.util.*;

public class Home{

    public static void main(String[] args) {
        
        //creating Factory object, used to make the right ship
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip enemy = null;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the ship type? (u/r/b");

        //taking in input, assigning typeOfShip that input char
        // assigning enemy the value of makeEnemyShip method
        if(input.hasNextLine()){
            String typeOfShip = input.nextLine();
            enemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(enemy != null){
            enemyControls(enemy);
        }else System.out.println("You entered invalid input, enter u/r/b");

        input.close();

    }

    public static void enemyControls(EnemyShip oneEnemyShip){

        oneEnemyShip.displayEnemyShip();
        oneEnemyShip.followPlayerShip();
        oneEnemyShip.enemyShipFires();
    }

}