/**
 * Created by stenly on 04.01.15.
 */
public class Hero {
    public Integer health;
    public String name;
    public String nickname;

    public Hero(String name, Integer health, String nickname) {
        this.name = name;
        this.health = health;
        this.nickname = nickname;
    }

    public String knownAs() {
        return String.format("%s the %s", this.name, this.nickname);
    }


}
