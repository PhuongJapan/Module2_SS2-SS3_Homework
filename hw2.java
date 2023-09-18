package Session3;

public class hw2 {
    public static void main(String[] args) {
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên");
        int count = 0;
        int number=2;
        while(count<20){
            boolean isPrime= true;
            for (int i = 2; i <=Math.sqrt(number) ; i++) {
                if (number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(number + " ");
                count++;
            }number++;
        }
    }
}
