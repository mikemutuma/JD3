import javax.swing.*;

public class fileFour {

    public static void main(String[] args) {

        String x,y;
        Double xc,yc,answer;
        x = JOptionPane.showInputDialog("Enter the First Number");
        y = JOptionPane.showInputDialog("Enter the Second Number");
        xc = Double.parseDouble(x);
        yc = Double.parseDouble(y);
        answer = xc+yc;
        JOptionPane.showMessageDialog(null,"Sum ="+answer);

    }

}
