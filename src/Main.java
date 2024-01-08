import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("жашынызды жазыныз");
        int a=scanner.nextInt();
        //String b=a>18?"сатылат":"сатылбайт";
       // System.out.println(b);
    if(a>=18&&a<100){
        System.out.println("сатылат");
    }else {
        System.out.println("сатылбайт");
    }
    }
}