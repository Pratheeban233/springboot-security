package com.boot.security.models;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "sbs_user")
@Data
@NoArgsConstructor
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SBS_USER_ID_SEQ")
	@SequenceGenerator(sequenceName = "sbs_user_id_seq",allocationSize = 1,name = "SBS_USER_ID_SEQ")
	private Long id;

	@NonNull
	@Column(name = "user_name")
	private String userName;

	@NonNull
	@Column(name = "password")
	private String password;

	@Column(name = "is_active")
	private boolean isActive;

	@NonNull
	@Column(name = "roles")
	private String roles;
}
