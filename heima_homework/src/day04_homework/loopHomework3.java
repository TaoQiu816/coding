package day04_homework;

public class loopHomework3 {
    public static void main(String[] args) {
        //已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。

        for (int i = 1949; i <= 2019; i++) {
            if ((2019-i)%12==0){
                System.out.println(i);
            }
        }
    }
}
