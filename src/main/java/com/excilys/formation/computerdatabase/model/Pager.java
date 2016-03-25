package com.excilys.formation.computerdatabase.model;

import java.util.List;

import com.excilys.formation.computerdatabase.model.dto.ComputerDTO;
import com.excilys.formation.computerdatabase.persist.dao.mapper.ComputerDtoMapper;
import com.excilys.formation.computerdatabase.service.GenericService;

public class Pager<T> {

    public List<T> list;
    public int totalCount = 0;
    public int nbByPage;
    public int nbPages;
    public int currentPage;
    public String search = null;
    public String sort = null;

    public Pager(int nbParPage, int page) {
	this.nbByPage = nbParPage;
	this.nbPages = (int) Math.ceil(totalCount / nbParPage) + 1;
	currentPage = page;
    }

    public Pager(int nbParPage, int page, String search) {
	this.search = search;
	this.nbByPage = nbParPage;
	currentPage = page;
    }

    public int getTotalCount() {
	return totalCount;
    }

    public void setTotalCount(int nbEntries) {
	this.totalCount = nbEntries;
	this.nbPages = (int) Math.ceil(nbEntries / nbByPage);
    }

    public int getNbByPage() {
	return nbByPage;
    }

    public void setNbByPage(int nbParPage) {
	this.nbByPage = nbParPage;
	this.nbPages = (int) Math.ceil(totalCount / nbParPage) + 1;
    }

    public int getNbPages() {
	return nbPages;
    }

    public void setNbPages(int nbPages) {
	this.nbPages = nbPages;
    }

    public int getCurrentPage() {
	return currentPage;
    }

    public void setCurrentPage(int pageActuelle) {
	this.currentPage = pageActuelle;
    }

    public String getSearch() {
	return search;
    }

    public void setSearch(String search) {
	this.search = search;
    }

    public String getSort() {
	return sort;
    }

    public void setSort(String orderBy) {
	this.sort = orderBy;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    

}
