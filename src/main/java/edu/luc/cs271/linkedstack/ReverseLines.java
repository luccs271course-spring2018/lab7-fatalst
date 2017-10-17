package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

	public static void main(String[] args) {
		// TODO read successive input lines until EOF, then print out in reverse order

	    final Scanner input = new Scanner(System.in);
	    int n = 0;
	    
	    LinkedStack<String> stack = new LinkedStack<String>();
	    
		String line;
		while ((line = input.nextLine()) != null) {
			
			line = input.nextLine();
			if(line == "EOF"){
				break;
			}
			else{
				stack.push(line);
				n++;
			}
		
		}

		for(int i = 0; i < stack.asList().size(); i++){
			
			System.out.println(stack.asList());
		}

	}
}
