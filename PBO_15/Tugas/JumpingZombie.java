package Tugas;

public class JumpingZombie extends Zombie {
    private int level;

    public JumpingZombie(int health, int level) {
        this.health=health;
        this.level=level;
    } 
    public void heal(){
        if(level == 1) {
            health =+ (health * 30/100);
            System.out.println("Heal\t = " + health);
        } else if(level == 2) {
            health =+ (health * 40/100);
            System.out.println("Heal\t = " + health);
        } else {
            health =+ (health * 50/100);
            System.out.println("Heal\t = " + health);
        }
    }
    public void destroyed() {
        health -= (health * 2/100);
        
    }   
    public String getZombieInfo() {
        System.out.println("Jumping Zombie Data =");
        String info = super.getZombieInfo() + "\n";
        info += "Level\t = " + level  + "\n";
        return info;
    }    
}