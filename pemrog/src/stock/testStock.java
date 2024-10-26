package stock;

public class testStock {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.previousClosingPrice = 34.5;
        oracle.currentPrice = 34.35;
        System.out.println("Symbol: " + oracle.symbol);
        System.out.println("Name: " + oracle.name);
        System.out.println("The price-change percentage formula A: " + oracle.getChangePercent());
        System.out.println("The price-change percentage formula B: " + oracle.getChangePercent2());
    }
}
