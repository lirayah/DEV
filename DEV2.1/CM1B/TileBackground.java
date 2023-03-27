package CM1B;

import java.awt.*;
import javax.swing.*;

public class TileBackground extends JComponent {
    private Image tile;
    private int tileScale;

    public TileBackground(int tileScale, String imagePath) {
        super();
        this.tile = Toolkit.getDefaultToolkit().getImage(imagePath);
        this.tileScale = tileScale;
    }

    @Override
    protected void paintComponent(Graphics brush) {
        Graphics newBrush = brush.create();
        if (this.isOpaque()) {
            newBrush.setColor(this.getBackground());
            newBrush.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        int horizontalReps = this.getWidth() / this.tileScale + 1;
        int verticalReps = this.getHeight() / this.tileScale + 1;
        for (int x = 0; x < horizontalReps; x++) {
            for (int y = 0; y < verticalReps; y++) {
                newBrush.drawImage(this.tile, x * tileScale, y * tileScale, tileScale, tileScale, this);
            }
        }
    }
}