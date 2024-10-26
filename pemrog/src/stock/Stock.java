package stock;

public class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public double getChangePercent2() {
        return ((currentPrice - previousClosingPrice) / (previousClosingPrice + currentPrice) * 2) * 100;
    }
}
