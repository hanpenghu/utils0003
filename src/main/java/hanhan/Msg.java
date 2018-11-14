package hanhan;

/**
 *通用msg返回
 * status=1正常
 * status=0 异常
 * msg是封装的返回信息
 * */
public class Msg {
    private String msg="";
    private String status="1";
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
