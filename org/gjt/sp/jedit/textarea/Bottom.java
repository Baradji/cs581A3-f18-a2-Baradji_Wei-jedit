package org.gjt.sp.jedit.textarea;


import java.awt.Component;

/**
 * @see org.gjt.sp.jedit.textarea.ScrollLayout#BOTTOM
 */
public class Bottom extends Name {
	public void addLayoutComponent(Component comp, ScrollLayout scrollLayout) {
		scrollLayout.setBottom(comp);
	}
}