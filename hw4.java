package Session3;

public class hw4 {
    public static void main(String[] args) {
        int number = 1;
        boolean match = false;
        while(!match){
            if (number%5==0 && number%7==0&&number%11==0){
                match=true;
                System.out.println("Số nguyên nhỏ nhất chia hết cho 5,7,11 là: "+number);
            }number++;
        }
    }
}
