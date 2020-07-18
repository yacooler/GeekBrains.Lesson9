public class Cat implements Runner, Jumper, Creature {

    private final int maxHeight;
    private final int maxDistance;

    public Cat(int maxHeight, int maxDistance) {
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }


    @Override
    public boolean overcomeBarrier(BarrierWall b) {
        if (b.getStrength() <= maxHeight){
            System.out.printf("%s перелезает через барьер высотой %d используя когти\n", getDescription(), b.getStrength());
            return true;
        }

        System.out.printf("%s поглядывает то на барьер высотой %d метров, то на вас и укладывается спать. Дальше она не пойдёт\n", getDescription(), b.getStrength());
        return false;
    }

    @Override
    public boolean overcomeBarrier(BarrierRoad b) {
        if (b.getStrength() <= maxDistance) {
            System.out.printf("%s быстро пробегает %d метров, помогая хвостом на поворотах\n", getDescription(), b.getStrength());
            return true;
        }

        System.out.printf("%s видит, что бежать ей ещё %d метров, но ей лень. В другой раз.\n", getDescription(), b.getStrength());
        return false;
    }

    @Override
    public boolean overcomeBarrier(BarrierBase barrierBase) {
        System.out.println("base class");
        switch (barrierBase.getClass().getName()){
            case "BarrierWall":{
                BarrierWall barrierWall = (BarrierWall) barrierBase;
                return overcomeBarrier(barrierWall);
            }
            case "BarrierRoad":{
                BarrierRoad barrierRoad = (BarrierRoad) barrierBase;
                return overcomeBarrier(barrierRoad);
            }
        }
        System.out.println("Нет поведения для " + barrierBase.getClass().toString());
        return false;
    }

    @Override
    public String getDescription() {
        return String.format("Кошка [бег:%d прыжок:%d]", maxDistance, maxHeight);
    }
}
