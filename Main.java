import javax.swing.JFrame;
public class Main {
    public JFrame frame;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Салфетка Серпинского"); //титульник окна
        f.setSize(900, 650); //высота и ширина окна
        f.setResizable(false);
        int deep = 5; //глубина
        f.add(new Serpinskiy(f.getSize(), deep));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

