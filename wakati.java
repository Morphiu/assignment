import java.util.Scanner;
public class wakati {
    public static void main(String[]args){
        int seconds=0, minutes=0,hours=0, days=0,months=0, years=0;
        System.out.println("Enter time in seconds");
        Scanner input= new Scanner(System.in);
        int sec= input.nextInt();
        
        seconds=(sec%3600)%60;
        minutes=(sec%3600)/60;
        hours=sec/3600;
        days=sec/86400;
        months=sec/2592000;
        years=sec/31536000;
        
        System.out.println(years +"years" 
                            + months +"months"
                            + days +"days"
                            + hours +"hours"
                            + minutes +"minutes"
                            + seconds +"seconds");
    }
}
