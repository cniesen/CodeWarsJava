import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persist {
    public static int persistence(long n) {
        int result = 0;

        List<Integer> integerList = convertLongToIntegerList(n);

        while (integerList.size() > 1) {
            result++;
            integerList = convertLongToIntegerList(multiplyIntegerList(integerList));
        }

        return result;
    }

    private static List<Integer> convertLongToIntegerList(long n) {
        return Arrays.stream(Long.toString(n).split("")).mapToInt((Integer::parseInt)).boxed().collect(Collectors.toList());
    }

    private static long multiplyIntegerList(List<Integer> integerList) {
        return integerList.stream().mapToLong(i -> i).reduce(1, Math::multiplyExact);
    }
}