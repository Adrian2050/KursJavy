package myKurs;

import java.util.Date;

public class mainKot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Date data = new Date(117,07,29);
		Kot qiqiku= new Kot("Qiqiku",data,1.57,"Judy");
		System.out.println(qiqiku.toString());
	}

}
