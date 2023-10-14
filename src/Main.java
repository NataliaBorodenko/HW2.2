public class Main {
    public static void main(String[] args) {
        int initially = 100;
        int replenishment = 1100;

        int bonus;
            if (replenishment > 1000){
                bonus = replenishment / 100;
            }else {
                bonus = 0;
            }
        int result = initially + replenishment + bonus;

            System.out.println(" Сумма бонусов:" + bonus);
            System.out.println (" Итоговый счет:" + result);



    }
}