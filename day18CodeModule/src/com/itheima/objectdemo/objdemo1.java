package com.itheima.objectdemo;

public class objdemo1 {
    public static void main(String[] args) {
        //object类没有成员变量
        /*public String toString()				//返回该对象的字符串表示形式(可以看做是对象的内存地址值)
        public boolean equals(Object obj)		//比较两个对象地址值是否相等；true表示相同，false表示不相同
        protected Object clone()    			//对象克隆*/

        //返回对象的字符串表现形式（包名+类名+@地址值，@是固定格式）
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@776ec8df
        //直接sout打印对象结果相同
        System.out.println(obj);
        //system:类名
        //out:静态变量
        //system.out:获取打印的对象
        //println():方法
        //参数：打印的内容
        //核心逻辑
        //当打印一个对象的时候，底层就会调用对象的tostring方法，把对象变成字符串
        //然后再打印在控制台上，打印完毕换行处理
        //

        //注意：若不想看到地址值，可以重写tostring方法，比如显示属性值
    }
}
