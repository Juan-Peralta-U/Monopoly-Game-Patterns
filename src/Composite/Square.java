/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author jhona
 */
import gui.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Composite.Component;
import FactoryMethod.Action;

public class Square extends JPanel implements Component{

	int number;
	static int totalSquares = 0;
	private String name;
	JLabel nameLabel;
	private int price;
	private int rentPrice;
        private boolean isRentPaid = false;
        private Action squareAction = null;

    public Square() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        public void playerAction(Player player){
            if(squareAction == null) return;
            squareAction.playerAction(player);
        }
        
        public void setPlayerAction(Action action){
            squareAction = action;
        }
	
	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}
	
        @Override
	public int getRentPrice() {
		return rentPrice;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
        @Override
	public int getPrice() {
		return price;
	}
	
        @Override
	public String getName() {
		return name;
	}
	
	
	public Square(int xCoord, int yCoord, int width, int height, String labelString, int rotationDegrees) {
		number = totalSquares;
		totalSquares++;
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(xCoord, yCoord, width, height);
		name = labelString;
		this.setLayout(null);

		if(rotationDegrees == 0) {
			nameLabel = new JLabel(labelString);
			nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
			nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
			nameLabel.setBounds(0,20,this.getWidth(),20);
			this.add(nameLabel);
		} else {	
			nameLabel = new JLabel(labelString) {
				protected void paintComponent(Graphics g) {
					Graphics2D g2 = (Graphics2D)g;
					g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
							RenderingHints.VALUE_ANTIALIAS_ON);
					AffineTransform aT = g2.getTransform();
					Shape oldshape = g2.getClip();
					double x = getWidth()/2.0;
					double y = getHeight()/2.0;
					aT.rotate(Math.toRadians(rotationDegrees), x, y);
					g2.setTransform(aT);
					g2.setClip(oldshape);
					super.paintComponent(g);
				}
			};
			if(rotationDegrees == 90) {
				nameLabel.setBounds(20, 0, this.getWidth(), this.getHeight());
			}
			if(rotationDegrees == -90) {
				nameLabel.setBounds(-10, 0, this.getWidth(), this.getHeight());
			}
			if(rotationDegrees == 180) {
				nameLabel.setBounds(0, 0, this.getWidth(), this.getHeight());
			}
			if(rotationDegrees == 135 || rotationDegrees == -135 || rotationDegrees == -45 || rotationDegrees == 45) {
				nameLabel.setBounds(0, 0, this.getWidth(), this.getHeight());
			}
			nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
			nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
			this.add(nameLabel);
		} 
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.number == 1 || this.number == 3 || this.number == 4) {
			g.drawRect(0, this.getHeight()-20, this.getWidth(), 20);
			g.setColor(Color.BLUE);
			g.fillRect(0, this.getHeight()-20, this.getWidth(), 20);
		}
		if(this.number == 6 || this.number == 8 || this.number == 9) {
			g.drawRect(0, 0, 20, this.getHeight());
			g.setColor(Color.PINK);
			g.fillRect(0, 0, 20, this.getHeight());
		}
		if(this.number == 11 || this.number == 13 || this.number == 14) {
			g.drawRect(0, 0, this.getWidth(), 20);
			g.setColor(Color.ORANGE);
			g.fillRect(0, 0, this.getWidth(), 20);
		}
		if(this.number == 16 || this.number == 17 || this.number == 19) {
			g.drawRect(this.getWidth()-20, 0, 20, this.getHeight());
			g.setColor(Color.GREEN);
			g.fillRect(this.getWidth()-20, 0, 20, this.getHeight());
		}
	}

        
	public boolean isRentPaid() {
		return isRentPaid;
	}
        
	public void setRentPaid(boolean pay) {
		isRentPaid = pay;
	}



}
