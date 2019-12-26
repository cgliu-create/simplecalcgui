
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class calcgui {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			calcgui window = new calcgui();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize( 309, 380);
		shell.setText("Simple Calc SWT Application");
		shell.setLayout(null);

		
		
		text = new Text(shell, SWT.BORDER | SWT.RIGHT);
		text.setBounds(88, 10, 198, 51);
		
		// pressing a button adds the char to the display text
		Button btnNewButton_7  = new Button(shell, SWT.NONE);
		btnNewButton_7.setBounds(18, 67, 58, 58);
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_7.getText();
				text.setText(num);
			}
		});
		btnNewButton_7 .setText("7");
		
		Button btnNewButton_8  = new Button(shell, SWT.NONE);
		btnNewButton_8.setBounds(88, 67, 58, 58);
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_8.getText();
				text.setText(num);
			}
		});
		btnNewButton_8 .setText("8");
		
		Button btnNewButton_9  = new Button(shell, SWT.NONE);
		btnNewButton_9.setBounds(158, 67, 58, 58);
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_9.getText();
				text.setText(num);
			}
		});
		btnNewButton_9 .setText("9");
		
		Button btnNewButton_4  = new Button(shell, SWT.NONE);
		btnNewButton_4.setBounds(18, 138, 58, 58);
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_4.getText();
				text.setText(num);
			}
		});
		btnNewButton_4 .setText("4");
		
		Button btnNewButton_5  = new Button(shell, SWT.NONE);
		btnNewButton_5.setBounds(88, 138, 58, 58);
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_5.getText();
				text.setText(num);
			}
		});
		btnNewButton_5 .setText("5");
		
		Button btnNewButton_6  = new Button(shell, SWT.NONE);
		btnNewButton_6.setBounds(158, 138, 58, 60);
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_6.getText();
				text.setText(num);
			}
		});
		btnNewButton_6 .setText("6");
		
		Button btnNewButton_1  = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(18, 208, 58, 58);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_1.getText();
				text.setText(num);
			}
		});
		btnNewButton_1 .setText("1");
		
		Button btnNewButton_2  = new Button(shell, SWT.NONE);
		btnNewButton_2.setBounds(88, 208, 58, 58);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_2.getText();
				text.setText(num);
			}
		});
		btnNewButton_2 .setText("2");
		
		Button btnNewButton_3  = new Button(shell, SWT.NONE);
		btnNewButton_3.setBounds(158, 209, 58, 58);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_3.getText();
				text.setText(num);
			}
		});
		btnNewButton_3 .setText("3");
		
		Button btnNewButton_0  = new Button(shell, SWT.NONE);
		btnNewButton_0.setBounds(18, 279, 58, 58);
		btnNewButton_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_0.getText();
				text.setText(num);
			}
		});
		btnNewButton_0 .setText("0");
		
		Button btnNewButton_point  = new Button(shell, SWT.NONE);
		btnNewButton_point.setBounds(88, 279, 58, 58);
		btnNewButton_point.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_point.getText();
				text.setText(num);
			}
		});
		btnNewButton_point .setText(".");
		
		Button btnNewButton_times  = new Button(shell, SWT.NONE);
		btnNewButton_times.setBounds(228, 138, 58, 58);
		btnNewButton_times.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_times.getText();
				text.setText(num);
			}
		});
		btnNewButton_times .setText("*");
		
		Button btnNewButton_divide  = new Button(shell, SWT.NONE);
		btnNewButton_divide.setBounds(228, 67, 58, 58);
		btnNewButton_divide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_divide.getText();
				text.setText(num);
			}
		});
		btnNewButton_divide .setText("/");
		
		Button btnNewButton_plus  = new Button(shell, SWT.NONE);
		btnNewButton_plus.setBounds(228, 208, 58, 58);
		btnNewButton_plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_plus.getText();
				text.setText(num);
			}
		});
		btnNewButton_plus .setText("+");
		
		Button btnNewButton_minus  = new Button(shell, SWT.NONE);
		btnNewButton_minus.setBounds(228, 279, 58, 58);
		btnNewButton_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String num = text.getText() + btnNewButton_minus.getText();
				text.setText(num);
			}
		});
		btnNewButton_minus .setText("-");
		
		// actual operation
		Button btnNewButton_equal  = new Button(shell, SWT.NONE);
		btnNewButton_equal.setBounds(158, 279, 58, 58);
		btnNewButton_equal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				equalwithpemdas chrisliu = new equalwithpemdas();
				double num = chrisliu.equalopm(text.getText());
				String output = num +"";
				text.setText(output);
			}
		});
		btnNewButton_equal .setText("=");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText("");
			}
		});
		btnNewButton.setBounds(18, 10, 58, 51);
		btnNewButton.setText("clear");
		

	}
}
