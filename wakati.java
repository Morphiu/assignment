import java.util.Scanner;
public class wakati {
    public static void main(String[]args){
        int seconds=0, minutes=0,hours=0, days=0, years=0;
        System.out.println("Enter time in seconds");
        Scanner input= new Scanner(System.in);
        int sec= input.nextInt();
        
        minutes=sec/60;
        hours=sec/3600;
        days=sec/86400;
        years=sec/3153600;
        
        System.out.println(years+"years" 
                            +days +"days"
                            +hours+"hours"
                            +minutes +"minutes");
    }
}