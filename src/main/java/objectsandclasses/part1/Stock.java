package objectsandclasses.part1;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice)/currentPrice) * 100;
    }

    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк", 281.50, 282.87);
        String result = String.format("%f %%", stock.getChangePercent());
        System.out.println(result);
    }
}
