/**
 * Victor Sim
 * 5/14/22
 * JDK 17.0.2
 * This program will be the Alien Superclass for the Alien Game.
 */
package finalexam;


public class Alien {
    private int dmg;

    public Alien(int dmg) {
        this.dmg = dmg;
    }
    public int getDamage() {
        return dmg;
    }
    public void setDamage(int dmg) {
        this.dmg = dmg;
    }
    
    public String toString(int a, String sound) {
        String output;
        if(a > 2 || a <= 1) { 
        System.out.printf("This Alien does " + dmg + "damage points. \n");
        }
        else {
        System.out.printf("This Alien does " + dmg + "damage points.");
        }
        return output;
    }
    
}
