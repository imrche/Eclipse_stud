package Form;

import javax.swing.JFrame;

public class ovalFrame extends JFrame {
	public ovalFrame() {
		ovalComponent oc = new ovalComponent();
		
		add(oc);
		setBounds(200, 200, 300, 250);
	}
}
