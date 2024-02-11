package com.elite.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class Tutorial extends AuditModel implements Serializable{
@Column(nullable = false)
private String title;
private String description;
private boolean published;
@OneToOne(mappedBy = "tutorial")
@JsonIgnoreProperties("tutorial")
private TutorialDetails tutorialDetails;
@OneToMany(mappedBy = "tutorial",fetch = FetchType.EAGER)
@JsonIgnoreProperties("tutorial")
private Set<Comments> comments;
@ManyToMany(mappedBy = "tutorials")
@JsonIgnoreProperties("tutorials")
private Set<Tags> tags;
	
	
	
	
}
