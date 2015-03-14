package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

import controller.Controller;

public class MainFrame extends JFrame {
	
	/**
	 * Generated serialVersioUID
	 */
	private static final long serialVersionUID = 9171151647954871073L;
	private Controller controller;
	private TablePanel tablePanel;
	private Toolbar toolbar;
	
	public MainFrame() {
		super("Regression Line demo");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		controller = new Controller();
		tablePanel = new TablePanel();
		tablePanel.setBorder(BorderFactory.createLineBorder(Color.green, 5));
		
		add(tablePanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		
		setMinimumSize(new Dimension(500,400));
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
