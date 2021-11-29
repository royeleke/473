package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import infrastructureLayer.MainService;

public class MainController {
	
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		  MainService mainService = (MainService) context.getBean("mainService");
			System.out.println(mainService.listFacilityProblems());
	}
}
