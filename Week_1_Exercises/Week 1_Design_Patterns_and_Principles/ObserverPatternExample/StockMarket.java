import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockName;
    private double price;

    public StockMarket(String stockName, double price) {
        this.observers = new ArrayList<>();
        this.stockName = stockName;
        this.price = price;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockName, double price) {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(stockName, price);
    }
}