package demo;

import java.util.ArrayList;

public class SmartHomeControl {

    //接收家电类
    private ArrayList<JD> jds;

    public SmartHomeControl()
    {}

    //构造方法
    public SmartHomeControl( ArrayList<JD> jds)
    {
        this.jds = jds;
    }
    public void control(JD jd)
    {

        System.out.println("开始操作");
        System.out.println(jd.getName()+"开关状态：" + (jd.isStatus()?"开着":"关着"));
        jd.press();
        System.out.println(jd.getName()+"开关状态：" + (jd.isStatus()?"开着":"关着"));
    }
    public void Menu2(String name)
    {
        //2.选择要控制的设备
        for (JD jd : jds) {
            if (jd.getName().equals(name)) {
                System.out.println("开始操作");
                System.out.println(jd.getName()+"开关状态：" + (jd.isStatus()?"开着":"关着"));
                jd.press();
                System.out.println(jd.getName()+"开关状态：" + (jd.isStatus()?"开着":"关着"));
            }
        }

            // System.out.println("没有此设备");
        }
    public void printallstatus()
    {
        for (JD jd : jds) {
            System.out.println(jd.getName()+"开关状态：" + (jd.isStatus()?"开着":"关着"));
        }
    }

}
