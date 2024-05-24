
public class CodingProject {

	public static void main(String[] args) {
		
		//1. Defining the array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1. a) 
		//Accessing the first and last elements then subtract
		int resultValue = ages[0] - ages[ages.length - 1];
		System.out.println(resultValue);
		System.out.println("--------------------------");
		
		//1. b) New array
		//New array
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 73};
		
		//1. b) i. Making sure there's 9 elements
		System.out.println(ages2.length + " elements in the array.");
		
		//1. b) ii. Accessing the first and last elements
		int resultValue2 = ages2[0] - ages2[ages2.length - 1];
		System.out.println(resultValue2);
		System.out.println("--------------------------");
		
		//1. b) iii.
		System.out.println("Using first value and last will work on any array that has at least 2 elements");
		System.out.println("--------------------------");
		
		//1. c) Creating a loop to calculate average age
		int sum = 0;
		
			//Iterate each element and we add them together
			for (int age : ages) {
				sum += age;
			}
		
		//create a value with average age
		int average = sum / ages.length;
		System.out.println(average);
		System.out.println("--------------------------");
		
		//2. 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2. a)
		int numOfLetters = 0;
		
			for (String name : names) {
				numOfLetters += name.length();
			}
		int averageNumOfLetters = numOfLetters / names.length; 
		System.out.println(averageNumOfLetters);
		System.out.println("--------------------------");
		
		//2. b)
		//Create an empty value
		String concatNames = "";
		
		
			for (String name : names) {
				concatNames += name + " ";
			}
			
		System.out.println(concatNames);
		System.out.println("--------------------------");
		
		//3. Last element of any array regardless of length
		System.out.println(names[names.length - 1]);
		System.out.println("--------------------------");
		
		//4. First element is 0 index 
		System.out.println(names[0]);
		
		//5. 
		// create new element the same length as names 
        int[] nameLengths = new int[names.length];

        // loop to iterate over the names
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        //print the name lengths
        for (int length : nameLengths) {
            System.out.println(length);
        }
        System.out.println("--------------------------");

        //6.
        // create new element
        int sumOfNameLengths = 0;
        
        // loop name lengths
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println(sumOfNameLengths);
        System.out.println("--------------------------");

        //7.
        // print the method
        String result = sameWord("Hello", 3);
        System.out.println(result);
        System.out.println("--------------------------");

        //8.
        // create new string element that equals to the method fullName
        String printFullName = fullName("Oscar", "Diaz");
        
        //print new element
        System.out.println(printFullName);
        System.out.println("--------------------------");

        //9.
        // creates the array int
        int[] numbers = {10, 20, 33, 22, 14};
        boolean sumResult = returnValue(numbers);
        System.out.println(sumResult);
        System.out.println("--------------------------");

        //10.
        double[] doubles = { 35.2, 23.9, 48.7 };
		System.out.println(averageOfDoubles(doubles));
        System.out.println("--------------------------");


        //11.
        double[] arrayOne = {2.4, 2.1, 3.2};
        double[] arrayTwo = {1.3, 3.2, 2.7};

        boolean resultReturn = averageGreaterThan(arrayOne, arrayTwo);
        System.out.println(resultReturn);
        System.out.println("--------------------------");


        //12.
        //declare elements
        boolean isHotOutside = true;
        double moneyInPocket = 10.51;

        //run method
        boolean resultMethod = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println(resultMethod);
        System.out.println("--------------------------");
        
        //13.
        //double array
        double[] runs = { 3.96, 4.45, 2.95, 3.95, 4.05, 4.1 };
        double[] times = { 35.10, 39.48, 26.20, 35.05, 35.50, 36.10 };
        
        //printing values
        System.out.println("You have run " + runs.length + " times this week.");
        System.out.println("Your average time is " + timeAverage(times) + " minutes.");
		System.out.println("Your average run in the last month is: " + runsAverage(runs) + " miles.");
        System.out.println("--------------------------");
        
	}


    // METHODS //
	//13. 
	public static double runsAverage(double[] array) {
		
		//adding all distance runs
		double sumDistance = 0;
		for (double number : array) {
			sumDistance += number;
		}
		//returning the average
		return sumDistance / array.length;
	}
	
	public static double timeAverage(double[] array) {
		//adding all distance runs
		double sumTimes = 0;
		for (double number : array) {
			sumTimes += number;
		}
		//returning the average
		return sumTimes / array.length;
	}

    //12.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        //check if it is hot outside and if moneyInPocket is greater than 10.50
        if (isHotOutside && moneyInPocket > 10.50) {
            return true;
        }
        return false;
    }


    //11.
    public static boolean averageGreaterThan(double[] arrayOne, double[] arrayTwo) {
        //first double
        double sum1 = 0;

        for (double num : arrayOne) {
            sum1 += num;
        }

        double average1 = sum1 / arrayOne.length;

        //second double
        double sum2 = 0;

        for (double num : arrayTwo) {
            sum2 += num;
        }

        double average2 = sum2 / arrayTwo.length;

        //return boolean
        return average1 > average2;
    }

    //10.
    public static double averageOfDoubles(double[] array) {
		double sum = 0;

		for (double number : array) {
			sum += number;
		}
		//calculate double 
		return sum / array.length;
	}


    //9.
    public static boolean returnValue(int[] numbers) {
        int sumOfInts = 0;

        //add all ints
        for (int number : numbers) {
            sumOfInts += number;
        }

        //return true if meets requirements
        return sumOfInts > 100;
    }
 
    //8.
    public static String fullName(String fname, String lname) {
        //concatenate
    	return fname + " " + lname;
    }

    //7.

    public static String sameWord(String word, int n) {
        // use a stringbuilder for result
        StringBuilder repeatWord = new StringBuilder();
        
        //iterate the word n times
        for (int i = 0; i < n; i++) {
            repeatWord.append(word);
        }

        //return the string as a sequence 
        return repeatWord.toString();
    }

}