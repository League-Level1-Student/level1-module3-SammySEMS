package _01_intro_to_static;

public class AthleteMarathonRunner{
	
	public static void main(String[] args) {
	
	Athlete bob = new Athlete("Bob", 5);
	Athlete mark = new Athlete("Mark", 35);
    //create two athletes
    //print their names, bibNumbers, and the location of their race. 
	System.out.println(bob.name);
	System.out.println(bob.speed);
	
	System.out.println(mark.name);
	System.out.println(mark.speed);
	System.out.println("New York");
	System.out.println("9:00 AM");
	
	for (int i = 0; i < 5; i++) {
		
	
	int bibNumber;
int nextBibNumber=1;
	  bibNumber=nextBibNumber;
     for (int j= 0; j < 5; j++) {
		
	
	  nextBibNumber++;
     }
	System.out.println(nextBibNumber);}
	
}}