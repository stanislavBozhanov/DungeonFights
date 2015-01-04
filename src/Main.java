/**
 * Created by stenly on 04.01.15.
 */
public class Main {
    public static void main(String[] args) {
        Hero stenly = new Hero("Stenly", 100, "StenSten");
        System.out.println(stenly.name);
        System.out.println(stenly.health);
        System.out.println(stenly.nickname);

        System.out.println(stenly.knownAs());
    }
}
