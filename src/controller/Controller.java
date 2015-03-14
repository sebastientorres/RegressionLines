package controller;

import gui.LinePanel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;

import model.Points;

public class Controller {
	
	public static List<Points> listPoints = new ArrayList<Points>();
	
	public static void createPoints() {
		
		System.out.println("createPoints() triggered");
		for (int i = 0; i < 100000; i++){
			listPoints.add(new Points());
		}
	}

	public static void drawLine() {
		System.out.println("drawLine() triggered");
		for(Points item : listPoints){
			
		}
		
	}
	
	private LinePanel buildPlotTable(){
		LinePanel linePanel = new LinePanel();
		linePanel.setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
		
		return linePanel;
		
	}

}
