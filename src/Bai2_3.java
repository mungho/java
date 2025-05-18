public class Bai2_3 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            int result = 2;
            for (int k = 2; k < i; k++) {
                if (i%k == 0) {
                    check = false;
                    break;
                }
                result = i;
            }
            if (check == true) {
                System.out.println(result);
            }
        }
    }
}
