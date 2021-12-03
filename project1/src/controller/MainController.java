package controller;

import infrastructureLayer.MainService;

public class MainController {
	private static MainService mainService;
	
	public static void main(String[] args) {
			mainService= new MainService();
			System.out.println(mainService.listFacilities());
	}
}
