public class Man implements Runner, Jumper, Creature {

    private final int maxHeight;
    private final int maxDistance;

    public Man(int maxHeight, int maxDistance) {
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public boolean overcomeBarrier(BarrierWall b) {
        if (b.getStrength() <= maxHeight) {
            System.out.printf("Человек перепрыгивает через барьер высотой %d используя шест\n", b.getStrength());
            return true;
        }

        System.out.printf("Человек пока не может прыгать на высоту %d и сходит с дистанции\n", b.getStrength());
        return false;
    }

    @Override
    public boolean overcomeBarrier(BarrierRoad b) {
        if (b.getStrength() <= maxDistance) {
            System.out.printf("Человек без труда пробегает %d метров\n", b.getStrength());
            return true;
        }

        System.out.printf("Человек не может пробежать %d метров, он очень устал\n", b.getStrength());
        return false;

    }

    @Override
    public boolean overcomeBarrier(BarrierBase barrierBase) {
        return barrierBase.checkCreatureOvercome(this);
    }

    @Override
    public String getDescription() {
        return String.format("Человек [бег:%d прыжок:%d]", maxDistance, maxHeight);
    }

}