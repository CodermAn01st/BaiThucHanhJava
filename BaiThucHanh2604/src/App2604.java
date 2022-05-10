import Shape.Point;
import Shape.Triangle;
import Shape.Quadrilateral;
public class App2604 {
    public static void main(String[] args) throws Exception {
        
        Point p = new Point();
        p.nhaptenDiem();
        p.nhapHoanhDo();
        p.nhapTungDo();
        p.inDiem();
        Triangle A = new Triangle();
        Triangle B = new Triangle();
        Triangle C = new Triangle();
        A.nhapToaDo();
        A.tinhDoDai();

        B.nhapToaDo();
        B.tinhDoDai();

        C.nhapToaDo();
        C.tinhDoDai();

        Quadrilateral q = new Quadrilateral();
        q.nhapToaDo();
        q.dodaiCanh();
        q.kiemTraTuGiac();
        q.kiemTraLoaiTuGiac();
}
}