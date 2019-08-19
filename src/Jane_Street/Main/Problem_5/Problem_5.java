package Jane_Street.Main.Problem_5;

/**
 * This problem was asked by Jane Street.
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last
 * element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 *
 * Given this implementation of cons:
 *
 * def cons(a, b):
 *     def pair(f):
 *         return f(a, b)
 *     return pair
 *
 * Implement car and cdr.
 */
public class Problem_5 {

    private static Car<Object> car;
    private static Cdr<Object> cdr;
    private static Cons<Object> consInt;

    public static void main(String[] args) {

        car = new Car<Object>();
        cdr = new Cdr<Object>();

        consInt = new Cons<Object>(3, 4);

        System.out.println(car.car(consInt));
        System.out.println(cdr.cdr(consInt));
    }
}

