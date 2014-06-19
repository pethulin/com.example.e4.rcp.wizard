package com.example.e4.rcp.wizard.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class TestHandler {

	@Execute
	public void execute(Shell shell){
		if(MessageDialog.openQuestion(shell, "Question", "Do you like turtles?"))
			MessageDialog.openInformation(shell, "Yes", "You like turtles!");
		else
			MessageDialog.openInformation(shell, "No", "You don't like turtles!");
	}
	
}
