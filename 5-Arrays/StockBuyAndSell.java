import java.util.Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 4, 5, 6, 8, 4, 2 };
        int maxProfit = 0;
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minElement = Math.min(minElement, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minElement);
        }
        System.out.println(maxProfit);

        // with proper detail of day
        int startIndex = -1;
        int endIndex = -1;
        int maximumProfit = 0;
        int minimumElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimumElement) {
                startIndex = i;
                minimumElement = arr[i];
            }
            if (arr[i] - minimumElement > maximumProfit) {
                endIndex = i;
                maximumProfit = arr[i] - minimumElement;
            }
        }
        System.out.println(Arrays.asList(maximumProfit, startIndex + 1, endIndex + 1));
        // {maxProfit, buying Date, selling date}

    }
}
