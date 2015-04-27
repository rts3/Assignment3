package edu.nvcc.csc200.sorting;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*; 
 
public class SortArray implements ActionListener{
	private JFrame SF;
	final int SIZE =7;
	private JPanel pt= new JPanel();
	private JPanel pm= new JPanel();
	private JButton sa = new JButton("Sort");
	private JLabel l1= new JLabel("Before:4,5,6,9,2,3,1,7");
	private JLabel l2= new JLabel("After;");
	private JTextField t1 = new JTextField(10);

	public SortArray(){
		
		pt.add(l1);
		pt.add(l2);
		pt.add(t1);
		sa.addActionListener(this);
		pm.add(sa);
		SF= new JFrame("Sum Programm");
		SF.add(pt,BorderLayout.CENTER);
		SF.add(pm,BorderLayout.SOUTH);
		SF.setVisible(true);
		SF.setSize(320,300);
		SF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e){
		int [] unsortedList ={4,5,6,9,2,3,1,7};
		int [] sortedList=sortedList(unsortedList);
		
		t1.setText(""+sortedList[0]+","+sortedList[1]+","+sortedList[2]+","+sortedList[3]+","+sortedList[4]+","+sortedList[5]+","+sortedList[6]+","+sortedList[7]);
	}
	public static int [] sortedList(int[] numberList){
		
		for(int i=0;i<numberList.length-1;i++){
			int gis= gis(i,numberList);
			swap(i,numberList,gis);
		}
		return numberList;
		
	}
	private static int gis(int sI, int[]a){
		int min=a[sI];
		int Imin=sI;
		for(int i=sI+1;i<a.length; i++){
			if(a[i]<min){
				min=a[i];
				Imin=i;
			}
		}
		return Imin;
	}
	private static void swap( int i,int[] numberList, int j) {
		// TODO Auto-generated method stub
		int temp = numberList[i];
		numberList[i]= numberList[j];
		numberList[j]= temp;
	}

	
}
