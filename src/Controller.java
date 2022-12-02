import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller implements ActionListener {
    View view = new View();
    double num1=0, num2=0, result=0;
    int calculation;
    public Controller(){
        addActionEvent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==view.onRadioButton){
            enable();
        } else if(source==view.offRadioButton){
            disable();
        } else if(source==view.buttonClear){
            view.label.setText("");
            view.textField.setText("");
        } else if(source==view.buttonDelete){
            int lenght=view.textField.getText().length();
            int number=lenght-1;
            if(lenght>0) {
                StringBuilder back = new StringBuilder(view.textField.getText());
                back.deleteCharAt(number);
                view.textField.setText(back.toString());
            }if(view.textField.getText().endsWith(""));
            view.label.setText("");
        } else if(source==view.buttonZero){
            if(view.textField.getText().equals("0")){
                return;

            } else{
                view.textField.setText(view.textField.getText()+"0");
            }

        } else if(source==view.buttonOne){
            view.textField.setText(view.textField.getText()+"1");
        }else if(source==view.buttonTwo){
            view.textField.setText(view.textField.getText()+"2");
        }else if(source==view.buttonThree){
            view.textField.setText(view.textField.getText()+"3");
        }else if(source==view.buttonFour){
            view.textField.setText(view.textField.getText()+"4");
        }else if(source==view.buttonFive){
            view.textField.setText(view.textField.getText()+"5");
        }else if(source==view.buttonSix){
            view.textField.setText(view.textField.getText()+"6");
        }else if(source==view.buttonSeven){
            view.textField.setText(view.textField.getText()+"7");
        }else if(source==view.buttonEight){
            view.textField.setText(view.textField.getText()+"8");
        }else if(source==view.buttonNine){
            view.textField.setText(view.textField.getText()+"9");
        }else if(source==view.buttonDot){
            if(view.textField.getText().contains(".")){
                return;
            } else{
                view.textField.setText(view.textField.getText()+".");
            }
        }else if(source==view.buttonPlus){
            String str=view.textField.getText();
            num1=Double.parseDouble(view.textField.getText());
            calculation=1;
            view.textField.setText("");
            view.label.setText(str + "+");

        }else if(source==view.buttonMinus){
            String str=view.textField.getText();
            num1=Double.parseDouble(view.textField.getText());
            calculation=2;
            view.textField.setText("");
            view.label.setText(str + "-");

        }else if(source==view.buttonMul){
            String str=view.textField.getText();
            num1=Double.parseDouble(view.textField.getText());
            calculation=3;
            view.textField.setText("");
            view.label.setText(str + "X");

        }else if(source==view.buttonDiv){
            String str=view.textField.getText();
            num1=Double.parseDouble(view.textField.getText());
            calculation=4;
            view.textField.setText("");
            view.label.setText(str + "/");

        }else if(source==view.buttonSquare){
            num1=Double.parseDouble(view.textField.getText());
            double square=Math.pow(num1,2);
            String string=Double.toString(square);
            if(string.endsWith(".0")){
                view.textField.setText(string.replace(".0",""));
            } else{
                view.textField.setText(string);
            }

        }else if(source==view.buttonSqrt){
            num1=Double.parseDouble(view.textField.getText());
            double sqrt=Math.sqrt(num1);
            view.textField.setText(Double.toString(sqrt));
        } else if(source==view.buttonReciprocal){
            num1=Double.parseDouble(view.textField.getText());
            double reciprocal=1/num1;
            String string=Double.toString(reciprocal);
            if(string.endsWith(".0")){
                view.textField.setText(string.replace(".0",""));
            } else{
                view.textField.setText(string);
            }
        } else if(source==view.buttonEqual){
            num2=Double.parseDouble(view.textField.getText());
            switch(calculation){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
            } if(Double.toString(result).endsWith(".0")){
                view.textField.setText(Double.toString(result).replace(".0",""));

            } else{
                System.out.println(num1 + " " + num2);
                view.textField.setText(Double.toString(result));
            }
            view.label.setText("");
            num1=result;
        }
    }

    public void enable(){
        view.onRadioButton.setEnabled(false);
        view.offRadioButton.setEnabled(true);
        view. textField.setEnabled(true);
        view.label.setEnabled(true);
        view.buttonClear.setEnabled(true);
        view.buttonDelete.setEnabled(true);
        view.buttonDiv.setEnabled(true);
        view.buttonSqrt.setEnabled(true);
        view.buttonSquare.setEnabled(true);
        view.buttonReciprocal.setEnabled(true);
        view.buttonMinus.setEnabled(true);
        view.buttonSeven.setEnabled(true);
        view.buttonEight.setEnabled(true);
        view.buttonNine.setEnabled(true);
        view.buttonMul.setEnabled(true);
        view.buttonFour.setEnabled(true);
        view.buttonFive.setEnabled(true);
        view.buttonSix.setEnabled(true);
        view.buttonPlus.setEnabled(true);
        view.buttonOne.setEnabled(true);
        view.buttonTwo.setEnabled(true);
        view.buttonThree.setEnabled(true);
        view.buttonEqual.setEnabled(true);
        view.buttonZero.setEnabled(true);
        view.buttonDot.setEnabled(true);
    }
    public void disable(){
        view.offRadioButton.setEnabled(false);
        view.onRadioButton.setEnabled(true);
        view.textField.setEnabled(false);
        view.label.setEnabled(false);
        view.buttonClear.setEnabled(false);
        view.buttonDelete.setEnabled(false);
        view.buttonDiv.setEnabled(false);
        view.buttonSqrt.setEnabled(false);
        view.buttonSquare.setEnabled(false);
        view.buttonReciprocal.setEnabled(false);
        view.buttonMinus.setEnabled(false);
        view.buttonSeven.setEnabled(false);
        view.buttonEight.setEnabled(false);
        view.buttonNine.setEnabled(false);
        view.buttonMul.setEnabled(false);
        view.buttonFour.setEnabled(false);
        view.buttonFive.setEnabled(false);
        view.buttonSix.setEnabled(false);
        view.buttonPlus.setEnabled(false);
        view.buttonOne.setEnabled(false);
        view.buttonTwo.setEnabled(false);
        view.buttonThree.setEnabled(false);
        view.buttonEqual.setEnabled(false);
        view.buttonZero.setEnabled(false);
        view.buttonDot.setEnabled(false);
    }

    public void addActionEvent(){
        view.onRadioButton.addActionListener(this);
        view.offRadioButton.addActionListener(this);
        view.buttonClear.addActionListener(this);
        view.buttonDelete.addActionListener(this);
        view.buttonDiv.addActionListener(this);
        view.buttonSqrt.addActionListener(this);
        view.buttonSquare.addActionListener(this);
        view.buttonReciprocal.addActionListener(this);
        view.buttonMinus.addActionListener(this);
        view.buttonSeven.addActionListener(this);
        view.buttonEight.addActionListener(this);
        view.buttonNine.addActionListener(this);
        view.buttonMul.addActionListener(this);
        view.buttonFour.addActionListener(this);
        view.buttonFive.addActionListener(this);
        view.buttonSix.addActionListener(this);
        view.buttonPlus.addActionListener(this);
        view.buttonOne.addActionListener(this);
        view.buttonTwo.addActionListener(this);
        view.buttonThree.addActionListener(this);
        view.buttonEqual.addActionListener(this);
        view.buttonZero.addActionListener(this);
        view.buttonDot.addActionListener(this);
    }
}
