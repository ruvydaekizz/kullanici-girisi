import java.util.Scanner;

public class User {
    public static void main(String[] args) {

          /*
        Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
        isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
        yazan programı yazınız.
         */

        Scanner input = new Scanner(System.in);

        String userName, password;

        String reset = "Sıfırla";


        String girilen;

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");

        } else {
            System.out.println("Bilgileriniz yanlış !!! Şifrenizi sıfırlamak ister misiniz? (Evet / Hayır)");
            String yes = input.nextLine();

            switch (yes) {
                case "Evet":
                    System.out.print("Yeni şifrenizi giriniz: ");
                    girilen = input.nextLine();

                    if (girilen.equals("java123") || girilen.equals("pass123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. Tekrar deneyiniz!!! ");
                        break;

                    } else {
                        System.out.println("Yeni şifreniz oluşturuldu. Tekrar giriş yapınız.");
                        break;
                    }
                case "Hayır":
                    System.out.println("Tekrar Deneyiniz!!");
                    break;
            }
        }


    }
}
