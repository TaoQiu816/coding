package day04_homework;

public class homework1 {
    public static void main(String[] args) {
        //李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
        //而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，
        //新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。
        //旧手机可以卖的价格
        double oldPhone = 1500;
        //新手机价格
        double newPhone = 7988;
        //以旧换新后需要的钱
        double change = newPhone * 0.8;
        //不以旧换新
        double noChange = newPhone - oldPhone;

        //判断
        if (change > noChange) {
            System.out.println("以旧换新更省钱，并且共需要" + change);
        } else if (change < noChange) {
            System.out.println("不以旧换新更省钱，并且共需要" + noChange);
        } else {
            System.out.println("是否以旧换新价格一样，都需要" + change);
        }

    }
}
