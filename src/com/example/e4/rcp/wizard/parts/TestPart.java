package com.example.e4.rcp.wizard.parts;

import java.nio.channels.CompletionHandler;

import javax.annotation.PostConstruct;
import javax.annotation.processing.Completion;

import org.eclipse.jface.fieldassist.AutoCompleteField;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TestPart {

	private Text txtInput;
	//ContentProposalAdapter CPA = new ContentProposalAdapter(txtInput,new TextContentAdapter(),);
	//AutoCompleteField ACF = new AutoCompleteField(control, controlContentAdapter, proposals)
	ContentProposal CP = new ContentProposal("Some content proposal");
	
	
	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		txtInput = new Text(parent, SWT.BORDER);
		txtInput.setMessage("Enter command here");
		txtInput.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// Perhaps unessesary
			}
		});
		txtInput.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println("You released a key!");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.keyCode == 13){
					// 13 is the keyCode for the return key
					// TODO: This code should be rewritten
					String inputLine = txtInput.getText();
					System.out.println(inputLine);
				}
			}
		});
		txtInput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}
	
}
