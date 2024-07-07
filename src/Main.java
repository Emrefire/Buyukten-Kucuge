import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz: ");
        s1 = inp.nextInt();
        System.out.print("2.sayiyi giriniz: ");
        s2 = inp.nextInt();
        System.out.print("3.sayiyi giriniz: ");
        s3 = inp.nextInt();
        if(s2 < s1  && s3 > s1  ){
            System.out.println("Sıralama: " + s3 + " > " +  s1 + " > " + s2 );
        }
        else if( s1 > s3 && s2< s3){
            System.out.println("Sıralama: " + s1 + " > " +  s3 + " > " + s2 );
        }
        else if(s2 > s1 && s1 > s3 ){
            System.out.println("Sıralama: " + s2 + " > " +  s1 + " > " + s3 );
        }
        else{
            System.out.println("Sıralama: " + s1 + " > " +  s2 + " > " + s3 );
        }
    }
}