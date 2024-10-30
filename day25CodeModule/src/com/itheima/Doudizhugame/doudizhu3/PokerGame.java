package com.itheima.Doudizhugame.doudizhu3;

import java.util.*;

public class PokerGame {
    ////对牌进行排序
    //    //方法2:给每一张牌计算价值，通过价值大小实现排序

    //静态只能被静态使用
    static ArrayList<String> list = new ArrayList<>();
    //存储不同数字牌的价值,一一对应,键位牌，值位价值
    static HashMap<String,Integer> hm = new HashMap<>();


    //除开所有花色牌之外，还有大小王

    //准备牌
    //使用静态代码块，随着类的加载而加载，无论玩多少次都使用同一副牌
    static {
        //四个花色
        String[] color = {"♠", "♥", "♣", "♦"};
        //所有数字
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //拼接数字和花色得到不同的牌，并存放于集合之中
        for (String c : color) {
            //外循环获取所有花色
            for (String n : number) {
                //内循环获取所有数字
                //拼接并存储在集合之中
                //静态只能被静态使用
                list.add(c + n);
            }
        }
        //添加大小王到牌的集合之中
        //在前面加一个空格，保证与其他牌的格式一样，同时保证获取价值时不出错
        list.add(" 大王");
        list.add(" 小王");
        System.out.println(list);

        //指定牌的价值
        //排上的数字到map集合红判断是否存在
        //存在则获取价值，不存在（纯数字），则其本身就是价值（类型转换）
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",16);
        hm.put("大王",17);

    }

    //空参构造
    public PokerGame() {
        //洗牌,打乱集合中牌的顺序
        Collections.shuffle(list);
        System.out.println(list);

        ////发牌
        //共三个玩家，还要单独存储三张底牌
        //使用普通循环中的索引，进行发牌和获取底牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);

            //将前三张存为底牌
            if (i <= 2) {
                lord.add(poker);
            }
            //到此说明底牌存好了
            //依次给三个玩家发牌，使用取余运算
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }

        }

        ////看牌:遍历集合
        /*System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);*/
        lookPoker("lord", lord);
        lookPoker("player1", player1);
        lookPoker("player2", player2);
        lookPoker("player3", player3);

        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
    }

    //对牌进行排序
    //参数：牌的列表
    public void order(ArrayList<String> list){
        //调用collections中的sort并指定排序规则
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1位当前要加入到有序序列中的牌
                //o2位当前有序序列中已经存在的牌

                //字符串截取获取花色，大小王获得的是空格
                String color1 = o1.substring(0, 1);//包头不包尾
                //获取字符价值（不含花色）
                int value1 = getValue(o1.substring(1));//从指定索引截取到末尾

                String color2 = o2.substring(0,1);
                int value2= getValue(o2.substring(1));

                int i = value1-value2;

                //优先比较字符价值，价值相同时再比较花色
                return i==0?color1.compareTo(color2):i;

            }
        });

    }

    public int getValue(String poker){
        //从哈希表中寻找是否有此键
        if (hm.containsKey(poker)) {
            //若有则说明这不是纯数字，返回表中对应的价值
            return hm.get(poker);
        }else {
            //若没有则说明是纯数字，返回本身,强制类型转换
            return Integer.parseInt(poker);
        }

    }

    //看牌，获取每一个玩家的牌
    //参数：玩家名字，玩家的牌
    public void lookPoker(String name, ArrayList<String> list) {
        //玩家名字和牌的字符串拼接,sj指定了间隔符
        StringJoiner sj = new StringJoiner(", ", "", "");
        //sj.add(name).add(": ");
        for (String poker : list) {
            sj.add(poker);
        }
        System.out.println(name + ": " + sj);

    }


}
