package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexaoJDBC.SingleConnection;

public class TesteBancoJdbc {
	
	@Test
	public void iniciaBanco() {
		
		SingleConnection.getConnection();
		
	}

}
