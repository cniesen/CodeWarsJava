public class BitMarchArray {

    public static int[][] BitMarch(int n) {
        int leadingZeros = 8 - n;
        int[][] result = new int[leadingZeros + 1][];

        for (int i = 0; i < leadingZeros + 1; i++) {
            result[i] = getByte(n, i);
        }

        return result;
    }

    private static int[] getByte(int bits, int position) {
        int[] result = new int[8];
        int leadingZeros = 8 - bits - position;
        int tailingZeros = 8 - bits - leadingZeros;
        int i = 0;
        for (int j = 0; j < leadingZeros; j++) {
            result[i] = 0;
            i++;
        }
        for (int j = 0; j < bits; j++) {
            result[i] = 1;
            i++;
        }
        for (int j = 0; j < tailingZeros; j++) {
            result[i] = 0;
            i++;
        }
        return result;
    }
}
