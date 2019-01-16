//package opgave1.test;

import opgave1.model.EmailEvaluator;
import opgave1.model.FieldEvaluator;
import opgave1.model.NumberEvaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvaluatorTest {
	private FieldEvaluator num = new FieldEvaluator(new NumberEvaluator());
	private FieldEvaluator mail = new FieldEvaluator(new EmailEvaluator());

	@Test
	public void testIsValidNum() {
		assertTrue(num.evaluate("123"));
		assertTrue(num.evaluate(".123"));
		assertTrue(num.evaluate("1.123E33"));
		assertTrue(num.evaluate("0"));
		assertTrue(num.evaluate("-0.0"));
		assertFalse(num.evaluate(""));
		assertFalse(num.evaluate("-"));
		assertFalse(num.evaluate("0,0123"));
	}
	
	@Test
	public void testIsValidMail() {
		assertFalse(mail.evaluate("user@host"));
		assertFalse(mail.evaluate("first.last@host"));
		assertTrue(mail.evaluate("first.last@host.domain"));
		assertFalse(mail.evaluate(""));
		assertFalse(mail.evaluate(" "));
		assertFalse(mail.evaluate("user"));
		assertFalse(mail.evaluate("user."));
		assertFalse(mail.evaluate("user@"));
		assertFalse(mail.evaluate("user@."));
		assertFalse(mail.evaluate("user.@"));
		assertFalse(mail.evaluate("user@domain."));
	}


}
