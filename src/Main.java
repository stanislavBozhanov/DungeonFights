/**
 * Created by stenly on 04.01.15.
 */
public class Main {
    public static void main(String[] args) {
        Hero stenly = new Hero("Stenly", 100.0, "StenSten");

        System.out.println(stenly.name);
        System.out.println(stenly.health);
        System.out.println(stenly.nickname);

        System.out.println(stenly.knownAs());
        System.out.println(stenly.getHealth());
        System.out.println(stenly.isAlive());

        stenly.takeDamage(99.9);

        System.out.println(stenly.getHealth());

        stenly.takeDamage(0.2);

        System.out.println(stenly.getHealth());
        System.out.println(stenly.isAlive());
        System.out.println(stenly.takeHealing(10.0));

        stenly.health = 10.0;
        stenly.takeHealing(20.0);

        System.out.println(stenly.getHealth());
    }
}
