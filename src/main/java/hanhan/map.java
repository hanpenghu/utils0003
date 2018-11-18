package hanhan;
import java.util.LinkedHashMap;
import java.util.Map;

public class map<T,K> {

   private Map<T,K> map1=new LinkedHashMap<T,K>();

    public static <T,K> map b(){

        return new map<T,K>();

    }


    public map<T,K> a(T t,K k){

        map1.put(t,k);
        return this;

    }

    public Map<T,K>  g() {

        return map1;

    }



//    public static void main(String[]args){
//        Map g = map.b().a("1", "a").a("2", "b").g();
//        System.out.println(g);
//
//    }






}
