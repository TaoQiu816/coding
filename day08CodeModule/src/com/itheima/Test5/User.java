package com.itheima.Test5;

public class User {
    //属性
    //所有属性都要用private关键字，保证数据安全
    private String userName;
    private String passWord;
    private String email;
    private String gender;
    private int age;

    public User() {
    }

    public User(String userName, String passWord, String email, String gender, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{userName = " + userName + ", passWord = " + passWord + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }

    //插件生成标准JAVA BEAN


    //空参构造
    /*public User(){

    }*/


    /*//带全参 的构造
    public User(String userName, String passWord, String email, String gender, int age){
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //get和set方法
    public void setUserName(String userName){
        this.userName =userName;
    }

    public String getUserName(){
        return userName;
    }*/
    /*//快捷键创建
    public User() {
    }

    public User(String userName, String passWord, String email, String gender, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
}
