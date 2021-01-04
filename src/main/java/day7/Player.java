package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }

    }

    public void info() {
        if (countPlayers < 6) {
            int freePlace = 6 - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + freePlace + " свободных мест");
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
