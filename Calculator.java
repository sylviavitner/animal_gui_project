package apps;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Noah Laws
 * @version 2/18/25
 */

public class Calculator {
    private static final int X_LOC = 100;
    private static final int Y_LOC = 100;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final String NAME = "Noah's calculator";
    private static final String RESULT_PREAMBLE = "Result = ";
    private static final String ERROR_MESSAGE = "Error";
    private JFrame frame;
    private JTextField leftOpField;
    private JTextField rightOpField;
    private JLabel resultLabel;

    public Calculator() {
        createFrame();
        initializeComponents();
        displayFrame();
    }

    public JFrame getFrame() {
        return frame;
    }

    private void createFrame() {
        frame = new JFrame();
        frame.setTitle(NAME);
        frame.setLocation(X_LOC, Y_LOC);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

    private void initializeComponents() {
        initializeInputs();
        initializeResults();
        initializeButtons();
    }
    
    private void displayFrame() {
        frame.pack();
        frame.setVisible(true);
    }

    private void initializeInputs() {
        JPanel panel = new JPanel(new FlowLayout());
        leftOpField = new JTextField(5);
        rightOpField = new JTextField(5);
        leftOpField.setName("leftOperand");
        rightOpField.setName("rightOperand");
        panel.add(leftOpField);
        panel.add(rightOpField);
        frame.add(panel, BorderLayout.NORTH);
    }

    private void initializeResults() {
        JPanel panel = new JPanel(new FlowLayout());
        resultLabel = new JLabel(RESULT_PREAMBLE);
        resultLabel.setName("resultLabel");
        panel.add(resultLabel);
        frame.add(panel, BorderLayout.CENTER);
    }

    private void initializeButtons() {
        JPanel panel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("ADD");
        JButton subButton = new JButton("SUB");
        JButton multButton = new JButton("MULT");
        JButton divButton = new JButton("DIV");

        addButton.setName("addButton");
        subButton.setName("subButton");
        multButton.setName("multButton");
        divButton.setName("divButton");

        panel.add(addButton);
        panel.add(subButton);
        panel.add(multButton);
        panel.add(divButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateResult(getLeftNum() + getRightNum());
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateResult(getLeftNum() - getRightNum());
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (getRightNum() == 0) {
                    updateResult(Double.NaN);
                } else {
                    updateResult(getLeftNum() / getRightNum());
                }
            }
        });

        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateResult(getLeftNum() * getRightNum());
            }
        });

        frame.add(panel, BorderLayout.SOUTH);


    }

    private double getLeftNum() {
        try {
            return Double.parseDouble(leftOpField.getText());
        } catch (NumberFormatException | NullPointerException e) {
            return Double.NaN;
        }
    }

    private double getRightNum() {
        try {
            return Double.parseDouble(rightOpField.getText());
        } catch (NumberFormatException | NullPointerException e) {
            return Double.NaN;
        }
    }

    private void updateResult(double result) {
        if (Double.isNaN(result)) {
            resultLabel.setText(RESULT_PREAMBLE + ERROR_MESSAGE);
        } else {
            resultLabel.setText(RESULT_PREAMBLE + result);
        }
    }
}