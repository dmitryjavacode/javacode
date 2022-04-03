public class Container {
    private Integer count; // По умолчанию было null.

    public Container() {
        this.count = 0;
    }

    public Container(Integer count) {
        this.count = count;
    }

    // Так же сработает.
//    public Container(int count) {
//        this.count = count;
//    }

    public void addCount(int value) {
        count = count + value;
    }
    public int getCount() {
        return count;
    }
}
