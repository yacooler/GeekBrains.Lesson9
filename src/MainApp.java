import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        BaseBarrier[] barriers = new BaseBarrier[10];
        Object[] creatures = new Object[10];

        makeBarriers(barriers);
        makeCreatures(creatures);

        for (Object o : creatures) {
            if (o instanceof Cat){
                System.out.println("Участник кот вступает в гонку!");
            } else if (o instanceof Man) {
                System.out.println("Участник человек вступает в гонку!");
            } else if (o instanceof Robot){
                System.out.println("Участник робот вступает в гонку!");
            } else {
                System.out.printf("НЛО прилетело и высадило существо %s. Оно пока не реализует необходимые интерфейсы и не может участвовать в гонке. В другой раз.\\n", o.getClass());
                continue;
            }




            /*for (BaseBarrier b : barriers) {
               if (o instanceof Cat){
                   if (!((Cat) o).moveOver((b))) {
                       System.out.println("Кот вышел из гонки! \\n");
                       break;
                   }
               } else if (o instanceof Man) {
                   if (!((Man) o).moveOver(b)){
                       System.out.println("Человек вышел из гонки! \\n");
                       break;
                   }
               } else if (o instanceof Robot){
                   if (!((Robot) o).moveOver(b)){
                       System.out.println("Робот вышел из гонки! \\n");
                       break;
                   }
               } else {
                   System.out.printf("Данное существо (%s) науке не известно\\n", o.getClass());
                   break;
               }
            }*/
        }


    }

    private static void makeBarriers(BaseBarrier[] barriers) {
        Random random = new Random();
        for (int i = 0; i < barriers.length; i++) {
            switch (random.nextInt(2)){
                case 0:{
                    barriers[i] = new BarrierRunable(random.nextInt(50) + 100);
                    break;
                }

                case 1:{
                    barriers[i] = new BarrierJumpable(random.nextInt(6) + 1);
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
                    creatures[i] = new Cat(random.nextInt(50) + 75, random.nextInt(6) + 4);
                    break;
                }

                case 1:{ //Средние показатели
                    creatures[i] = new Man(random.nextInt(50) + 100, random.nextInt(6) + 1);
                    break;
                }

                case 2:{//Робот бегает дальше других, но прыгает хуже
                    creatures[i] = new Robot(random.nextInt(50) + 150, random.nextInt(3) + 1);
                    break;
                }
            }
        }
    }
}
