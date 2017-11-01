package programbresenhem;

import java.awt.Graphics;

public class NewClass {

    public void Garisku(Graphics g, int x0, int y0, int x1, int y1) {
        int dx, dy, steps,p;
        int x_tambah, y_tambah, x, y;

        dx = x1 - x0;
        dy = y1 - y0;
        
        p = (2 * dy) - dx;
        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
        } else {
            steps = Math.abs(dy);
        }
        x_tambah = dx / steps;
        y_tambah = dy / steps;
        x = x0;
        y = y0;

        g.fillRect(x, y, 200, 1);
        for (int k = 0; k < steps; k++) {
            if(p < 0){
            p = p+(2*dy);
            }else{
                y = y + 1;
                p = p + (2 * (dy - dx));
            }
            g.fillRect(x, y, 200, 1);
        }
    }
}