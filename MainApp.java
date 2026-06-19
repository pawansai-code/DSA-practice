public class MainApp {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, -22, 0};
        Solution solution = new Solution();
        int count = solution.findNumbers(nums);
        System.out.println("Count of numbers with an even number of digits: " + count);
    }
}
