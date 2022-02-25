import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;

public class newFrame {
    public void createNewFrame(){

        JFrame jFrame1 = new JFrame();
        jFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame1.setBounds(dimension.width/2 - 100, dimension.height/2 - 50, 200, 100);
        jFrame1.setVisible(true);

        JLabel jLabel1 = new JLabel("Отдохните 5 минут :)");
        JPanel jPanel1 = new JPanel();
        jFrame1.add(jPanel1);
        jPanel1.add(jLabel1);

        Timer timer1 = new Timer();
        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                JButton btn = new JButton("ОК IM Ready! :)");
                jPanel1.add(btn);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jFrame1.setVisible(false);
                    }
                });
                jPanel1.revalidate();
            }
        };
        long delay1 = 1000l * 60 * 5;
        timer1.schedule(timerTask1, delay1);
    }
}