package com.crudproje.demo;

import com.crudproje.demo.dataAccess.CagriDAO;
import com.crudproje.demo.dataAccess.ICagriDAO;
import com.crudproje.demo.entities.Cagri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	@Autowired
	CommandLineRunner commandLineRunner(ICagriDAO cagriDAO)
	{
		return runner -> {
			//addCagri(cagriDAO);
			//getCagriById(cagriDAO);
			//deleteCagriById(cagriDAO);
			//updateCagri(cagriDAO);
			//getAllCagrilar(cagriDAO);
			updateMany(cagriDAO);
		};
	}

	private void updateMany(ICagriDAO cagriDAO) {
		cagriDAO.updateMany();
	}

	private void getAllCagrilar(ICagriDAO cagriDAO) {
		List<Actor> actors = cagriDAO.getAll();

		for (Cagri cagri : cagrilar) {
			System.out.println(cagri);
		}
	}

	private void updateCagri(ICagriDAO cagriDAO) {
		Cagri cagri = cagriDAO.getByteId(1);
		System.out.println((cagri));

		cagri.setCalisan_id(5);
		cagriDAO.updateCagri(cagri);
		System.out.println(cagri);
	}

	private void deleteCagriById(ICagriDAO cagriDAO) {
		int id = 2;
		cagriDAO.deleteById(id);

		Cagri cagri = CagriDAO.getById(id);

		if (cagri == null)
			System.out.println("veri basariyla silindi");
		else
			System.out.println("silme sırasında bir problem meydana geldi");
	}

	private void getCagriById(ICagriDAO cagriDAO)
	{
		int id=2;
		Cagri cagri = CagriDAO.getById(id);

		if (cagri == null)
			System.out.println("Cagri bulunamadi");
		else
			System.out.println(cagri);
	}

	private void addCagri(ICagriDAO cagriDAO)
	{
		Cagri cagri = new Cagri("1","2","05-08-2001","08-082008","1");
		cagriDAO.add(cagri);
		System.out.println(cagri);
	}

}
