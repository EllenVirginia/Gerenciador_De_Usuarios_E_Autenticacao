package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertEquals; // importa metodo
import java.util.List; // importa a interface list
import org.junit.jupiter.api.Test; //importa anotação para indicar que os metodos são metodos de teste

public class UserServiceTest{
	private UserService userService = new UserService(); //Instancia um objeto da classe UserService que será testado
	
	@Test //Marca metodo como teste
	public void createUser(){ 
		User user = new User ("Nome","123456");
		List<User> users = userService.create(user); //Chama o método create de UserService para adicionar o usuário à lista e retorna a lista atualizada
		assertEquals (1, users.size()); // Verifica se a lista contém exatamente 1 usuário após a adição
		assertEquals (user, users.get(0)); //Verifica se o primeiro (e único) usuário na lista é igual ao usuário criado.
	}	
}