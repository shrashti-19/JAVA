public class Security{
    private String ticker;
    private double averageBuyprice;
    private int quantity;

    //constructor
    public Security(String ticker, double averageBuyprice, int quantity){
        this.ticker = ticker;
        this.averageBuyprice = averageBuyprice;
        this.quantity = quantity;
    }

    //getting the ticker 
    public String getTicker(){
        return ticker;
    }

    //getting the price
    public double getAveragePrice(){
        return averageBuyprice;
    }

    public int getQuantity(){
        return quantity;
    }

    //buying the tickers
    // public void buy(double price, int qtys){
    //     double totalInvestment = ((this.averageBuyprice * this.quantity) + (price * qtys));
    //     this.quantity +=qtys;
    //     this.averageBuyprice = totalInvestment/this.quantity;
    // }
    public void buy(double price, int qtys) {
        double totalInvestment = (this.averageBuyprice * this.quantity) + (price * qtys);
        this.quantity += qtys;
        this.averageBuyprice = totalInvestment / this.quantity;
    }



    public void sell(int qty){
        if(qty > this.quantity){
            throw new IllegalArgumentException("Cannot sell more shared than owned for: " + ticker);
        }
        this.quantity-=qty;
    }

}