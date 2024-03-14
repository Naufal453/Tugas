import java.awt.*;

public class SolidLineDrawing32 extends Frame {

    public SolidLineDrawing32() {
        super("Solid Line Drawing");
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        Stroke solid = new BasicStroke(2); // Menggunakan solid stroke tanpa pola putus-putus
        g2d.setStroke(solid);

        // Menggambar mobil
        // Badan mobil
        g2d.drawLine(50, 200, 300, 200);
        g2d.drawLine(50, 200, 50, 150);
        g2d.drawLine(300, 200, 300, 150);
        g2d.drawLine(50, 150, 100, 100);
        g2d.drawLine(300, 150, 250, 100);
        g2d.drawLine(100, 100, 250, 100);

        // Roda
        g2d.drawOval(80, 180, 40, 40);
        g2d.drawOval(230, 180, 40, 40);
    }

    public static void main(String[] args) {
        new SolidLineDrawing32();
    }
}
