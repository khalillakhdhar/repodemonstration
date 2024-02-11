package com.elite;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.elite.model.Produit;
import com.elite.repositories.ProduitRepository;

@SpringBootApplication
@EnableJpaAuditing
public class RepodemonstrationApplication implements CommandLineRunner {
	@Autowired
	ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(RepodemonstrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Produit p1=new  Produit("pc Asus laptop", "Pc gamer I7 11G", 3800, 6, false);
		produitRepository.save(p1);
		Produit p2=new  Produit("souris laser", "souris low cost", 8, 1, false);
		produitRepository.save(p2);
		Produit p3=new  Produit("tomate", "tomate bonne qualité", 2.4, 20, true);
		produitRepository.save(p3);
		getList(produitRepository.findAll());
		System.out.println("---filtrage par titre ou description---");
		getList(produitRepository.findByTitreOrDescriptionContaining("pc", "gamer"));

		System.out.println("---filtrage par prix---");
		getList(produitRepository.findByPrixBetween(1, 30));

	}
	 void getList(List<Produit> prods)
	 {
		 prods.forEach(prod->
		 {
			 System.out.println(prod.toString());
		 }
				 );
	 }

}
