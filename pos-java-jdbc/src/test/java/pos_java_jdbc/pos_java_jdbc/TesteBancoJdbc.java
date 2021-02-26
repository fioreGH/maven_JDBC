package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexaoJDBC.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void iniciaBanco() {
		
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(6L);
		userposjava.setNome("Douglas");
		userposjava.setEmail("douglas@gmail.com");
		
		userPosDAO.salvar(userposjava);
		
	}

}
