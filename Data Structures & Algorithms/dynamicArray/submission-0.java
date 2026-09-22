class DynamicArray {

    int myArr[];
    int length;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        myArr = new int[capacity];
    }

    public int get(int i) {
        return myArr[i];
    }

    public void set(int i, int n) {
        myArr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        myArr[length] = n;
        length++;
    }

    public int popback() {
        length--;
        return myArr[length];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < length; i++) {
            newArr[i] = myArr[i];
        }
        myArr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}