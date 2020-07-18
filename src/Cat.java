public class Cat implements Runner, Jumper {

    private final int maxHeight;
    private final int maxDistance;

    public Cat(int maxHeight, int maxDistance) {
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public int getJumpHeight() {
        return maxHeight;
    }

    @Override
    public int getRunDistance() {
        return maxDistance;
    }

    //    @Override
//    public boolean moveOver(BarrierJumpable b) {
//        if (b.getHeight() <= maxHeight){
//            System.out.printf("Кошка перелезает через барьер высотой %d используя когти\n", b.getHeight());
//            return true;
//        }
//
//        System.out.printf("Кошка поглядывает то на барьер высотой %d, то на вас и укладывается спать. Дальше она не пойдёт\n", b.getHeight());
//        return false;
//    }
//
//    @Override
//    public boolean moveOver(BarrierRunable b) {
//        if (b.getLength() <= maxLength) {
//            System.out.printf("Кошка быстро пробегает %d метров, помогая хвостом на поворотах\n", b.getLength());
//            return true;
//        }
//
//        System.out.printf("Кошка видит, что бежать ей ещё %d метров, но ей лень. В другой раз.\n", b.getLength());
//        return false;
//    }

//    public boolean moveOver(BaseBarrier b){
//
//        System.out.println((b.getClass().cast(b)).getClass());
//
//        return false;
//    }

}
