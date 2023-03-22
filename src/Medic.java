public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType,int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил суперсилу " + getSuperAbilityType());
    }
    public void increaseExperience() {
        healPoints += healPoints / 10;
    }

}
