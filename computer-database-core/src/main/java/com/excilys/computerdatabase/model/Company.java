package com.excilys.computerdatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String name;

    /**
     * Constructor.
     * @param name of the company.
     * @param id of the company in the database.
     */
    public Company(String name, long id) {
	this.name = name;
	this.id = id;
    }

    public Company() {
    }

    public long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Company other = (Company) obj;
	if (id != other.id) {
	    return false;
	}
	if (name == null) {
	    if (other.name != null) {
		return false;
	    }
	} else if (!name.equals(other.name)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Company [id=" + id + ", name=" + name + "]";
    }
}
