package come.itheima.arrayList.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        //添加手机对象并返回要求的数据
        //四年归方法 返回价格低于3000的手机信息
        //创建集合对象
        ArrayList<Phone> list = new ArrayList<>();
        //添加对象
        list.add(new Phone("小米", 1000));
        list.add(new Phone("苹果", 8000));
        list.add(new Phone("锤子", 2999));

        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone p = phoneInfoList.get(i);
            System.out.println(p.getBand() + "," + p.getPrice());
        }

    }

    //返回价格低于3000的手机信息

    //技巧：
    //如果要返回多个数据，可以把这些数据先放到一个容器中，再把容器返回
    //集合 数组
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //存储符合要求的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<3000){
                //满足要求则加入新集合
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
