package Session2;

import java.util.Scanner;

public class Session2_hw_baitonghop {
    public static void main(String[] args) {
        /*
        * 1.Nhập 1 số nguyên từ bàn phím
        * 2. Hiển thi menu và thực hiện các chức năng
        * *****************************MENU**************************
        * 1.Kiểm tra chẵn/lẻ
        * 2. Kiểm tra số nguyên tố
        * 3. Tính tổng các ước của số nguyên
        * 4.Kiểm tra số hoàn hảo
        * 5. Thoát
        *
        * */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hãy nhập 1 số nguyên");
        int number = Integer.parseInt(scanner.nextLine());
        //In menu
        do{
            System.out.println("*******MENU*******");
            System.out.println("1.Kiểm tra chẵn lẻ");
            System.out.println("2.Kiểm tra số nguyên tố");
            System.out.println("3.Tính tổng các ước số nguyên");
            System.out.println("4. Kiếm tra số hoàn hảo");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn của bạn là gì:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Bạn vừa chọn chức năng kiểm tra chẵn lẻ");
                    if (number%2==0){
                        System.out.println("Kết quả: số bạn vừa nhập là số chẵn");
                    }else{
                        System.out.println("Kết quả: số bạn vừa nhập là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn chức năng kiểm tra số nguyên tố");
                    boolean isPrime = true;
                    if(number<=1){
                        isPrime=false;
                    }else {
                      for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number%i==0){
                            isPrime= false;
                            break;
                        }

                      }
                    }
                    if (isPrime) {
                        System.out.println(number + " là số nguyên tố.");
                    } else {
                        System.out.println(number + " không phải là số nguyên tố.");
                    }

                    break;
                case 3:
                    System.out.println("Bạn vừa chọn chức năng tính tổng các ước số nguyên");
                    int sum =0;
                    for (int i = 1; i <number ; i++) {
                        if (number%i==0){
                        sum+=i;
                        }
                    }
                    System.out.println("Tổng các ước của "+number+"là:"+sum);
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn chức năng kiểm tra số hoàn hảo");
                    int sumToCheckPerfectNumber =0;
                    for (int j = 1; j <number ; j++) {
                        if (number%j==0){
                            sumToCheckPerfectNumber+=j;
                            }
                        }if (sumToCheckPerfectNumber==number){
                    System.out.println("Số bạn nhập là số hoàn hảo");
                    }else {
                    System.out.println("Số bạn nhập không phải số hoàn hảo");
                    }
                    break;
                case 5:
                    System.out.println("Bạn chọn thoát nên chương trình kết thúc");
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chỉ chọn từ 1 đến 5");

            }
        }while (true);
    }
}
