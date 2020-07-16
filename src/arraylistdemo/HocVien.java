package arraylistdemo;

public class HocVien {
    private int mahv;
    private String tenhv;

    public HocVien(int mahv, String tenhv) {
        this.mahv = mahv;
        this.tenhv = tenhv;
    }

    public int getMahv() {
        return mahv;
    }

    public void setMahv(int mahv) {
        this.mahv = mahv;
    }

    public String getTenhv() {
        return tenhv;
    }

    public void setTenhv(String tenhv) {
        this.tenhv = tenhv;
    }

//    @Override
//    public String toString() {
//        return this.mahv+"-"+this.tenhv;
//    }
    public void display(){
        System.out.println(this.mahv+"-"+this.tenhv);
    }
}
