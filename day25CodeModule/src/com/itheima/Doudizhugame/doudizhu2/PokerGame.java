package com.itheima.Doudizhugame.doudizhu2;

import java.util.*;

public class PokerGame {
    //对牌进行排序
    //方法1：利用序号进行排序：：将每张牌和一个数字产生对应关系（map），再利用数字的排序对牌进行排序
    //键：序号  值：牌
    //只需要将牌和数字产生对应关系，使用hashmap即可,不需要按照序号进行排序
    static HashMap<Integer, String> hm = new HashMap<>();
    //存储所有序号  与hashmap一一对应，用于获取每个序号对应的牌，后续对牌的操作等同于对序号集合的操作
    static ArrayList<Integer> list = new ArrayList<>();

    //静态只能使用静态
    //准备牌
    static {
        //四个花色
        String[] color = {"♠", "♥", "♣", "♦"};
        //所有数字
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //记录序号
        int serialNumber = 1;
        //遍历数字和花色，添加牌和数字的键值对
        for (String n : number) {
            //获取每一个数字,相同数字的优先级是一样的，所以先循环数字
            for (String c : color) {
                //获取每一个花色
                //拼接并存储键值对
                hm.put(serialNumber, c + n);
                //存储序号
                list.add(serialNumber);
                //序号自增
                serialNumber++;
            }
        }
        //添加大小王
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

       /* System.out.println(list);
        System.out.println(hm);*/
    }

    //空参构造
    public PokerGame() {
        //洗牌：打乱序号集合即可
        Collections.shuffle(list);
        System.out.println(list);

        //发牌：对序号进行操作,此时使用Treeset可同时通过序号的自然排序实现对牌的排序
        //创建四个集合存储三个玩家以及底牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        //便利序号集合进行发牌
        //需要用到索引
        for (int i =0;i<list.size();i++) {
            Integer serialNumber = list.get(i);
            //前三张当底牌
            if (i <= 2) {
                lord.add(serialNumber);
            }

            //给三个玩家发牌
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else if (i % 3 == 2) {
                player3.add(serialNumber);
            }


        }
        //看牌:通过序号获取牌
        lookPoker("底牌",lord);
        lookPoker("玩家一",player1);
        lookPoker("玩家二",player2);
        lookPoker("玩家三",player3);
    }

    //参数：玩家名字，玩家的序号列表
    public void lookPoker(String name, TreeSet<Integer> treeSet){
        StringJoiner sj = new StringJoiner(", ","","");
        //serialNumber为集合中的每个元素
        for (Integer serialNumber : treeSet) {
            //Integer key = list.get(i);
            sj.add(hm.get(serialNumber));
        }
        System.out.println(name+": "+sj);
    }
}
