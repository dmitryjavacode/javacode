public class Printer {
    private String queue = "";
    private int count = 0;
    private static int pagesCount = 0;
    private int countNum = 0;


    public void append(String text){
        append(text, "nonamedoc", 1);
    }

    public void append(String text, String name){
        append(text, name, 1);
    }

    public void append(String text, String name, int count){
        queue = queue +
                "\nНазвание: " + name +
                "\nСодержимое:\n" + text +
                "\nКол-во экземпляров: " + count + "\n";
        this.count = this.count + count;
        pagesCount = pagesCount + count;
    }

    public void clear(){
        queue = "";
    }

    public static int getPendingPagesCount(){
        return pagesCount;
    }


    public int getCountNum(){
        return countNum;
    }

    public void print(){
        if(!queue.isEmpty()) {
            System.out.println(queue);
            System.out.println("Кол-во страниц отправленных на печать: " + count + "\n");
            countNum = countNum + count;
            pagesCount = pagesCount - count;
            System.out.println("Кол-во страниц и12341234: " + count);
            clear();
            System.out.println("Кол-во страниц в очереди печати: " + pagesCount);
        } else {
            System.out.println("\nОчередь печати пуста");
        }
    }
}
