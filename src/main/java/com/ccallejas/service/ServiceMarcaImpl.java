package com.ccallejas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccallejas.beans.Marca;
import com.ccallejas.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca {
	
    @Autowired
	private DAOMarca daoMarca;
	
	public void registrar(Marca marca) throws Exception {
		try {
			daoMarca.registrar(marca);
		} catch (Exception e) {
			throw e;
		}		
	}

}
