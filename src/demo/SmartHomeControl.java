package demo;

public class SmartHomeControl {

    //接收家电类
    private JD[] jds;

    public SmartHomeControl()
    {}

    //构造方法
    public SmartHomeControl(JD[] jds)
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
    public void printallstatus()
    {
        for (JD jd : jds) {
            System.out.println(jd.getName()+"开关状态：" + (jd.isStatus()?"开着":"关着"));
        }
    }
}
