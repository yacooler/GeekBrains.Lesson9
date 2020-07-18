public class BarrierRoad extends BarrierBase{
    public BarrierRoad(int strength) {
        super(strength);
    }

    @Override
    public String getDescription() {
        return String.format("Дорожка длиной %d", getStrength());
    }
}
