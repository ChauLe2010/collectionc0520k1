package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class DanhSachHocVien {
    ArrayList<HocVien> dsHocvien=new ArrayList();
    //ArrayList<HocVien> dsHocvien1=new ArrayList<>();
    public void inputList(){
        dsHocvien.add(new HocVien(1,"Dung"));
        dsHocvien.add(new HocVien(2,"Vinh"));
        dsHocvien.add(new HocVien(3,"Binh"));
    }
    public void display(){
        Iterator<HocVien> iterator=dsHocvien.iterator();
        while(iterator.hasNext()){
            iterator.next().display();
        }
    }
}
