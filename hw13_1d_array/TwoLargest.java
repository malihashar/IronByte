import java.util.Random;

public class TwoLargest {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
        }

        int gv = nums[0];
        int sgv = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > gv) {
                sgv = gv;
                gv = nums[i];
            } else if (nums[i] > sgv) {
                sgv = nums[i];
            }
        }

        System.out.println("Array values:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Largest (gv): " + gv);
        System.out.println("Second largest (sgv): " + sgv);
    }
}
