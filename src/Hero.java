/**
 * Created by stenly on 04.01.15.
 */
public class Hero {
    public double health;
    public String name;
    public String nickname;
    public final double MAX_HEALTH;

    public Hero(String name, double health, String nickname) {
        this.name = name;
        this.health = health;
        this.MAX_HEALTH = health;
        this.nickname = nickname;
    }

    public String knownAs() {
        return String.format("%s the %s", this.name, this.nickname);
    }

    public double getHealth() {
        return this.health;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(double damagePoints) {
        this.health -= damagePoints;
        if (this.health < 0.0) {
            this.health = 0.0;
        }
    }

    public boolean takeHealing(double healingPoints) {
        if (!isAlive()) {
            return false;
        }
        this.health += healingPoints;
        if (this.health > MAX_HEALTH) {
            this.health = MAX_HEALTH;
        }
        return true;
    }
}
