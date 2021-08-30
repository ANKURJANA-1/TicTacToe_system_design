import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Table table = new Table(3);
        boolean quit=false;
        Scanner sc=new Scanner(System.in);
        int user=0;

        while(!quit){
            System.out.println("Enter your input: ");
            int val=sc.nextInt();

            if(val==-1){
                quit=true;
            }

            user = user==0?1:0;
            Table.inputRoute(val, user);
            Table.showTable();
        }
       
        
    }
}
