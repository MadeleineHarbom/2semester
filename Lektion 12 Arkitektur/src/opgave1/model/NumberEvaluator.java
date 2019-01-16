package opgave1.model;

import java.util.Calendar;

public class NumberEvaluator implements Evaluator {

	@Override
	public boolean isValid(String s) {
		boolean hasdigit = false;
		boolean hasdog = false;
		if (s.length() <= 0) {
			return false;
		}
		int i = 0;
		Character c = s.charAt(i);
		if (c.equals('-')) {
			i++;
		}
		while(i < s.length()) {
			c = s.charAt(i);
			if (Character.isDigit(c)) {
				hasdigit = true;
				i++;
			}
			else if (c.equals(' ') || c.equals('E')) {
				i++;
			}
			else if (c.equals('.')) {
				if (hasdog) {
					return false;
				}
				else {
					hasdigit = true;
					i++;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	
}
