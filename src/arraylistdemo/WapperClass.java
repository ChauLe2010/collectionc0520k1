package arraylistdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WapperClass {
    public static void main(String[] args) {
        Set<String> set	=	new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New	York");
        set.add("San	Francisco");
        set.add("Beijing");
        set.add("New	York");
        set.add("London");
        System.out.println(set);
        for	(String	s:	set)	{
            System.out.print(s.toUpperCase()	+	"	");
        }


//        ArrayList list=new ArrayList();
//        list.add("Minh");
//        list.add("Hung");
//        list.add(10);
//        list.add(10.5);
//
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//        for (Object element:list) {
//            System.out.println(element);
//        }
//        Iterator iterator=list.iterator();
//
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
