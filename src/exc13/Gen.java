package exc13;

public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.print("Метод getob() из класса Gen: ");
        return ob;
    }
}
