//public class Robot implements Runner, Jumper {
//
//    private final int maxHeight;
//    private final int maxLength;
//
//    public Robot(int maxHeight, int maxLength) {
//        this.maxHeight = maxHeight;
//        this.maxLength = maxLength;
//    }
//
//    @Override
//    public boolean moveOver(BarrierJumpable b) {
//        if (b.getHeight() <= maxHeight) {
//            System.out.printf("Робот прыгает через барьер высотой %d используя реактивный ранец\\n", b.getHeight());
//            return true;
//        }
//
//        System.out.printf("Робот не может прыгнуть на высоту %d и сходит с дистанции\\n", b.getHeight());
//        return false;
//    }
//
//    @Override
//    public boolean moveOver(BarrierRunable b) {
//        if (b.getLength() <= maxLength) {
//            System.out.printf("Робот бежит по дорожке длиной %d на роликах\\n", b.getLength());
//            return true;
//        }
//
//        System.out.printf("Заряда робота не хватает, чтобы пробежать %d метров и он останавливается\\n", b.getLength());
//        return false;
//    }
//
//    public boolean moveOver(BarrierBase b){
//        System.out.println("Робот не умеет преодолевать препятствия типа " + b.getClass());
//        return false;
//    }
//
//}