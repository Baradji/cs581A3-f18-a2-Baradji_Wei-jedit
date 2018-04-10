package org.gjt.sp.jedit.textarea;


import java.awt.Component;

/**
 * @see org.gjt.sp.jedit.textarea.ScrollLayout#LEFT
 */
public class Left extends Name {
	public void addLayoutComponent(Component comp, ScrollLayout scrollLayout) {
		scrollLayout.setLeft(comp);
	}
}