package model;

public class Player {
    Sign sign;

    String name;
    boolean won;



    public Player(String name, Sign sign){
        this.name = name;
        this.sign = sign;
        won = false;
    }


}
