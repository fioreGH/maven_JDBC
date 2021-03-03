package pos_java_jdbc.pos_java_jdbc;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import conexaoJDBC.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	/*@Test
	public void iniciaBanco() {
		
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(7L);
		userposjava.setNome("Vinicius");
		userposjava.setEmail("vinicius@gmail.com");
		
		userPosDAO.salvar(userposjava);
		
	}*/
	
	@Test
	public void iniciaListar() {
		
		UserPosDAO userPosDAO = new UserPosDAO();
		try {
			List<Userposjava> list = userPosDAO.listar();
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("______________________________________________");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void iniciarBuscar() {
		
		UserPosDAO userPosDAO = new UserPosDAO();
		
		try {
			Userposjava userposjava = userPosDAO.buscar(6L);
			System.out.println(userposjava);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}
