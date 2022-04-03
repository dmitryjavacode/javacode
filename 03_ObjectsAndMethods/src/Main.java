public class Main {

    public static void main(String[] args) {
//        Basket basket = new Basket();
//        basket.add("Milk", 40);
//        basket.print("Milk");
//        basket.add("Eggs", 50, 3, 60);
//        basket.add("Phone", 200, 1);
//        basket.add("7up", 30);
//        basket.print("Milk");
//        System.out.println("Общая стоимость товаров: " + basket.getTotalPrice());
//        System.out.println("Общий вес товаров: " + basket.getTotalWeight());
//        System.out.println("Товаров всего: " + Basket.getCount());
//        System.out.println();
//
//
//        Arithmetic ress = new Arithmetic(2,6);
//        System.out.println("Сумма чисел: " + ress.sumNumber());
//        System.out.println("Произведение чисел: " + ress.multiplicationNumber());
//        System.out.println("Максимальное число: " + ress.maxNumber());
//        System.out.println("Минимальное число: " + ress.minNumber());
//        System.out.println();

        Printer doc1 = new Printer();
        doc1.append("doc1 Document1 text");
        doc1.append("doc1 Document2 text", "Второй документ");
        doc1.append("doc1 Document3 text", "Третий документ", 5);
        Printer doc2 = new Printer();
        doc2.append("doc2 Document1 text", "Первый документ", 12);
        doc2.append("doc2 Document2 text", "Второй документ", 5);
        doc2.append("doc2 Document3 text", "Третий документ", 4);
        doc1.print();
        doc2.print();
        System.out.println("Кол-во страниц распечатанных в обьекте doc1: " + doc1.getCountNum());
        System.out.println("Кол-во страниц распечатанных в обьекте doc2: " + doc2.getCountNum());
        System.out.println("PagesCount1 -- : " + Printer.getPendingPagesCount());
        doc1.append("doc2 Document1 text", "123Третий документ", 3);
        doc1.append("doc2 Document2 text", "456Третий документ", 4);
        doc2.append("doc2 Document3 text", "789Третий документ", 2);
        System.out.println("PagesCount2 -- : " + Printer.getPendingPagesCount());
        doc2.print();
        doc1.print();
        System.out.println("Кол-во страниц распечатанных в обьекте doc1: " + doc1.getCountNum());
        System.out.println("Кол-во страниц распечатанных в обьекте doc2: " + doc2.getCountNum());
        System.out.println("PagesCount3 -- : " + Printer.getPendingPagesCount());
    }
}
