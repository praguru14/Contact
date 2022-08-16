package com.graphql.ql;

import com.graphql.ql.entities.Book;
import com.graphql.ql.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QlApplication  implements CommandLineRunner {

	@Autowired
	private BookServices bookServices;
	public static void main(String[] args) {
		SpringApplication.run(QlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("PGL");
		b1.setDesc("AUTOBIO");
		b1.setPages(2000);
		b1.setPrice(34);
		b1.setAuthor("PG");
		this.bookServices.create(b1);
	}
}
