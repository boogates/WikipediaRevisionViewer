import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainUI extends JFrame implements ActionListener {

    JLabel term;
    JTextField input;
    JButton fetch;
    JLabel recent;
    JLabel active;

    public mainUI() {
        super("Wikipedia Revision Viewer with Swing UI");

        UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));

        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        fetch = new JButton("Fetch");
        var fetchConstraints = new GridBagConstraints(1, 0, 1, 1, .25, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        fetch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                term.setText(input.getText());
            }
        });
        panel.add(fetch, fetchConstraints);

        term = new JLabel("");
        var termConstraints = new GridBagConstraints(0, 1, 2, 1, 1, .25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(term, termConstraints);

        input = new JTextField();
        var inputConstraints = new GridBagConstraints(0, 0, 1, 1, 1.75, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(input, inputConstraints);

        recent = new JLabel("");
        var recentConstraints = new GridBagConstraints(0, 3, 1, 2, 1, 1.75, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(recent, recentConstraints);

        active = new JLabel("");
        var activeConstraints = new GridBagConstraints(1, 3, 1, 2, 1, 1.75, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(active, activeConstraints);

        setPreferredSize(new Dimension(1000, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new mainUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
