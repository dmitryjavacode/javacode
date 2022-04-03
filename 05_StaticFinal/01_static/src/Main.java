public class Main {
    public static void main(String[] args){
//        Basket basket = new Basket("товары", 200);
        Basket basket = new Basket();
        basket.add("Хлеб", 50, 3);
        basket.add("Молоко", 100);
        basket.print("Корзина1");

//        Basket basket2 = new Basket("товары2", 300);
        Basket basket2 = new Basket();
        basket2.add("Пироги", 30, 5);
        basket2.add("Мука", 60);
        basket2.print("Корзина2");
        System.out.println("allBasketItems - " + Basket.getAllBasketItems());
        System.out.println("allBasketPrice - " + Basket.getAllBasketPrice());
        System.out.println("averageBasketPrice - " + Basket.averageBasketPrice());
        System.out.println("averagePrice - " + Basket.averagePrice());
        basket2.clear();
        System.out.println("allBasketItems - " + Basket.getAllBasketItems());
        System.out.println("allBasketPrice - " + Basket.getAllBasketPrice());

        //System.out.println(Basket.count);
    }
}