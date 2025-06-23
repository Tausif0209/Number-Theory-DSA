public class ManhattanDistance {
   public int maxDistance(String s, int k) {
    int max = 1;
    int north = 0, south = 0, east = 0, west = 0;
for (char ch : s.toCharArray()) {
    if (ch == 'N') north++;
    else if (ch == 'S') south++;
    else if (ch == 'E') east++;
    else west++;
    max = Math.max(max,
        Math.abs(north - south) + Math.abs(east - west) +
        Math.min(Math.min(north, south) + Math.min(east, west), k) * 2
    );
}return max;
    }
}
