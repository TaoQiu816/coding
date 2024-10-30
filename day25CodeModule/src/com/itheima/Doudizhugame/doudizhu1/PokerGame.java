package com.itheima.Doudizhugame.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class PokerGame {
    //静态只能被静态使用
    static ArrayList<String> list = new ArrayList<>();

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
        list.add("大王");
        list.add("小王");
        System.out.println(list);
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
