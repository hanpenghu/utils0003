package hanhan;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 *首先set  currentPage---前端穿过来
 *
 * 再set  perPageSize-----前端穿过来,不传默认写死10
 *
 * 再set   totalRecSize-------查数据库的总记录数
 *
 *
 *
 * 再set   zongYeShu------这一步是为了自动计算zongYeShu,
 * 但是这个set可以不用,因为我在上一步set调
 * 了这个set
 *
 *
 * */
public class Page {

    //当前页
    private Integer currentPage;//当前页的页面传过来
    //每页显示数
    private Integer perPageSize=10;

    //总记录数
    private Integer totalRecSize;

    //总页数
    private Integer totalPageSize;


    //装数据对象
    private List objList;




    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }






    public void setPerPageSize(Integer perPageSize) {
        if(empty(perPageSize)||perPageSize==0){
            perPageSize=10;
        }
        this.perPageSize = perPageSize;
    }

    public Integer getPerPageSize() {
        if(empty(perPageSize)||perPageSize==0){
            perPageSize=10;
        }
        return perPageSize;
    }





    public void setTotalPageSize(Integer totalPageSize) {
        this.totalPageSize = totalPageSize;
    }


    //得到总记录数
    public Integer getTotalRecSize() {

        return totalRecSize;

    }

    //设置总记录数,顺便把总页数计算了
    public void setTotalRecSize(Integer totalRecSize) {
        this.totalRecSize = totalRecSize;
        //顺便把总页数也设置一下
        this.setTotalPageSize();
    }



    public Integer getTotalPageSize() {
        this.setTotalPageSize();
        return this.totalPageSize;
    }

    public void setTotalPageSize() {
        this.perPageSize=this.getPerPageSize();
        if(this.totalRecSize%this.perPageSize==0){
            this.totalPageSize=this.totalRecSize/this.perPageSize;
        }else{
            this.totalPageSize=this.totalRecSize/this.perPageSize+1;
        }
    }




    public List getObjList() {
        return objList;
    }

    public void setObjList(List objList) {
        this.objList = objList;
    }







    /**
     *以下是空判断和非空判断以及所有非空判断和所有空的判断,如果是包含空的
     * 判断请用   !allNotEmpty
     * */

    private  boolean empty(Object ob){

        if(notEmpty(ob)){
            return false;
        }else{
            return true;
        }

    }




    private boolean notEmpty(Object ob){
        if(ob==null){
            return false;
        }else{
            if(ob instanceof String){
                if("".equals(ob)){return false;}else{return true;}
            }else if(ob instanceof Collection){
                if(((Collection) ob).size()>0){return true;}else{return false;}
            }else if(ob instanceof Map){
                if(((Map) ob).size()>0){return true;}else{return false;}
            }/*else if(ob instanceof JSONObject){
                if(((JSONObject) ob).isEmpty()){return false;}else{
                    if(((JSONObject) ob).size()==0){return false;}else{return true;}
                }
            }else if(ob instanceof JSONArray){
                if(((JSONArray) ob).isEmpty()){return false;}else{
                    if(((JSONArray) ob).size()==0){return false;}else{return true;}
                }
            }*/else{return true;}
        }
    }

    //所有的非空
    private boolean allNotEmpty(Object[ ]obs){
        for(Object ob:obs){
            if(!notEmpty(ob)){return false;}
        }
        return true;
    }

    //不是所有的是空的,有不为空的
    private boolean notAllEmpty(Object[ ]obs){
        int i=0;
        for(Object ob:obs){
            if(notEmpty(ob)){i++;}
        }
        if(i>0){
            return true;
        }else{
            return false;
        }

    }
    //测试notAllEmpty
//    public static void main(String[]args){
//           p.p(notAllEmpty(p.gp().setArl("1").setArl(null).getArl().toArray()));
//    }

    private boolean allEmpty(Object[ ]obs){
        for(int i=1;i<=obs.length;i++){
            /**
             *循环所有,如果有一个不是空的,就代表有不是空的,不是所有是空的,返回false
             * */
            if(notEmpty(obs[i])){
                return false;
            }
            /**
             *如果到了最后一个,也是空的,就返回true,代表所有的都空了
             * */
            if(empty(obs[i])&&i==obs.length){
                return true;
            }
        }
        return false;
    }




}
