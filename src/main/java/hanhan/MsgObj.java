package hanhan;
/**
 *统一返回用data封装数据
 * */
public class MsgObj extends Msg {
    private Object data=null;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
