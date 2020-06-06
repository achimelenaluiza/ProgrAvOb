package Company;

import Company.Sqlite.ReadTable;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comp extends JFrame {

    private JPanel rootPanel;
    private JButton displayFromDBButton;
    private JTextArea textArea;
    private JButton CLEARButton;

    public Comp(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(rootPanel);
        this.pack();
        this.setVisible(true);

        this.displayFromDBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fromDB();
            }
        });

        this.CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("");
            }
        });

    }

    private void fromDB() {
        ReadTable readTable = new ReadTable();
        this.textArea.setText(readTable.getAllOutput());
    }

    public static void main(String[] args) {
        JFrame frame = new Comp("Company \"THECOMPANY\"");
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        rootPanel.setAlignmentX(0.0f);
        rootPanel.setAlignmentY(0.0f);
        rootPanel.setBackground(new Color(-16777216));
        rootPanel.setForeground(new Color(-1));
        rootPanel.setMinimumSize(new Dimension(1000, 500));
        rootPanel.setPreferredSize(new Dimension(1000, 500));
        rootPanel.setRequestFocusEnabled(true);
        rootPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-1)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$(null, Font.BOLD, 73, rootPanel.getFont()), null));
        displayFromDBButton = new JButton();
        displayFromDBButton.setAlignmentY(0.0f);
        displayFromDBButton.setBorderPainted(false);
        Font displayFromDBButtonFont = this.$$$getFont$$$(null, Font.BOLD, 24, displayFromDBButton.getFont());
        if (displayFromDBButtonFont != null) displayFromDBButton.setFont(displayFromDBButtonFont);
        displayFromDBButton.setMaximumSize(new Dimension(401, 38));
        displayFromDBButton.setMinimumSize(new Dimension(401, 38));
        displayFromDBButton.setOpaque(false);
        displayFromDBButton.setPreferredSize(new Dimension(401, 38));
        displayFromDBButton.setText("Display from DB");
        rootPanel.add(displayFromDBButton);
        textArea = new JTextArea();
        textArea.setBackground(new Color(-1));
        textArea.setEnabled(true);
        Font textAreaFont = this.$$$getFont$$$(null, Font.BOLD, 10, textArea.getFont());
        if (textAreaFont != null) textArea.setFont(textAreaFont);
        textArea.setLineWrap(true);
        textArea.setMinimumSize(new Dimension(950, 100));
        textArea.setPreferredSize(new Dimension(950, 400));
        textArea.setRequestFocusEnabled(false);
        textArea.setSelectedTextColor(new Color(-16777216));
        textArea.setText("");
        rootPanel.add(textArea);
        CLEARButton = new JButton();
        CLEARButton.setAlignmentX(0.0f);
        Font CLEARButtonFont = this.$$$getFont$$$(null, Font.BOLD, 24, CLEARButton.getFont());
        if (CLEARButtonFont != null) CLEARButton.setFont(CLEARButtonFont);
        CLEARButton.setText("CLEAR");
        rootPanel.add(CLEARButton);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}