package pos_java_jdbc.pos_java_jdbc;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import conexaoJDBC.SingleConnection;
import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void iniciaInserir() {

		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		userposjava.setNome("Paula");
		userposjava.setEmail("paula@gmail.com");

		userPosDAO.salvar(userposjava);

		System.out.println("Processo de inserir novo usuario finalizado!");

	}

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
		
		System.out.println("Processo de listar os usuarios finalizado!");
		
	}

	@Test
	public void iniciarBuscar() {

		UserPosDAO userPosDAO = new UserPosDAO();

		try {
			Userposjava userposjava = userPosDAO.buscar(12L);
			System.out.println(userposjava);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Processo de buscar o usuario finalizado!");

	}

	@Test
	public void iniciarAtualizar() {

		try {

			UserPosDAO dao = new UserPosDAO();

			Userposjava objetoBanco = dao.buscar(12L);

			objetoBanco.setNome("Pedro");
			objetoBanco.setEmail("pedro@gmail.com");

			dao.atualizar(objetoBanco);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Processo para atualizar o usuário finalizado!");

	}

	@Test
	public void iniciaDeletar() {

		try {
			UserPosDAO dao = new UserPosDAO();

			dao.deletar(12L);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Processo de apagar usuário finalizado!");
	}

	@Test
	public void salvarTelefone() {

		UserPosDAO dao = new UserPosDAO();

		Telefone telefone = new Telefone();
		telefone.setNumero("(13) 6666-88888");
		telefone.setTipo("Celular");
		telefone.setUsuario(9L);

		dao.salvarTelefone(telefone);

		System.out.println("Processo de adicionar telefone finalizado!");
	}

	@Test
	public void listaComTelefone() {

		UserPosDAO dao = new UserPosDAO();

		List<BeanUserFone> beanUserFones = dao.listaUserFone(9L); // passa o id para busca

		for (BeanUserFone beanUserFone : beanUserFones) {

			System.out.println(beanUserFone);
			System.out.println("-----------------------------------------");

		}

		System.out.println("Processo de listagem de usuario com telefone finalizado!");

	}

	@Test
	public void deleteTelefoneUsuario() {

		UserPosDAO dao = new UserPosDAO();

		dao.deletarFonesPorUsuario(13L);

		System.out.println("Processo de apagar finalizado!");

	}

}
