public class Warrior extends Hero{
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Warrior применил суперсилу " + getSuperAbilityType());
    }
}
