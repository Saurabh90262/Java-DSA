public class buyAndSell_Stocks {
    public static int buyAndSellStocks(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        int prices[] = { 1, 5, 2, 3, 1 };
        int prices1[] = { 10, 1, 3, 8, 2, 6, 9 };
        System.out.println(buyAndSellStocks(prices));
        System.out.println(buyAndSellStocks(prices1));
    }
}

// Time Complexity of this code is : O(n)
