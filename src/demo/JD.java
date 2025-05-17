package demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get set 方法快捷
@Data
//有参无参快捷提供
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch{
    //第一步定义设备类JD家电
    //家电有品牌，价格，颜色，大小，是否能关机
    private String name;
    //get set 方法
    //定义初始状态表示开关
    private boolean Status;//默认false
    //重写接口
    @Override
    public void press() {
        //开关状态
        if(this.Status){
            //关机
            this.Status=false;
        }else{
            //开机
            this.Status=true;
        }
        //status!=status
    }

}
