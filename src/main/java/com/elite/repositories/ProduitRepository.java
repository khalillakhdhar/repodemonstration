package com.elite.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	List<Produit> findByTitre(String titre);
	List<Produit> findByTitreOrDescriptionContaining(String titre,String description);
	List<Produit> findByPrixBetween(double min,double max);
	List<Produit> findByQuantiteLessThanEqual(int quantite);
	List<Produit> findByIsExpired(boolean expiration);

}
