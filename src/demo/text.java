package demo;

import java.util.Scanner;

public class text {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //创建jd数组存放家电
        JD[] jds = new JD[4];

        jds[0] = new lamp("美的电灯", false);
        jds[1] = new TV("海信电视", false);
        jds[2] = new washmachine("美的洗衣机", false);
        jds[3] = new Air("美的空调", false);

        //写一个智能控制系统控制家电
        SmartHomeControl smartHomeControl = new SmartHomeControl(jds);
       // smartHomeControl.control(jds[0]);
        //1.提示所有设备的状态
        smartHomeControl.printallstatus();
        //2.选择要控制的设备
        System.out.println("请输入要控制的设备");
        String name = sc.next();
        for (int i = 0; i < jds.length; i++) {
            if (jds[i].getName().equals(name)) {
                smartHomeControl.control(jds[i]);
                //break;
            }
         // System.out.println("没有此设备");
        }
    }
    //为每个设备指定开合关的功能，定义一个接口实现开关
    //界面操作
    //}


}