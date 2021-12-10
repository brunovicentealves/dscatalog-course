package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id ;
	private String authority;
	
	public RoleDTO(Role role) {

		this.id = role.getId();
		this.authority = role.getAuthority();
	}
	
	

}
