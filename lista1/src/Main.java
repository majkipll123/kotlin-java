public class Main {
    public static void main(String[] args) {
        int x = 15015;
        zadanie1(x);
    }
    static void zadanie1(int x) {
        String zero = "";
        String trzy = "trzy";
        String piec = "piec";
        String siedem = "siedem";
        String jedenascie = "jedenascie";
        String trzynascie = "trzynascie";
        String pietnascie = "pietnascie";
        String dwadziesciajeden = "dwadziesciajeden";
        if (x % 3 == 0) {
            zero = zero + trzy;
        }
        if (x % 5 == 0) {
            zero = zero + piec;
        }
        if (x % 7 == 0) {
            zero = zero + siedem;
        }
        if (x % 11 == 0) {
            zero = zero + jedenascie;
        }
        if (x % 13 == 0) {
            zero = zero + trzynascie;
        }
        if (x % 15 == 0) {
            zero = zero + pietnascie;
        }
        if (x % 21 == 0) {
            zero = zero + dwadziesciajeden;
        }
        System.out.println(zero);
    }
}