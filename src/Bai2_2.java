public class Bai2_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count <= 20; i++) {
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
                count++;
            }
        }
    }
}
