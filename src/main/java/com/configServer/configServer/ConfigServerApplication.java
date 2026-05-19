package com.configServer.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/*
* Este servidor solo funciona como un servidor que lee los archivos que estan en otro repositorio aparte
* y los expone a los microservicios clientes para que puedan acceder a sus configuraciones.
* Este servidor es sencillo y no tiene ninguna funcionalidad adicional.
* */
@EnableConfigServer //Permite habilitar este servicio como un servidor de configuración
@SpringBootApplication
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}