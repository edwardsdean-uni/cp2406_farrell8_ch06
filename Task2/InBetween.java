import javax.swing.*;

public class InBetween {
    public static void main(String[] args){

        int num1, num2;
        String str, output;
        str = JOptionPane.showInputDialog(null,"Enter lower integer");
        num1 = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null,"Enter higher integer");
        num2 = Integer.parseInt(str);


        for(int num = num1; num <= num2; num++){
            System.out.println(num);
        }
    }
}
