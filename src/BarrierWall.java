public class BarrierWall extends BarrierBase {
    public BarrierWall(int strength) {
        super(strength);
    }

    @Override
    public String getDescription() {
        return String.format("Стена высотой %d", getStrength());
    }
}
