package Model;

import static Model.TrucToaDo.bresenhamLine;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MyRect1 implements Shapes2D {

    private Point A, B,C,D;

    public MyRect1(Point a, Point c) {
         A = a;
        C = c;
        B=new Point(C.x,A.y);
        D=new Point(A.x,C.y);
    }
public MyRect1(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(DEFAULT_COLOR);
        bresenhamLine(g, A.x, A.y, B.x, B.y);
        bresenhamLine(g, B.x, B.y, C.x, C.y);
        bresenhamLine(g, C.x, C.y, D.x, D.y);
        bresenhamLine(g, D.x, D.y, A.x, A.y);
    }

    @Override
    public void draw(Graphics g, Color c) {
        g.setColor(c);
        bresenhamLine(g, A.x, A.y, B.x, A.y);
        bresenhamLine(g, B.x, A.y, B.x, B.y);
        bresenhamLine(g, B.x, B.y, A.x, B.y);
        bresenhamLine(g, A.x, B.y, A.x, A.y);
    }

    @Override
    public void fill(Graphics g, Color color) {
    }

}
