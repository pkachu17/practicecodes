class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // sort the cars by position in ascending order
        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new int[] { position[i], speed[i] };
        }
        Arrays.sort(cars, (a, b) -> a[0] - b[0]);

        // calculate the time it takes for each car to reach the target
        double[] times = new double[position.length];
        for (int i = 0; i < position.length; i++) {
            int pos = cars[i][0];
            int speed1 = cars[i][1];
            times[i] = (double)(target - pos) / speed1;
        }

        // count the number of car fleets
        int count = 0;
        double maxTime = 0;
        for (int i = position.length - 1; i >= 0; i--) {
            if (times[i] > maxTime) {
                count++;
                maxTime = times[i];
            }
        }
        return count;
    }
}
