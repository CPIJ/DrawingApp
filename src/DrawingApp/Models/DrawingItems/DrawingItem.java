package DrawingApp.Models.DrawingItems;

import DrawingApp.Models.Color;
import DrawingApp.Models.Point;

import java.util.Comparator;

public class DrawingItem implements Comparator<DrawingItem> {

    private Color color;
    private DrawingItem previousState;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getAnchor() {
        throw new UnsupportedOperationException();
    }

    public double getWidth() {
        throw new UnsupportedOperationException();
    }

    public double getHeigt() {
        throw new UnsupportedOperationException();
    }

    // Compare methods.
    @Override
    public int compare(DrawingItem o1, DrawingItem o2) {
        return 0;
    }
}
