public class pizzaBillGenerator{
    public static void main(String args[]){
        // Pizza basePizza= new Pizza(false);
        // basePizza.addExtraToppings();
        // basePizza.addExtraCheese();
        // basePizza.getBill();
        
        DeluxPizza dp= new DeluxPizza(true);
        // dp.addExtraCheese();
        dp.takeAway();
        dp.getBill();
        
    }
}
class Pizza{
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice= 150;
    private int takeAwayPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;
    public Pizza(Boolean veg){
        this.veg= veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice= this.price;
    }
    public void getPizzaPrice(){
        System.out.print(this.price);
    }
    public void addExtraCheese(){
        isExtraCheeseAdded= true;
        this.price+=extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded= true;
        this.price+=extraToppingsPrice;
    }
    public void takeAway(){
        isOptedForTakeAway= true;
        this.price+=takeAwayPrice;
    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+= "Extra Cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill+= "Extra toppings  added: "+extraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill+= "Take away: "+takeAwayPrice+"\n";
        }
        bill+= "Bill: "+this.price+"\n";
        System.out.println(bill);
    }
    
}
class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    
    @Override
    public void addExtraCheese(){}
    public void addExtraToppings(){}
    
}
