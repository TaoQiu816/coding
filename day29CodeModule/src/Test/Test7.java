package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) throws IOException {
        //带权重的随机点名（随机抽取）
        //每个人每被点到一次，下次被点到的概率就在原有基础上降低一半


        //读取数据，数据包含每个人的权重，开始每个人的权重都一样
        //获取数据，并自定义一个javabean类进行管理
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\InfoWeight.txt"));

        //将获得的数据按照字段存为student对象,并放入集合
        ArrayList<Student> list = new ArrayList<>();
         String line;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("-");
            list.add(new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3])));
        }
        br.close();

        System.out.println(list);

        //求权重之和
        double sum=0;
        for (Student stu : list) {
            sum=sum+ stu.getWeight();
        }

        //计算每个人的权重占比并存于数组
        double[] weightArr = new double[list.size()];
        for (int i = 0; i < weightArr.length; i++) {
            weightArr[i]=list.get(i).getWeight()/sum;
        }
        System.out.println(Arrays.toString(weightArr));//[0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1]

        //根据权重占比，求出每个人在0~1所占的范围,
        for (int i = 1; i < weightArr.length; i++) {
            weightArr[i]=weightArr[i]+weightArr[i-1];
        }
        System.out.println(Arrays.toString(weightArr));//[0.1, 0.2, 0.30000000000000004, 0.4, 0.5, 0.6, 0.7, 0.7999999999999999, 0.8999999999999999, 0.9999999999999999]

        //随机获取0~1的小数
        double random = Math.random();
        System.out.println(random);
        //根据小数所在的范围确定谁被点中
        //法一：遍历，效率低
        //法二：二分查找法，Arrays中的工具方法，当所找元素在集合中不存在时，返回值为  -应当存入的索引-1
        //应当存入的索引就是实际被点名人的权重范围
        int index = -Arrays.binarySearch(weightArr,random)-1;

        //点名
        System.out.println(list.get(index));
        //点名后更改权重,减半
        list.get(index).setWeight(list.get(index).getWeight()/2);

        //将集合中的信息再次写入(通过改写tostring方法简化写入)
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29CodeModule\\InfoWeight.txt"));
        for (Student student : list) {
            bw.write(student.toString());
            //换行
            bw.newLine();
        }
        bw.close();

    }
}
