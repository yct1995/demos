import java.util.ArrayList;

public class Test {
    //定义静态变量：psf
    public static final int NUM = 1;
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*注释*/
        String str = "123";
        //输出变量快捷键：soutv或者xxx.sout
        System.out.println("str = " + str);
        //ctrl+u相当于eclipse的ctrl+shift+I，查看当前断点的详细内容
        //soutm,打印方法名
        System.out.println("Test.main");
        //for循环：fori
        String[] arr = new String[]{"貂蝉","杨贵妃","昭君","西施"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("美女" + i + " = " + arr[i]);
        }
        //增强for循环:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //正序遍历list.for或list.fori
        ArrayList<String> list = new ArrayList<String>();
        list.add("刘备");
        list.add("关羽");
        list.add("张飞");
        //倒序遍历:list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        //判断==null：ifn或xx.null
        //判断!=null：inn或xx.nn
    }

    public String demo(String str){
        String str1;
        str1 = str;
        return str1;
    }
}
