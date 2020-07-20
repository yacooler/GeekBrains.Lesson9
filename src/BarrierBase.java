public abstract class BarrierBase {
    private int strength;

    public BarrierBase(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public abstract boolean checkCreatureOvercome(Creature c);

    public abstract String getDescription();
}
