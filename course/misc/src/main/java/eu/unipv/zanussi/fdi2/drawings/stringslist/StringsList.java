package eu.unipv.zanussi.fdi2.drawings.stringslist;

import eu.unipv.zanussi.fdi2.drawings.Drawable;

import java.awt.*;

/**
 * A drawable for string arrays..
 */
public class StringsList implements Drawable {

    private String[] strings;

    private int index;

    // Not initializing Placer here, pass in instead to remove dependance.
    IPlacer placer;

    public StringsList(String... strings) {
        this.strings = strings;
    }

    public void setPlacer(IPlacer placer) {
        this.placer = placer;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < strings.length; i++) {
            int position = i - index;

            if (position == 0)
                g.setColor(Color.RED);
            else
                g.setColor(Color.BLACK);

            int[] xy = new int[2];
            placer.place(position, xy);

            g.drawString(strings[i], xy[0], xy[1]);
        }
    }

    public void up() {
        if (index < strings.length - 1) index++;
    }

    public void down() {
        if (index > 0) index--;
    }

}
