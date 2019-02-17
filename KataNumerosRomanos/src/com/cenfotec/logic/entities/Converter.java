package com.cenfotec.logic.entities;

public class Converter {
	
		public static String Convertir(int num) {
			String romano= "";
			int miles, centenas,unidades =0;
			
			miles= num/ 1000;
			romano = millares(romano, miles);
			
			centenas = (num - (miles*1000))/100;
			romano = centenas(romano, centenas);
			
			//decenas = num-((miles*1000)+(centenas *100));
			
			
			
			romano = unidades(romano, unidades);
			
			System.out.println(romano);
			return romano;
		}

		private static String centenas(String romano, int centenas) {
			int i;
			if (centenas == 9) {
		          romano = romano + "CM";
		      } else if (centenas >= 5) {
		                     romano = romano + "D";
		                     for (i = 6; i <= centenas; i++) {
		                            romano = romano + "C";
		                     }
		      } else if (centenas == 4) {
		                      romano = romano + "CD";
		      } else {
		                  for (i = 1; i <= centenas; i++) {
		                         romano = romano + "C";
		                  }
		      }
			return romano;
		}

		private static String millares(String romano, int miles) {
			for(int i=0;i<= miles;i++) {
				romano= romano +"M";
			}
			return romano;
		}

		private static String unidades(String romano, int unidades) {
			switch(unidades) {
			case 1:
				romano= "I";
				break;
			case 2:
				romano="II";
				break;
			case 3:
				romano= "III";
				break;
			case 4:
				romano= "IV";
				break;
			case 5:
				romano= "V";
				break;
			case 6:
				romano= "VI";
				break;
			case 7:
				romano= "VII";
				break;
			case 8:
				romano= "VIII";
				break;
			case 9:
				romano= "IX";
				break;
				
			}
			return romano;
		}
		
		
		
		
	}



