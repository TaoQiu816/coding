package com.itheima.Test3;

public class GoodsTest {
    public static void main(String[] args) {
        //定义数组存储三个对象商品，创建三个商品对象，并把商品对象存入到数组当中
        Goods[] gds = new Goods[3];
        Goods g1 = new Goods("NXBD001", "瓜子", 7.5, 321);
        gds[0] = g1;
        Goods g2 = new Goods("NXBD002", "薯片", 6.5, 300);
        gds[1] = g2;
        Goods g3 = new Goods("NXBD003", "果冻", 2.5, 531);
        gds[2] = g3;

        for (int i = 0; i < gds.length; i++) {
            gds[i].showGoodInfo();
        }
    }
}
