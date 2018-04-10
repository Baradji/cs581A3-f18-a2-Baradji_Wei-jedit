package org.gjt.sp.jedit.textarea;


import java.awt.Component;

/**
 * @see org.gjt.sp.jedit.textarea.ScrollLayout#CENTER
 */
public class Center extends Name {
	public void addLayoutComponent(Component comp, ScrollLayout scrollLayout) {
		scrollLayout.setCenter(comp);
	}
}