public class shortest_path {
    public static double shortestPath(String str) {  // O(n)
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E')
                x++;
            if (str.charAt(i) == 'W')
                x--;
            if (str.charAt(i) == 'N')
                y++;
            if (str.charAt(i) == 'S')
                y--;
        }
        double path = Math.sqrt((x * x) + (y * y));
        return path;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
