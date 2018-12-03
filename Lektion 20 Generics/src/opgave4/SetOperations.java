package opgave4;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		Set<T> newset = new HashSet<>();
		for (T t1: s1) {
			newset.add(t1);
		}
		for (T t2 : s2) {
			newset.add(t2);
		}
		return newset;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		Set<T> newset = new HashSet<>();
		boolean found = false;
		for (T t1 : s1) {
			for (T t2 : s2) {
				if (t2.equals(t1)) { // Will this work?
					found = true;
				}
			}
			if (!found) {
				newset.add(t1);
			}
			found = false;
		}
		for (T t2 : s2) {
			for (T t1 : s1) {
				if (t1.equals(t2)) { // Will this work?
					found = true;
				}
			}
			if (!found) {
				newset.add(t2);
			}
			found = false;
		}
		//Wet code
		return newset;

	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		Set<T> newset = new HashSet<>();
		boolean found = false;
		for (T t1 : s1) {
			for (T t2 : s2) {
				if (t2.equals(t1)) { // Will this work?
					found = true;
				}
			}
			if (found) {
				newset.add(t1);
			}
			found = false;
		}
		//retunere et sety med alle faelles objekter
		return newset;

	}

}
