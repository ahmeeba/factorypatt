public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        //returns the correct ship depending on what char is inputted at runtime
        if(newShipType.equals("u")){
            return new UFOEnemyShip();
        }else
            if(newShipType.equals("r")){
                return new RocketEnemyShip();
            
        }else
            if(newShipType.equals("b")){
                return new BossUFO();
            }
        else return null;
    }
    
}