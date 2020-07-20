import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        BarrierBase[] barriers = new BarrierBase[10];
        Creature[] creatures = new Creature[10];
        boolean win;

        makeBarriers(barriers);
        makeCreatures(creatures);

        System.out.println("Список препятствий:");
        for(BarrierBase b:barriers){
            System.out.println(b.getDescription());
        }

        for (Creature creature : creatures) {

            System.out.printf("%s вступает в гонку\n", creature.getDescription());
            win = true;
            for (BarrierBase b : barriers) {
                if (!(creature.overcomeBarrier(b))){
                    System.out.printf("%s выходит из гонки\n", creature.getDescription());
                    win = false;
                    break;
                };
            }
            if (win){
                System.out.printf("%s доходит до конца!\n", creature.getDescription());
            }
        }


    }

    private static void makeBarriers(BarrierBase[] barriers) {
        Random random = new Random();
        for (int i = 0; i < barriers.length; i++) {
            switch (random.nextInt(2)){
                case 0:{
                    barriers[i] = new BarrierRoad(random.nextInt(50) + 90);
                    break;
                }

                case 1:{
                    barriers[i] = new BarrierWall(random.nextInt(4) + 1);
                    break;
                }
            }
        }
    }

    private static void makeCreatures(Creature[] creatures) {
        Random random = new Random();
        for (int i = 0; i < creatures.length; i++) {

            switch (random.nextInt(3)){
                case 0:{ //Кот прыгает выше других, но бегает хуже
                    creatures[i] = new Cat(random.nextInt(8) + 2, random.nextInt(50) + 85);
                    break;
                }

                case 1:{ //Средние показатели
                    creatures[i] = new Man(random.nextInt(6) + 2,random.nextInt(50) + 100 );
                    break;
                }

                case 2:{//Робот бегает дальше других, но прыгает хуже
                    creatures[i] = new Robot(random.nextInt(4) + 2, random.nextInt(50) + 150 );
                    break;
                }
            }
        }
    }
}
