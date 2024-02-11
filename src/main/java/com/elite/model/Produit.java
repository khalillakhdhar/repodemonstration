package com.elite.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit extends AuditModel {
private String titre;
private String description;
private double prix;
private int quantite;
private boolean isExpired;
}
