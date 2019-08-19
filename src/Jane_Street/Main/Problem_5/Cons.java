package Jane_Street.Main.Problem_5;

public final class Cons<T> {

    T car;
    T cdr;

    public Cons(T car, T cdr) {
        this.car = car;
        this.cdr = cdr;
    }

    public T getCar() {
        return car;
    }

    public T getCdr() {
        return cdr;
    }
}
