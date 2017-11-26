package game.test;

import javax.swing.JOptionPane;

import game.frame.GameFrame;

public class Test {
	public static void main(String[] args){
		GameFrame gf = new  GameFrame();
		/*
		int result = JOptionPane.showConfirmDialog(gf, "confirm");
		System.out.println("Result: "+result);		
		if(result == 0){
			JOptionPane.showMessageDialog(gf, "Game Start");
		}
		if(result == 1){
			JOptionPane.showMessageDialog(gf, "Game End");
		}
		if(result == 2){
			JOptionPane.showMessageDialog(gf, "Please choose again");
		}
		*/
		String username = JOptionPane.showInputDialog("Please input your name: ");
		if(username == null){
			JOptionPane.showMessageDialog(gf,"Please input your name again.");
		}
		else{
			JOptionPane.showMessageDialog(gf,"Your username is: " + username);
		}
	}

}
