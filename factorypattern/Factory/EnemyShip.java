public abstract class EnemyShip {

    //basic class for a ship, every ship needs one of these.
    private String name;
    private double amtDamage;
    
    public String getName(){return name;}
    public void setName(String newName){name = newName;}

    public double getDamage(){return amtDamage;}
    public void setDamage(double newDamage){
        amtDamage = newDamage;
    }

    public void followPlayerShip(){
        System.out.println(getName() + " is following the player");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " has appeared");
    }

    public void enemyShipFires(){
        System.out.println(getName() + " has attacked, it did " + getDamage());
    }
    
}