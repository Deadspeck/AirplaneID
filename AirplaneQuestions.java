import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by compsci on 4/25/17.
 */
public class AirplaneQuestions extends JFrame{

    private static final long serialVersionUID = 1L;

    /*
    ask questions about the airplane you are looking at
    1 what type of engine
    2 how many engines
    3 location of engines

    GUI -- jop minimum or full jframe - your team decides
     */

    JPanel sizePanel = new JPanel();
    ButtonGroup sizeButtonGroup = new ButtonGroup();
    JRadioButton smallRadioButton = new JRadioButton();
    JRadioButton mediumRadioButton = new JRadioButton();
    JRadioButton largeRadioButton = new JRadioButton();

    JPanel enginePanel = new JPanel();
    ButtonGroup engineButtonGroup = new ButtonGroup();
    JRadioButton jetRadioButton = new JRadioButton();
    JRadioButton propellerRadioButton = new JRadioButton();

    JPanel toppingsPanel = new JPanel();
    JCheckBox cheeseCheckBox = new JCheckBox();
    JCheckBox mushroomsCheckBox = new JCheckBox();
    JCheckBox olivesCheckBox = new JCheckBox();
    JCheckBox onionsCheckBox = new JCheckBox();
    JCheckBox peppersCheckBox = new JCheckBox();
    JCheckBox tomatoesCheckBox = new JCheckBox();

    ButtonGroup whereButtonGroup = new ButtonGroup();
    JRadioButton eatInRadioButton = new JRadioButton();
    JRadioButton takeOutRadioButton = new JRadioButton();

    JButton buildButton = new JButton();
    JButton exitButton = new JButton();

    String engineType;
    String engineNumber;
    String engineLocation;
    JCheckBox[] topping = new JCheckBox[6];

    }

    public AirplaneQuestions() {

        setTitle("Airplane ID");
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exitForm(e);
            }
        });

        getContentPane().setLayout(new GridBagLayout()); // use GBL JFrame
        GridBagConstraints gridConstraints;

        enginePanel.setLayout(new GridBagLayout());
        enginePanel.setBorder(BorderFactory.createTitledBorder("Engine Type"));

        jetRadioButton.setText("Jet");
        jetRadioButton.setSelected(true);
        engineButtonGroup.add(jetRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        enginePanel.add(jetRadioButton, gridConstraints);
        jetRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jetRadioButtonActionPerformed(e);
            }
        });

        propellerRadioButton.setText("Thick Crust");
        engineButtonGroup.add(propellerRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        enginePanel.add(propellerRadioButton, gridConstraints);
        propellerRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                propellerRadioButtonActionPerformed(e);
            }
        });

        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(enginePanel, gridConstraints);

        toppingsPanel.setLayout(new GridBagLayout());
        toppingsPanel.setBorder(BorderFactory.createTitledBorder("Toppings"));

        cheeseCheckBox.setText("Extra Cheese");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(cheeseCheckBox, gridConstraints);

        mushroomsCheckBox.setText("Mushrooms");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(mushroomsCheckBox, gridConstraints);

        olivesCheckBox.setText("Olives");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(olivesCheckBox, gridConstraints);

        onionsCheckBox.setText("Onions");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(onionsCheckBox, gridConstraints);

        peppersCheckBox.setText("Green Peppers");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(peppersCheckBox, gridConstraints);

        tomatoesCheckBox.setText("Tomatoes");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(tomatoesCheckBox, gridConstraints);


        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 2;
        getContentPane().add(toppingsPanel, gridConstraints);


        eatInRadioButton.setText("Eat In");
        eatInRadioButton.setSelected(true);
        whereButtonGroup.add(eatInRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        getContentPane().add(eatInRadioButton, gridConstraints);
        eatInRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                whereRadioButtonActionPerformed(e);
            }
        });

        takeOutRadioButton.setText("Take Out");
        whereButtonGroup.add(takeOutRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        getContentPane().add(takeOutRadioButton, gridConstraints);
        takeOutRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                whereRadioButtonActionPerformed(e);
            }
        });


        buildButton.setText("Build Pizza");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        getContentPane().add(buildButton, gridConstraints);
        buildButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buildButtonActionPerformed(e);
            }
        });

        exitButton.setText("Exit");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        getContentPane().add(exitButton, gridConstraints);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });


        getContentPane().setBackground(Color.YELLOW);
        //pack();
        setSize(600, 300);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (screenSize.width - getWidth())),
                (int) (0.5 * (screenSize.height - getHeight())),
                getWidth(), getHeight());

        // Initialize parameters
        engineNumber = smallRadioButton.getText(); // small is default
        engineType = jetRadioButton.getText(); // thin is default
        engineLocation = eatInRadioButton.getText(); // eat-in is default
        // Define an array of topping check boxes
        topping[0] = cheeseCheckBox;
        topping[1] = mushroomsCheckBox;
        topping[2] = olivesCheckBox;
        topping[3] = onionsCheckBox;
        topping[4] = peppersCheckBox;
        topping[5] = tomatoesCheckBox;


    } // end of constructor


    // methods

    private void exitButtonActionPerformed(ActionEvent e) {
        // "Are you sure?"
        // "Do you want to save your work?"
        // code for a graceful exit
        System.exit(0);
    }

    private void buildButtonActionPerformed(ActionEvent e) {

        String message; // local or method var, works only inside this method
        message = pizzaWhere + "\n";
        message += pizzaSize + " Pizza" + "\n";
        message += pizzaCrust + "\n";
        // Check each topping using the array we set up
        for (int i = 0; i < 6; i++) {
            if (topping[i].isSelected()) {
                message += topping[i].getText() + "\n";
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                message,
                "Your Custom Pizza",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );

    }

    private void whereRadioButtonActionPerformed(ActionEvent e) {
        pizzaWhere = e.getActionCommand();
        System.out.println("Eat-in / take-out: " + pizzaWhere);
    }

    private void jetRadioButtonActionPerformed(ActionEvent e) {
        pizzaCrust = e.getActionCommand();
        System.out.println("Crust: " + pizzaCrust);
    }

    private void sizeRadioButtonActionPerformed(ActionEvent e) {
        pizzaSize = e.getActionCommand();
        System.out.println("Size: " + pizzaSize);
    }


    private void exitForm(WindowEvent e) {
        // ask "are sure?"
        // ask "do you want to save this file?"
        System.exit(0); // normal exit, zero errors

    }

    public static void main(String[] args) {

        new CustomPizza().setVisible(true);

    }

} // end of class

