package drawingapp;

import javax.swing.JFrame;

public class Program {
    public void run(){

        Canvas canva = new Canvas();
        Pen dollar = new Pen(canva);

        Point p1 = new Point(200, 50);
        Point p2 = new Point(300, 130);
        Point p3 = new Point(260, 250);
        Point p4 = new Point(140, 250);
        Point p5 = new Point(100, 130);

        

        dollar.moveto(p1);
        dollar.lineTo(p2);
        dollar.lineTo(p3);
        dollar.lineTo(p4);
        dollar.lineTo(p5);
        dollar.lineTo(p1);

        JFrame frame = new JFrame("Zoobia's Canvas");
        frame.setSize(600, 600);
         frame.add(canva);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
