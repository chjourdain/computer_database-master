package com.excilys.formation.computerdatabase.persist.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.excilys.formation.computerdatabase.model.Computer;

public interface ComputerDao extends PagingAndSortingRepository<Computer, Long> {

  public void deleteByCompany_id(Long company_id);

  @Query("SELECT c FROM computer c WHERE "
	      + "c.name LIKE :search OR c.company.name LIKE :search ")
  public Page<Computer> findByNameCompanySearch (@Param("search") String search, Pageable page);
}
