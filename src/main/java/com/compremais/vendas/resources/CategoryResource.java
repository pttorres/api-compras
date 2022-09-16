package com.compremais.vendas.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.compremais.vendas.domain.Category;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Category> list() {
		
		Category c1 =  new Category(1, "Informatica");
		Category c2 =  new Category(2, "Escritório");
		
		List<Category> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		return list;
		
	}
	
}
