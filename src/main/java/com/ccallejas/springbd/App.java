package com.ccallejas.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccallejas.beans.Marca;
import com.ccallejas.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Marca marca = new Marca();
        marca.setId(3);
        marca.setNombre("Chevignon");
        
        ApplicationContext contex = new ClassPathXmlApplicationContext("com/ccallejas/xml/beans.xml");
        
        ServiceMarca sm = (ServiceMarca) contex.getBean("serviceMarcaImpl");
        
        try {
			sm.registrar(marca);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
