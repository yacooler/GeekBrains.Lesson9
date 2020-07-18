//public class Man implements Runner, Jumper {
//
//    private final int maxHeight;
//    private final int maxLength;
//
//    public Man(int maxHeight, int maxLength) {
//        this.maxHeight = maxHeight;
//        this.maxLength = maxLength;
//    }
//
//    @Override
//    public boolean moveOver(BarrierJumpable b) {
//        if (b.getHeight() <= maxHeight) {
//            System.out.printf("Человек перепрыгивает через барьер высотой %d используя шест", b.getHeight());
//            return true;
//        }
//
//        System.out.printf("Человек пока не может прыгать на высоту %d и сходит с дистанции", b.getHeight());
//        return false;
//    }
//
//    @Override
//    public boolean moveOver(BarrierRunable b) {
//        if (b.getLength() <= maxLength) {
//            System.out.printf("Человек без труда пробегает %d метров", b.getLength());
//            return true;
//        }
//
//        System.out.printf("Человек не может пробежать %d метров, он очень устал.", b.getLength());
//        return false;
//
//    }
//
//    public boolean moveOver(BarrierBase b){
//        System.out.println("Человек не умеет преодолевать препятствия типа " + b.getClass());
//        return false;
//    }
//
//}