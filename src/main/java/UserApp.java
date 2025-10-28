
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserApp extends JFrame {
    private JPanel panel;
    private Painting painting;
    private Vlogger vlogger;
    private Player user;

    public UserApp() {
        this.panel = new JPanel();
        this.painting = new Painting();
        this.vlogger = new Vlogger();
        this.user = new Player();

        panel.add(new JLabel("Player Name:" + user.getName()));
        panel.add(new JLabel("Player Level:" + user.getLevel()));

        this.add(panel);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new UserApp();
    }
}