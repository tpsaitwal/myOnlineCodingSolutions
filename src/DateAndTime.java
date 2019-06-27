import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Result {

	/*
	 * Complete the 'findDay' function below.	
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. INTEGER month
	 *  2. INTEGER day
	 *  3. INTEGER year
	 */

	public static String findDay(int month, int day, int year)  {
		String result = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = simpleDateFormat.parse(day + "/" + month + "/" + year);
			switch (date.toString().substring(0, 3)){
			case "Mon":
				result = "MONDAY";
				break;
			case "Tue":
				result = "TUESDAY";
				break;
			case "Wed":
				result = "WEDNESDAY";
				break;
			case "Thu":
				result = "THURSDAY";
				break;
			case "Fri":
				result = "FRIDAY";
				break;
			case "Sat":
				result = "SATURDAY";
				break;
			case "Sun":
				result = "SUNDAY";
				break;
			} 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
}

public class DateAndTime {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);
		System.out.println(res);

		// bufferedWriter.write(res);
		//bufferedWriter.newLine();

		//bufferedReader.close();
		//bufferedWriter.close();
	}
}
