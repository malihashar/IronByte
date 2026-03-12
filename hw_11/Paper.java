public class Paper {

    public static void main(String[] args) {
        double area = 1.0;        
        double thickness = 0.090; 

        for (int i = 1; i <= 40; i++) {
            area = area / 2.0;
            thickness = thickness * 2.0;
        }

        System.out.println("After 40 times:");
        System.out.println("Thickness of the pile: " + thickness + " mm");
        System.out.println("Thickness in meters: " + (thickness / 1000.0) + " m");
        System.out.println("Area of each piece: " + area + " square meters");
    }
}
