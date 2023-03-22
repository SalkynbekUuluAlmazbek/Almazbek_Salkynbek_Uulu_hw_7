public class Magic extends Hero{
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Megic применил суперсилу " + getSuperAbilityType());

    }

}
