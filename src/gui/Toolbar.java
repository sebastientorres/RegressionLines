package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
	
	/**
	 * Generated serialVersioUID
	 */
	private static final long serialVersionUID = -7532311366309850391L;
	private JButton plotPoints;
	private JButton drawLine;
	
	public Toolbar() {
		plotPoints = new JButton("Plot points");
		drawLine = new JButton("Draw trend \\ regression line");
		drawLine.setEnabled(false);
		
		plotPoints.addActionListener(this);
		drawLine.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(plotPoints);
		add(drawLine);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == plotPoints) {
			Controller.createPoints();
			setButtons(clicked);
		} else if (clicked == drawLine){
			Controller.drawLine();
			setButtons(clicked);
		}
	}
	
	public void setButtons(JButton clicked){
		if(clicked == plotPoints){
			drawLine.setEnabled(true);
			plotPoints.setEnabled(false);
		} else if (clicked == drawLine){
			drawLine.setEnabled(false);
			plotPoints.setEnabled(true);
		}
	}

}
