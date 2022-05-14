import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // yil degiskeni yaratildi ve kullanicidan veri alindi.
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz: ");
        yil = input.nextInt();

        // artik bir yil olup olmadigi hesaplandi.
        //hesabi daha hassas hale getirmek icin 400'e kalansiz bolunebilse de 4000'e kalansiz bolunebilen yillar artik yil kabul edilmediler.
        // 4000, 8000 gibi yillar artik yil degildir.

        if ( ((yil%4==0 && yil%100!=0) || (yil%400==0)) && yil%4000!=0 ) {
            System.out.print(yil +" bir artik yildir!");
        } else {
            System.out.print(yil+" artik yil degildir!");
        }
    }
}
