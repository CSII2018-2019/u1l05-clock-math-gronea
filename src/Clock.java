import javax.swing.JOptionPane;

public class Clock {
	public static void main (String [] args){
		//ask the user for a start time and duration
		//give an ending time
		
		//GET STARTING TIME
		int hours = 0;
		int minutes = 0;
		do {
			String answer = JOptionPane.showInputDialog(null, "Give me a start time (ex: 3:10): ");
			//figure out where the colon in
			int colonInd = answer.indexOf(':');
			//take start of string to where the colon is and make it an integer
			System.out.println(colonInd);
			hours = Integer.parseInt(answer.substring(0, colonInd));
			//take colon to end of string and make it an integer
			System.out.println(hours);
			minutes = Integer.parseInt(answer.substring(colonInd + 1, answer.length()));
			//check that it came in correctly
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
		} while (hours < 1 || minutes < 0);
		//GET DURATION
		String input = JOptionPane.showInputDialog(null, "Give me a duration (min.): ");
		int duration = Integer.parseInt(input);
		minutes += duration;
		if (minutes > 60 || minutes == 60) {
			int addHour = minutes / 60;
			hours += addHour;
			minutes %= 60;
		}
		if (hours > 12) {
			hours -= 12;
		}
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);		
		
		
		
		
	}
}
