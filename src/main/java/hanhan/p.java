package hanhan;
//import com.hanhan.utils0002.Test.Test2StringEntity;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.security.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



//import java.util.regex.Matcher;
public strictfp class p implements pI{
//    public static void main(String[]args){
//        p.p("----------------------测试毫秒级别时间---------------------------------");
//        p.p(p.dtoStr(p.getDate(),p.d16));
//        p.p("-------------------------------------------------------");
////        ----------------------测试毫秒级别时间---------------------------------
////                2018-04-08 15:47:20.240
////                -------------------------------------------------------
//    }


//    public static void main(String[]args){
//            p.p(sjOrg.size());
//
//    }



//    public static void main(String[]args){
//            p.p(urlSpecialSignReplace("dsf!a;%d\"d'fasdfasdf打发"));
//    }


    /**
     *替换掉文件名中的特殊字符和中文
     * */
    // "%","[","]",";","!","&","|","=","/","\\","@","\"","^","(",")","+","?","#"
    public static String urlSpecialSignReplace(String s){
        if(p.empty(s)){return s;}
        if(s.contains("%")){
            s=s.replace("%","_baiFenHao_");
        }if(s.contains("[")){
            s=s.replace("[","_zuoZhongKuoHao_");
        }if(s.contains("]")){
            s=s.replace("]","_youZhongKuoHao_");
        }if(s.contains(";")){
            s=s.replace(";","_fenHao_");
        } if(s.contains("!")){
            s=s.replace("!","_ganTanHao_");
        } if(s.contains("&")){
            s=s.replace("&","_quDiZhiFuHao_");
        } if(s.contains("|")){
            s=s.replace("|","_luoJiHuo_");
        } if(s.contains("=")){
            s=s.replace("=","_dengYuHao_");
        } if(s.contains("/")){
            s=s.replace("/","_xieGang_");
        } if(s.contains("\\")){
            s=s.replace("\\","_fanXieGang_");
        } if(s.contains("@")){
            s=s.replace("@","_aiTaFuHao_");
        } if(s.contains("^")){
            s=s.replace("^","_ciFangFuHao_");
        } if(s.contains("\"")){
            s=s.replace("\"","_shuangYinHao_");
        } if(s.contains("(")){
            s=s.replace("(","_zuoXiaoKuoHao_");
        } if(s.contains(")")){
            s=s.replace(")","_youXiaoKuoHao_");
        } if(s.contains("+")){
            s=s.replace("+","_jiaHao_");
        } if(s.contains("?")){
            s=s.replace("?","_wenHao_");
        } if(s.contains("#")){
            s=s.replace("#","_jingHao_");
        } if(s.contains("$")){
            s=s.replace("$","_meiYuanFuHao_");
        } if(s.contains("¥")){
            s=s.replace("¥","_RMBFuHao_");
        } if(s.contains("~")){
            s=s.replace("~","_wanZhiHao_");
        } if(s.contains("·")){
            s=s.replace("·","_zhongDianHao_");
        } if(s.contains("*")){
            s=s.replace("*","_xingHao_");
        } if(s.contains("-")){
            s=s.replace("-","_jianHao_");
        } if(s.contains(",")){
            s=s.replace(",","_douHao_");
        } if(s.contains(":")){
            s=s.replace(":","_maoHao_");
        } if(s.contains("<")){
            s=s.replace("<","_xiaoYuHao_");
        } if(s.contains(">")){
            s=s.replace(">","_daYuHao_");
        } /*if(s.contains(".")){
            s=s.replace(".","_juHao_");
        } */if(s.contains("{")){
            s=s.replace("{","_zuoDaKuoHao_");
        } if(s.contains("}")){
            s=s.replace("}","_youDaKuoHao_");
        } if(s.contains("'")){
            s=s.replace("'","_danYinHao_");
        }if(p.isContainCh(s)){
            s=p.filterCh2Fix(s);
        }
        return s;
    }

    /**
     *替换特殊字符但是不替换中文
     * */
    public static String urlSpecialSignReplaceOverCh(String s){
        if(p.empty(s)){return s;}
        if(s.contains("%")){
            s=s.replace("%","_baiFenHao_");
        }if(s.contains("[")){
            s=s.replace("[","_zuoZhongKuoHao_");
        }if(s.contains("]")){
            s=s.replace("]","_youZhongKuoHao_");
        }if(s.contains(";")){
            s=s.replace(";","_fenHao_");
        } if(s.contains("!")){
            s=s.replace("!","_ganTanHao_");
        } if(s.contains("&")){
            s=s.replace("&","_quDiZhiFuHao_");
        } if(s.contains("|")){
            s=s.replace("|","_luoJiHuo_");
        } if(s.contains("=")){
            s=s.replace("=","_dengYuHao_");
        } if(s.contains("/")){
            s=s.replace("/","_xieGang_");
        } if(s.contains("\\")){
            s=s.replace("\\","_fanXieGang_");
        } if(s.contains("@")){
            s=s.replace("@","_aiTaFuHao_");
        } if(s.contains("^")){
            s=s.replace("^","_ciFangFuHao_");
        } if(s.contains("\"")){
            s=s.replace("\"","_shuangYinHao_");
        } if(s.contains("(")){
            s=s.replace("(","_zuoXiaoKuoHao_");
        } if(s.contains(")")){
            s=s.replace(")","_youXiaoKuoHao_");
        } if(s.contains("+")){
            s=s.replace("+","_jiaHao_");
        } if(s.contains("?")){
            s=s.replace("?","_wenHao_");
        } if(s.contains("#")){
            s=s.replace("#","_jingHao_");
        } if(s.contains("$")){
            s=s.replace("$","_meiYuanFuHao_");
        } if(s.contains("¥")){
            s=s.replace("¥","_RMBFuHao_");
        } if(s.contains("~")){
            s=s.replace("~","_wanZhiHao_");
        } if(s.contains("·")){
            s=s.replace("·","_zhongDianHao_");
        } if(s.contains("*")){
            s=s.replace("*","_xingHao_");
        } if(s.contains("-")){
            s=s.replace("-","_jianHao_");
        } if(s.contains(",")){
            s=s.replace(",","_douHao_");
        } if(s.contains(":")){
            s=s.replace(":","_maoHao_");
        } if(s.contains("<")){
            s=s.replace("<","_xiaoYuHao_");
        } if(s.contains(">")){
            s=s.replace(">","_daYuHao_");
        } /*if(s.contains(".")){
            s=s.replace(".","_juHao_");
        } */if(s.contains("{")){
            s=s.replace("{","_zuoDaKuoHao_");
        } if(s.contains("}")){
            s=s.replace("}","_youDaKuoHao_");
        } if(s.contains("'")){
            s=s.replace("'","_danYinHao_");
        }/*if(p.isContainCh(s)){
            s=p.filterCh2Fix(s);
        }*/
        return s;
    }


   /* public static void main(String[]args){
        String s="21palksdfjlas大立科技发斯!蒂芬";
        p.p(urlSpecialSignReplaceOverCh(s));
    }*/



    /**
     * 判断字符串中是否包含中文
     * @param str
     * 待校验字符串
     * @return 是否为中文
     * @warn 不能校验是否为中文标点符号
     */
    public static boolean isContainCh(String str) {
        if(p.empty(str))return false;
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }


//    public static void main(String[]args){
//        p.p(filterCh2Fix("sadfasdlaskdf了加上端口冷风机"));
//    }


    public static String filterCh2Fix(String str) {
        if(p.empty(str))return str;
        // 用于返回结果
        String result = str;
        boolean flag = isContainCh(str);
        if (flag) {// 包含中文
            // 用于拼接过滤中文后的字符
            StringBuffer sb = new StringBuffer();
            // 用于校验是否为中文
            boolean flag2 = false;
            // 用于临时存储单字符
            char chinese = 0;
            // 5.去除掉文件名中的中文
            // 将字符串转换成char[]
            char[] charArray = str.toCharArray();
            // 过滤到中文及中文字符
            for (int i = 0; i < charArray.length; i++) {
                chinese = charArray[i];
                flag2 = isChinese(chinese);
                if (!flag2) {// 不是中日韩文字及标点符号
                    sb.append(chinese);
                }else{
                    sb.append("_CH_");
                }
            }
            result = sb.toString();
        }
        return result;
    }

    public static String filterCh2Want(String str,String sss) {
        if(p.empty(str))return str;
        // 用于返回结果
        String result = str;
        boolean flag = isContainCh(str);
        if (flag) {// 包含中文
            // 用于拼接过滤中文后的字符
            StringBuffer sb = new StringBuffer();
            // 用于校验是否为中文
            boolean flag2 = false;
            // 用于临时存储单字符
            char chinese = 0;
            // 5.去除掉文件名中的中文
            // 将字符串转换成char[]
            char[] charArray = str.toCharArray();
            // 过滤到中文及中文字符
            for (int i = 0; i < charArray.length; i++) {
                chinese = charArray[i];
                flag2 = isChinese(chinese);
                if (!flag2) {// 不是中日韩文字及标点符号
                    sb.append(chinese);
                }else{
                    sb.append(sss);
                }
            }
            result = sb.toString();
        }
        return result;
    }


    /**
     * 过滤掉中文
     * @param str 待过滤中文的字符串
     * @return 过滤掉中文后字符串
     */
    public static String filterChinese(String str) {
        if(p.empty(str))return str;
        // 用于返回结果
        String result = str;
        boolean flag = isContainCh(str);
        if (flag) {// 包含中文
            // 用于拼接过滤中文后的字符
            StringBuffer sb = new StringBuffer();
            // 用于校验是否为中文
            boolean flag2 = false;
            // 用于临时存储单字符
            char chinese = 0;
            // 5.去除掉文件名中的中文
            // 将字符串转换成char[]
            char[] charArray = str.toCharArray();
            // 过滤到中文及中文字符
            for (int i = 0; i < charArray.length; i++) {
                chinese = charArray[i];
                flag2 = isChinese(chinese);
                if (!flag2) {// 不是中日韩文字及标点符号
                    sb.append(chinese);
                }
            }
            result = sb.toString();
        }
        return result;
    }





    /**
     * 校验一个字符是否是汉字
     *
     * @param c
     *  被校验的字符
     * @return true代表是汉字
     */
    public static boolean isChineseChar(char c) {
        try {
            return String.valueOf(c).getBytes("UTF-8").length > 1;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 验证字符串内容是否包含下列非法字符<br>
     * `~!#%^&*=+\\|{};:'\",<>/?○●★☆☉♀♂※¤╬の〆
     *
     * @param content
     *  字符串内容
     * @return 't'代表不包含非法字符，otherwise代表包含非法字符。
     */
    public static char validateLegalString(String content) {
        String illegal = "`~!#%^&*=+\\|{};:'\",<>/?○●★☆☉♀♂※¤╬の〆";
        char isLegalChar = 't';
        L1: for (int i = 0; i < content.length(); i++) {
            for (int j = 0; j < illegal.length(); j++) {
                if (content.charAt(i) == illegal.charAt(j)) {
                    isLegalChar = content.charAt(i);
                    break L1;
                }
            }
        }
        return isLegalChar;
    }

    /**
     * 验证是否是汉字或者0-9、a-z、A-Z
     *
     * @param c
     *  被验证的char
     * @return true代表符合条件
     */
    public static boolean isRightChar(char c) {
        return isChinese(c) || isWord(c);
    }

    /**
     * 校验某个字符是否是a-z、A-Z、_、0-9
     *
     * @param c
     *  被校验的字符
     * @return true代表符合条件
     */
    public static boolean isWord(char c) {
        String regEx = "[\\w]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher("" + c);
        return m.matches();
    }

    /**
     * 判定输入的是否是汉字
     *
     * @param c
     *  被校验的字符
     * @return true代表是汉字
     */
    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }

    /**
     * 校验String是否全是中文
     *
     * @param name
     *  被校验的字符串
     * @return true代表全是汉字
     */
    public static boolean checkNameChese(String name) {
        boolean res = true;
        char[] cTemp = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (!isChinese(cTemp[i])) {
                res = false;
                break;
            }
        }
        return res;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *分页数量
     * 比如当要对一定数量的庞大id归类成几批再循环的时候,
     * 就会用到此工具
     * totalCount   总页数
     * perPageCount  每页显示数
     * totalPageCount 总页数
     * */

    public static int  batchData(int totalCount,int perPageCount){
        int totalPageCount;
        if(totalCount%perPageCount==0){
            totalPageCount=totalCount/perPageCount;
        }else{
            totalPageCount=totalCount/perPageCount+1;
        }
        return totalPageCount;
    }


//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(batchData(100,1000));
//        p.p("-------------------------------------------------------");
//    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 跟下面3个不一样,这个是n等分list,下面3中算法是把一个list拆成未知的若干份,每份的元素个数输入到函数
     * 将一个list均分成n个list,主要通过偏移量来实现的
     * @param source
     * @return
     */
    public static <T> List<List<T>> avgList(List<T> source,int n){
        List<List<T>> result=new ArrayList<List<T>>();
        int remaider=source.size()%n;  //(先计算出余数)
        int number=source.size()/n;  //然后是商
        int offset=0;//偏移量
        for(int i=0;i<n;i++){
            List<T> value=null;
            if(remaider>0){
                value=source.subList(i*number+offset, (i+1)*number+offset+1);
                remaider--;
                offset++;
            }else{
                value=source.subList(i*number+offset, (i+1)*number+offset);
            }
            if(null!=value&&value.size()>0){
                result.add(value);
            }
        }
        return result;
    }




//    public static void main(String[]args){
//        List<String> list = new linklistT<String>().a("1").a("2").a("3").a("4").a("5").a("6").a("7").g();
////        list = new linklistT<String>().a("1").a("2").a("3").a("4").a("5").a("6").g();
//        p.p("-------------------------------------------------------");
//        p.p(avgList0(list,2));
//        p.p("-------------------------------------------------------");
//    }


    /**把一个list拆成未知的若干份,每份的元素个数输入到函数
     * 高效率
     *用subList把原来的list分成至多有  mostCountInOneSubList个数元素的集合
     * mostCountInOneSubList是每个list里尽量并且至多能存的个数,
     * mostCountInOneSubList是分完后每个list里存的平均个数,
     * 当然,不能整除的时候最后一个放入的余数小于mostCountInOneSubList
     * */

    public static <T>List<List<T>> avgSubList(List<T>sourceList,int mostCountInOneSubList){
        if(null==sourceList){
            return null;
        }else{
            int totalListSize = sourceList.size();
            //能不能整除都按不能整除算, 整除的时候会多加一个空集合,判空一下不add就行了
            //余数
            int yuShu = totalListSize % mostCountInOneSubList;
            //商
            int shang=totalListSize / mostCountInOneSubList;
            //先把整除的放进去
            List<List<T>> lists = new LinkedList<List<T>>();
            //用于计算余数最后的subList的起始值k
            int k=0;
            for(int i=0;i<shang;i++){
                lists.add(sourceList.subList(i * mostCountInOneSubList, (i + 1) * mostCountInOneSubList));
                if(i==shang-1){//如果是最后一次,就得到k
                    k=(i + 1) * mostCountInOneSubList;
                }
            }
            if(yuShu!=0){
                lists.add(sourceList.subList(k, k + yuShu));
            }
            return lists;
        }
    }


//        public static void main(String[]args){
//            List<Integer>list=new ArrayList<Integer>();
////            list.add(1);
////            list.add(2);
////            list.add(3);
////            list.add(4);
////            list.add(5);
////            list.add(6);
////            list.add(7);
////            list.add(8);
////            list.add(9);
//            p.p(subList(null,3));
//
//    }


    /**把一个list拆成未知的若干份,每份的元素个数输入到函数
     *高效率
     * 把list拆分成若干个子list(每个有toIndex个元素)  功能跟上面一个一模一样
     * toIndex是  将来子list里面的个数
     * 网友  鬼鬼-java1级冲锋衣
     * 静静的群里  写的
     * */
    public static List subList(List list,int toIndex){
        if(null==list){return null;}
        int listSize = list.size();
        List subList = new LinkedList();
        for (int i = 0; i < list.size(); i += toIndex) {
            if (i + toIndex > listSize) {
                toIndex = listSize - i;
            }
            List newList = list.subList(i, i + toIndex);
            subList.add(newList);
        }
        return subList;
    }





    /**把一个list拆成未知的若干份,每份的元素个数输入到函数
     * 低效率
     *sourceList是要拆解的list
     * oneListHowMany是拆解后一个list放入多少个元素的意思
     * oneListHowMany  就是 拆分后每个list  分几个元素的意思
     * sourceList  要被拆解的list
     * */
    public static <T> List<List<T>> avglist(List<T> sourceList,int oneListHowMany){
        if(oneListHowMany<=0)oneListHowMany=1;
        //避免影响原来的sourceList
        List<List<T>>all=new LinkedList<List<T>>();
        if(p.notEmpty(sourceList)){
            List<T> sourceList1=new LinkedList<T>(sourceList);
            if(sourceList1.size()>oneListHowMany){
                int size = sourceList1.size();
                if(size%oneListHowMany==0){
                    p.canAvg(all,size,oneListHowMany,sourceList1);
                }else{
                   int w= size%oneListHowMany;
                   List<T>list0=new LinkedList<T>();
                    for(int i=0;i<w;i++){list0.add(sourceList1.get(i));}
                    all.add(list0);
                    for(int h=0;h<w;h++){sourceList1.remove(0);}
                    //重新得到size
                    size = sourceList1.size();
                    p.canAvg(all,size,oneListHowMany,sourceList1);
                }
            }else{
                all.add(sourceList1);
            }
        }
        return all;
    }

    private static <T> void canAvg(List<List<T>> all, int size, int oneListHowMany, List<T> sourceList) {
        for(int i=0;i<size/oneListHowMany;i++){
            List<T>list=new LinkedList<T>();
            for(int j=0;j<oneListHowMany;j++){
                list.add(sourceList.get(j));
            }
            all.add(list);
            for(int h=0;h<oneListHowMany;h++){
                sourceList.remove(0);
            }
        }
    }






//    @SuppressWarnings("unchecked")
//    public static void main(String[]args){
//       List<String> list = new linklistT<String>().a("1").a("2").a("3").a("4").a("5").a("6").a("7").g();
////            p.p("-------------------------------------------------------");
////            p.p(list.subList(0,6));
////            p.p("-------------------------------------------------------");
//            List<List<String>> avglist1 = avglist(list,2);
//            p.p("-------------------------------------------------------");
//            p.p(avglist1);
//            p.p("-------------------------------------------------------");
//        }









//    @SuppressWarnings("unchecked")
//    public static void main(String[]args){
//       List<String> list=new linklistT<String>().a("1").a("2").a("3").a("4").a("5").g();
//        for(int i=0;i<3;i++){
//            list.remove(0);
//        }
//        p.p("-------------------------------------------------------");
//        p.p(list);
//        p.p("-------------------------------------------------------");
//        //结果 ：    [4, 5]
//    }



//    public static void main(String[]args){
//        List<String> g = new linklistT<String>().a("1")
//                .a("2")
//                .a("3")
//                .a("4")
//                .g();
//        List<List<String>> list = p.avgList(g, 3);
//        p.p(list.size());
//        for(List<String> list1:list){
//            p.p("-------------------------------------------------------");
//            for(String s:list1){
//                p.p("---------《"+s+"》---------");
//            }
//            p.p("-------------------------------------------------------");
//        }
//
//    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *
     *
     *2个一起并且,注意先后顺序,因为有的必须a成立后b才能再判断
     * */
    public static  boolean bq(boolean a,boolean b){
        if(a){
            if(b){
                return true;
            }
        }
        return false;
    }


    /**
     *多个一起并且
     * 注意添加到list的顺序,比如是    order!=null  && order.getId==12111
     *必须是先添加 order!=null这个boolean先判空才行
     *
     * dgbq==多个并且
     * */

    public static boolean dgbq(List<Boolean> bList){
        if(empty(bList)){
            return false;
        }
        for(boolean b:bList){
            if(b){
                //此时继续
            }else{
                //有一个是 false就返回false
                return false;
            }
        }
        //如果能走到这里,就返回true
        return true;
    }






//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *打印当前对象,并打印异常堆栈
     * */
    public static void p1(Object o){
        try {
            print(o);
        } catch (Exception e) {e.printStackTrace();}finally{}

    }


    /**
     *打印当前对象,但是并不打印异常堆栈
     * */
    public static void p2(Object o){
        try {
            print(o);
        } catch (Exception e) {}finally{}

    }

    /**
     *抽取的公共方法,不对外
     * */
    private static void print(Object o){
        if(o instanceof List){
            if(((List)o).size()<50){
                p.p("-----------------chang du:  "+((List)o).size()+"--------------------------------------");
                p.p(o);
                p.p("-------------------------------------------------------");
            }
        }else{
            p.p("------------------------"+o.getClass().getName()+"-------------------------------");
            p.p(o);
            p.p("-------------------------------------------------------");
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////



    public static String trim(String str2Trim){
        if(null==str2Trim){
            return "is fuck nullPoint";
        }else{
            return str2Trim.trim();
        }
    }


    /**
     *剪切2头,空格,避免空指针
     * 截取两头空格避免空指针
     * */
    public static String trimNoNull(String str2Trim){
        if(null==str2Trim){
            return "";
        }else{
            return str2Trim.trim();
        }
    }

    public static String trimHaveNull(String str2Trim){
        if(null==str2Trim){
            return null;
        }else{
            return str2Trim.trim();
        }
    }

    /**
     *截取字符串
     * 注意索引start是从0开始,
     * 截取是
     * 包括startHave
     * 不包括endNotHave
     *
     * 如果被截取对象是空的,就返回空
     *
     *
     *
     * 注意当endNotHave已经超过最大能索引到的东西的时候
     * ,直接截取 startHave后面所有的
     * */
    public static String strCut(String originalStr,int startHave,int endNotHave){
        int length = originalStr.length();
        if(null==originalStr||"".equals(originalStr)){
            return "";
        }else if(startHave>length){
            return"";
        }else if(startHave==length){
            return "";
        }else if(startHave<length&&endNotHave>length){
            return originalStr.substring(startHave);
        }else{
            return originalStr.substring(startHave,endNotHave);
        }
    }

    /**注意这个方法使用的前提是:  startHave只出现过一次
     * [------这种
     * 从头带头到尾
     *截取字符串originalStr从startHave(包括)开始
     * 到最后结束
     *
     * */
    public static String strCut(String originalStr,String startHave){
        if(null==originalStr||"".equals(originalStr)){
            return "";
        }else if(!originalStr.contains(startHave)){
            return  "";
        }else{
            return originalStr.substring(originalStr.indexOf(startHave));
        }
    }
    //    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strCut("eer",2,4));
//        p.p("eer".indexOf(3));//-1
//        p.p("-------------------------------------------------------");
//    }
    public static String strCutNoHead(String originalStr,String startNotHave){
        String waiJia="{~}";
       return  strCutNoHeadNoTail(originalStr+waiJia,startNotHave,waiJia);
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strCutNoHead("12123123123dsafasdfa","ds"));//afasdfa
//        p.p("-------------------------------------------------------");
//        p.p("-------------------------------------------------------");
//        p.p(strCutNoHead("12123123123dsafasdfa",""));//12123123123dsafasdfa
//        p.p("-------------------------------------------------------");
//    }
public static String strCutEndNothave(String orignalStr,String endNotHave){
    return  orignalStr.substring(0,orignalStr.indexOf(endNotHave));
}




    public static String strCutEndhave(String orignalStr,String endHave){
        int len=endHave.length();
        return  orignalStr.substring(0,orignalStr.indexOf(endHave)+len);
    }
    /**
     *截取originalStr中从startHave(包括)到endNotHave(不包括)的字符串
     *
     * 注意这个方法使用的前提是:  startHave和endNotHave只出现过一次
     * dsfasdfa使用该函数
     * strCut("dsfasdfa","sf","df")
     * 后变成
     * sfas
     * 可以发现,截取的是从sf开始并包括sf
     * 从df结束,并不包括df
     *
     * 这个是跟官方截取一直的[)方式
     *
     * 有头无尾
     * */
    public static String strCut(String originalStr,String startHave,String endNotHave){
        if(null==originalStr||"".equals(originalStr)){
            return "";
        }else if(!originalStr.contains(startHave)||!originalStr.contains(endNotHave)){
            //此时没法截取,因为不包含要 截取的头或者尾部
            return "";
        }else{
            return originalStr.substring(originalStr.indexOf(startHave),originalStr.indexOf(endNotHave));
        }
    }


    /**
     * 注意这个方法使用的前提是:  startHave和endNotHave只出现过一次
     * (]
     *strCutNoHead("sdabkjwp","da","jw")
     * 得到的是
     * bkjw
     * 无头有尾
     * */

    public static String strCutNoHead(String originalStr,String startNotHave,String endHave){
        if(null==originalStr||"".equals(originalStr)){
            return "";
        }else if(!originalStr.contains(startNotHave)||!originalStr.contains(endHave)){
            //此时没法截取,因为不包含要 截取的头或者尾部
            return "";
        }else{
            return originalStr.substring(
                            p.strIndxTail(originalStr,startNotHave)+1
                            ,p.strIndxTail(originalStr,endHave)+1
                    );
        }
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strCutNoHead("sdabkjwp","da","jw"));
//        p.p("-------------------------------------------------------");
//    }


//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strCutEndNothave("12312312ab123","ab"));//12312312
//        p.p("-------------------------------------------------------");
//        p.p("-------------------------------------------------------");
//        p.p(strCutEndhave("12312312ab123","ab"));//12312312ab
//        p.p("-------------------------------------------------------");
//    }

/**
 *注意这个方法使用的前提是:  startHave和endNotHave只出现过一次
 * 无头无尾
 *()方式截取
 * strCutNoHeadTail("sdabkj","da","j")
 * 得到的是bk,就是截取da和j之间的东西
 * */

    public static String strCutNoHeadNoTail(String originalStr,String startNotHave,String endNotHave){

            if(null==originalStr||"".equals(originalStr)){
                return "";
            }else if(!originalStr.contains(startNotHave)||!originalStr.contains(endNotHave)){
                //此时没法截取,因为不包含要 截取的头或者尾部
                return "";
            } else{
                return originalStr.substring(p.strIndxTail(originalStr,startNotHave)+1,originalStr.indexOf(endNotHave));
            }

    }

    /**
     * 注意这个方法使用的前提是:  startHave和endNotHave只出现过一次
     * 有头有尾
     *[]这种截取方式
     * strCutHaveHeadAndTail("sdabkjwp","da","jw")
     * 得到的结果是
     * dabkjw
     * */
    public static String strCutHaveHeadAndTail(String originalStr,String startHave,String endHave){

        if(null==originalStr||"".equals(originalStr)){
            return "";
        }else if(!originalStr.contains(startHave)||!originalStr.contains(endHave)){
            //此时没法截取,因为不包含要 截取的头或者尾部
            return "";
        } else{
            return originalStr.substring(
                    p.strIndxHead(originalStr,startHave)
                    ,p.strIndxTail(originalStr,endHave)+1
            );
        }

    }




    /**
     * 注意这个方法使用的前提是:  startHave只出现过一次
     * 从头带头到底
     * [------最后这种
     *从  索引startHave开始(包括startHave索引处的字符)
     * 到字符串结束为止
     * */
    public static String strCut(String originalStr,int startHave){
        if(null==originalStr||"".equals(originalStr)){
            return "";
        }else if(originalStr.length()-1<startHave){
            return "";
        }else{
            return originalStr.substring(startHave);
        }
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strCut("sdfasdf",7));
//        p.p("-------------------------------------------------------");
//    }



    /**
     *
     * 索引要索引字符串的头
     *字符串中字符的索引,该索引从0开始的
     * strIndxHead("dsfasdfa","sf")得到的结果是1,
     * 因为d是第0位,sf就是第1位,这里是将sf当成整体,
     * 其实是索引的sf中的s的索引作为sf整体的索引了
     *
     * 其实官方的不包含要索引的字符串的时候,返回的也是-1
     *
     *
     *
     * strIndxHead("1211221","1")=1证明  索引的是第一次出现的位置,毕竟1有那么多,他只索引了第一个
     * */

    public static int strIndxHead(String strOrignal,String strIndx){
        if(null==strOrignal){
            return -1;
        }else if(!strOrignal.contains(strIndx)){
            return -1;
        }else{
            return strOrignal.indexOf(strIndx);
        }

    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strIndxHead("1211221","1"));//0 ,证明索引的是第一次出现的位置
//        p.p("-------------------------------------------------------");
//    }


    /**
     * 索引要索引字符串的尾部
     * tail是尾巴的意思
     *得到strIndx索引的最后一位索引
     * strIndxTail("dsfa_sdfa","sfa")=3
     * */
    public static int strIndxTail(String strOrignal,String strIndx){
        if(null==strOrignal){
            return -1;
        }else if(!strOrignal.contains(strIndx)){
            return -1;
        }else{
            return strOrignal.indexOf(strIndx)+strIndx.length()-1;
        }

    }
//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strIndxTail("dsfa_sdfa","sfa"));
//        p.p("-------------------------------------------------------");
//    }
    /**
     * 索引整个字符串的下一个字符串的索引
     *
     *strNextIndx("dsfa_sdfa","fa")得到的结果是4
     * 因为这个我设计的是得到"_"的索引,
     * 通过第一个"fa"所在位置推断"_"的索引是4
     * */
    public static int strNextIndx(String strOrignal,String strIndx){
        if(null==strOrignal){
            return -1;
        }else if(!strOrignal.contains(strIndx)){
            return -1;
        }else{
            return strOrignal.indexOf(strIndx)+strIndx.length();
        }

    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p("1212121212".indexOf("1"));//0,说明,索引的是第一个次出现的位置
//        p.p("-------------------------------------------------------");
//    }


    /**
     *索引整个字符串的下一个字符串
     *
     * strNextStr("asfk_ja","fk")得到的是"_"
     * */

    public static String strNextStr(String strOrignal,String strIndx){
        int i = strOrignal.indexOf(strIndx) + strIndx.length();
        if(null==strOrignal){
            return "";
        }else if(!strOrignal.contains(strIndx)){
            return "";
        }else{
            return strOrignal.substring(i,i+1);
        }

    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(strNextStr("asfk_ja","fk"));
//        p.p("-------------------------------------------------------");
//    }



    /**
     * 前提是:  每个字符串后面带"_数字",就算里面有多个"_"也无所谓,因为我已经取的最后一个
     * 组合分隔符中的最大值
     * 组合或单一分隔符的时候
     * 找出
     *        <~>abc_1<~>abc_2<~>abc_3
     * 中  _  后面最大的那个数字
     *
     *以后我用作保存文件取名字都这样,在文件名字后面加  _xx,然后组合放入数据库某个字段
     *
     * getMaxSufixLeft("<~>abc_1<~>abc_2<~>abc_3","<~>")=3
     *
     * left指的是分隔符位于最左边
     * */
    public static Integer getMaxSufixLeft(String str2Split,String splitor){
        try {
            List<String> strings = p.splitStrSeparator1Left(str2Split, splitor);

            List<Integer>numberStrs=new LinkedList<>();
            for(String s:strings) {
                String s101 = s.substring(s.lastIndexOf("_")+1);
                numberStrs.add(Integer.valueOf(s101));
            }
            Collections.sort(numberStrs);
            return numberStrs.get(numberStrs.size()-1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

//    public static void main(String[]args){
//        p.p("-------------------结果是:3------------------------------------");
//        p.p(getMaxSufixLeft("<~>abc_1<~>abc_2<~>abc_3","<~>"));
//        p.p("-------------------------------------------------------");
//    }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *去掉数字   后面无用的0
     * */

    public static String del0(String s){
        if(null==s||"".equals(s)){
            return null;
        }else{
            //注意有的数字有逗号分隔符,replace就算再 没有","的情况下也不会出错
            s=s.replace(",","");
            try {
                new BigDecimal(s);
            } catch (Exception e) {
                //不是数字
               return null;
            }
            if(s.contains(".")){
                while(s.endsWith("0")){
                    s=s.substring(0,s.lastIndexOf("0"));
                }
                if(s.endsWith(".")){
                    s=s.substring(0,s.lastIndexOf("."));
                }
                return s;
            }else{
                return s;
            }
        }
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(p.del0("11"));
//        p.p("-------------------------------------------------------");
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    /**
     下面集合有63个

     List<String>sjOrg=Arrays.asList
     ("+","-","@","¥","$","~","(",")","!",",",".",
     "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
     ,"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");

     里面随机取出一个
     * */

    public static String sjOrg(){
       return sjOrg.get(p.randomDigit(0,62));
    }




    /*【群主】变色龙 2018-04-08 15:52:41
    一般 秒级 + 3位随机数*/

//    public static void main(String[]args){
//        for(int i=0;i<1000;i++){
//            p.p(sjOrg());
//        }
//
//    }


    /**
     *生成2数字之间的随机数,其实是[min,max],其实就是这个区间包括min,也包括max
     * */
    public static int randomDigit(int min,int max){
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
    }
    /**
     *生成0到100之间的随机数
     * */
    public static int random0_100(){
        Random random = new Random();
        int s = random.nextInt(100);
        return s;
    }

    /**
     *生成0到999之间的随机数
     * */
    public static int random0_999(){
        Random random = new Random();
        int s = random.nextInt(999);
        return s;
    }


    /**
     *大写英文字母随机
     * */

    public static String strARandom(){
        String str = "";
        for (int i = 0;i<1;i++){
            synchronized ("2222341212318979797") {
                str = str+ (char)(Math.random()*26+'A');
            }
        }
        return str;
    }

    /**
     *小写英文字母随机
     * */

    public static String straRandom(){
        String str = "";
        for (int i = 0;i<1;i++){
            synchronized ("111111232213123111111") {
                str = str+ (char)(Math.random()*26+'a');
            }
        }
        return str;
    }

    /**
     * 根据时间奇偶数决定26字母
     *大小写随机
     * */

    public static String aOrARandom(){
        long timeStamp = p.getTimeStamp();
        if(timeStamp%2==0){
            return straRandom();
        }
        return strARandom();
    }

//    public static void main(String[]args){
//        for(int i=0;i<10;i++){
//            p.p(s());
//        }
//
//    }

    /**
     * 带毫秒
     *带字母带时间的随机,非常随机 21位
     * 18b08I17z17L20v40J040
     * */
    public static String  ss(){
        String s="yy$MM+dd@HH!mm;ss#sss";
         return new SimpleDateFormat(s).format(new Date())
                    .replace("$", aOrARandom())
                    .replace("+", aOrARandom())
                    .replace("@", aOrARandom())
                    .replace("!", aOrARandom())
                    .replace(";", aOrARandom())
                    .replace("#", aOrARandom());
    }

    /**
     * 21位
     *毫秒级,比上面的更随机     18I08E18R00D27)57Y057

     List<String>sjOrg=Arrays.asList
     ("+","-","@","¥","$","~","(",")","!",",",".",
     "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
     ,"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");

     *
     * */
    public static String  ssOrg(){
        String s="yy$MM+dd@HH!mm;ss#sss";
        return new SimpleDateFormat(s).format(new Date())
                .replace("$", sjOrg())
                .replace("+", sjOrg())
                .replace("@", sjOrg())
                .replace("!", sjOrg())
                .replace(";", sjOrg())
                .replace("#", sjOrg());
    }

//    public static void main(String[]args){
//        List<String>list=new ArrayList<>();
//        for(int i=0;i<10000;i++){
//            list.add(sOrg());
//        }
//
//        p.p(list.size());
//        p.p(p.distinctList(list).size());
//
//    }



//    public static void main(String[]args){
//        p.p(ssOrg());
//    }


    /**
     * 去掉毫秒  17位      18J08N18(00@26P57
     List<String>sjOrg=Arrays.asList
     ("+","-","@","¥","$","~","(",")","!",",",".",
     "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
     ,"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
     下面更随机
     * */
    public static String  sOrg(){
        String s="yy$MM+dd@HH!mm;ss";
        return new SimpleDateFormat(s).format(new Date())
                .replace("$",sjOrg())
                .replace("+",sjOrg())
                .replace("@",sjOrg())
                .replace("!",sjOrg())
                .replace(";",sjOrg());
    }


    /**
     * 去掉毫秒
     *带字母带时间的随机,非常随机 17位
     * 18Q08c17g17x36w14
     * */
    public static String  s(){
        String s="yy$MM+dd@HH!mm;ss";
        return new SimpleDateFormat(s).format(new Date())
                .replace("$",aOrARandom())
                .replace("+",aOrARandom())
                .replace("@",aOrARandom())
                .replace("!",aOrARandom())
                .replace(";",aOrARandom());
    }

//    public static void main(String[]args){
//        for(int i=0;i<10;i++){
//            p.p(s());
//        }
//
//    }







    /**
     *生成0到999之间的随机数,顺序循环,spring容器启动后顺序循环
     * */
    private static int orderRandom=0;
    public synchronized static  int orderRandom999(){
        int i=0;
        i=orderRandom;
        orderRandom=orderRandom+1;
        if(orderRandom>=1000)orderRandom=0;
        return i;
    }

//    public static String  r(){
//
//    }
//
    /**
     *随机冒号变分号23位,冒号做文件名字在路径里不行,分号也不行
     *2018-08-17@16-46-06.006
     * */
    public static String r(){
        return new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss.sss").format(new Date());
    }

//    public static void main(String[]args){
//            System.out.println(r());
//    }

    /**
     *
     * 2018-08-17@16-44-34.034@826
     * */
    public static String ra3(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss").format(new Date()).replace(":","-").replace(" ","@")+"@"+String.valueOf(p.random0_999());
    }

    /**
     *最后3位是容器循环随机
     * 2018-08-17@16-38-31.031@0
     * */
    public static String ra3o(){
        return new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss.sss").format(new Date())+"@"+String.valueOf(p.orderRandom999());
    }

    /**
     *无20头
     *18-08-17@16-40-07.007
     * */
    public static String raNoH(){
        return new SimpleDateFormat("yy-MM-dd@HH-mm-ss.sss").format(new Date());
    }

    /**
     *无20头加三位随机
     * 18-08-17@16-41-35.035@403
     * */
    public static String raNoH3(){
        return new SimpleDateFormat("yy-MM-dd@HH-mm-ss.sss").format(new Date())+"@"+String.valueOf(p.random0_999());
    }

    /**
     *最后三位是容器循环随机(在容器 中运行的时候才会随机)
     * 18-08-17@16-43-09.009@0
     * */
    public static String rfNoH3o(){
        return new SimpleDateFormat("yy-MM-dd@HH-mm-ss.sss").format(new Date())+"@"+String.valueOf(p.orderRandom999());
    }

//    public static void main(String[]args){
//        p.p(rfNoH3o());
//    }
//    public static void main(String[]args){
//        System.out.println(rfNoH3o());
//    }


//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(random0_999AndTime());
//        p.p("-------------------------------------------------------");
//    }

//    public static void main(String[]args) throws InterruptedException {
//        while(true){
//            String s = timeStampRandom0999();
//            p.p("---------------------------"+s.length()+"----------------------------");
//            p.p(s);
//            p.p("-------------------------------------------------------");
////            Thread.sleep(2000);
//        }
//
//    }



    /**
     *时间戳+0到999之间随机码做id
     * 毫秒级时间戳13位+1到3位随机   共14到16位
     * 152318040010237
     * 这种
     * */
    public static String timeStampRandom0999(){
        return String.valueOf(p.getTimeStamp())+String.valueOf(p.random0_999());
    }

    /**
     * 毫秒级时间戳13位
     *时间戳+"-"+0到999之间随机码做id
     * 1523180466849-593
     * 这种
     * 13位时间戳+"-"+1到3位随机数共15到17位
     * */
    public static String timeStamp_Random0999(){
        return String.valueOf(p.getTimeStamp())+"-"+String.valueOf(p.random0_999());
    }

    /**
     *毫秒级时间+0到999之间的随机数
     * 180531223635864906
     * yyMMddHHmmssSSS+  1到3位随机码
     * 共16到18位
     * */

    public static String  suiji01(){
        Random random = new Random();
        int s = random.nextInt(999);
        String s101 = p.dtoStr(p.getDate(),"yyMMddHHmmssSSS")+p.strValeOf(s);
        return s101;
    }

    /**
     *秒级时间+0到999之间的随机数
     * 180531223913822
     * yyMMddHHmmss+  1到3位随机码
     * 共13到15位
     * */
    public static String  suiji02(){
        Random random = new Random();
        int s = random.nextInt(999);
        String s101 = p.dtoStr(p.getDate(),"yyMMddHHmmss")+p.strValeOf(s);
        return s101;
    }



    /**
     *
     *毫秒级时间+0到999之间的随机数
     * 2018-04-08 17:20:18.507 84
     * */
    public static String  timeAndRandom0_999(){
        Random random = new Random();
        int s = random.nextInt(999);
        String s101 = p.dtoStr(p.getDate(), d16)+" "+p.strValeOf(s);
        return s101;
    }
//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(timeAndRandom0_999NoHead());
//        p.p("-------------------------------------------------------");
//    }
    /**
     *
     * 这种
     *18-04-08 17:22:57.666 634
     * */
    public static String  timeAndRandom0_999NoHead(){

        return p.timeAndRandom0_999().substring(2);
    }

    /**
     * 推荐1给傻逼项目用,
     * 这种:  毫秒级时间+"-"+ 0到999的随机数
     *23位到 25位
     *
     *18-08-17 13:31:53.368 654
     *
     * */
    public static String  timeAndRandom0_999NoHead_(){

        return p.timeAndRandom0_999NoHead();
    }
//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(timeAndRandom0_999NoHead());
//        p.p("-------------------------------------------------------");
//    }

    /**
     * 推荐3给傻逼项目
     *下面这种23到25位是上面的变形版
     * ,主要是用于文件名的时候冒号不行的改进
     * 18-08-17 13_30_54_997 284
     * 这种
     * */
    public static String  timeAndRandom0_999NoHead_1(){

        return p.timeAndRandom0_999NoHead_().replace(":","_").replace(".","_");
    }





    /**
     * 用于角色权限id的角色id
     * 推荐3给傻逼项目
     *下面这种30到32位是上面的变形版
     * ,主要是用于文件名的时候冒号不行的改进
     * roleId-18-04-15-12_56_37.487-392
     * 这种
     * */
    public static String  timeRoleId(){

        return "roleId"+"-"+p.timeAndRandom0_999NoHead_().replace(":","_");
    }


    /**
     * 用于角色权限id的用户id
     * 推荐3给傻逼项目
     *下面这种29到31位是上面的变形版
     * ,主要是用于文件名的时候冒号不行的改进
     * usrId-18-04-15-12_58_27.402-396
     * 这种
     * */
    public static String  timeUsrId(){

        return "usrId"+"-"+p.timeAndRandom0_999NoHead_().replace(":","_");
    }

    /**
     * 用于角色权限id的权限id
     * 推荐3给傻逼项目
     *下面这种28到30位是上面的变形版
     * ,主要是用于文件名的时候冒号不行的改进
     * qxId-18-04-15-13_00_15.477-365
     * 这种
     * */
    public static String  timeQxId(){

        return "qxId"+"-"+p.timeAndRandom0_999NoHead_().replace(":","_");
    }


//    public static void main(String[]args){
//
//        p.p("-------------------------------------------------------");
//        p.p(timeQxId());
//        p.p("-------------------------------------------------------");
//    }

    /**
     * 推荐
     *保险的id
     * 时间+八位随机数
     * 2018-04-09 11:37:35.982 11074079
     * 固定带2个空格是32位
     * 其中时间23位
     * */

    public static String timeAnd8Wei(){
        byte[] lock = new byte[0];
        // 位数，默认是8位
        long w = 100000000;
        long r = 0;
        synchronized (lock) {
            r = (long) ((Math.random() + 1) * w);
        }
        return p.dtoStr(p.getDate(),p.d16) +" "+ String.valueOf(r).substring(1);
    }
//    public static void main(String[]args){
//
//
//        p.p("-------------------------------------------------------");
//        p.p(timeAnd8Wei());
//        p.p("-------------------------------------------------------");
//
//
//    }

    /**
     *0到999之间的随机数 跟上生成的毫秒级时间
     * 24 2018-04-08 17:19:40.397
     * */
    public static String  random0_999AndTime(){
        Random random = new Random();
        int s = random.nextInt(999);
        String s101 = p.strValeOf(s)+" "+ p.dtoStr(p.getDate(), d16);
        return s101;
    }
    /**
     *毫秒级时间去掉符号+" "+随机码
     * Symbol是随机码的意思
     * 20180408165527961 737
     * 上面这种
     * */
    public static String  timeAndRandom0_999NoSymbol(){
        Random random = new Random();
        int s = random.nextInt(999);
        String s101 = p.dtoStr(p.getDate(), d16).replace(" ","")+" "+p.strValeOf(s);
        s101=s101.replace("-","");
        s101=s101.replace(":","");
        s101=s101.replace(".","");
        return s101;
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(timeAndRandom0_999NoSymbol());
//        p.p("-------------------------------------------------------");
//    }


    /**
     * 种17位到19位随机数
     *   180408170201088 878
     *   上面这种 15位+一位空格+  1到3位随机数
     * */
    public static String  timeAndRandom0_999NoSymbolRemoveHead(){
        return p.timeAndRandom0_999NoSymbol().substring(2);
    }
    /**
     * 推荐2给一般项目用
     * 这种17位到19位随机数
     *   180408171524866-547
     *   上面这种 15位+ - +  1到3位随机数
     * */
    public static String  timeAndRandom0_999NoSymbolRemoveHead_(){
        return p.timeAndRandom0_999NoSymbolRemoveHead().replace(" ","-");
    }


    /**
     *来自guns的随机,随机取length的长度的字符串
     * 这种随机是用于hash加盐的,不能用于id随机,因为这个可能会重复
     * */
    public static String getRandomString(int length) {
        //base长度36
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < length; ++i) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }

        return sb.toString();
    }


//    public static void main(String[]args){
//        p.p(p.getRandomString(5));
//    }


    /**
     *上面那种简化成下面这种
     * 180621202154373-767
     * 17到19位
     * */
    public static String sj(){
        return timeAndRandom0_999NoSymbolRemoveHead_();
    }

//    public static void main(String[]args){
//        p.p(sj());
//    }

    /**
     *毫秒级时间去掉符号+" "+随机码
     * Symbol是随机码的意思
     * 20180408165748545179
     * 上面这种
     * */
    public static String  timeAndRandom0_999NoSymbolNoSpace(){
        Random random = new Random();
        int s = random.nextInt(999);
        String s101 = p.dtoStr(p.getDate(), d16).replace(" ","")+p.strValeOf(s);
        s101=s101.replace("-","");
        s101=s101.replace(":","");
        s101=s101.replace(".","");
        return s101;
    }

    /**
     * 16到18位
     *180408170814386251
     * 这种,时间去掉20这个头后+0到999之间的随机数
     * */
    public static String  timeAndRandom0_999NoSymbolNoSpaceRemoveHead(){

        return p.timeAndRandom0_999NoSymbolNoSpace().substring(2);
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(timeAndRandom0_999NoSymbolRemoveHead_());
//        p.p("-------------------------------------------------------");
//    }






//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(timeStamp_Random0999());
//        p.p("-------------------------------------------------------");
//    }

    /**
     *对于打包后的springboot项目
     * 我们怎么读取资源路径？
     * 其实很简单
     * 所有  资源文件放到跟jar包同级目录  然后用
     * String pa = p.readAllTxt("资源文件.txt")
     * 在项目中就能读取
     *
     * */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    /**
     * 使用默认分隔符{~}的  后置分隔符
     * 分隔符在后面开始
     *按顺序拆分带组合分隔符的字符串
     * 适用于
     *
     * 阿拉山口打飞{~}机爱丽丝打飞{~}机埃里克的{~}
     *
     * 这种
     * 最后还带分隔符的组合
     * 截取后是
     * [阿拉山口打飞, 机爱丽丝打飞, 机埃里克的]
     * */
    public static List<String>chaiFenZuHeFenGeFu(String s){
        List<String>list=new LinkedList<>();
        while(s.contains(zuHeFenGeFu)){
            //就是按照{~}拆分
            String ss = s.substring(0, s.indexOf(zuHeFenGeFu));
            list.add(ss);
            s=s.substring(s.indexOf(zuHeFenGeFu)+3);
        }

        return list;
    }


    /**
     * 中间分隔符,默认{~}分隔符
     ** 适用于
     *
     * 阿拉山口打飞{~}机爱丽丝打飞{~}机埃里克的
     *
     * 这种最后没有分隔符的组合
     * 截取后是
     * [阿拉山口打飞, 机爱丽丝打飞, 机埃里克的]
     * */
    public static List<String>chaiFenZuHeFenGeFu0(String s){
        return chaiFenZuHeFenGeFu(s+zuHeFenGeFu);

    }


    /**
     * 后置分隔符 适用于组合或者单一分隔符
     * 分隔符在后面开始
     *自定义组合符号的拆分
     * 用于字符串最后有分隔符的
     * 阿拉山口打飞{~}机爱丽丝打飞{~}机埃里克的{~}
     * */
    public static List<String>chaiFenZuHeFenGeFu(String s,String zuHeFenGeFuHao){
        List<String>list=new LinkedList<>();
        while(s.contains(zuHeFenGeFuHao)){
            //就是按照{~}拆分
            String ss = s.substring(0, s.indexOf(zuHeFenGeFuHao));
            list.add(ss);
            s=s.substring(s.indexOf(zuHeFenGeFuHao)+zuHeFenGeFuHao.length());
        }

        return list;
    }

    /**
     * 中间分隔符,单一或组合
     * 分隔符在后面开始
     *用于字符串最后没有分隔符的
     * 阿拉山口打飞{~}机爱丽丝打飞{~}机埃里克的
     * 根据  ~  拆完是
     * [阿拉山口打飞{, }机爱丽丝打飞{, }机埃里克的]
     * */
    public static List<String>chaiFenZuHeFenGeFu0(String s,String zuHeFenGeFuHao){
        return chaiFenZuHeFenGeFu(s+zuHeFenGeFuHao,zuHeFenGeFuHao);

    }

//    public static void main(String[]args){
//            String s="阿拉山口打飞{~}机爱丽丝打飞{~}机埃里克的";
//        p.p("-------------------------------------------------------");
//        p.p(chaiFenZuHeFenGeFu0(s,"{~}"));
//        p.p("-------------------------------------------------------");
//    }


    /**
     * 左分隔符 单一或组合
     *
     * 像下面这种用|做分隔符,且在最左边开始就有
     * |/upload/images/20170801/20170801172703_858.jpg|/upload/images/20170801/20170801172709_244.jpg
     * split是拆分的意思
     * Separator是分隔符  分离器 的  意思
     *
     *这种方法适合一个字符组成的分隔符,当然也适合组合分隔符
     * splitStrSeparator1Left("|1|2","|")得到的结果是:
     * [1, 2]这种List集合
     *
     *
     * splitStrSeparator1Left("{~}1{~}2","{~}")=[1,2]
     *
     * */


    public static List<String> splitStrSeparator1Left(String strToBeSplit,String separator){
        //注意, split()里面的参数是正则表达式,所以不能用  {~}
        //因为{在正则表达式中有特殊意义
        return new LinkedList<>(Arrays.asList((strToBeSplit+separator).substring(separator.length()).replace(separator,"<~>").split("<~>")));
    }

//    public static void main(String[]args){
//        String str="{~}1{~}2";
//        p.p("-------------------------------------------------------");
//        p.p(str);
//        p.p(splitStrSeparator1Left("{~}1{~}2","{~}"));
//        p.p("-------------------------------------------------------");
//    }


    /**
     * 左分隔符 默认 |
     *分隔符默认使用  "|"  且是    |1|2  这种[)
     *
     * */
    public static List<String> splitStrSeparator1Left(String strToBeSplit){
        //注意, split()里面的参数是正则表达式,所以不能用  {~}
        //因为{在正则表达式中有特殊意义
        return new LinkedList<>(Arrays.asList((strToBeSplit+"|").substring(1).replace("|","<~>").split("<~>")));
    }


//    public static void main(String[]args){
//        String str="|1|2";
//        p.p("-------------------------------------------------------");
//        p.p(str);
//        p.p(splitStrSeparator1Left("|1|2","|"));
//        p.p("-------------------------------------------------------");
//    }



////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *生成新类new封装
     * */

    public static p gp(){
        return new p();
    }


    /**
     *打印封装
     * */
    public static void p(Object o){
        System.out.println(o);
    }
    public static void p(String o){
        System.out.println(o);
    }

    /**
     *常用字符串组合打印或者log.error
     * 封装
     *
     *
     这种
     *
     *
     * */
    /**
     *--------------------------------------------
     123
     --------------------------------------------
     这种
     * */
    public static String str2Log(String str){
        return manyMinus2+str+manyMinus2;
    }

    /**
     *------------------log提示a-------------------
     123
     --------------------------------------------
     这种
     * */
    public static String str2Log(String str,String msg){

        int i;
        int j;
        if(msg.length()%2==0){
            i=msg.length()/2;
            j=i+1;
        }else{
            i=msg.length()/2+1;
            j=i+1;
        }

        return manyMinus2.substring(0, manyMinusBefore.length() / 2-i)
                +msg+manyMinus2.substring(manyMinusBefore.length() / 2+j)
                +str+manyMinus2;

    }
//    public static void main(String[]args){
//        p.p(str2Log("123","log提示a"));
//    }
    /**
     *uuid封装
     * */
    public static String uuid(){
        return UUID.randomUUID().toString();
    }

    public static String uuidNo_(){
        return UUID.randomUUID().toString().replace("-","");
    }

    /*public static void main(String[]args){
         p.p(p.gp().sad(p.dexhx).sad(p.uuid()).sad(p.dexhx).gad());
    }*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *下面一个方法是为了解决String.valueOf(str)当str=null的情况的方法
     * */
    public static String strValeOf(Object o){
        if (null==o){
            return "null";
        }else {
            return String.valueOf(o);
        }
    }
    public static String strValeOfNull(Object o){
        if (null==o){
            return null;
        }else {
            return String.valueOf(o);
        }
    }
    public static String strValeOfSpace(Object o){
        if (null==o){
            return "";
        }else {
            return String.valueOf(o);
        }
    }
    /**
     *字符串空与null互转
     * */
    /**
     *null变空
     * */
    public static String strNullToSpace(String s){
        return (null==s?"":s);
    }


    /**
     * 反射,内省,将类里面的String的null变成""
     *将对象里面的String类型的null变成space
     * */
    public static void strNullToSpace(Object o){
        List<Field> fieldList=new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for(Field field:fieldList){
            field.setAccessible(true);
            //得到当前字段类型
            String typeName = field.getType().getTypeName();
            if("java.lang.String".equals(typeName)){
                //得到我的生日
                try {
                    if(field.get(o)==null){
                            field.set(o,"");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }


//    public static void main(String[]args){
//        Test2StringEntity t=new Test2StringEntity();
//        p.p(t);
//        p.strNullToSpace(t);
//        p.p(t);
//    }





    /**
     * 反射拿到所有的字段和字段类型并 暴力反射, 并有方法 setOMyGetVal 可以给字段设置值
     *
     * 注意:field.getType().getTypeName()是
     * java.lang.String  这种
     * */
    public static List<p.FieldContent> getField(Object o){
        List<Field> fs=new ArrayList<>();
        Class<?> c = o.getClass();
        while (c != null) {//用while得到所有超类的字段属性
            fs.addAll(Arrays.asList(c.getDeclaredFields()));
            c = c.getSuperclass(); //得到父类,然后赋给自己
        }
        List<p.FieldContent>lfc=new LinkedList<p.FieldContent>();
        for(Field f:fs){
            FieldContent fc=new p.FieldContent();
            f.setAccessible(true);
            //得到当前字段类型
            fc.setField(f);
            fc.setFieldName(f.getName());
            fc.setFieldType(f.getType().getTypeName());
            fc.setoMy(o);
            lfc.add(fc);
        }
        return lfc;
    }
    public static class FieldContent{
        //字段名字,比如 public String fieldName;中的fieldName就是字段名字
         private String fieldName;
         //字段类型,比如 java.lang.String
         private String fieldType;
         //字段的对象
         private  Field field;
         //字段本身所在的对象
         private Object oMy;



        public Object getoMy() {
            return oMy;
        }

        //外部引用该方法来给字段设置值
        public void setOMyGetVal(Object fieldValue) throws IllegalAccessException {
            field.setAccessible(true);
            field.set(oMy,fieldValue);
        }

        //只给p类内部用
        private void setoMy(Object oMy) {
            this.oMy = oMy;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public String getFieldType() {
            return fieldType;
        }

        public void setFieldType(String fieldType) {
            this.fieldType = fieldType;
        }

        public Field getField() {
            return field;
        }

        public void setField(Field field) {
            this.field = field;
        }


    }



    /**
     *空变null
     * */
    public static String strSpaceToNull(String s){
        return ("".equals(s)?null:s);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public  static List<String>removeKongZiFuChuan(List<String>strList){
        while(strList.contains("")){
            for(int i=0;i<strList.size();i++){
                if("".equals(strList.get(i))){
                    strList.remove(i);
                }
            }
        }
        return strList;
    }


//    public static void main(String[]args){
//        List g = new linklistT<String>().a("1").a("").a("2").a("").g();
//        p.p("-------------------------------------------------------");
//        p.p(g);//[1, , 2, ]
//        p.p(removeKongZiFuChuan(g));//[1, 2]
//        p.p("-------------------------------------------------------");
//    }






    public static List<?extends Object> removeNull(List<?extends Object> list) {
    if(notEmpty(list)){
        while(list.contains(null)){
            //这种方式是可以变长删除元素的
            for(int i=0;i<list.size();i++){
                if(null==list.get(i)){
                    list.remove(null);
                }
            }
        }
    }
    return list;
}

//    public static void main(String[]args){
//        List<Object> g = linklist.b().a("1").a(null).a(2).a(null).g();
//        p.p("-------------------------------------------------------");
//        p.p(g);//[1, null, 2, null]
//        p.p("-------------------------------------------------------");
//        p.p("-------------------------------------------------------");
//        p.p(removeNull(g));//[1, 2]
//        p.p("-------------------------------------------------------");
//    }



    /**
     *给list集合依次remove掉一个元素(必须是存的String)
     * s是空字符串和null也可以,但是list是null和size=0就不行
     * list里面的null也能去除了
     * */
    public  static List<String> remove1EleInList(List<String> list,String s){
        if(notEmpty(list)&&s==null){
            while(list.contains(null)){
                //这种方式是可以变长删除元素的
                for(int i=0;i<list.size();i++){
                    if(null==list.get(i)){
                        list.remove(null);
                    }
                }
            }

        }else if(notEmpty(list)){
            //下面的filter其实就是留下符合条件的意思,把不等于的过滤留着
            return list.stream().filter(v -> bdy(s, v)).collect(Collectors.toList());
        }
        return list;
    }

//        public static void main(String[]args){
//            List<String> g = new linklistT<String>().a("1").a(null).a("2").a("2").a(null).g();
//            p.p("-------------------------------------------------------");
//            p.p(g);//[1, null, 2, 2, null]
//            p.p("-------------------------------------------------------");
//            p.p("-------------------------------------------------------");
//            p.p(remove1EleInList(g,"2"));//[1, null, null]
//            p.p("-------------------------------------------------------");
//        }





    /**
     *给list集合remove掉多个元素(必须是存的String)
     * s是空字符串和null也可以,但是list是null和size=0就不行
     * parentList是总的集合,childList是要删除的元素集合
     * 就是说从parentList中删除childList
     * 如果parentList和childList中都有null,也可以remove掉
     * */
    public  static List removeLotEleInList(List<String> parentList,List<String> childList){
        if(allNotEmpty(new Object[]{parentList,childList})){
            //s是空字符串和null也可以,但是list是null和size=0就不行
                parentList.removeAll(childList);
        }
        return parentList;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *list里面去重复
     * */
    public static List distinctList(List<String>list){
        return list.stream().distinct().collect(Collectors.toList());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //根据某几个字段去重对象 并同时合并某个字段的实例
    /**
     *map去重复,并合并某一字段,根据key的唯一性
     * */
 /*   private static void quChongFuBingHeBingMouYiXiang(){
        usr u1=new usr();
        usr u2=new usr();
        //根据name+age的字符串进行去重复,根据money字段进行合并
        //就是把name+age相同的对象他们的money加在一起并去除重复的
        u1.setAge(22);
        u1.setName("han");
        u1.setMoney(p.b("1.2"));


        u2.setAge(22);
        u2.setName("han");
        u2.setMoney(p.b("3.5"));

        //将实验去重并合并的对象放入list
        List<Object> usrs=arraylist.b().a(u1).a(u2).g();
        //打印没有合并的时候的整个对象集合
        p.p("-------------------------------------------------------");
        p.p(usrs.toString());
        p.p("-------------------------------------------------------");

        //得到去重复并合并某个字段的工具类map,根据map的key的唯一性进行去重复
        Map<String,Usr> map=new HashMap();
        //循环还没有合并的对象集合
        usrs.forEach(v->{

            Usr v1 = (Usr) v;
            String name = v1.getName() ;
            int age = v1.getAge();
            BigDecimal money = v1.getMoney();
            //将要合并的对象的字段转化成字符串连接在一起,为了将来对比用
            String nameage=name+p.strValeOf(age);
            //从map工具类中拿到相同的那个对象中的对比字段
            Usr usr = map.get(nameage);
            if(p.notEmpty(usr)){
                //如果//拿到map中本来有的重复的同类项非空,就跟当前流里面的同类项的money合并
                v1.setMoney(v1.getMoney().add(usr.getMoney()));
            }
            //把合并后的对象放到当前的那个 连接好的字符串为key 下面
            // 如果key相同,会把原来的那个覆盖掉用现在的合并后的对象替代
            map.put(nameage, v1);
        });

        //把 map的values  放入list,得到的就是去重并合并后的对象集合
        List<Usr> usrs01 = new ArrayList<>(map.values());
        //打印合并并去重后的对象
        p.p("------------------srs01.toString()-------------------------------------");
        p.p(usrs01.toString());
        p.p("-------------------------------------------------------");

    }
  */

//    public static void main(String[]args){
//        quChongFuBingHeBingMouYiXiang();
//
//
//    }




    /**
     * set集合去重不合并某个字段,注释掉的是根据对象的2个字段相加去重,没有注释的是根据对象的一个字段去重
     *测试去重,但是set始终不能对其他项合并,比如根据age+name合并后未能将money合并
     * */
  /*  private static void zhiQuChongBuHeBing(){
        usr u1=new usr();
        usr u2=new usr();
        u1.setAge(22);
        u1.setName("han");
        u1.setMoney(b("1.2"));
        u2.setAge(22);
        u2.setName("han");
        u2.setMoney(p.b("3.5"));
        List<usr> list=new arraylistT<usr>().a(u1).a(u2).g();
        p.p("-------------------------------------------------------");
        p.p(list.toString());
        p.p("-------------------------------------------------------");

        Set<usr> usrSet = new TreeSet<>(
//                (u01, u02)->(
//                        //将u01去重的字段转换成字符串连接再一起
//                        p.gp().sad(p.strValeOf(u01.getAge())).sad(u01.getName()).gad()
//                ).compareTo(
//                        ////将u02去重的字段转换成字符串连接再一起
//                        p.gp().sad(p.strValeOf(u02.getAge())).sad(u02.getName()).gad()
//                )
                //上面那个是组合字段去重复,下面这个是单一字段去重复对象
                Comparator.comparing(usr::getName)
        );
        //将要去重复的对象集合list放入去重复的set内部就能去重复
        usrSet.addAll(list);
        //将去重复后的set变成list集合
        List<usr>list1= new ArrayList<>(usrSet);

        p.p("-------------------------------------------------------");
        p(list1.toString());
        p.p("-------------------------------------------------------");
    }*/

//    public static void main(String[]args){
//        zhiQuChongBuHeBing();
//    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *排序
     * 在java中，要给数据排序，有两种实现方式，分别实现两个接口：

     一种是实现Comparable接口
     另一种是实现Comparator接口
     　　在JDK类库中，有一部分类实现了Comparable接口,如Integer Double和String等。
     　Comparable接口有一个comparTo(Object o)方法,它返回整数类型。
     对于表达式x.compareTo(y),如果返回值为0，则表示x和y相等,如果返回值大于0，
     则表示x大于y,如果返回值小于0，则表示x小于y.
     * */

    /*public static void main(String[]args){
        Usr u1=new Usr();
        u1.setAge(22).setMoney(p.b(32)).setName("hanhan1").setBir("2012-01-09");
        Usr u2=new Usr();
        u2.setAge(23).setMoney(p.b(33)).setName("hanhan2").setBir("2013-02-09");
        Usr u3=new Usr();
        u3.setAge(24).setMoney(p.b(34)).setName("hanhan3").setBir("2014-02-09");
        List l = p.gp().setArl(u2).setArl(u1).setArl(u3).getArl();
        p.p(l);
        //按年龄排序
        l.sort(Comparator.comparing(Usr::getAge));
        p.p(l);
        //按字符串生日排序
        l.sort(Comparator.comparing(Usr::getBir));
        p.p(l);
        //按字符串生日倒排序
        l.sort(Comparator.comparing(Usr::getBir).reversed());
        p.p(l);
        //根据自己写的方法规则排序
        l.sort(Comparator.comparing(Usr::Age1).reversed());
        p.p(l);


    }*/


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *构造map自动链式生成
     *
     * */
//    public p smp(String key,Object val){
//        map.put(key,val);
//        return this;
//    }
//    public Map<String,Object> gmp(){
//        return map;
//    }
    /**
     ****************************************************************************************
     * */
    //@Test1
   /* private static void xx(){
        p.p(Integer.class.getName());
        p.p(int.class.getTypeName());//int
        p.p(Integer.class.getTypeName());//java.lang.Integer
        p.p(double.class.getTypeName());//double
        p.p(Double.class.getTypeName());//java.lang.Double
        p.p(float.class.getTypeName());//float
        p.p(Float.class.getTypeName());//java.lang.Float
        p.p(Long.class.getTypeName());//java.lang.Long
        p.p(long.class.getTypeName());//long
        p.p(Short.class.getTypeName());//java.lang.Short
        p.p(short.class.getTypeName());//short
    }*/

//    public static void main(String[]args){
//            xx();
//    }
    /**
     *g得到s链式连接的字符串
     * */
//    public String gad() {
//        return ads;
//    }

    /**
     * 先用gp得到一个新类,注意,一定要用gp得到new类,才能调用该方法
     *拼接字符串封装
     * 调用该方法链式增加字符串
     * 然后调用gad()得到结果
     * */
//    public p sad(String str) {
//        ads=sb.append(str).toString();
//        return this;
//    }

    //@Test1
//    public void g(){
//        String gad = p.gp().sad("韩寒").sad("梦如").gad();
//        p.p(gad);//韩寒梦如
//    }
    /**
     ****************************************************************************************
     * */






    /**
     ****************************************************************************************
     * 生成linkedlist并装上东西
     * */
//    public List getLin() {
//        return lin;
//    }
//
//    public p setLin(Object o) {
//        this.lin.add(o);
//        return this;
//    }

    //@Test1
//    public void f(){
//        List lin = p.gp().setLin(1).setLin(2).setLin(3).getLin();
//        p.p(lin);//[1,2,3]
//    }



    /**
     ****************************************************************************************
     * 生成arraylist并装上东西
     * */
//    public List getArl() {
//        return arl;
//    }
//
//    public p setArl(Object o) {
//        this.arl.add(o);
//        return this;
//    }
    //@Test1
//    public void f1(){
//        List arl = p.gp().setArl(11).setArl(22).setArl(33).getArl();
//        p.p(arl);////[11,22,33]
//
//    }
    /**
     ****************************************************************************************
     * */
    /**
     *逻辑非
     * opp是opposit的缩写
     * */

    public static boolean opp(boolean b){
        //如果a是true返回false
        if(b){
            return false;
            //如果a是false,返回true
        }else{
            return true;
        }
    }

    /**
     *并且
     * */
    public static boolean and(boolean a,boolean b){
        if(a&&b){
            return true;
        }else{
            return false;
        }
    }





    /**
     *或者
     * */
    public static boolean or(boolean a,boolean b){
        if(a||b){
            return true;
        }else{
            return false;
        }
    }




    /**
     *equals缩写,判断两个字符串如果等于返回true
     * */
       public static boolean dy(String str1 ,String str2){
           if(str1!=null){
               if(str1.equals(str2)){
                   return true;
               }else{
                   return false;
               }
           }else if(str2!=null){
               if(str2.equals(str1)){
                   return true;
               }else{
                   return false;
               }
           }else if(str1==null&&str2==null){
               p("str1和str2都是null");
               return false;
           }else{
               //这种情况基本不会发生
               return false;
           }
       }

    //equals缩写,判断两个字符串如果不等于返回true
    public static boolean bdy(String str1 ,String str2){
           if(dy(str1,str2)){
               return false;
           }else{
               return true;
           }

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //new 一个BigDecimal//非正常情况返回null

    public static BigDecimal b(Object o){
        if(null==o){
            return null;
        }else{
            try {
                return new BigDecimal(String.valueOf(o));
            } catch (Exception e) {
                return null;
            }
        }
    }


    public static BigDecimal b(String s){
        if(null==s){
            return null;
        }else{
            try {
                return new BigDecimal(s);
            } catch (Exception e) {
                   return null;
            }
        }
    }


    //new 一个BigDecimal//非正常情况返回null
    public static BigDecimal b(Double d){
        if(null==d){
            return null;
        }else{
            try {
                return new BigDecimal(d);
            } catch (Exception e) {
                return null;
            }
        }
    }
    //new 一个BigDecimal//非正常情况返回null
    public static BigDecimal b(Integer i){
        if(null==i){
            return null;
        }else{
            try {
                return new BigDecimal(i);
            } catch (Exception e) {
                return null;
            }
        }
    }
    //new 一个BigDecimal//非正常情况返回null
    public static BigDecimal b(Long L){
        if(null==L){
            return null;
        }else{
            try {
                return new BigDecimal(L);
            } catch (Exception e) {
                return null;
            }
        }
    }




    /**
     *传入一个Bigdecimal,如果是null,就变为0
     * */
    public static BigDecimal bNull0(BigDecimal b){
        return null==b?new BigDecimal(0):b;
    }

    /**
     *bigDecimal比大小
     * */


    public static boolean isFirstBigBigdecimal(BigDecimal b1,BigDecimal b2){
        return b1.compareTo(b2)==1?true:false;
    }

    public static boolean isFistSmallBigdecimal(BigDecimal b1,BigDecimal b2){
        return b1.compareTo(b2)==-1?true:false;
    }
    public static boolean isEqualBigdecimal(BigDecimal b1,BigDecimal b2){
        return b1.compareTo(b2)==0?true:false;
    }

//
//    public static void main(String[]args){
//        p.p(p.isFirstBig(p.b(1),p.b(0.5)));
//        p.p(p.isFistSmall(p.b(1),p.b(2)));
//        p.p(p.isEqual(p.b(3),p.b(2)));
//    }

    /**
     *bigdecimal加减乘除
     * */


    public static BigDecimal badd(BigDecimal b1,BigDecimal b2){
       return bNull0(b1).add(bNull0(b2));
    }

    public static BigDecimal b1_b2(BigDecimal b1,BigDecimal b2){
        return bNull0(b1).subtract(bNull0(b2));
    }

    public static BigDecimal b1Xb2(BigDecimal b1,BigDecimal b2){
        return bNull0(b1).multiply(bNull0(b2));
    }

    public static BigDecimal b1ChuYib2Null(BigDecimal b1,BigDecimal b2){
        if(isEqualBigdecimal(b2,b(0)))return null;
        return bNull0(b1).divide(bNull0(b2));
    }

    public static BigDecimal b1ChuYib20(BigDecimal b1,BigDecimal b2){
        if(isEqualBigdecimal(b2,b(0)))return b(0);
        return bNull0(b1).divide(bNull0(b2));
    }

//    public static void main(String[]args){
//                p(b1ChuYib2Null(b(4),b(0)));
//    }


    /**
     *bigDecimal取余
     * Bigdecimal取商
     *
     * */


    public static Map<String,BigDecimal>bigDecimalChuFa(BigDecimal beiChuShu,BigDecimal chuShu){
        BigDecimal[] results = beiChuShu.divideAndRemainder(chuShu);
        BigDecimal shang=results[0];
        BigDecimal yuShu=results[1];
        Map<String,BigDecimal>map=new LinkedHashMap<>();
        map.put("beiChuShu",beiChuShu);
        map.put("chuShu",chuShu);
        map.put("shang",shang);
        map.put("yuShu",yuShu);
        return map;

    }

//        public static void main(String[] args) {
//            Map<String, BigDecimal> map = bigDecimalChuFa(b(1001), b(20));
//            p(map);
//        }





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    /**
     ****************************************************************************************
     * */
    /**
     *2个日期相减得到的毫秒数量
     * */
        public static Long xjms(Date bigDate,Date samllDate){
            if(bigDate==null||samllDate==null){
                return null;
            }else{
                return bigDate.getTime()-samllDate.getTime();
            }
        }

    /**
     *2个日期相减得到的秒数量
     * */
    public static Long xjs(Date bigDate,Date samllDate){
        Long xjms = xjms(bigDate, samllDate);
        if(xjms ==null){
            return null;
        }else{
            return xjms/1000;
        }
    }

    /**
     *2个日期相减得到的分钟数量
     * */
    public static  Long xjmin(Date bigDate,Date samllDate){
        Long xjs = xjs(bigDate, samllDate);
        if(xjs ==null){
            return null;
        }else{
            return xjs/60;
        }
    }

    /**
     *2个日期相减得到的小时数量
     * */
    public  static Long xjh(Date bigDate,Date samllDate){
        Long xjmin = xjmin(bigDate, samllDate);
        if(xjmin ==null){
            return null;
        }else{
            return xjmin/60;
        }
    }

    /**
     *2个日期相减得到的天数
     * */
    public static Long xjd(Date bigDate,Date samllDate){
        Long xjh = xjh(bigDate, samllDate);
        if(xjh ==null){
            return null;
        }else{
            return xjh/24;
        }
    }


    //@Test1
    public void testDD() throws ParseException {
        p.p(xjh(new SimpleDateFormat("yyyy-MM-dd").parse("2017-12-14"),new SimpleDateFormat("yyyy-MM-dd").parse("2017-12-13")));
    }
    /**
     ****************************************************************************************
     * */


    /**
     *字符串日期转化成date
     * yyyy-MM-dd HH:mm:ss.SS
     * */

    public static Date tod(String strDate,String geshi) {
        if(strDate==null){
            return null;
        }
        try {
            return new SimpleDateFormat(geshi).parse(strDate);
        } catch (ParseException e) {
//            e.printStackTrace();
            return null;
        }
    }



    /**
     *设置所有格式试一遍的时间
     * 只有-和/两种的格式都试了一遍
     * */
    public static Date todAll(String strDate) {
        if(strDate==null){
            return null;
        }
        try {
            return new SimpleDateFormat(d16).parse(strDate);
        } catch (ParseException e) {
            try {
                return  new SimpleDateFormat(d1).parse(strDate);
            } catch (ParseException e1) {
                try {
                    return  new SimpleDateFormat(d2).parse(strDate);
                } catch (ParseException e2) {
                    try {
                        return  new SimpleDateFormat(d3).parse(strDate);
                    } catch (ParseException e3) {
                        try {
                            return  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").parse(strDate);
                        } catch (ParseException e4) {
                            try {
                                return  new SimpleDateFormat(d5).parse(strDate);
                            } catch (ParseException e5) {
                                try {
                                    return  new SimpleDateFormat(d6).parse(strDate);
                                } catch (ParseException e6) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }




    /**
     *将excel里面的距离1900/1/1的时间转为
     * unix标准时间,
     * excelDayNumStr就是excel里的时间 比如  43333  就是距离 1900-01-01   43333天的时间
     * */
    public static Date excelData2Date(String excelDayNumStr) throws ParseException {
        try {
            //得到excel起始值计算的毫秒数
            long time = new SimpleDateFormat(d16).parse("1900-1-1 00:00:00.000").getTime();
            //得到excel中的毫秒数
            BigDecimal b = p.b(excelDayNumStr).multiply(p.b(24)).multiply(p.b(3600)).multiply(p.b(1000));
            BigDecimal add = b.add(b(time)).subtract(p.b(2*24*3600*1000));//不知道为啥多了2天,后面减掉2天
            if(String.valueOf(add).contains(".")){
                return  new Date(new Long(String.valueOf(add).substring(0,String.valueOf(add).indexOf("."))));
            }else{
                return  new Date(new Long(String.valueOf(add)));
            }

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *yyyy-MM-dd转换成默认日期的
     * */
    public static Date tod(String strDate) {
        if(strDate==null){
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     *Date 变成 String异常的时候转换成yyyy-MM-dd HH:mm:ss.SSS
     * */
    public static String  dtoStr(Date date,String geshi) {
        if(date==null){
            return null;
        }

        try {
            return new SimpleDateFormat(geshi).format(date);
        } catch (Exception e) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date);
        }

    }

    /**
     *Date 变成 String默认格式
     * yyyy-MM-dd HH:mm:ss.SS
     * */
    public static String  dtoStr(Date date) {
        if(date==null){
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
    public String  dtoStrs(Date date) {
        if(date==null){
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(date);
    }
    /**
     ****************************************************************************************
     * */
    //@Test1
//    public void f2(){
//        p(dtoStrs(new Date()));
//    }

    /**
     ****************************************************************************************
     * */


    /**
     *小于1971年,
     * 一般用于判断是否是1970-01-01 08:00:00.000
     * */
    public static boolean isSmallThan1971(Date date){
        if(date==null){
            return false;
        }else{
            if((date.getTime())<(p.tod("1971-01-01 08:00:00.000").getTime())){
                return true;
            }else{
                return false;
            }
        }
    }


    public static boolean isBiggerThan1971(Date date){
        return !isSmallThan1971(date);
    }


    /**
     *用于判断是否是unix元年
     * 其中  这种判断
     * 1970-01-01 08:00:00.000是等于1970-01-01这种的
     * */
    public static boolean eqUnixOriTime(Date date){
        if(tod(unixTimeOri).equals(date)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean notEqUnixOriTime(Date date){
       return !eqUnixOriTime(date);
    }


//    public static void main(String[]args){
//            p(notEqUnixOriTime(p.tod("1970-01-01")));
//    }





    /**
     *小于等于我的生日,精确到日,因为我的生日只能精确到日,这玩意可以用来处理1970和1899的判断
     * */

    public static boolean isSmallOrEqMybirth(Date date){
        if(date==null){
            return false;
        }else{
            if((date.getTime())<=(p.tod(p.hanhanBirthday_).getTime())){
                return true;
            }else{
                return false;
            }
        }
    }


    /**
     *大于我的生日,精确到日,因为我的生日只能精确到日,这玩意可以用来处理1970和1899的判断
     * */

    public static boolean isBiggerThenMybirth(Date date){
        return !isSmallOrEqMybirth(date);
    }

//    public static void main(String[]args){
//          p.p(isBiggerThenMybirth(new Date()));
//        p.p(isSmallOrEqMybirth(new Date()));
//    }
    /**
     *时间比大小,精确到时间戳毫秒
     * */
    public static boolean isFirstDateBig(Date first,Date second){
        if(first==null || second==null){
            return false;
        }else{
            if(first.getTime()>second.getTime()){
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     *时间比大小,精确到时间戳毫秒
     * */
    public static boolean isFirstDateSmall(Date first,Date second){
        return !isFirstDateBig(first,second);
    }
    /**
     *默认是"yyyy-MM-dd"的str格式才能比较,精确到日
     * */
    public static boolean isFirstDateBig_(String firstStr,String  secondStr){
        Date first= tod(firstStr);
        Date second=tod(secondStr);
        return isFirstDateBig(first,second);
    }

    /**
     *默认是"yyyy-MM-dd"的str格式才能比较,精确到日
     * */
    public static boolean isFirstDateSamll_(String firstStr,String  secondStr){
        Date first= tod(firstStr);
        Date second=tod(secondStr);
        return !isFirstDateBig(first,second);
    }

/**
 *默认是"yyyy/MM/dd"的str格式才能比较
 * 这里说的大小是字面大小,距离1970越远越大
 * 精确到日
 * */
public static boolean isFirstDateBig(String firstStr,String  secondStr){
    Date first= tod(firstStr,"yyyy/MM/dd");
    Date second=tod(secondStr,"yyyy/MM/dd");
    return isFirstDateBig(first,second);
}

    /**
     *默认是"yyyy/MM/dd"的str格式才能比较
     * 这里说的大小是字面大小,距离1970越远越大
     * 精确到日
     * */
    public static boolean isFirstDateSmall(String firstStr,String  secondStr){
        Date first= tod(firstStr,"yyyy/MM/dd");
        Date second=tod(secondStr,"yyyy/MM/dd");
        return !isFirstDateBig(first,second);
    }
    //@Test1
   public void f3() {
    p(isFirstDateBig("2017/12/24", "2017/12/23"));//true
}
    /**
     ****************************************************************************************
     * */

    public static boolean isFirstDateBig(Date first,String  secondStr){
        Date second=tod(secondStr,"yyyy/MM/dd");
        return isFirstDateBig(first,second);
    }

    public static boolean isFirstDateBig_(Date first,String  secondStr){
        Date second=tod(secondStr,"yyyy-MM-dd");
        return isFirstDateBig(first,second);
    }
    public static boolean isFirstDateSmall(Date first,String  secondStr){
        Date second=tod(secondStr,"yyyy/MM/dd");
        return !isFirstDateBig(first,second);
    }

    public static boolean isFirstDateSmall_(Date first,String  secondStr){
        Date second=tod(secondStr,"yyyy-MM-dd");
        return !isFirstDateBig(first,second);
    }
    public static boolean isFirstDateBig(String firstStr,Date  second){
        synchronized (ThreadLocal.class) {
            Date first= tod(firstStr,"yyyy/MM/dd");
            return isFirstDateBig(first,second);
        }
    }

    public static boolean isFirstDateBig_(String firstStr,Date  second){
        synchronized (ThreadLocal.class) {
            Date first= tod(firstStr,"yyyy-MM-dd");
            return isFirstDateBig(first,second);
        }
    }
    public static boolean isFirstDateSmall(String firstStr,Date  second){
        synchronized (ThreadLocal.class) {
            Date first= tod(firstStr,"yyyy/MM/dd");
            return !isFirstDateBig(first,second);
        }
    }

    public static boolean isFirstDateSmall_(String firstStr,Date  second){
        synchronized (ThreadLocal.class) {
            Date first= tod(firstStr,"yyyy-MM-dd");
            return !isFirstDateBig(first,second);
        }
    }
    //@Test1
//    public void f4() {
//        p(isFirstDateBig(new Date(), "2017/12/02"));//true
//    }
    /**
     ****************************************************************************************
     * */


    /**
     *将  yyyy-MM-dd这种字符串变成时间戳
     * */
    public String getSjc(String strSj){
        if(p.empty(strSj)){
            return null;
        }else{
            try {
                //yyyy-MM-dd注意:写成yyyy-MM-dd hh:mm:ss.sss就会过于严格
                Date d=new SimpleDateFormat("yyyy-MM-dd").parse(strSj);
                strSj=String.valueOf(d.getTime());
            } catch (ParseException e) {
                return null;
            }
        }
        return strSj;
    }


    /**
     *时间戳转换成Date
     * */
    public static Date sjc2Date(String shiJianChuoStr){
        if(null==shiJianChuoStr||"".equals(shiJianChuoStr)){
            return null;
        }else{
            long lt = new Long(shiJianChuoStr);
            Date date= new Date(lt);
            return  date;
        }

    }

    public static Date sjc2Date(Long shiJianChuo){
        if(null==shiJianChuo){
            return null;
        }else{
            Date date= new Date(shiJianChuo);
            return  date;
        }

    }

    /**
     *new 一个日期
     * */
    public static Date getDate(){
        return new Date();
    }
    /**
     *new 一个时间戳
     * */
    public static long getTimeStamp(){
        return new Date().getTime();
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //时间戳变成str格式时间

    public static String sjc2StrDate(String strSjc){
       return p.dtoStr(p.sjc2Date(strSjc),p.d16);

    }
    public static String sjc2StrDate(String strSjc,String geShi){
        return p.dtoStr(p.sjc2Date(strSjc),geShi);

    }
    public static String sjc2StrDate(Long longSjc){
        return p.dtoStr(p.sjc2Date(longSjc),p.d16);

    }

    public static String sjc2StrDate(Long longSjc,String geShi){
        return p.dtoStr(p.sjc2Date(longSjc),geShi);

    }
//    public static void main(String[]args){
//        //1970-01-01 08:02:01.344得到这种形式
//         p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(sjc2StrDate("121344"))).sad(p.dexhx).gad());
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(sjc2StrDate(121344L))).sad(p.dexhx).gad());
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(sjc2StrDate(121344L,d16))).sad(p.dexhx).gad());
//    }



    public static void make1970null(Object o){
        List<Field> fieldList=new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for(Field field:fieldList){
            field.setAccessible(true);
            //得到当前字段类型
            String typeName = field.getType().getTypeName();
            if("java.util.Date".equals(typeName)){
                //得到我的生日
                try {
                    if(field.get(o)!=null){
                        Date date=null;
                        try {  date = new SimpleDateFormat("yyyy-MM-dd").parse("1986-12-26"); } catch (ParseException e) { e.printStackTrace(); }
                        long mybrith = date.getTime();
                        long time = ((Date) field.get(o)).getTime();
                        if(time<=mybrith){
                            //如果这个时间小于我的生日,证明这个时间是在1986年以前的时间,需要变成NULL
                            field.set(o,null);
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }




//    public static void main(String[]args){
//        List <String>list = stringNumDesc(new linklistT<String>().a(null).a("100").a("2").g());
//
//        for(String s:list){
//            p.p(s);
//        }
//
//    }

    //降序    字符串数字降序
    public static List<String> stringNumDesc(List<String> ss){
        try {
            for(String s:ss){
                if(!isBd(s)){
                    System.out.println("该集合中有不是数字的字符串,无法进行排序");
                    return null;
                }
            }
            TreeSet<String> sSet = new TreeSet(
                    (o1,o2)-> {
                        Double d1 = new Double((String) o1);
                        Double d2 = new Double((String) o2);
                        if(d1==d2){
                            return 0;
                        }else if(d1<d2){
                            return 1;
                        }else{
                            return -1;
                        }
                    });
            sSet.addAll(ss);
            return new LinkedList<String>(sSet);
        } catch (Exception e) {
            return null;
        }
    }


    //升序    字符串数字升序
    public static List<String> stringNumAsc(List<String> ss){
        try {
            for(String s:ss){
                if(!isBd(s)){
                    System.out.println("该集合中有不是数字的字符串,无法进行排序");
                    return null;
                }
            }
            TreeSet<String> sSet = new TreeSet(
                    (o1,o2)-> {
                        Double d1 = new Double((String) o1);
                        Double d2 = new Double((String) o2);
                        if(d1==d2){
                            return 0;
                        }else if(d1<d2){
                            return -1;
                        }else{
                            return 1;
                        }
                    });
            sSet.addAll(ss);
            return new LinkedList<String>(sSet);
        } catch (Exception e) {
            return null;
        }
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 该方法解决了返回给前端是 "null"的情况,直接全部字段String化后把类变为Map再在controller return
     *
     * 字段转换为字符串
     * 字段转换为String
     * 全部字段转换为字符串
     * 全部字段转换为String
     *
     *
     * 注意这里用Map接收是因为map和类都有同样的性质,都是key和value的组合的集合
     *@ 设计该类的初衷是 为了输出接口到外部的时候,输出的都是String,
     * 对于字段无值的进行  ""  输出
     *
     *
     * 亲自试验返回结果,证明没有get方法和set方法的时候实体也能够被jackson序列化
     * fastJson在field是public的时候同样也不需要实体的get和set方法
     *
     * 返回类型中value是Object,是为了将来有符合类型的时候不会出错
     * */

    /**
     *
     * 现在已经支持以下复合类型的直接所有字段变String,
     * 复杂的要依次取出之后String化再放入
     * 这样得到的Map最终在Controller  return的时候就可以直接json化,而且不会出现"null"  "nulL"都会变为""
     *public class Test2StringEntity {
             private String str;
             private BigDecimal b;
             private Double d;
             private Test1 t;
             private List<Test1> list;



     public class Test1 {
             String kk="121323";
             BigDecimal bb;
     * */

 /* 该方法判断类内部的基本类型用的是下面所有这些
 List<String> canBeJsonTypes
            = Arrays.asList(new String[]{"int","java.lang.Integer",
            "double","java.lang.Double",
            "float","java.lang.Float","java.lang.Long"
            ,"long","java.lang.Short","short","java.lang.String","String"
            ,"java.math.BigDecimal","BigDecimal","byte","java.lang.Byte","char"
            ,"boolean","java.lang.Boolean"});*/
    public static Map<String,Object> getAllFields2String(Object o) throws IllegalAccessException {
        Class clazz=o.getClass();
        List<Field>allFieldsOrignal=new LinkedList<>();
        while (clazz != null) {//用while得到所有超类的字段属性
            allFieldsOrignal.addAll(Arrays.asList(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass(); //得到父类,然后赋给自己
        }
        Map<String,Object> allFiledKeyValueAllReadyString=new LinkedHashMap<String,Object>();
        for(Field f:allFieldsOrignal){
            //强奸 private 字段
            f.setAccessible(true);
            //得到字段名字
            String key = f.getName();
            String typeName = f.getType().getName();
            //预设字段值
            Object value;
            //得到字段真实值
            Object valueObj=f.get(o);
            if(p.canBeJsonTypes.contains(typeName)){
                if(null==valueObj){
                    value="";
                }else{
                    //只要不是空就转化为String
                    value=String.valueOf(valueObj);
                }
            }else if("java.util.Date".equals(typeName)){
                try {
                    value=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(valueObj);
                } catch (Exception e) {
                    e.printStackTrace();
                    value="";
                }
            }else if("java.util.List".equals(typeName)){
                //此时是list复合类型
                List<Map<String,Object>>list=new ArrayList<Map<String,Object>>();
                for(Object o1:(List)valueObj){
                    //使用递归
                    list.add(getAllFields2String(o1)) ;
                }
                value=list;
            }else{
                //此时是自己造的对象那种符合类型
                //此时该字段可能是复合类型, 调用自己//使用递归
               value= getAllFields2String(valueObj);
            }

            allFiledKeyValueAllReadyString.put(key,value);
        }
        return allFiledKeyValueAllReadyString;
    }




        /**
     *把所有是类中所有是null的字段,如果是String类型,变成""
     * */
    public static Object StringTypeNull2Space(Object o) throws IllegalAccessException {
        List<Field> fieldList = new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for (Field field : fieldList) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (StringType.equals(type.getName())) {
                if(null==field.get(o)){//把o穿进去,得到o的属性值
                    //设置o的属性值
                    field.set(o,space);
                }

            }
        }
        return o;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static Object StringTypeSpace2Null(Object o) throws IllegalAccessException {
    List<Field> fieldList = new ArrayList<>();
    Class<?> aClass = o.getClass();
    while (aClass != null) {//用while得到所有超类的字段属性
        fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
        aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
    }
    for (Field field : fieldList) {
        field.setAccessible(true);
        Class<?> type = field.getType();
        if (StringType.equals(type.getName())) {
            if(space.equals(field.get(o))){//把o穿进去,得到o的属性值
                //设置o的属性值
                field.set(o,null);
            }

        }
    }
    return o;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *当日期小于我的生日的时候,证明这个日期不太正确,设置为null
     * 这个是针对某些框架内部会把Date设置为1970或者1899的情况
     * */
    public static Object dateTypeSamll2Null(Object o) throws IllegalAccessException {
        List<Field> fieldList = new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for (Field field : fieldList) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (DateType.equals(type.getName())) {
                if(isFirstDateBig(hanhanBirthday,(Date)field.get(o))){//把o穿进去,得到o的属性值
                    //设置o的属性值
                    field.set(o,null);
                }

            }
        }
        return o;
    }


    /**
     *把字段是Date的小于1986的都设置为null
     * 把字段是String的是""的都设置为null
     * */
    public static Object dateTypeSamllAndStringTypeSpace2Null(Object o) throws IllegalAccessException {
        List<Field> fieldList = new ArrayList<>();
        Class<?> aClass = o.getClass();
        while (aClass != null) {//用while得到所有超类的字段属性
            fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for (Field field : fieldList) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (DateType.equals(type.getName())) {
                if(isFirstDateBig(hanhanBirthday,(Date)field.get(o))){//把o穿进去,得到o的属性值
                    //设置o的属性值
                    field.set(o,null);
                }

            }else if(StringType.equals(type.getName())){
                if(space.equals(field.get(o))){
                    field.set(o,null);
                }
            }
        }
        return o;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //@Test1
//    public void f5(){
//        p(Date.class.getName());
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *关于list去除一个元素变长问题
     *
     * 这个工具主要是解决  从list元素里删除若干个符合条件的元素,list装的是基本类型的时候比较基本类型,是对象的时候比较对象
     * 的某一个参数值来决定是否删除list中的该对象
     *
     *
     * 参数  list 是一个装满  listEleType 类型的list
     * 参数 listEleType  是list里面装的元素的类型,注意,一定要装的是同一类型才能用该工具
     * 参数 comparedFieldName就是将来要删除的元素中如果是对象类型的,comparedFieldName就是该对象的属性名的字符串形式
     * 如果 list里装的不是对象,compareContentToFieldValue可以写个""或者NULL,因为不会走到比较对象那一步
     *
     * compareContentToFieldValue是将来安排的"比较内容",比如,你要删除的元素的属性值是compareContentToFieldValue的才删除,
     * 其他不删除,  如果list装的是一般类型不是对象,这个值就代表了list里面的元素值
     *
     *
     * compareContentToFieldValue填入的是NULL的时候删除的就是属性值是NULL的那个元素
     * */
    public static void removeSameEle(List<?> list ,Class listEleType,String comparedFieldName,Object compareContentToFieldValue) throws IllegalAccessException {

        //如果list里面没东西,直接不进行了
        if(list==null||list.size()==0){
           return;
        }
        Object listFirstObj = list.get(0);

        //此时是String类型
        if(StringType.equals(listEleType.getTypeName())||BigDecimalType.equals(listEleType.getTypeName())){
            Iterator<?> iterator = list.iterator();
            while(iterator.hasNext()){
                Object next = iterator.next();
                if(compareContentToFieldValue==null){
                    iterator.remove();
                }else if(next.equals(compareContentToFieldValue)){
                    iterator.remove();
                }
            }
        //此时是数字类型
       }else if(numberTypelist.contains(listEleType.getTypeName())) {
            Iterator<?> iterator = list.iterator();
            while(iterator.hasNext()){
                Object next = iterator.next();
                if(compareContentToFieldValue==null){
                    iterator.remove();
                }else if(next==(compareContentToFieldValue)){
                    iterator.remove();
                }
            }
       //此时是普通对象带元素的类型
       }else if(listFirstObj.getClass().getTypeName().equals(listEleType.getTypeName())){
           Iterator<?> iterator = list.iterator();
           while(iterator.hasNext()){
               Object next = iterator.next();
               Field[] declaredFields = next.getClass().getDeclaredFields();
               for(Field field:declaredFields){
                   field.setAccessible(true);
                   Object o = field.get(next);
                   String fieldName = field.getName();
                   String typeName = o.getClass().getTypeName();
                   //此时是删除是某个元素属性是NULL的那个元素
                   if(comparedFieldName.equals(fieldName)&&StringType.equals(typeName)&&o==null&&compareContentToFieldValue==null){
                       iterator.remove();
                       //属性值是String的情况
                   }else if(comparedFieldName.equals(fieldName)&&StringType.equals(typeName)&&o.equals(compareContentToFieldValue)){
                       iterator.remove();
                       //属性值是BigDecimal的情况
                   }else if(comparedFieldName.equals(fieldName)&&BigDecimalType.equals(typeName)&&o.equals(compareContentToFieldValue)){
                       iterator.remove();
                       //属性是数字类型的情况,数字类型就是numberTypelist里的所有类型
                   }else if(comparedFieldName.equals(fieldName)&&numberTypelist.contains(typeName)&&o==compareContentToFieldValue){
                       iterator.remove();
                   }else{

                   }
               }
           }
       }else{
           p.p("此时的list里面装的类型是："+listEleType.getTypeName()+"无法进行比对,请优化工具对类型的处理情况");
       }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //@Test1
//    public void f8() throws IllegalAccessException {
//        List<x>list=new ArrayList<>();
//        list.addAll(p.gp().setArl(new x().setStr("str")).setArl(new x().setStr("str")).setArl(new x().setStr("xxx")).getArl());
//        p.p(list);
//        //删除字段str属性值是"xxx"的
//        removeSameEle(list,x.class,"str","xxx");
//        p.p(list);
//
//    }

    //@Test1
//    public void f9() throws IllegalAccessException {
//        List<x>list=new ArrayList<>();
//        list.addAll(p.gp().setArl(new x().setStr("str")).setArl(new x().setStr("str")).setArl(new x().setStr("xxx")).getArl());
//        p.p(list);
//        //删除子弹str属性值是"xxx"的
//        removeSameEle(list,x.class,"str","str");
//        p.p(list);
//
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //@Test1
//    public void f6(){
//        p.p("".getClass().getTypeName());
//        p.p(new Integer(5).getClass().getTypeName());
//        p.p(new BigDecimal(5).getClass().getTypeName());
//        p.p(new BigDecimal(5).equals(new BigDecimal(6)));//false
//        p.p(new BigDecimal(5).equals(new BigDecimal(5)));//true
//    }


    /**
     *System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
     * */
//    public class x{
//        public int x=1;
//        public String str="str";
//
//        public int getX() {
//            return x;
//        }
//
//        public x setX(int x) {
//            this.x = x;
//            return this;
//        }
//
//        public String getStr() {
//            return str;
//        }
//
//        public x setStr(String str) {
//            this.str = str;
//            return this;
//        }
//
//        @Override
//        public String toString() {
//            final StringBuffer sb = new StringBuffer("com.winwin.picreport.Futils.hanhan.p.x{");
//            sb.append("x=").append(x);
//            sb.append(", str='").append(str).append('\'');
//            sb.append('}');
//            return sb.toString();
//        }
//    }

    /**
     *
     * */
    //@Test1
//    private void f7(){
//        Field[] declaredFields = x.class.getDeclaredFields();
//        for(Field field:declaredFields){
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//            p.p(field.getName());
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//        }
//
//    }
 /**
     *输入一个字符串格式的数字,然后四舍五入到max和min的小数位数,一般max
     * 和min的值都写一样,比如max=min=4就是说四舍五入后小数后面留4位
     * */
    public static String getNum(int max,int min,String num){
        if(null==num){
            return null;
        }
        num=num.replace(",","");
        BigDecimal b;
        try {
            b = new BigDecimal(num);
        } catch (Exception e) {
            p("p.getNum yao format de bu shi shuZi001");
            e.printStackTrace();
            return null;
        }
        try {
            java.text.NumberFormat  f  =  java.text.DecimalFormat.getInstance();
            f.setMaximumFractionDigits(max);
            f.setMinimumFractionDigits(min);
            return f.format(b).replace(",","");
        } catch (Exception e) {
            p("p.getNum yao format de bu shi shuZi002");
            e.printStackTrace();
            return null;
        }
    }

   /* public static void main(String[]args){
            p.p(getNum(4,4,"657573.1423929831"));
    }*/




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *下面这个方法通常用于前端传过来的有
     * 文件
     * 我们通过
     * 文件名
     * 和
     * 得到的
     * 绝对路径
     * 来拼凑一个文件
     * 再创建
     * dirAbsolutePath
     * 是最后带一个斜杠的文件夹路径
     * fileName是文件名字
     *
     *
     * */
    public static File getFileByFileNameAndAbsolutePath(String dirAbsolutePath,String fileName){
        return new File(dirAbsolutePath, fileName);

    }
    //file.getAbsolutePath()  de dao de shi  zui hou dai  gang de jue dui lu jing
    public static File getFileByFileNameAndAbsolutePath(File file,String fileName){
        return new File(file.getAbsolutePath(), fileName);

    }

    /**
     *删除文件
     * */
    public static void Del(File file){
        if(file!=null&&file.exists()){
            file.delete();
        }
    }

    /**
     *通过路径打得到一个file,如果是springboot jar包同一级目录,路径指的就是一个文件名
     * 如果是其他项目,路径一般指的是全路径名
     * //注意,该方法如果不存在这个文件就会返回null是将来作为判断的
     * */
    public static File getFile(String path){
        File file = new File(path);
        if(file.exists()){
            return file;
        }else{
            return null;
        }
    }

    /**
     *根据文件判断文件是否存在
     * */
    public static boolean exists(File file){
        if(file==null){
            return false;
        }else{
            if(file.exists()){
                return true;
            }else{
                return false;
            }
        }
    }

    public static boolean notExists(File file){
        return !exists(file);
    }

    public static boolean notDic(File file){
        if(null==file){
            return true;
        }else if(file.isDirectory()){
            return false;
        }else {
            return true;
        }
    }
    /**
     *根据路径判断文件是否存在
     * */
    public static boolean notExists(String filePath){
        return !exists(filePath);
    }
    public static boolean exists(String filePath){
        if(null==filePath||"".equals(filePath)){
            return false;
        }else{
            File file=new File(filePath);
            if(null==file){
                return false;
            }else{
                if(file.exists()){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    /**
     *创建一个文件, 不存在再创建
     * */

    public static File createNewFile(String filePath) throws IOException {
        File f=new File(filePath);
        if(!f.exists()){
            f.createNewFile();
        }
        //如果创造过之后还不存在,就返回null
        if(!f.exists()){
            f=null;
        }
        return f;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *是否是email
     * */

    public static boolean isEmail1(String emailStr){
        if (Pattern.compile(emailPattern1).matcher(emailStr).find()) {
            return true;
        }
        return false;
    }
    public static boolean isEmail2(String emailStr){
        if (Pattern.compile(emailPattern2).matcher(emailStr).find()) {
            return true;
        }
        return false;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *null和undefined变成""
     * */
    public static String nullUndefinedToSpace(String str){
        str=(str==null?"":str);
        str=("undefined".equals(str)?"":str);
        return str;
    }
    /**
     *前提是数字的时候null变成0,undefined变成0
     * */
    public static String NumNullUndefinedToStrZero(String str){
        str=(str==null?"0":str);
        str=("undefined".equals(str)?"0":str);
        return str;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *以下是空判断和非空判断以及所有非空判断和所有空的判断,如果是包含空的
     * 判断请用   !allNotEmpty
     * */

    public static boolean empty(Object ob){

        if(notEmpty(ob)){
            return false;
        }else{
            return true;
        }

    }




    public static boolean notEmpty(Object ob){
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
    public static boolean allNotEmpty(Object[ ]obs){
        for(Object ob:obs){
            if(!notEmpty(ob)){return false;}
        }
        return true;
    }

    //不是所有的是空的,有不为空的
    public static boolean notAllEmpty(Object[ ]obs){
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

    public static boolean allEmpty(Object[ ]obs){
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


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *n倍相同字符串的设计
     * */

    public static String nStr(String s,int n){
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<n;i++){
            ss.append(s);
        }
        return ss.toString();
    }

    /*public static void main(String[]args){
        p.p(p.gp().sad(p.dexhx).sad(p.nStr("草",5)).sad(p.dexhx).gad());
    }*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *计算整型的长度
     * */

    public static int sizeOfInt(int x) {
        for (int i = 0;; i++)
            if (x <= sizeTable[i])
                return i + 1;
    }

//    public static void main(String[]args){
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(p.sizeOfInt(213123))).sad(p.dexhx).gad());
//    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *是否是电话号码
     * */

    public static boolean isPhoneNo(String phoneNoStr){
        if (Pattern.compile(phonePattern).matcher(phoneNoStr).find()) {
            return true;
        }
        return false;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * addDate是负数就代表减去几天,addDate是正数代表加上几天
     * */
    public static Date getNextDay(Date date,int addDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,addDate);//+1今天的时间加一天
        date = calendar.getTime();
        return date;
    }

//    public static void main(String[] args) {
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        Date date =new Date( );
//        System.out.println(sdf.format(date));
//        System.out.println(sdf.format(getNextDay(date,3)));
//
//    }
////统计小数点后面位数//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *统计小数点后面位数
     * */

    public static Integer dianHouWeiShu(String shuZi){
        //得到点号后面的位数索引//从0开始//ejh是English句号的意思
        int i = shuZi.indexOf(p.ejh) + 1;
        //截取到shuZi小数点后面(不包括)所有的位数
        shuZi = shuZi.substring(i);
        //这个长度说的是字符长度,汉字跟字母数字都一样
        Integer length = shuZi.length();
        if(i==0) {
            //此时没有.号//点号后面肯定是0
            length=0;
        }
        if(Integer.valueOf(shuZi)==0){
            //针对123.0000D这种
            length=0;
        }
        return length;
    }
    public static Integer dianHouWeiShu(Double shuZi){
        return dianHouWeiShu(String.valueOf(shuZi));
    }

//    public static void main(String[]args){
//             p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(p.dianHouWeiShu(123123.001D))).sad(p.dexhx).gad());
//    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    /**
     *BigDecimal相加
     * */
    public static BigDecimal badd(Object o1,Object o2){
        if(p.notEmpty(o1)&&p.notEmpty(o2)&&p.isBd(o1)&&p.isBd(o2) ){
            return p.b(o1).add(p.b(o2));
        }else{
            return null;
        }
    }
    /**
     *BigDecimal相减,前减去后面
     * */
    public static BigDecimal bsub(Object o1,Object o2){
        if(p.notEmpty(o1)&&p.notEmpty(o2)&&p.isBd(o1)&&p.isBd(o2) ){
            return p.b(o1).subtract(p.b(o2));
        }else{
            return null;
        }
    }
    /**
     *BigDecimal乘,前乘以后面
     * */
    public static BigDecimal bmul(Object o1,Object o2){
        if(p.notEmpty(o1)&&p.notEmpty(o2)&&p.isBd(o1)&&p.isBd(o2) ){
            return p.b(o1).multiply(p.b(o2));
        }else{
            return null;
        }
    }
    /**
     *BigDecimal除法,前面除以后面,后面是除数,前面被除数
     * */
    public static BigDecimal bdiv(Object o1,Object o2){
        if(p.notEmpty(o1)&&p.notEmpty(o2)&&p.isBd(o1)&&p.isBd(o2) ){
            return p.b(o1).divide(p.b(o2));
        }else{
            return null;
        }
    }


    /**
     * BigDecimal
     *前面比后面大
     * */
    public static boolean bbig(Object o1,Object o2){
        if(p.notEmpty(o1)&&p.notEmpty(o2)&&p.isBd(o1)&&p.isBd(o2) ){
            return p.b(o1).compareTo(p.b(o2))==1;
        }else{
            return false;
        }
    }
    /**
     * BigDecimal
     *前面比后面小
     * */
    public static boolean bsml(Object o1,Object o2){
        if(p.notEmpty(o1)&&p.notEmpty(o2)&&p.isBd(o1)&&p.isBd(o2) ){
            return p.b(o1).compareTo(p.b(o2))==-1;
        }else{
            return false;
        }
    }

    /**
     * BigDecimal
     *两数字相等
     * */
    public static boolean beql(Object o1,Object o2){
        if(p.notEmpty(o1)&&p.notEmpty(o2)&&p.isBd(o1)&&p.isBd(o2) ){
            return p.b(o1).compareTo(p.b(o2))==0;
        }else{
            return false;
        }
    }
//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(p.beql(p.b(2),p.b(2)));
//        p.p("-------------------------------------------------------");
//    }


    /**
     * 利用正则表达式判断字符串是否是数字
     * @param str
     * @return
     * 判断每一位是否是数字,如果是小数有小数点,返回的是false
     * 如果每一个字符都是数字,返回true
     */
    public static boolean isNumeric(String str){
        return isBd(str);
    }

    /**
     *字符串是否是整型
     * */
    public static boolean isInt(String str){
        try {
            Integer.valueOf(str);
            //不抛异常就是true
            return true;
        } catch (Exception e) {
            //抛出异常就是false
         return false;
        }
    }
    public static boolean isFloat(String str){
        try {
            Float.valueOf(str);
            //不抛异常就是true
            return true;
        } catch (Exception e) {
            //抛出异常就是false
            return false;
        }
    }
    public static boolean isDouble(String str){
        try {
            Double.valueOf(str);
            //不抛异常就是true
            return true;
        } catch (Exception e) {
            //抛出异常就是false
            return false;
        }
    }

    //判断浮点数（double和float）
    public static boolean isDuble(String str) {
        if (null == str || "".equals(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }


//    public static void main(String[]args){
//            System.out.println(isDuble("123.1231213123123123123122312312321"));
//            //会缩减长度
//            System.out.println(Double.valueOf("123.1231213123123123123122312312321"));
//            //不会缩减长度
//            System.out.println(new BigDecimal("123.1231213123123123123122312312321"));
//    }



    /**
     *是否是BigDecimal
     * */
    public static boolean isBd(Object o){
        try {
            new BigDecimal(String.valueOf(o));
            //不抛异常就是true
            return true;
        } catch (Exception e) {
            //抛出异常就是false
            return false;
        }
    }

    public static boolean isBd(String str){
        try {
            new BigDecimal(str);
            //不抛异常就是true
            return true;
        } catch (Exception e) {
            //抛出异常就是false
            return false;
        }
    }
    /**
     *是否是long
     * */
    public static boolean isL(String str){
        try {
            Long.valueOf(str);
            //不抛异常就是true
            return true;
        } catch (Exception e) {
            //抛出异常就是false
            return false;
        }
    }
    /**
     *是否是short
     * */
    public static boolean isShort(String str){
        try {
            Short.valueOf(str);
            //不抛异常就是true
            return true;
        } catch (Exception e) {
            //抛出异常就是false
            return false;
        }
    }
    /**
     *是否是标准时间
     * 2017-01-09 12:23:33.333这种
     * */
    public static boolean isBzSj(String s){
        try {

            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /**
     * 是否是时间
     *是否是标准时间
     * 2017-01-09 12:23:33,333这种
     * */
    public static boolean isBzSj1(String s){
        try {

            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS").parse(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /**
     *是否是标准时间
     * 2017-01-09 12:23:33这种
     * */
    public static boolean isBzSj2(String s){
        try {

            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /**
     *是否是标准时间
     * 2017-01-09这种
     * */
    public static boolean isBzSj3(String s){
        try {

            new SimpleDateFormat("yyyy-MM-dd").parse(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     *是否是标准时间
     * */
    public static boolean isDate(String s){
        boolean bzSj = isBzSj(s);
        boolean bzSj2 = isBzSj2(s);
        boolean bzSj3 = isBzSj3(s);
        if(bzSj||bzSj2||bzSj3){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isNotDate(String s){
        return !p.isDate(s);
    }
//    public static void main(String[]args) throws ParseException {
//        p.p("-------------------------------------------------------");
//        p.p(isBzSj3("2017-13-12 12:23:44"));
//        p.p("-------------------------------------------------------");
//    }
//    public static void main(String[]args){
//        //_________________true_________________
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isNumeric("11231212333333333333333333333333333333"))).sad(p.dexhx).gad());
//       //_________________false_________________
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isNumeric("1123.213123"))).sad(p.dexhx).gad());
//        //_________________false_________________
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isNumeric(""))).sad(p.dexhx).gad());
//        //_________________false_________________
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isNumeric(null))).sad(p.dexhx).gad());
//    }

    public static boolean isPic(String jueDuiLuJing){
        try {
            String s=jueDuiLuJing.substring(jueDuiLuJing.lastIndexOf("."));
            if(p.imgSufixs.contains(s)){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isPic(File file){
        return isPic(file.getAbsolutePath());
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(isPic(new File("E:\\1\\000\\常用东西放入\\2\\98K警告.jpg")));
//        p.p("-------------------------------------------------------");
//    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*方法二：推荐，速度最快
  * 判断是否为整数
  * @param str 传入的字符串
  * @return 是整数返回true,否则返回false//实际上超过long的都返回true
*/

    public static boolean isInteger(String str) {
        if(empty(str)){
            return false;
        }else{
            return Pattern.compile("^[-\\+]?[\\d]*$").matcher(str).matches();
        }

    }

    /**
     *判断所有序列上是不是数字
     * "123123.111"  返回false,因为这个方法是判断所有位上都是数字的
     * "00000001000876"返回true
     * */
    //方法一：用JAVA自带的函数
    public static boolean isNumericInAllSequence(String str){
        if(null==str||"".equals(str)||str.contains(" ")||str.contains(".")){return false;}
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }


//    public static void main(String[]args){
//            p.p(isBigDecimal("324234.38924-"));
//            p.p(new BigDecimal("+12312.98"));
//        p.p(new BigDecimal("12312.98-"));
//    }


    public static boolean isBigDecimal(String str){
        if(null==str||"".equals(str)||str.contains(" ")){return false;}
        if(str.contains("-")){
            if(str.indexOf("-")!=str.lastIndexOf("-")){
                //含有多个负号
                return false;
            }else if(str.indexOf("-")!=0){
                //负号不在第一位
                return false;
            }
            return  whenNoPlusOrMinus(str.replace("-",""));
        }else if(str.contains("+")){
            if(str.indexOf("+")!=str.lastIndexOf("+")){
                //含有多个负号
                return false;
            }else if(str.indexOf("+")!=0){
                //负号不在第一位
                return false;
            }
            return  whenNoPlusOrMinus(str.replace("+",""));
        }else{
            return  whenNoPlusOrMinus(str);
        }
    }

    private static boolean whenNoPlusOrMinus(String str){
        if(str.contains(".")){
            //开始和结尾有.是可以做小数点的
            /*if(str.startsWith(".")||str.endsWith(".")){
                //不应该在开头或者结束有小数点
                return false;
            }*/
            //当最后一个点和最前面一个点不是一个点的时候,说明有2个点,不是数字
            if(str.indexOf(".")!=str.lastIndexOf(".")){
                //此时有2个或者2个以上小数点,明显不是数字
                return false;
            }else{
                String strTemp = str.replace(".", "");
                //有一个点的时候考虑去掉点后是不是全都是数字
                for (int i = strTemp.length();--i>=0;){
                    if (!Character.isDigit(strTemp.charAt(i))){
                        return false;
                    }
                }
            }
        }else{
            for (int i = str.length();--i>=0;){
                if (!Character.isDigit(str.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }



//    public static void main(String[]args){
//           p.p(p.isBigDecimal(".12312312"));
//
//           p.p(".12312312.".indexOf("9"));
//          p.p( new BigDecimal("-00010.000"));
//
//    }



//    public static void main(String[]args){
//        String s="123123.111";
////        s=null;
//        s="00000001000876";
//        p.p(isNumericInAllSequence(s));
//    }






/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//    public static void main(String[]args){
//        //_________________true_________________
//         p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isInteger("11111111111111111111111111111111111111111111111111111111111111111111"))).sad(p.dexhx).gad());
//        //_________________false_________________
//         p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isInteger("11.1"))).sad(p.dexhx).gad());
//        //_________________false_________________
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isInteger(""))).sad(p.dexhx).gad());
//        //_________________false_________________
//        p.p(p.gp().sad(p.dexhx).sad(p.strValeOf(isInteger(null))).sad(p.dexhx).gad());
//    }

    public static Connection getCon(String ip,String port
            ,String dbType,String dbName,String usr,String pwd)
            throws ClassNotFoundException, SQLException {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17";
        String driver="";
        if("sqlserver".equals(dbType)){
            url="jdbc:sqlserver://"+ip+":"+port+";DatabaseName="+dbName;
            driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        }else if("mysql".equals(dbType)){
            url="jdbc:mysql://"+ip+":"+port+"/"+dbName+"?useUnicode=true&characterEncoding=utf-8";
            driver="com.mysql.jdbc.Driver";
        }
//        //mydb为数据库
//        String user = "sa";
//        String password = "root";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, usr, pwd);
        if (p.empty(conn)) {
            return null;
        } else {
            return conn;
        }
    }

    public static void conClose(Connection c) throws SQLException {
        if (p.notEmpty(c)) {
            c.close();
        } else {

        }

    }

    public static void resultSetClose(ResultSet c) throws SQLException {
        if (p.notEmpty(c)) {
            c.close();
        } else {

        }

    }

    public static void preparedStatementClose(PreparedStatement c) throws SQLException {
        if (p.notEmpty(c)) {
            c.close();
        } else {

        }

    }


    public static void closeAll(Connection c,PreparedStatement p1, ResultSet r) {
        try {
            p.preparedStatementClose(p1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            p.resultSetClose(r);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            p.conClose(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    /**
     *写字节到文件
     * */
    public static void writeByteToFile(byte[] bs,File file) throws IOException {
        //建立输出字节流
        FileOutputStream fos = new FileOutputStream(file);
        //用FileOutputStream 的write方法写入字节数组
        fos.write(bs);
        fos.flush();
        //为了节省IO流的开销，需要关闭
        fos.close();
    }


    /**
     *将字符串写入文本,注意会覆盖原来的文本内容
     * 注意,这个写入文件,如果文件不存在,会自动创建并写入,但是文件 路径中的文件夹必须存在
     * */
    public static boolean  writeToTxt(String strToWrite,String txtPath) {

        FileWriter writer=null;
        try {
            writer = new FileWriter(txtPath);
            writer.write(strToWrite);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

//    public static void main(String[]args){
//        boolean b = writeToTxt("[\"1\",\"2\"]", "C:/123");
//        System.out.println(b);
//    }
    /**
     *读文本的所有内容变为字符串
     * 读取文本
     * */
    public static String readAllTxt(String txtPath){
        File file=null; FileReader fr=null;BufferedReader br=null;
        try {
            file=new File(txtPath);
            fr=new FileReader(file);
            br=new BufferedReader(fr);
            StringBuffer sb=new StringBuffer();
            String str="";
            while((str=br.readLine())!=null){
                sb.append(str);
            }
            return sb.toString().trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     *对于打包后的springboot项目
     * 我们怎么读取资源路径？
     * 其实很简单
     * 所有  资源文件放到跟jar包同级目录  然后用
     * String pa = p.readAllTxt("资源文件.txt")
     * 在项目中就能读取
     *
     *
     * 注意,这玩意在云蕊服务器上连接微信的时候
     * 读取txt文件必须是ansi格式编码,原来的utf-8编码被读后是乱码
     * 这个可能跟txt文件在jar包外面和平台编码有关
     *
     * 就是说在读jar外面的文件,最好用notpad++转换成ANSI编码
     *
     * */

    public static String readAllTxt(File file){

        FileReader fr=null;BufferedReader br=null;
        try {
            fr=new FileReader(file);
            br=new BufferedReader(fr);
            StringBuffer sb=new StringBuffer();
            String str="";
            while((str=br.readLine())!=null){
                sb.append(str);
            }
            return sb.toString().trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    public static void main(String[]args){
//         p.p(p.gp().sad(p.dexhx).sad(readAllTxt("E:\\1\\新建文本文档.txt")).sad(p.dexhx).gad());
//
//    }


    /**
     *将流读成字符串
     * 流变字符串,设定了50K以内
     * */

    /*public static void main(String[]args){

        String s = readInputUtf8ToString(p.class.getResourceAsStream("1"));
        p(s);
    }*/


    public static String readInputGBKToString(InputStream input){
        return readInputToString(input,"GBK");
    }

    public static String readInputUtf8ToString(InputStream input){
        return readInputToString(input,"UTF-8");
    }




    private static final int PROTECTED_LENGTH = 51200;// 输入流保护 50KB

    public static String readInputToString(InputStream input,String charSet){

        if (input == null) {
            throwE("----InputStream is  null----");
        }
        //字节数组
        byte[] bcache = new byte[2048];
        int readSize = 0;//每次读取的字节长度
        int totalSize = 0;//总字节长度
        ByteArrayOutputStream infoStream = new ByteArrayOutputStream();
        try {
            //一次性读取2048字节
            while ((readSize = input.read(bcache)) > 0) {
                totalSize += readSize;
                if (totalSize > PROTECTED_LENGTH) {
                    throwE("---InputStream more than 50KB-----");
                }
                //将bcache中读取的input数据写入infoStream
                infoStream.write(bcache,0,readSize);
            }
        } catch (IOException e1) {
            throwE("---read inputStream Exception--");
        } finally {
            try {
                //输入流关闭
                input.close();
            } catch (IOException e) {
                throwE("-----inputStream close Exception----");
            }
        }

        try {
            return infoStream.toString(charSet);
        } catch (UnsupportedEncodingException e) {
            throwE("---return String Exception---");
        }

        return "";


    }


    /**
     *读当前类所在目录下面的文件
     *
     * 对于springboot等打包的jar项目无效
     * 在普通的jar打包的java文件中有效
     * */


    public static String duDangQianLeiMuLuXiaDeWenJian
    (String wenJianMing,Class dangQianLeiClazz,String charSetOfTxt){


        try {
            InputStream resourceAsStream = dangQianLeiClazz.getResourceAsStream(wenJianMing);


            return readInputToString(resourceAsStream,charSetOfTxt);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(duDangQianLeiMuLuXiaDeWenJian("1",p.class,p.UTF8));
//        p.p("-------------------------------------------------------");
//    }


//    public static void main(String[]args){
//        String s = duDangQianLeiMuLuXiaDeWenJian("1", arraylist.class, p.UTF8);
//        p.p("-------------------------------------------------------");
//        p.p(s);
//        p.p("-------------------------------------------------------");
//
//
//    }

    /**
     *读取项目里面某个文件夹下的txt为String
     * 读取文本为字符串
     * 读取文本为String
     * @Param srcXiangDuiLuJingQianMianBuDaiGang 意思是src相对路径前面不带杠的意思
     *
     *
     * 输入从src下开始的路径如下即可
     * com/footing/website/hanhan/1
     *
     * 上面1是个文本文件 com文件夹是在src下面
     * */

    public static  String xiangDuiSrcDeLuJingDuTxt(String srcXiangDuiLuJingQianMianBuDaiGang){
        try {
            return readAllTxt(srcPath() + srcXiangDuiLuJingQianMianBuDaiGang);
        } catch (Exception e) {
            return "";
        }
    }


//    public static void main(String[]args){
//          p(xiangDuiSrcDeLuJingDuTxt("com/footing/website/hanhan/1"));
//    }


    /**
     *java读取资源文件
     * 读取properties文件
     * 读取properties资源文件
     * 资源读取不到返回null
     * 注意   pr.getProperty("key");可以直接拿到 文件里面的东西
     * */


    public static Properties readProp(String propertiesPath){
        Properties pr=new Properties();
        try {
            pr.load(new FileReader(propertiesPath));
        } catch (IOException e) {
            e.printStackTrace();
            //有异常的话,返回一个null;
            return null;
        }
//        pr.getProperty("key");
        return pr;
    }







//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *springBoot  jarPath
     * 得到springboot  jar所在路径,最后带杠的
     *
     * //注意这种路径只是得到springboot  的jar所在的路径
     * */
    public static String  springBootJarPath(){
        //创建一个文件//注意这个文件直接会生成在springboot  jar所在的文件夹中
        File file = new File("1");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String absolutePath = file.getAbsolutePath();

        String jarPath=absolutePath.substring(0,absolutePath.length()-1);
        if(file .exists()) {
            file.delete();
        }
        return jarPath;

    }



    /**
     *得到springboot打包后的jar路径
     * */
    public static String jarPath() {
        /**
         *得到类似路径
         * E:/1/000/LinZhan
         * 我们打包后的springboot 的jar包就在LinZhan文件夹里面
         * */
        String path = p.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        synchronized (p.class) {
            path = path.replace("file:/", "");
            int i = path.lastIndexOf("!");
            i = i - 18;
            path = path.substring(0, i);
            path = path.substring(0, path.lastIndexOf("/"));
        }
        //处理路径中的%20为 " "
        if(path!=null&&path.contains(enCodeSpace)){
            path=path.replace(enCodeSpace,space);
        }
//       String path="E:/";
        return path;
    }



    /**
     * 通过当前类得到当前类的加载路径
     *路径
     * 类的加载路径(类clazz所在的文件夹)
     * E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/com/footing/website/hanhan/
     * */

    public static String classLoadPath(Class clazz){
        //得到的很可能是这种路径
        //          /E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/com/footing/website/hanhan/
        String s= clazz.getResource("").getPath();
        if(p.dy(p.xg,s.substring(0,1))){
            //得到这种  类所在的文件夹
            //           E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/com/footing/website/hanhan/
            s=s.substring(1);
        }
        return s;
    }


//    public static void main(String[]args){
//
//        p.p(classLoadPath(p.class));
//    }






    /**
     *  这种玩意对于导包jar的java启动文件有灾难性的后果,因为jar里面的路径从外面一直读是读不进去的
     *通过当前类 得到工程根目录,根路径  就是得到src路径
     * E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/
     *
     * 这个对于war包放在tomcat下面是 可以得到src下面路径的,但是对于springboot打的jar包不行
     * */

    public static String srcPath(){
        //得到的很可能是这种路径
        //          /E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/
        String s= p.class.getResource("/").getPath();
        if(p.dy("/",s.substring(0,1))){
            //得到这种  类所在的文件夹
            //           E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/
            s=s.substring(1);
        }
        return s;
    }

    //无法得到springboot内部的src目录,但是可以得到传统java main和java web项目的src根目录
    //其实这个也可以用于win,因为前面多个/也可以读到路径,
    public static String srcPathLinux(){
        //得到的很可能是这种路径
        //          /E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/
        String s= p.class.getResource("/").getPath();

        return s;
    }


    /**
     /E:/1/work_space/CloudPlatformMobile002/target/classes/
     这种最前面带/的路径,  跟不带一样  但是这种路径对于打包的springboot来讲,是灾难的
     因为打包后,就无法深入到jar文件内部去读取了
     * */
    public static String srcPathYuan(){
        //得到的很可能是这种路径
        //          /E:/1/work_space/luxclub_jeesite/out/production/luxclub_jeesite/
        String s= p.class.getResource("/").getPath();
        return s;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //获取父路径
//    public static void main(String[]args){
//        File file = new File("E:/1/00000/");
//        p.p(file.getAbsolutePath());//  E:\1\00000
//        p.p(file.getParent());//  E:\1
//        File parentFile = file.getParentFile();
//
//    }


//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(getParent("E:/1/00000/"));// 得到   E:\1
//        p.p("-------------------------------------------------------");
//    }
  //得到父目录
    //不管当前目录是否后面带/  得到的父目录都不带/
    //就是得到 ../这种目录
  public static  String getParent(String currentPath){
        return new File(currentPath).getParent();
  }
    //得到父目录
    //不管当前目录是否后面带/  得到的父目录都不带/
    //就是得到 ../这种目录
    public  static  String getParent(File file){
        return file.getParent();
    }

//得到爷爷目录//就是得到 .../ 上上层目录
    //不管当前目录带不带杠,  得到的最后上上层目录都最后不带杠
    public static String getGrandpa(String currPath){
        return p.getParent(p.getParent(currPath));
    }
    public static String getGrandpa(File file){
        return p.getParent(p.getParent(file));
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        //结果E:\1\原来E\360data
//        p.p(getGrandpa("E:\\1\\原来E\\360data\\重要数据\\我的文档\\"));
//        p.p("-------------------------------------------------------");
//    }


    //getUp3Dir("E:\\1\\原来E\\360data\\重要数据\\我的文档\\")
    //得到  E:\1\原来E
    //得到爷爷目录的上一层目录,就是得到上3层目录
    public static String getUp3Dir(String currPath){
        return p.getParent(p.getGrandpa(currPath));
    }
    public static String getUp3Dir(File file){
        return p.getParent(p.getGrandpa(file));
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        //得到 E:\1\原来E
//        p.p(getUp3Dir("E:\\1\\原来E\\360data\\重要数据\\我的文档\\"));
//        p.p("-------------------------------------------------------");
//    }


    //  getUp4Dir("E:\\1\\原来E\\360data\\重要数据\\我的文档\\")
    //得到的是 E:\1
    public static String getUp4Dir(String currPath){
        return p.getParent(p.getUp3Dir(currPath));
    }
    public static String getUp4Dir(File file){
        return p.getParent(p.getUp3Dir(file));
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(getUp4Dir(new File("E:\\1\\原来E\\360data\\重要数据\\我的文档\\")));
//        p.p("-------------------------------------------------------");
//    }

    //得到上五层目录
    //  getUp5Dir("E:\\1\\work_space\\TCode001\\target\\test1-classes\\com\\ipacedev")
    //得到 E:\1\work_space  最后没有杠的目录
    public static String getUp5Dir(String currPath){
        return p.getParent(p.getUp4Dir(currPath));
    }
    public static String getUp5Dir(File file){
        return p.getParent(p.getUp4Dir(file));
    }
//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(getUp5Dir("E:\\1\\work_space\\TCode001\\target\\test1-classes\\com\\ipacedev"));
//        p.p("-------------------------------------------------------");
//    }

    //得到 tomcat 部署项目的根目录,
    //比如项目名称是 luxclub
    //打包成 luxclub.war然后放到Tomcat的webapps下面启动
    //得到C:\Users\Administrator\Desktop\Tomcat85\webapps\luxclub\  后面带杠的这种目录
    //注意这个request 必须是控制层传过来的request
    public static String getWebProjectDir(HttpServletRequest request){
        return request.getSession().getServletContext().getRealPath("/");
    }

    //得到webapps这个目录
    //最终结果不带杠
//注意这个request 必须是控制层传过来的request
    ////得到C:\Users\Administrator\Desktop\Tomcat85\webapps这种不带杠
    public static String getTomcatWebappsDir(HttpServletRequest request){
        return p.getParent(p.getWebProjectDir(request));
    }
    //得到Tomcat根目录,就是得到webapps的上层目录
    ////注意这个request 必须是控制层传过来的request
    //注意这个最后不带杠
    public static String getTomcatDir(HttpServletRequest request){
        return p.getParent(p.getTomcatWebappsDir(request));
    }

    /**
 *response跨域设置
 * */
    public static void kuaYuAndUtf8Response(HttpServletResponse response, String Content_type, String charset){
    //        response.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding(charset);
    //        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setHeader("Content-type", Content_type);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,content-type,token");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
    }
    //////////md5////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        public static void main(String[] args){
//           System.out.println(md5Up32("ceshi0051657786").length());
//            System.out.println(md5_32("ceshi0051657786"));
//        }

    /**
     * 把字符串变成MD5加密码,顺便大写了
     * */
    public static String md5Up32(String inputString) {
        return generatePasswordToUpperCase(inputString);
    }

    /**
     * 把字符串变成MD5加密码,不大写
     * */
    public static String md5_32(String inputString) {
        return encodeByMD5(inputString);
    }

    public static String generatePasswordToUpperCase(String inputString) {
        return encodeByMD5(inputString).toUpperCase();
    }
    //////////////////////////////////////////////////////////////////////////////
    public static String generatePassword(String inputString) {
        return encodeByMD5(inputString);
    }
    //////////////////////////////////////////////////////////////////////////////
    public static String generateHexString(byte[] inputByte) {
        return encodeByMD5(inputByte);
    }

    private static String encodeByMD5(byte[] originByte) {
        if (originByte != null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] results = md.digest(originByte);
                String resultString = byteArrayToHexString(results);
                String pass = resultString.toUpperCase();
                return pass;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    private static String encodeByMD5(String originString) {
        if (originString != null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] results = md.digest(originString.getBytes());
                String resultString = byteArrayToHexString(results);
                String pass = resultString;
                return pass;
            } catch (Exception ex) {
                ex.printStackTrace();//TODO change to use logger?
            }
        }
        return null;
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
///////////////////////////////////////////////////////////////////////////////////////////

    /**
     *图片和base64互转
     * */

    //图片转化成base64字符串
    public static String GetImageStr(String imagePath)
    {//将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        String imgFile = imagePath;//待处理的图片
        InputStream in = null;
        byte[] data = null;
//读取图片字节数组
        try
        {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
//对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);//返回Base64编码过的字节数组字符串
    }

    //base64字符串转化成图片
    public static boolean GenerateImage(String imgStr,String pathToGenerateImg)
    { //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try
        {
//Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
//生成jpeg图片
//新生成的图片
            OutputStream out = new FileOutputStream(pathToGenerateImg);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    ///////////////////////////////////////////////////////////////////////
//base64字符串转化成图片
    public static boolean GenerateImage(String imgStr,File file)

    {
        System.out.println("开始把图片放入文件夹");
        //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try
        {
//Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
//生成jpeg图片
//新生成的图片
            System.out.println("==============="+file.getAbsolutePath());
            OutputStream out = new FileOutputStream(file);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //抛出异常并记录异常到list
    public static void throwEAddToList(String strException,List<String> msgExceptions){
        msgExceptions.add(strException);
        throw new RuntimeException(strException);
    }


    //抛出异常并记录异常到list
    public static void throwEAddToList(Exception e,String strException,List<String> msgExceptions){
        msgExceptions.add(strException);
        e.printStackTrace();
        throw new RuntimeException(strException);
    }



    //异常抛出
    public static void throwE(String s){
        throw new RuntimeException(s);
    }
    //异常抛出
    public static void throwE(Exception e){
        throw new RuntimeException(e);
    }
    //去除空白符
    public static String replaceBlank(String str){
        String dest = null;
        if(str == null){
            return dest;
        }else{
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
            return dest;
        }
    }



//    public static void main(String[]args){
//        String s=p.readAllTxt("E:\\1\\work_space\\LinZhan_Picture_ReportTable\\src\\main\\java\\com\\winwin\\picreport\\Bcontroller\\loginRegistModul\\auth\\权限的json.json");
//
//        p(replaceBlank(s));
//    }


    //去掉字符串数字末尾的0
//    public static void main(String[]args){
//            p(new BigDecimal("0.10000"));
//    }

    /**
     *转换编码
     * 编码转换
     * 字符串编码转换
     * */


    /**
     *转换失败变为null
     * */
    public static String changeCharsetNull(String str,String beforeCharset,String afterCharset){
        try {
            return new String(str.getBytes(beforeCharset),afterCharset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *转换失败变为 ""
     * */
    public static String changeCharsetSpacec(String str,String beforeCharset,String afterCharset){
        try {
            return new String(str.getBytes(beforeCharset),afterCharset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }


    public static String  strUtf8ToGBKNull(String str) {
        try {
            return new String(str.getBytes("UTF-8"),"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String  strUtf8ToGBKSpace(String str) {
        try {
            return new String(str.getBytes("UTF-8"),"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String  strUtf8ToGB2312Null(String str) {
        try {
            return new String(str.getBytes("UTF-8"),"GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String  strUtf8ToGB2312Space(String str) {
        try {
            return new String(str.getBytes("UTF-8"),"GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String  strGBKToUtf8Space(String str) {
        try {
            return new String(str.getBytes("GBK"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
    public static String  strGBKToUtf8Null(String str) {
        try {
            return new String(str.getBytes("GBK"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String  strGB2312ToUtf8Null(String str) {
        try {
            return new String(str.getBytes("GB2312"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String  strGB2312ToUtf8Space(String str) {
        try {
            return new String(str.getBytes("GB2312"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

//    public static void main(String[]args) throws UnsupportedEncodingException {
//        String s="\u672a\u77e5\u9519\u8bef\uff0c\u8bf7\u8054\u7cfb\u7cfb\u7edf\u7ba1\u7406\u5458\u3002";
//        String s101 = p.changeCharsetNull(s, "utf-8", "utf-8");
//        p.p(s101);
//    }
/////////////////////////////微信排序///////////////////////////////////////////////////////////////////////////

    /**
     *根据list排序参数
     * 字典排序
     * */
    //排序后不拼接字符串
    public static List<String> ziDianPaiXu(List<String> weiPaiXuDeZiFuChuanJiHe){
        Collections.sort(weiPaiXuDeZiFuChuanJiHe);
        return weiPaiXuDeZiFuChuanJiHe;
    }

    //排序后再拼接字符串
    public static String ziDianPaiXuBingPinJie(List<String> weiPaiXuDeZiFuChuanJiHe){
        Collections.sort(weiPaiXuDeZiFuChuanJiHe);
        StringBuilder sb=new StringBuilder();
        for(String s:weiPaiXuDeZiFuChuanJiHe){
            sb.append(s);
        }
        return sb.toString();
    }






    public static void fuckIt(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {

        }
    }

    /**
     *线程休眠
     * */
    public static void sleep(long haoMiao) {
        try {
            Thread.sleep(haoMiao);
        } catch (InterruptedException e) {

        }
    }

//    public static void main(String[]args){
//        p.p("-------------------------------------------------------");
//        p.p(digitUpper(0.01));//打印  壹分
//        p.p("-------------------------------------------------------");
//    }

    /**
     * 数字金额大写转换
     * //只能精确到分
     * 异常的时候返回空
     */
    public static String digitUpper(double n) {
        try {
            String fraction[] = { "角", "分" };
            String digit[] = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
            String unit[][] = { { "元", "万", "亿" }, { "", "拾", "佰", "仟" } };

            String head = n < 0 ? "负" : "";
            n = Math.abs(n);

            String s = "";
            for (int i = 0; i < fraction.length; i++) {
                s += (digit[(int) (Math.floor(n * 10 * Math.pow(10, i)) % 10)] + fraction[i]).replaceAll("(零.)+", "");
            }
            if (s.length() < 1) {
                s = "整";
            }
            int integerPart = (int) Math.floor(n);

            for (int i = 0; i < unit[0].length && integerPart > 0; i++) {
                String p = "";
                for (int j = 0; j < unit[1].length && n > 0; j++) {
                    p = digit[integerPart % 10] + unit[1][j] + p;
                    integerPart = integerPart / 10;
                }
                s = p.replaceAll("(零.)*零$", "").replaceAll("^$", "零") + unit[0][i] + s;
            }
            return head + s.replaceAll("(零.)*零元", "元").replaceFirst("(零.)+", "").replaceAll("(零.)+", "零").replaceAll("^整$", "零元整");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }
    /**
     *封装三目运算符号
     * */
    public static Object sm(boolean condition,Object trueIt,Object falseIt){

        return condition?trueIt:falseIt;

    }
    public static String sm(boolean condition,String trueIt,String falseIt){

        return condition?trueIt:falseIt;

    }
    public static int sm(boolean condition,int trueIt,int falseIt){

        return condition?trueIt:falseIt;

    }
    public static Integer  sm(boolean condition,Integer trueIt,Integer falseIt){

        return condition?trueIt:falseIt;

    }
    public static Double  sm(boolean condition,Double trueIt,Double falseIt){

        return condition?trueIt:falseIt;

    }
    public static double  sm(boolean condition,double trueIt,double falseIt){

        return condition?trueIt:falseIt;

    }
    public static float  sm(boolean condition,float trueIt,float falseIt){

        return condition?trueIt:falseIt;

    }
    public static Float  sm(boolean condition,Float trueIt,Float falseIt){

        return condition?trueIt:falseIt;

    }
    public static BigDecimal  sm(boolean condition,BigDecimal trueIt,BigDecimal falseIt){

        return condition?trueIt:falseIt;

    }
    public static Long  sm(boolean condition,Long trueIt,Long falseIt){

        return condition?trueIt:falseIt;

    }
    public static long  sm(boolean condition,long trueIt,long falseIt){

        return condition?trueIt:falseIt;

    }
    public static short  sm(boolean condition,short trueIt,short falseIt){

        return condition?trueIt:falseIt;

    }
    public static Short  sm(boolean condition,Short trueIt,Short falseIt){

        return condition?trueIt:falseIt;

    }
    /**
     *封装三目运算符号英文名字
     * */
    public static Object threeEyeCalculate(boolean condition,Object trueIt,Object falseIt){

        return condition?trueIt:falseIt;

    }
    public static String threeEyeCalculate(boolean condition,String trueIt,String falseIt){

        return condition?trueIt:falseIt;

    }
    public static int threeEyeCalculate(boolean condition,int trueIt,int falseIt){

        return condition?trueIt:falseIt;

    }
    public static Integer  threeEyeCalculate(boolean condition,Integer trueIt,Integer falseIt){

        return condition?trueIt:falseIt;

    }
    public static Double  threeEyeCalculate(boolean condition,Double trueIt,Double falseIt){

        return condition?trueIt:falseIt;

    }
    public static double  threeEyeCalculate(boolean condition,double trueIt,double falseIt){

        return condition?trueIt:falseIt;

    }
    public static float  threeEyeCalculate(boolean condition,float trueIt,float falseIt){

        return condition?trueIt:falseIt;

    }
    public static Float  threeEyeCalculate(boolean condition,Float trueIt,Float falseIt){

        return condition?trueIt:falseIt;

    }
    public static BigDecimal  threeEyeCalculate(boolean condition,BigDecimal trueIt,BigDecimal falseIt){

        return condition?trueIt:falseIt;

    }
    public static Long  threeEyeCalculate(boolean condition,Long trueIt,Long falseIt){

        return condition?trueIt:falseIt;

    }
    public static long  threeEyeCalculate(boolean condition,long trueIt,long falseIt){

        return condition?trueIt:falseIt;

    }
    public static short  threeEyeCalculate(boolean condition,short trueIt,short falseIt){

        return condition?trueIt:falseIt;

    }
    public static Short  threeEyeCalculate(boolean condition,Short trueIt,Short falseIt){

        return condition?trueIt:falseIt;

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *url传参拼接,
     * 参数放入map就行了
     *
     * www.baidu.com?key1=value1&key2=value2;
     * */

    public static String urlJoinParams(String url,Map<String,String>params){

        url=url+"?";
        for(String key:params.keySet()){
           String value=params.get(key);
           url=url+(key+"="+value)+"&";
        }
        if(url.lastIndexOf("&")==url.length()-1){
           url= url.substring(0,url.lastIndexOf("&"));
        }
        try {
            url= URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            String s="-----------------------------------";
            s=s+"<< when  p.urlJoinParams encode a url, have a Exception like [UnsupportedEncodingException]   >>"+s;
            throw new RuntimeException(s);
        }
        return url;
    }



//    public static void main(String[]args) throws UnsupportedEncodingException {
//        Map<String,String>params=new LinkedHashMap<>();
//        params.put("hanhan","23");
//        params.put("梦如","18");
//        p.p("-------------------------------------------------------");
//        p.p(urlJoinParams("www.baidu.com",params));
//        p.p("-------------------------------------------------------");
//        p.p("-------------------------------------------------------");
//        p.p(URLDecoder.decode(urlJoinParams("www.baidu.com",params),"UTF-8"));
//        p.p("-------------------------------------------------------");
//    }



/**
 *去掉文件名中 字符串中 的路径特殊符号
 * 比如
 * #   影响访问路径
 * ?   影响 路径跟参数
 * &   路径分隔符
 * =   路径参数等号符号
 * * */

    /**
     * 这里参数str指的是文件名
     *这个是路径中绝对不能有的符号去除
     * */
    public  static String delNotPath(String fileName){
        if(null==fileName){
            return fileName;
        }else{
            return fileName.replace("#","_jh_")
                    .replace("?","_wh_")
                    .replace("&","_bq_")
                    .replace("=","_dy_");
        }
    }

    /**
     * 这里参数str指的是文件名
     *加强到sqlServer不能模糊查询要去掉  [   和   ]
     *
     * */

    public  static String delNotPathNotSql(String fileName){
        if(null==fileName){
            return fileName;
        }else{
            return fileName.replace("#","_jh_")
                    .replace("?","_wh_")
                    .replace("&","_bq_")
                    .replace("=","_dy_")
                    .replace("[","_zzkh_")
                    .replace("]","_yzkh_");
        }
    }


    /**
     * 这里参数str指的是文件名
     *加强到sqlServer不能模糊查询要去掉  [   和   ]
     *并且加强到我常用的  !  做分隔符号要去掉
     * !  一般做路径和唯一id分隔
     * ;  一般做2个路径之间的分隔
     * */

    public  static String delNotPathNotSqlNotSplit(String fileName){
        if(null==fileName){
            return fileName;
        }else{
            return fileName.replace("#","_jh_")
                    .replace("?","_wh_")
                    .replace("&","_bq_")
                    .replace("=","_dy_")
                    .replace("[","_zzkh_")
                    .replace("]","_yzkh_")
                    .replace("!","_gth_")
                    .replace(";","_fh_");
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////
}

