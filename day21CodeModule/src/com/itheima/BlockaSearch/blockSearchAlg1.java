package com.itheima.BlockaSearch;

public class blockSearchAlg1 {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */
        int[] arr = {16, 5, 9, 12, 21, 18,//为了让数据更均匀
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //数据分块（分块数量：数据总个数开根号，约4.24）
        //创建三个块对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        //定义数组，管理块对象（索引表）
        Block[] blockArr = {b1,b2,b3};

        //要查找的数据
        int num = 73;

        //调用方法查找数据(传递索引表，数组，要查找的元素)
        int index = getIndex(blockArr,arr,num);
        System.out.println(index);

    }

    //利用分块查找查询数据索引
    private static int getIndex(Block[] blockArr, int[] arr, int num) {
       //首先确定要查找的数据所在的块(索引表中的索引)
        int blockIndex = findBlockIndex(blockArr,num);
        if (blockIndex==-1){
            //分块不存在，数据不存在
            return -1;
        }

        //获取所在分块内的起始和终止索引
        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        //块内顺序查找
        for (int i = startIndex; i <= endIndex; i++) {
            if (num==arr[i]){
                return i;
            }
        }
        //到此说明再块内没有该数据
        return -1;
    }

    private static int findBlockIndex(Block[] blockArr, int num) {
        //顺序查找，若小于分块的最大值，则位于该分块
        for (int i = 0; i < blockArr.length; i++) {
            if (num<=blockArr[i].getMax()){
                return i;
            }
        }
        //循环结束未终止说明未找到分块，数据不存在
        return -1;
    }


}
//块的类
class Block {
    private int max;//块内最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}