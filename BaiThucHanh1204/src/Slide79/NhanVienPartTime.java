package Slide79;

public class NhanVienPartTime {
  public NhanVienPartTime(String string, int i) {
  }

  public class NhanVienFullTime  extends NhanVien{
    private int gioLamViec;
    public  NhanVienFullTime(String ten, int gioLamViec) {
      this.ten=ten;
      this.gioLamViec = gioLamViec;
    } 
    public String loaiNhanVien() {
      return "Nhan vien thoi vu";
    }
    public void tinhLuong() {
      luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}

  public void tinhLuong() {
  }

  public void xuatThongTin() {
  }
}
