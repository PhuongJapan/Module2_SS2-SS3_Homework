package Session3;

import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("Nhập cạnh a");
            double a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh b");
            double b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh c");
            double c = Integer.parseInt(scanner.nextLine());
            double p = (a+b+c)/2;
            double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

            if(a+b>c && a+c>b && b+c>a){
                System.out.println("Chu vi tam giác là: " + p*2);
                System.out.println("Diện tích tam giác là: "+area);
                break;
            }else {
                System.out.println("Các cạnh bạn nhập không phải là tam giác, vui lòng nhập lại");
            }
        }


    }
}
