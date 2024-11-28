package com.example.demo;
import java.util.List; // import de interfaçe lista
import java.util.ArrayList; // Importa a classe ArrayList que implementa a interface List para criar uma lista dinâmica.
import org.springframework.stereotype.Service; //Importa a anotação @Service, que marca a classe como um componente de serviço no Spring.


@Service //classe é um bean de serviço, ou seja, um componente que o Spring gerencia e disponibiliza para injeção em outros lugares.
public class UserService {
	List <User> users = new ArrayList <>  (); //ArrayList permite armazenar os objetos User de forma dinâmica.
	
	public List<User> create (User user) {
		users.add(user);
		return users;
	}
}