package org.gjt.sp.jedit.textarea;


import java.awt.Component;

/**
 * @see org.gjt.sp.jedit.textarea.ScrollLayout#BOTTOM_LEFT
 */
public class BottomLeft extends Name {
	public void addLayoutComponent(Component comp, ScrollLayout scrollLayout) {
		scrollLayout.setBottomLeft(comp);
	}
}