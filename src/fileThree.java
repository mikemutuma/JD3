import javax.swing.*;

public class fileThree {

    public static void main(String[] args) {

        String fnum,snum;
        Double firstNumber,secondNumber,Answer;
        fnum = JOptionPane.showInputDialog(null,"Enter the First Number");
        snum = JOptionPane.showInputDialog(null,"Enter the Second Number");
        firstNumber = Double.parseDouble(fnum);
        secondNumber = Double.parseDouble(snum);
        Answer= firstNumber+secondNumber;
        JOptionPane.showMessageDialog(null,Answer);

    }

}
