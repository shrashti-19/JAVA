public class Main{
    public static void main(String args[]){
        Portfolios portfolio = new Portfolios();

        try{
            
            portfolio.addTrade("TCS", 1500, 10, "buy");
            portfolio.addTrade("TCS", 2500, 10, "buy");
            portfolio.addTrade("TCS", 1800, 20, "sell");


            System.out.println("Holdings: ");
            System.out.println(portfolio.fetchHoldings());

            System.out.println("Returns: ");
            System.out.println(portfolio.fetchReturnFormatted());

        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}