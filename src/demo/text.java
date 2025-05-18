package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class text {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //创建jd数组存放家电
        JD[] jds = new JD[4];
        fang_fa fang_f = new fang_fa();
        jds[0] = new lamp("美的电灯", false);
        jds[1] = new TV("海信电视", false);
        jds[2] = new washmachine("美的洗衣机", false);
        jds[3] = new Air("美的空调", false);
        ArrayList<JD> jds1 = new ArrayList<>();
        for (JD jd : jds) {
            jds1.add(jd);
        }
        //写一个智能控制系统控制家电
        SmartHomeControl smartHomeControl = new SmartHomeControl(jds1);
        // smartHomeControl.control(jds[0]);
        while (true) {
            fang_f.Menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //1.提示所有设备的状态
                    smartHomeControl.printallstatus();
                    break;
                case 2:
                    System.out.println("请输入设备名称：");
                    //显示所有设备名字jds1
                    for (JD jd : jds1) {
                        System.out.println(jd.getName());
                    }
                    String name = sc.next();
                    smartHomeControl.Menu2(name);
                    break;
                case 3:
                    //调用添加设备
                    System.out.println("请输入设备名称：");
                    for (JD jd : jds1) {
                        System.out.println(jd.getName());
                    }
                    String name1 = sc.next();
                    //利用jds1添加新设备
                    //先判断里面有没有该设备，然后在看要不要添加设备
                    if (jds1.contains(name1)) {
                        System.out.println("该设备已存在");
                    } else {
                        JD jd = new JD(name1, false);
                        jds1.add(jd);
                        System.out.println("添加成功");
                    }
                    break;
                case 4:
                    //删除指定设备
                    System.out.println("请输入设备名称：");
                    for (JD jd : jds1) {
                        System.out.println(jd.getName());
                    }
                    String name2 = sc.next();
                    for (JD jd : jds1) {
                        if (jd.getName().equals(name2)) {
                            jds1.remove(jd);
                            break;
                        }
                    }
                    System.out.println("删除成功");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的选项");
            }
            //判断是否继续使用系统
            System.out.println("是否继续使用系统(y/n)");
            String choices = sc.next();
            if (choices.equals("n")) {
                System.exit(0);
            }
        }


        //为每个设备指定开合关的功能，定义一个接口实现开关
        //界面操作666666
        //}


    }
}