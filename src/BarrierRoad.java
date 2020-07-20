public class BarrierRoad extends BarrierBase{
    public BarrierRoad(int strength) {
        super(strength);
    }

    @Override
    public String getDescription() {
        return String.format("Дорожка длиной %d", getStrength());
    }

    @Override
    public boolean checkCreatureOvercome(Creature c) {
        if (c instanceof Runner) {
            return ((Runner) c).overcomeBarrier(this);
        } else {
            System.out.printf("%s не умеет преодолевать препятствие %s\n", c.getDescription(), this.getDescription());
            return false;
        }
    }
}
