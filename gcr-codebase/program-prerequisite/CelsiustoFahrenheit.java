// Celsius to Fahrenheit Conversion

import java.util.*;
public class CelsiustoFahrenheit{

private static final Logger logger = LoggerFactory.getlogger(CelsiustoFahrenheit.class);

 public static void main(String args[])
{

  Scanner sc = new Scanner(System.in);
  logger.info("Enter the Temperature in Celsius: ");
  int Celsius = sc.nextInt();
  int Fahrenheit = (Celsius * 9/5) + 32;
  logger.info(Fahrenheit);
}
}