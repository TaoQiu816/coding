package com.itheima.objectdemo;

import java.util.StringJoiner;

//标记型接口（没有抽象方法），如Cloneable
//表示一旦实现，当前类的对象就被克隆，否则就不能被克隆
public class user implements Cloneable{
    private int id;//游戏角色
    private String username;//用户名
    private String password;//密码
    private String path;//游戏图片
    private int[] data;//游戏进度


    public user() {
    }

    public user(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "user{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", data = " + arrToString() + "}";
    }

    public String arrToString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+" ");
        }
        return sj.toString();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类的克隆方法
        //return super.clone();

        //重写为深克隆
        //先获取被克隆对象的数组
        int[] data = this.data;
        //创建新的数组
        int[] newData =new int[data.length];
        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        user u=(user) super.clone();
        //因为父类中的克隆方法是浅克隆，要替换克隆出来对象中的数组地址值
        u.data =newData;
        return u;
    }
}
