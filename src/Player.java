public class Player {

    String name;
    int district;
    boolean isAlive = true;
    String weapon;

    static int numberOfPlayers = 0;

    public Player(String name, int district) {
        this.name = name;
        this.district = district;

        numberOfPlayers++;
    }
}
