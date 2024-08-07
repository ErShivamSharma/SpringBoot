package com.example.eduassign.entity;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// lombok send details
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String fname;
	private String lname;
	private String email;
	public Admin(String fname, String lname, String email) {
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	
	
	
	
	
}
