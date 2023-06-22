package Brackets;

import java.util.Stack;

public class BalancedBrackets {

	public static boolean balanceBrack(String str) {

		Stack stc = new Stack();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				stc.push(c);
				continue;
			}

			if (stc.isEmpty()) {
				return false;
			}

			char cc;
			switch (c) {

			case '}':
				cc = (char) stc.pop();
				if (cc == '[' || cc == '(')
					return false;
				break;
			case ')':
				cc = (char) stc.pop();
				if (cc == '{' || cc == '[')
					return false;
				break;
			case ']':
				cc = (char) stc.pop();
				if (cc == '(' || cc == '{')
					return false;
				break;

			}

		}
		return (stc.isEmpty());
	}

	public static void main(String[] args) {

		String stin = "(){}{{}}[[]]";
		if (balanceBrack(stin))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

}
