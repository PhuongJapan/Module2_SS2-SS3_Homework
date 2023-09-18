package Session3;

public class hw3 {
    public static void main(String[] args) {
        System.out.println("Hiển thị số nguyên tố nhỏ hơn 100");
        boolean isPrime;
        for (int i = 2; i < 100; i++) {
            isPrime=true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
