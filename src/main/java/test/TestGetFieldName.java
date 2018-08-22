package test;

import hanhan.p;

import java.util.List;

/**
 * Created by Administrator on 2018/8/22.
 */
public class TestGetFieldName {

    private String str1="我曹";
    private int i=0;


    public static void main(String[]args) throws IllegalAccessException {
        List<p.FieldContent> fields = p.getField(new TestGetFieldName());
        for(p.FieldContent f:fields){
            p.p("-------------------------------------------------------");
            if(f.getFieldType().equals("java.lang.String")){
                f.setOMyGetVal("草拟吗啊");
            }
            p.p(f.getFieldName()+"-----"+f.getFieldType()+"----"+((TestGetFieldName)f.getoMy()).getStr1());
            p.p("-------------------------------------------------------");
        }

    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
