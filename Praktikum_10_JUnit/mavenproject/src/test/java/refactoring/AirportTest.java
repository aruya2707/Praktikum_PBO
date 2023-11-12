package refactoring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class AirportTest {
	 
	@DisplayName("Given there is an economy flight")
	@Nested
	class EconomyFlightTest 
	{
		private Flight economyFlight; 
	 
		@BeforeEach
		void setUp() {
			economyFlight = new EconomyFlight("1"); 
		}
	
	}
	 
	@DisplayName("Given there is a business flight")
	@Nested
	class BusinessFlightTest 
	{
		private Flight businessFlight;
		@BeforeEach
		void setUp() 
		{
			businessFlight = new BusinessFlight("2"); 
		}
	}
}