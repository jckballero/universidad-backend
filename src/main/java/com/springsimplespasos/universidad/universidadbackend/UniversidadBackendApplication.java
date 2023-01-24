package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UniversidadBackendApplication {

	@Autowired
	private AlumnoDAO servicio;

	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
		/* for(String str: beanDefinitionNames) {
			System.out.println(str);
		}*/
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			//Persona alumno = new Alumno(null, "Raul", "Perez", "111111111", new Direccion("Calle falsa", "123", "1623", "", "", "Junin"));

/*			Direccion direccion = new Direccion("Calle el mamey", "1234", "0652", "", "", "Veranillo");
			Persona alumno = new Alumno(null, "Lorena", "Miranda", "12121212", direccion);

			Persona save = servicio.save(alumno);
			System.out.println(save.toString());*/
			List<Persona> alumnos = (List<Persona>) servicio.findAll();
			alumnos.forEach(System.out::println);
		};
	}

}
