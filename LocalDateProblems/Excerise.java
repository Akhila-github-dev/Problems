package LocalDateProblems;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class Excerise{
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
	    LocalDate birthday= LocalDate.of(2000, 03, 14);
	    System.out.println(today);
	    Period period=Period.between(birthday, today);
	 System.out.println("You are "+ period.getYears() +" years, "+ period.getMonths() +" months and "+ period.getDays()+" days old.");   
	 
	 /*

     Excercise :- Segregate each element from dateOne (for example: year,month,day...etc) using get() method and display
     
     
     */
	 
	 System.out.println("date "+today.getDayOfMonth());
	 System.out.println("in 365 days how many days completed "+today.getDayOfYear());
	 System.out.println("day sunday "+today.getDayOfWeek());
	 System.out.println("year "+today.getYear());
	 System.out.println("month "+today.getMonth());
	 System.out.println("month value "+today.getMonthValue());
	 
	 
		/*
		
		Exercise :- 
					Thomas has to board train departing at 8:00 PM, You have to check whether he will be able to board or not.
					It takes him 2.5 hrs to reach the station and further 15 mins to reach the platform.
					Before what time should he leave his house in order to board the train ?
					(Hint :- You can use isAfter() and isBefore() methods, take reference from LocalDate tryout)
	
	*/
	 
	 LocalTime boardtime=LocalTime.of(8, 0);
	 LocalTime startTime = boardtime.minusHours(2).minusMinutes(45);
	 
	 System.out.println(startTime);
	 
	 LocalTime time=LocalTime.of(5, 30);
	 
	 if(time.isBefore(startTime) ||startTime.equals(time)) {
		 System.out.println("ur able to catch the train");
	 }else {
		 System.out.println("u will miss the train");
	 }
	}
}   