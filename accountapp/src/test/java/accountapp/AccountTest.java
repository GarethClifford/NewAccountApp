package accountapp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.app.AccountService;

public class AccountTest {

	@Test
	public void accountTest() {
		AccountService service = new AccountService();

		service.addAccount("Gareth", "Clifford","123");
		service.addAccount("Gareth", "Paul","124");
		service.addAccount("Ben", "Taylor","125");
				
		
		assert.assertEquals(2, service.getSum("Gareth"));
		assert.assertEquals(1, service.getSum("Ben"));
		assert.assertEquals(0, service.getSum("Andrew"));
	}

}
