public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("ABC Inc.", 100.0);

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(120.0);

        stockMarket.deregisterObserver(webApp);

        stockMarket.setPrice(130.0);
    }
}