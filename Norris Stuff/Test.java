import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        JPanel mainPanel = new JPanel();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(mainPanel);

        JLabel label = new JLabel("WTF WTF WTF");
        mainPanel.add(label);

        JTextField textField = new JTextField();
        mainPanel.add(textField);

        //label.setText(textField.getText());
        mainPanel.revalidate();
    }
}
