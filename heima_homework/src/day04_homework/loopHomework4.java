package day04_homework;

public class loopHomework4 {
    public static void main(String[] args) {
        //中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。
        // （年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。
        // 请打印出1988年到2019年的所有闰年年份。

        for (int year = 1988; year <= 2019; year++) {
            if ((year %4==0 && year %100!=0) || (year %400==0) ){
                System.out.println(year + "是闰年");
            }
        }
    }
}
