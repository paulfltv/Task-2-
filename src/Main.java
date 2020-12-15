public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 4444;
        int bonus = refill / 100;
        int rest = balance + refill;
        if (refill >= 1100) {
            rest = balance + refill + refill / 100;
        } else {
            rest = balance + refill;
        }
        System.out.println(rest);
    }
}