import javax.swing.*;
import java.awt.*;
public class View {
    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton onRadioButton=new JRadioButton("on");
    JRadioButton offRadioButton=new JRadioButton("off");
    JButton buttonZero=new JButton("0");
    JButton buttonOne=new JButton("1");
    JButton buttonTwo=new JButton("2");
    JButton buttonThree=new JButton("3");
    JButton buttonFour=new JButton("4");
    JButton buttonFive=new JButton("5");
    JButton buttonSix=new JButton("6");
    JButton buttonSeven=new JButton("7");
    JButton buttonEight=new JButton("8");
    JButton buttonNine=new JButton("9");
    JButton buttonDot=new JButton(".");
    JButton buttonClear=new JButton("C");
    JButton buttonDelete=new JButton("DEL");
    JButton buttonEqual=new JButton("=");
    JButton buttonMul=new JButton("X");
    JButton buttonDiv=new JButton("/");
    JButton buttonPlus=new JButton("+");
    JButton buttonMinus=new JButton("-");
    JButton buttonSquare=new JButton("x\u00B2");
    JButton buttonReciprocal=new JButton("1/x");
    JButton buttonSqrt=new JButton("\u221A");

    public View() {
        prepareGui();
        addComponents();
    }

    public void prepareGui(){
        frame.setSize(362,758);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new Color(14,53,54));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void addComponents() {
        label.setBounds(150, 0, 50, 70);
        label.setForeground(Color.white);
        frame.add(label);
        textField.setBounds(10, 50, 320, 40);
        textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 90, 70, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        onRadioButton.setBackground(new Color(14, 53, 54));
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 130, 70, 40);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        offRadioButton.setBackground(new Color(14, 53, 54));
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonClear.setBounds(90,95,70,80);
        buttonClear.setFont(new Font("Times New Roman", Font.BOLD,30));
        buttonClear.setBackground(new Color(54,122,128));
        frame.add(buttonClear);

        buttonDelete.setBounds(175,95,70,80);
        buttonDelete.setFont(new Font("Times New Roman", Font.BOLD,15));
        buttonDelete.setBackground(new Color(54,122,128));
        frame.add(buttonDelete);

        buttonDiv.setBounds(260,95,70,80);
        buttonDiv.setFont(new Font("Times New Roman", Font.BOLD,35));
        buttonDiv.setBackground(new Color(43,138,131));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 200, 70, 80);
        buttonSqrt.setFont(new Font("Times New Roman", Font.BOLD, 35));
        buttonSqrt.setBackground(new Color(43,138,131));
        frame.add(buttonSqrt);

        buttonSquare.setBounds(90, 200, 70, 80);
        buttonSquare.setFont(new Font("Times New Roman", Font.BOLD, 35));
        buttonSquare.setBackground(new Color(43,138,131));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(175, 200, 70, 80);
        buttonReciprocal.setFont(new Font("Times New Roman", Font.BOLD, 25));
        buttonReciprocal.setBackground(new Color(43,138,131));
        frame.add(buttonReciprocal);

        buttonMinus.setBounds(260, 200, 70,80);
        buttonMinus.setFont(new Font("Times New Roman", Font.BOLD, 35));
        buttonMinus.setBackground(new Color(43,138,131));
        frame.add(buttonMinus);

        buttonSeven.setBounds(10, 300, 70, 80);
        buttonSeven.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonSeven);

        buttonEight.setBounds(90, 300, 70, 80);
        buttonEight.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonEight);

        buttonNine.setBounds(175, 300, 70, 80);
        buttonNine.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonNine);

        buttonMul.setBounds(260,300,70,80);
        buttonMul.setFont(new Font("Times New Roman", Font.BOLD, 35));
        buttonMul.setBackground(new Color(43,138,131));
        frame.add(buttonMul);

        buttonFour.setBounds(10, 400, 70, 80);
        buttonFour.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonFour);

        buttonFive.setBounds(90, 400, 70, 80);
        buttonFive.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonFive);

        buttonSix.setBounds(175, 400, 70, 80);
        buttonSix.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonSix);

        buttonPlus.setBounds(260,400,70,80);
        buttonPlus.setFont(new Font("Times New Roman", Font.BOLD, 35));
        buttonPlus.setBackground(new Color(43,138,131));
        frame.add(buttonPlus);

        buttonOne.setBounds(10,500,70,80);
        buttonOne.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonOne);

        buttonTwo.setBounds(90,500,70,80);
        buttonTwo.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonTwo);

        buttonThree.setBounds(175,500,70,80);
        buttonThree.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonThree);

        buttonZero.setBounds(10,600,150,80);
        buttonZero.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonZero);

        buttonDot.setBounds(175,600,70,80);
        buttonDot.setFont(new Font("Times New Roman", Font.BOLD, 35));
        frame.add(buttonDot);

        buttonEqual.setBounds(260,500,70,180);
        buttonEqual.setFont(new Font("Times New Roman", Font.BOLD, 35));
        buttonEqual.setBackground(new Color(43,138,131));
        frame.add(buttonEqual);
    }

}
