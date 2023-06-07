import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    private JTextField tfN;
    private JTextField tfBufferSize;
    private JTextField tfOutputFile;
    private JButton startProducerButton;
    private JPanel mainpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public Test()
    {
        setContentPane(mainpanel);

        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        startProducerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  N = tfN.getText();
                String BufferSize = tfBufferSize.getText();
                String OutputFile = tfOutputFile.getText();

            }
        });
    }
    public static void main (String[] ags){
        Test myFrame = new Test();

    }

}
