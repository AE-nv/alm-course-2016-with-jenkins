package be.ae.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Product {
	
	private String name;
	private Double price;
	private String description;
    private Time releaseDate;
}
