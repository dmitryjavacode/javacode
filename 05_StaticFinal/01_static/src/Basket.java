public class Basket {

    private static int count = 0;
    private String items;
    private int totalPrice = 0; // Общая стоимость товаров в корзине
    private int totalCount = 0; // Кол-во товаров в корзине
    private int limit;
    private double totalWeight = 0;
    private static int allBasketPrice = 0; // Общая стоимость товаров во всех корзинах
    private static int allBasketItems = 0; // Кол-во товаров во всех крозинах

    public Basket() {
        increaseCount(1);
        items = "Список товаров: \n";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
//        increaseAllBasketPrice(totalPrice);
//        increaseAllBasketItems(1);
//        totalCount = totalCount + 1;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public static int getCount() {
        return count;
    }

    public static int getAllBasketPrice() {
        return allBasketPrice;
    }

    public static int getAllBasketItems() {
        return allBasketItems;
    }

    public static void increaseCount(int count) { // Подсчет корзин
        Basket.count = Basket.count + count;
    }

    public static void increaseAllBasketPrice(int allBasketPrice) { // Подсчета общей стоимости товаров во всех корзинах
        Basket.allBasketPrice = Basket.allBasketPrice + allBasketPrice;
    }

    public static void increaseAllBasketItems(int allBasketItems) { // Подсчет общего кол-ва товаров во всех корзинах
        Basket.allBasketItems = Basket.allBasketItems + allBasketItems;
    }

    public static int averagePrice() {
        return Basket.allBasketPrice / Basket.allBasketItems;
    }

    public static int averageBasketPrice() {
        return Basket.allBasketPrice / Basket.count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalCount = totalCount + count;
        increaseAllBasketItems(count);
        totalPrice = totalPrice + count * price;
        increaseAllBasketPrice(count * price);
        totalWeight = totalWeight + count * weight;
    }

    public void clear() {
        items = "";
        allBasketPrice = allBasketPrice - totalPrice;
        allBasketItems = allBasketItems - totalCount;
        totalCount = 0;
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста \n");
        } else {
            System.out.println(items + "\n");
        }

    }
}