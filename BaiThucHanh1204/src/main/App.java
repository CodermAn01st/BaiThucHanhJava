package main;
import shapes.HinhChuNhat;
import shapes.HinhTru;
import shapes.HinhTron;
import shapes.HinhVuong;

public class App {
  public static void main(String[] args) {
    HinhTron hinhTron = new HinhTron();
    hinhTron.xuatTen();
    hinhTron.nhapBanKinh();
    hinhTron.tinhChuVi();
    hinhTron.tinhDienTich();
    hinhTron.inchuVi();
    hinhTron.inDienTich();

    HinhTru hinhTru = new HinhTru();
    hinhTru.xuatTen();
    hinhTru.nhapChieuCao();
    hinhTru.tinhTheTich();
    hinhTru.inTheTich();

    HinhChuNhat hinhChuNhat = new HinhChuNhat();
    hinhChuNhat.xuatTen();
    hinhChuNhat.nhapChieuDai();
    hinhChuNhat.nhapchieuRong();
    hinhChuNhat.tinhChuVi();
    hinhChuNhat.tinhDienTich();
    hinhChuNhat.inchuVi();
    hinhChuNhat.inDienTich();

    HinhVuong ht = new HinhVuong();
    ht.xuatTen();
    ht.nhapCanh();
    ht.tinhChuVi();
    ht.tinhDienTich();
    ht.inchuVi();
    ht.inDienTich();
  }
}