import java.time.LocalDate;
import java.time.LocalTime;
public class TodayDateTime
{
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		System.out.println("Today date is :"+date);
		System.out.println("Today time is :"+time);
	}
}