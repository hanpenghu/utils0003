package test.propertyDescriptorTest;

import com.alibaba.fastjson.JSON;
import hanhan.pp;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPropertyDescriptor {


    public void test() throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        User user=new User();
        user.setAge(30);user.setId("1231231231");user.setName("hanhan");
        //为了拿到类的属性值,可以将属性名字和该类放入属性描述器
        PropertyDescriptor propertyDescriptor=new PropertyDescriptor("name",user.getClass());
        //得到getName()这个方法的包装类
        Method nameMethod = propertyDescriptor.getReadMethod();
        //通过getName得到name的值
        Object name = nameMethod.invoke(user);
        //hanhan
        System.out.println(name);

    }


    public void test1() throws IntrospectionException, InvocationTargetException, IllegalAccessException {

    }

    public static void main(String[]args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        new TestPropertyDescriptor().test1();
    }

}
