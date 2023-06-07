package com.group5.controller;

import com.group5.component.Base;
import javax.swing.JPanel;

public abstract class TestView extends JPanel {

	private Base base = new Base();
	private Controller controller;

	public TestView(Controller controller) {
		this.controller = controller;
	}

	public Controller getController() {
		return controller;
	}

	public void addToBase(JPanel p) {
		this.base.add(p);
	}

	public void addToBaseWithGap(JPanel...panel) {
		for (JPanel p : panel) this.base.addWithGap(p);
	}

	public Base getBasePanel() {
		return this.base;
	}

	public void resetBasePanel() {
		if (getBasePanel() != null) getBasePanel().removeAll();
	}
}
