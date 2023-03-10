package com.lvg.ojdemo.entity;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import com.lvg.ojdemo.support.ERole;
@Entity
//@Table(name="roles")
public class Role 
{
    @Id
    @Column(name="role_id")
    private Integer id;
    
    @Enumerated(EnumType.STRING)
    private ERole name;
    
    public Role() {}

	public Role(ERole name) 
	{
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}
    
}
