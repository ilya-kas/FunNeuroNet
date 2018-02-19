public class result {
    public static void main(String[] args) {
        neuro0 n0 = new neuro0();
        neuro1 n1 = new neuro1();
        double ans1 = n1.main(null);
        double ans0 = n0.main(null);
        if (ans1>ans0) {
            System.out.print('1');
        }
        else{
            System.out.print('0');
        }
    }
}
