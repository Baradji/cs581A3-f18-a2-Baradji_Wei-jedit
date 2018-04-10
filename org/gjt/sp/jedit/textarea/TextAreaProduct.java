package org.gjt.sp.jedit.textarea;


import org.gjt.sp.jedit.JEditActionContext;
import org.gjt.sp.jedit.JEditBeanShellAction;
import org.gjt.sp.jedit.JEditActionSet;
import org.gjt.sp.jedit.input.InputHandlerProvider;
import java.util.EventObject;
import org.gjt.sp.jedit.input.DefaultInputHandlerProvider;
import org.gjt.sp.jedit.input.TextAreaInputHandler;
import java.io.Serializable;

public class TextAreaProduct implements Serializable {
	private JEditActionContext<JEditBeanShellAction, JEditActionSet<JEditBeanShellAction>> actionContext;
	private InputHandlerProvider inputHandlerProvider;

	public JEditActionContext<JEditBeanShellAction, JEditActionSet<JEditBeanShellAction>> getActionContext() {
		return actionContext;
	}

	public InputHandlerProvider getInputHandlerProvider() {
		return inputHandlerProvider;
	}

	public void setInputHandlerProvider(InputHandlerProvider inputHandlerProvider) {
		this.inputHandlerProvider = inputHandlerProvider;
	}

	/**
	* Creates an actionContext and initializes the input handler for this textarea. Called when creating a standalone textarea from within jEdit.
	*/
	public void initInputHandler(final TextArea textArea) {
		actionContext = new JEditActionContext<JEditBeanShellAction, JEditActionSet<JEditBeanShellAction>>() {
			@Override
			public void invokeAction(EventObject evt, JEditBeanShellAction action) {
				action.invoke(textArea);
			}
		};
		textArea.setMouseHandler(new TextAreaMouseHandler(textArea));
		inputHandlerProvider = new DefaultInputHandlerProvider(new TextAreaInputHandler(textArea) {
			@Override
			protected JEditBeanShellAction getAction(String action) {
				return actionContext.getAction(action);
			}
		});
	}
}