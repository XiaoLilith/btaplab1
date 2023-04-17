import java.util.Scanner;
 
public class quanlysinhvien {
    private int mssv;
    private String hoTen;
    private String diaChi;
    private int sdt;
 
    
    public quanlysinhvien() {
 
    }
    //khởi tạo constructor có tham số
    public quanlysinhvien(int maSV, String hoten, String diaChi, String sTD) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    public int getmssv() {
        return mssv;
    }
 
    public void setMaSV(int mssv) {
        this.mssv = mssv;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoTen) {
        this.hoTen = hoten;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(int diaChi) {
        this.diaChi = diaChi;
    }
 
    public String getsdt() {
        return sdt;
    }
 
    public void setsdt(int sdt) {
        this.sdt = sdt;
    }
    @Override
    public String toString() {
        return "SinhVienNhap{" +
                "mssv=" + mssv +
                ", hoten='" + hoTen + ''' +
                ", diaChi='" + diaChi + ''' +
                ", sTD='" + sTD + ''' +
                '}';
                public void nhap(){
                    Scanner sc= new Scanner(System.in);
                    System.out.printf("Nhap ma svien");
                    mssv=sc.nextInt();
                    System.out.printf("Nhap ho ten");
                    hoTen=sc.nextLine();
                    System.out.printf("Nhap dia chi");
                    diaChi=sc.nextLine();
                    System.out.printf("nhap sdt");
                    sdt=sc.nextInt();

                }
    }