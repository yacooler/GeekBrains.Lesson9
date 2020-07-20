public class BarrierWall extends BarrierBase {
    public BarrierWall(int strength) {
        super(strength);
    }

    @Override
    public String getDescription() {
        return String.format("Стена высотой %d", getStrength());
    }

    @Override
    public boolean checkCreatureOvercome(Creature c) {
        if (c instanceof Jumper) {
            return ((Jumper) c).overcomeBarrier(this);
        } else {
            System.out.printf("%s не умеет преодолевать препятствие %s\n", c.getDescription(), this.getDescription());
            return false;
        }
    }
}
