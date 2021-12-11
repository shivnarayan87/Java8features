package com.foreachdemo;

import java.util.ArrayList;

public class ForEachUsesCase {
	//ArrayList<DoctoDTO> doctor= new ArrayList<DoctoDTO>();
	public static void main(String[] args) {
		ArrayList<UserDTO> user= new ArrayList<UserDTO>();
		
		ArrayList<DoctoDTO> doctor= new ArrayList<DoctoDTO>();
		
		DoctoDTO d= new DoctoDTO("raj","100","noida");
		DoctoDTO d1= new DoctoDTO("shiv","101","delhi");
		DoctoDTO d2= new DoctoDTO("ishu","102","patna");
		DoctoDTO d3= new DoctoDTO("suman","103","gaya");
		DoctoDTO d4= new DoctoDTO("priya","104","dehri");
		DoctoDTO d5= new DoctoDTO("santosh","105","sasaram");
		
		doctor.add(d1);
		doctor.add(d2);
		doctor.add(d3);
		doctor.add(d4);
		doctor.add(d5);
		
		doctor.stream().forEach((obj)->{
			user.add(new UserDTO(obj.getDoctorid(),obj.getDoctorname()));
		});
		
		for(UserDTO usrdto:user) {
			System.out.println("username:"+usrdto.getUsername()+" "+"Id: "+usrdto.getUserid());
			
		}
		
//		for (DoctoDTO doctoDTO : doctor) {
//			System.out.println("Name: "+doctoDTO.getDoctorname()+"  "+"city: "+doctoDTO.getDoctorcity()+" "+"Id:"+doctoDTO.getDoctorid());
//			System.out.println();
//		}
//		
		
		
		
	}

}
