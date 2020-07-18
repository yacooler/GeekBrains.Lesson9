public class BarrierJumpable extends BaseBarrier{

    private int height;

    public BarrierJumpable(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean moveOverAction() {
        return false;
    }
}
