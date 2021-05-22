package br.com.web.project;


import br.com.web.project.model.service.ProductService;
import br.com.web.project.model.vo.Product;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Value("${bruno.teste}")
    private String url;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            ProductService productService = ctx.getBean(ProductService.class);


            List<Product> products = productService.list();

            System.out.println( products );
        };
    }

}
