package prob3;

import java.util.Scanner;

public class Prob3 {
   
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("숫자를 입력하세요: ");
      int num = scanner.nextInt();
      if(num%2==1) {
         int temp=0;
         for(int i=1;i<=num;i+=2) {
            temp+=i;
         }
         num=temp;
      }
      else {
         int temp=0;
         for(int i=2;i<=num;i+=2) {
            temp+=i;
         }
         num=temp;
      }
      System.out.println("결과 값 : "+num);
      
      scanner.close();
   }
}