public class Rectangle extends Shape implements IRectangle{
    private double length;
    private double width;
    
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double tinhChuVi() {
        // TODO Auto-generated method stub
        return (width + length) * 2;
    }
    
    @Override
    public double tinhDienTich() {
        // TODO Auto-generated method stub
        return width * length;
    }
    
    @Override
    public double tinhDuongCheo() {
        // TODO Auto-generated method stub
        return Math.sqrt((width * width) + (length * length));
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    
}
