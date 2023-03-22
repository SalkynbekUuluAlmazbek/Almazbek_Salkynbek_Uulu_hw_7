public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(220, 20, "MegicDamage"),
                         new Medic(210, 20, "Heal", 10),
                         new Warrior(250, 25, "CriticalDamage")};
        // В начале делал через {new Megic(), new Medic(), new Warrior()}
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }

        }


    }
}