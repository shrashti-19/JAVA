import java.util.*;

public class Portfolios{
    private Map<String, Security> holdings = new HashMap<>();
    private double current_price = 100.0;

    //adding trade
    public void addTrade(String ticker, double price, int quantity, String typeStr){
        if(ticker == null || ticker.isEmpty()){
            throw new IllegalArgumentException("Invalid ticker"); 
        }

        if(price<=0){
            throw new IllegalArgumentException("Price must be positive");
        }
        if(quantity<=0){
            throw new IllegalArgumentException("Quantity must be positive");
        }

        TradeType type;
        try{
            type = TradeType.valueOf(typeStr.toUpperCase()); //BUY AND SELL
        }catch(Exception e){
            throw new IllegalArgumentException("Trade type must be BUY OR SELL");
        }

        ticker = ticker.toUpperCase();
        Security stock = holdings.get(ticker);

        if(type == TradeType.BUY){
            if(stock == null){
                holdings.put(ticker, new Security(ticker, price, quantity));
            }else{
                //some stocks are already present 
                stock.buy(price,quantity);
            }
        }else{
            if(stock == null){
                throw new IllegalArgumentException("Can't sell unnamed stock: " + ticker);
            }
            //sell
            stock.sell(quantity);
            if(stock.getQuantity() == 0){
                holdings.remove(ticker);
            }
        }

    }

    //fetching holdings
    public String fetchHoldings(){
        StringBuilder sb = new StringBuilder();
        for(Security s : holdings.values()){
            sb.append(s.getTicker())
              .append(": ")
              .append(s.getQuantity())
              .append(" @Rs.")
              .append(String.format("%.2f", s.getAveragePrice()))
              .append("\n");
              
        }

        return sb.toString().trim();
    }

    //fetching returns
    public double fetchReturns(){
        double total = 0.0;
        for(Security s: holdings.values()){
            total += (current_price - s.getAveragePrice())*s.getQuantity();
        }
        return total;
    }

    public String fetchReturnFormatted(){
        return "Rs." + String.format("%.2f", fetchReturns());
    }

}