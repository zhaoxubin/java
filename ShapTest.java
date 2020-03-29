
interface IShape{
    void draw();
}
class Cyle implements IShape {
    @Override
    public void draw(){
        System.out.println("⭕");
    }
}
class Square implements IShape{
    @Override
    public void draw(){
        System.out.println("▲");
    }
}
public class ShapTest {
    public static void main(String[] args) {
        IShape shap = new Cyle();
        shap.draw();
        IShape shap1 = new Square();
        shap1.draw();
    }
}