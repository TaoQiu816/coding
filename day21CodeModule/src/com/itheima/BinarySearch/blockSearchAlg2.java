package com.itheima.BinarySearch;

public class blockSearchAlg2 {
    public static void main(String[] args) {
        //分块查找的扩展（无规律数据）
        //思路：每个分块属性包含最小值和最大值，保证各个分块没有交集即可
        //{27，22，30，40，36，13，19，16，20，7，10，43，50，48}
        int[] arr = {27, 22, 30, 40, 36,//22~40
                13, 19, 16, 20, 7, 10, //7~20
                43, 50, 48};//43~50

        //共14个数据，分三四组即可

        //数据分块
        Block b1 = new Block(40, 22, 0, 4);
        Block b2 = new Block(20, 7, 5, 10);
        Block b3 = new Block(50, 43, 11, 13);

        //索引表管理分块
        Block[] blockArr = {b1, b2, b3};

        //要查找的数据
        int num = 12;

        //调用方法查找数据，获取索引,传递原数组，索引表，要查找的数据
        int index = getIndex(arr,blockArr,num);
        System.out.println(index);
    }

    private static int getIndex(int[] arr, Block[] blockArr, int num) {
        //确定数据所在块再索引表中的位置
        int blockIndex=getBlockIndex(num,blockArr);

        if (blockIndex==-1){
            return -1;//无满足的分块
        }

        //获取所在分块的起始和终止
        int startIndex = blockArr[blockIndex].getStratIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        //搜索数据
        for (int i = startIndex; i <= endIndex; i++) {
            if (num==arr[i]){
                return i;
            }
        }
        //未找到
        return -1;

    }

    private static int getBlockIndex(int num, Block[] blockArr) {
        //在某块的条件：在其最值之间
        for (int i = 0; i < blockArr.length; i++) {
            if (blockArr[i].getMin()<=num && blockArr[i].getMax()>=num){
                return i;
            }
        }
        //到此说明不在任意一块之内
        return -1;

    }
}

//分块的类
class Block {
    private int max;//最大值
    private int min;//最小值
    private int stratIndex;//起始索引
    private int endIndex;//终止索引


    public Block() {
    }

    public Block(int max, int min, int stratIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.stratIndex = stratIndex;
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
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     *
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     *
     * @return stratIndex
     */
    public int getStratIndex() {
        return stratIndex;
    }

    /**
     * 设置
     *
     * @param stratIndex
     */
    public void setStratIndex(int stratIndex) {
        this.stratIndex = stratIndex;
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
        return "Block{max = " + max + ", min = " + min + ", stratIndex = " + stratIndex + ", endIndex = " + endIndex + "}";
    }
}
