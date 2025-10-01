public class trapping_rainWater {
    public static int trappedWater(int height[]) {
        int n = height.length;

        // calculate the left-max height

        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // calculate the right-max height

        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // water level = min(leftmax bound,rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water = water level - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedWater(height));
        // Time complexity is Linear that is = O(n)
    }
}
