package JFrame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Libs.Param;

public class FrameHinhCau extends JFrame{
	public static int subFrameWidth=275,subFrameHight=250,xOBegin=10,yOBegin=25,khoangCach=100,labelSize=25,textSize=75;
	
	public JFrame create() {
		JFrame frame = new JFrame("HINH CAU");
		frame.setSize(subFrameWidth, subFrameHight);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		
		JLabel labelX1,labelY1,labelZ1,labelBanKinhR;
		
		labelX1=new JLabel("X1");
		labelX1.setBounds(10,25,labelSize,25);
		frame.add(labelX1);
		Param.txtX1=new JTextField();
		Param.txtX1.setBounds(40,25,textSize,25);
		frame.add(Param.txtX1);
		
		labelY1=new JLabel("Y1");
		labelY1.setBounds(130,25,labelSize,25);
		frame.add(labelY1);
		Param.txtY1=new JTextField();
		Param.txtY1.setBounds(160,25,textSize,25);
		frame.add(Param.txtY1);
		
		labelZ1=new JLabel("Z1");
		labelZ1.setBounds(10,75,labelSize,25);
		frame.add(labelZ1);
		Param.txtZ1=new JTextField();
		Param.txtZ1.setBounds(40,75,textSize,25);
		frame.add(Param.txtZ1);
		
		labelBanKinhR=new JLabel("R");
		labelBanKinhR.setBounds(10,125,labelSize,25);
		frame.add(labelBanKinhR);
		Param.txtR=new JTextField();
		Param.txtR.setBounds(40,125,textSize,25);
		frame.add(Param.txtR);
		
		
		Param.btnDraw=new JButton("DRAW");
		Param.btnDraw.setFocusPainted(false);     	// xoa duong vien tren button khi click
		Param.btnDraw.setBackground(Color.white);	//background cho button
		Param.btnDraw.setContentAreaFilled(false);	
		Param.btnDraw.setOpaque(true);
		Param.btnDraw.setBounds(40,175,textSize,30);
		frame.add(Param.btnDraw);
		
		
		Param.btnCls=new JButton("CLEAR");
		Param.btnCls.setFocusPainted(false);
		Param.btnCls.setBackground(Color.white);
		Param.btnCls.setContentAreaFilled(false);
		Param.btnCls.setOpaque(true);
		Param.btnCls.setBounds(160,175,textSize,30);
		frame.add(Param.btnCls);
		frame.setResizable(false);
		frame.setVisible(true);
		return frame;
	}
	
	public void processTXT() {
		String text = Param.txtX1.getText();
		
		if(text.equals("")){
			Param.txtX1.requestFocus(); // nhay den de nhap tien gui
        } else {
        	Param.tamO.x = (int) (Integer.parseInt(text) / 0.2 + 140);
    
        	text = Param.txtY1.getText();
        	if(text.equals("")){
        		Param.txtY1.requestFocus(); // nhay den de nhap tien gui
            } else {
            	Param.tamO.y = (int) Math.abs(Integer.parseInt(text) / 0.2 + 70);
            	
            	text = Param.txtZ1.getText();
            	if(text.equals("")){
            		Param.txtZ1.requestFocus();
            	}
            	else{
            		Param.tamO.z = (int) Math.abs(Integer.parseInt(text)/Math.sqrt(2) / 0.2 + 78);
            		
            		text = Param.txtR.getText();
            	if(text.equals("")){
            		Param.txtR.requestFocus(); // nhay den de nhap tien gui
                } else {
                	Param.R = (int) (Integer.parseInt(text) / 0.2);
                	
                }
              }
            }
        }
	}
	
	public void clear(){
		Param.tamO.x = -1;
		Param.tamO.y = -1;
		Param.R = 0;
		
		Param.txtX1.setText("");
		Param.txtX1.requestFocus();
		Param.txtY1.setText("");
		Param.txtZ1.setText("");
		Param.txtR.setText("");
		
	}
}
