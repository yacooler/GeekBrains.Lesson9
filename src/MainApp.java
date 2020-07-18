import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        //test();
        BarrierBase b = new BarrierRoad(100);

        Cat c = new Cat(1000,1000);

        c.overcomeBarrier(b.getClass().cast(b));

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

    private static void makeCreatures(Object[] creatures) {
        Random random = new Random();
        for (int i = 0; i < creatures.length; i++) {

            switch (random.nextInt(1)){
                case 0:{ //Кот прыгает выше других, но бегает хуже
                    creatures[i] = new Cat(random.nextInt(6) + 4, random.nextInt(50) + 85);
                    break;
                }

//                case 1:{ //Средние показатели
//                    creatures[i] = new Man(random.nextInt(50) + 100, random.nextInt(6) + 1);
//                    break;
//                }
//
//                case 2:{//Робот бегает дальше других, но прыгает хуже
//                    creatures[i] = new Robot(random.nextInt(50) + 150, random.nextInt(3) + 1);
//                    break;
//                }
            }
        }
    }
}
