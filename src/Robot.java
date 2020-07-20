public class Robot implements Runner, Jumper, Creature {

    private final int maxHeight;
    private final int maxDistance;

    public Robot(int maxHeight, int maxDistance) {
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public boolean overcomeBarrier(BarrierWall b) {
        if (b.getStrength() <= maxHeight) {
            System.out.printf("Робот прыгает через барьер высотой %d используя реактивный ранец\n", b.getStrength());
            return true;
        }

        System.out.printf("Робот не может прыгнуть на высоту %d и сходит с дистанции\n", b.getStrength());
        return false;
    }

    @Override
    public boolean overcomeBarrier(BarrierRoad b) {
        if (b.getStrength() <= maxDistance) {
            System.out.printf("Робот бежит по дорожке длиной %d на роликах\n", b.getStrength());
            return true;
        }

        System.out.printf("Заряда робота не хватает, чтобы пробежать %d метров и он останавливается\n", b.getStrength());
        return false;
    }

    @Override
    public boolean overcomeBarrier(BarrierBase barrierBase) {
        return barrierBase.checkCreatureOvercome(this);
    }

    @Override
    public String getDescription() {
        return String.format("Робот [бег:%d прыжок:%d]", maxDistance, maxHeight);
    }


}