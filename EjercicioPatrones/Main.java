public class Main {
    public static void main(String[] args) {
        RestaurantFactoryProducer factory = new RestaurantFactoryProducer();
        RestaurantAbstractFactory r1 = factory.getRestaurantAbstractFactory(1);
        FastFood myOrder = r1.getFastFood("hamburger");
        if(myOrder==null)
        {
            System.out.println("Your order is not in the menu");
        }
        Drink myDrink = r1.getDrink("beer");
        if(myDrink==null)
        {
            System.out.println("Your drink is not in the menu");
        }
    }
    
}