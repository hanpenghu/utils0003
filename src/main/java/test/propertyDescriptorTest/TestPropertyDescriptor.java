package test.propertyDescriptorTest;

import com.alibaba.fastjson.JSON;

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
        //得到
        Method nameMethod = propertyDescriptor.getReadMethod();

        Object name = nameMethod.invoke(user);
        //hanhan
        System.out.println(name);

    }

    public static void main(String[]args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        new TestPropertyDescriptor().test();
    }

}
