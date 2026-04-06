class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
       Set<String> set = new HashSet<>();
        for (int[] o : obstacles) {
            set.add(o[0] + "," + o[1]);
        }
        int x = 0, y = 0;
        int dx = 0, dy = 1; 
        int maxDist = 0;
        for (int cmd : commands) {

            if (cmd == -1) { 
                int temp = dx;
                dx = dy;
                dy = -temp;
            } 
            else if (cmd == -2) { 
                int temp = dx;
                dx = -dy;
                dy = temp;
            } 
            else {
                for (int i = 0; i < cmd; i++) {
                    int nx = x + dx;
                    int ny = y + dy;

                    if (set.contains(nx + "," + ny)) break;

                    x = nx;
                    y = ny;
                    maxDist = Math.max(maxDist, x*x + y*y);

                    
                }
            }
        }
        return maxDist;

    }
}