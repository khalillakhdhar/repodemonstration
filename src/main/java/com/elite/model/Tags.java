package com.elite.model;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Tags extends AuditModel implements Serializable{
	@Column(unique = true,nullable = false)
	private String name;
	@ManyToMany(cascade = {CascadeType.MERGE,CascadeType.ALL})
	@JsonIgnoreProperties("tags")
	private Set<Tutorial> tutorials;

}
