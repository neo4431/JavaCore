public class Circle extends Shape implements ICircle{
    private double r;
    
    public Circle(double r) {
        this.r = r;
    }
    
    public Circle() {
    }
    
    @Override
    public double tinhChuVi() {
        // TODO Auto-generated method stub
        return r * r * 3.14;
    }
    
    @Override
    public double tinhDienTich() {
        // TODO Auto-generated method stub
        return 2 * r * 3.14;
    }
    @Override
    public double tinhDuongKinh() {
        // TODO Auto-generated method stub
        return 2 * r;
    }
    
    public double getR() {
        return r;
    }
    
    public void setR(double r) {
        this.r = r;
    }
    
}
