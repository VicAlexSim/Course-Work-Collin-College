/**
 * Victor Sim
 * 5/14/22
 * JDK 17.0.2
 * This program will be the RattlesnakeAlien subclass for the Alien Game.
 */
package finalexam;

public class RattlesnakeAlien {
    
    private int dmg;
    private String sound = "Hiss";

    public RattlesnakeAlien(int dmg, String sound) {
        this.dmg = dmg;
        this.sound = sound;
    }
    public int getDamage() {
        return dmg;
    }
    public void setDamage(int dmg) {
        this.dmg = dmg;
    }
    public String getSound() {
        return this.sound;
    }
    public void setSound(String Sound) {
        this.sound = sound;
    }    
    
    public String toString(int dmg, String sound) {
        return super.toString(int dmg, String sound);
    }
    
}

