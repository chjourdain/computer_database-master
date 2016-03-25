package com.excilys.formation.computerdatabase.service;

import java.util.List;

import com.excilys.formation.computerdatabase.model.Computer;
import com.excilys.formation.computerdatabase.model.Pager;

public interface ComputerService extends GenericService<Computer> {

    int count();

    default Computer find(long id) {
	throw new UnsupportedOperationException();
    }

    List<Computer> findAll(Long index, int nbrElement);

    default Computer create(Computer c) {
	throw new UnsupportedOperationException();
    }

    default Computer update(Computer c) {
	throw new UnsupportedOperationException();
    }

    default void delete(Computer c) {
	throw new UnsupportedOperationException();
    }

    void fillPage(Pager pager);

}
