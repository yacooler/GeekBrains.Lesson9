//Тестовый класс, не умеющий прыгать (не реализующий Jumper)
public class Snail implements Runner, Creature {

    private final int maxDistance;

    public Snail(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public boolean overcomeBarrier(BarrierRoad b) {
        if (b.getStrength() <= maxDistance) {
            System.out.printf("Улиточка ползет %d метров\n", b.getStrength());
            return true;
        }

        System.out.printf("Улиточка не может проползти %d метров и прячется\n", b.getStrength());
        return false;
    }

    @Override
    public boolean overcomeBarrier(BarrierBase barrierBase) {
        return barrierBase.checkCreatureOvercome(this);
    }

    @Override
    public String getDescription() {
        return String.format("Улиточка [бег:%d]", maxDistance);
    }


}