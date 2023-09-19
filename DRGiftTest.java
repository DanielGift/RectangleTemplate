public class DRGiftTest{
    public static void main(String[] args) {
        //Sample rectangles created
        Rectangle r = new Rectangle(5, 3);
        Rectangle s = new Rectangle(2);
        Rectangle u = new Rectangle();
        Rectangle test1 = new Rectangle(45, 12);
        System.out.println("Is 5x3 a square? " + r.isSquare());
        System.out.println("Is 2x2 a square? " + s.isSquare());
        System.out.println("Is 1x1 a square? " + u.isSquare());
        System.out.println("Is 45x12 a square? " + test1.isSquare());
        r.quadratize();
        System.out.println("Is quadratized 5x3 a square? " + r.isSquare());
        test1.quadratize();
        System.out.println("Is quadratized 45x12 a square? " + test1.isSquare());
    }
}
