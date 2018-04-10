package org.gjt.sp.jedit.textarea;


import java.awt.Component;

/**
 * @see org.gjt.sp.jedit.textarea.ScrollLayout#TOP_LEFT
 */
public class TopLeft extends Name {
	public void addLayoutComponent(Component comp, ScrollLayout scrollLayout) {
		scrollLayout.setTopLeft(comp);
	}
}