package Form;

import java.awt.Graphics;
import javax.swing.JComponent;

public class ovalComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(5, 5, getWidth()-10, getHeight()-10);
	}
}
