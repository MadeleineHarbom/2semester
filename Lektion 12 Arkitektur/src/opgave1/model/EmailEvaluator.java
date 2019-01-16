package opgave1.model;

public class EmailEvaluator implements Evaluator {

	@Override
	public boolean isValid(String s) {
		if (s.length() <= 0) {
			return false;
		}
		//Make better
		int i = 0;
		Character c; //= s.charAt(0); //ellers faar jeg et maaske ikke initialiseret error
		boolean part1 = false;
		boolean part2 = false;
		boolean part3 = false;
		boolean lastSpecial = false;
		while (i < s.length() && !part1) {
			c = s.charAt(i);
			if (Character.isAlphabetic(c) || Character.isDigit(c)) {
				lastSpecial = false;
				i++;
			}
			else if (c.equals('.')) {
				if (lastSpecial) {
					return false;
				}
				i++;
				lastSpecial = true;
			}
			else if (c.equals('@')) {
				if (lastSpecial) {
					return false;
				}
				i++;
				part1 = true;
				lastSpecial = true;
			}
			else {
				return false;
			}
		}
		while (i<s.length() && part1 && !part2) {
			c = s.charAt(i);
			if (Character.isAlphabetic(c) || Character.isDigit(c)) {
				i++;
				lastSpecial = false;
			}
			else if (c.equals('@')) {
				return false;
			}
			else if(c.equals('.')) {
				if (lastSpecial) {
					return false;
				}
				i++;
				part2 = true;
				lastSpecial = true;
			}
			else {
				return false;
			}
		}
		while (i<s.length() && part2) {
			c = s.charAt(i);
			if (Character.isAlphabetic(c) || Character.isDigit(c)) {
				part3 = true;
				i++;
			}
			else {
				return false;
			}
		}
		if (part1 && part2 && part3) {
			return true;
		}
		else {
			return false;
		}
	}

}
