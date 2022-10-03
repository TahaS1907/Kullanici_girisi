import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String username,password;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        username= scanner.nextLine();
        System.out.println("Şifrenizi giriniz:");
        password= scanner.nextLine();
        if(password.equals("java123")){
            System.out.println("Şifre doğru hoşgeldiniz:"+username);
        }
        else {System.out.println("Şifre hatalı yeni şifre belirlemek ister misiniz?:\n1.Evet\n2.Hayır");
          int select= scanner.nextInt();
          if(select==1){
              System.out.println(username+"Yeni şifre giriniz:");
              String yeni= scanner.nextLine();
              if(yeni.equals("java123")){System.out.println("Şifre öncekiyle aynı lütfen yeni şifre giriniz.");}
              else System.out.println("Şifre oluşturuldu" +username);
          }
          else System.out.println("Doğru şifreyi giriniz:"+username);
        }





    }
}