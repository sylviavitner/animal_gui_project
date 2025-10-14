package Animals; 



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public abstract class Animal {

    protected String name; 
    private JFrame frame2;
    private JPanel animalButtonPanel;    
    private static final int X_LOC = 100;
    private static final int Y_LOC = 100;
    String animalType1;
    String animalType2;

    public Animal(String name){
        this.name = name;
        // JFrame animalFrame = new JFrame(name);
        // animalFrame.setSize(400, 400);
        // animalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // animalFrame.setVisible(true);
        createFrame();
        setButtons();
        displayFrame();

    }
    public void createFrame() {
        frame2 = new JFrame();
        frame2.setTitle(name);
        frame2.setLocation(X_LOC, Y_LOC);
        frame2.setSize(400, 400);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setLayout(new BorderLayout());
    }
    
    public void setButtons() {
        animalButtonPanel = new JPanel(new GridLayout(2, 5, 10, 10));
        animalButtonPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        //using a for-each loop to create buttons for each animal

        JButton button = createAnimalButton(animalType1);
        animalButtonPanel.add(button);
        JButton button2 = createAnimalButton(animalType2);
        animalButtonPanel.add(button2);
        
        frame2.add(animalButtonPanel, BorderLayout.CENTER);
    }

    private JButton createAnimalButton(String name) {
        JButton button = new JButton(name);
        
        ImageIcon icon = new ImageIcon("images/" + name.toLowerCase() + ".jpg");
        Image scaledImage = icon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        button.setIcon(icon);
        //button press action creates a call to the loadAnimalWindow method
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // loadAnimalWindow(name);
            }
        });

        return button;
    }

    private void displayFrame() {
        frame2.pack();
        frame2.setVisible(true);
    }



    
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    






    public abstract void performMove();
    public abstract void performSound();
    public abstract void performEat();
}

