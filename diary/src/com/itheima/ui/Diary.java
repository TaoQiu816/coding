package com.itheima.ui;

import java.io.Serial;
import java.io.Serializable;

public class Diary implements Serializable {
    @Serial
    private static final long serialVersionUID = 8380411647324971825L;
    //编号、标题、正文
    private int number;//编号
    private String tittle;//标题
    private String text;//正文


    public Diary() {
    }

    public Diary(int number, String tittle, String text) {
        this.number = number;
        this.tittle = tittle;
        this.text = text;
    }

    /**
     * 获取
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 获取
     * @return tittle
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * 设置
     * @param tittle
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    /**
     * 获取
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * 设置
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "Diary{number = " + number + ", tittle = " + tittle + ", text = " + text + "}";
    }
}
