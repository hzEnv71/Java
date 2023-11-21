package study32线程;



import java.util.*;

//        线程安全类,由synchronized修饰
       /* StringBufferDemo
        Vector
        Hashtable*/

public class Thread0Demo {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        StringBuilder sb2=new StringBuilder();

        Vector<String> v=new Vector<>();
        ArrayList<String> al=new ArrayList<>();

       /* Hashtable<Key, Value> h=new Hashtable<>();
        HashMap<Key,Value> hm=new HashMap<>();*/
        Hashtable<String,String> h=new Hashtable<>();
        HashMap<String,String> hm=new HashMap<>();

//        static <T> List<T> synchronizedList(List<T> list) 返回由指定列表支持的同步（线程安全）列表。
        List<String> list= Collections.synchronizedList(new ArrayList<String>());
//        static <K,V> Map<K,V> synchronizedMap(Map<K,V> m) 返回由指定地图支持的同步（线程安全）映射。
        Map<String,String> m=Collections.synchronizedMap(new HashMap<String,String>());
    }
}
