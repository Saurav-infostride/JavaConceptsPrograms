package Serialization_Deserialization;
// import required classes and packages
// we use classes of nio package to read bytes data of the JSON file

import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.Files.readAllBytes;

public class ReadFileAsString {
    public static void main(String[] args) throws Exception{
        String fileName, file, location;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file");
        fileName = sc.nextLine();
        System.out.print("Enter the laction of the "+fileName+" file: ");
        // take input from user and initialize location variable
        location = sc.nextLine();
        // close scanner class obj
        sc.close();
        // call convertFileIntoString() method that will return the file data as string. We store the returned data into file variable
        file = convertFileIntoString(location+"\\"+fileName);
        // print the result, i.e., JSON data in form of string
        System.out.println(file);
    }
    // create convertFileIntoString() method to convert JSON file into string
    public static String convertFileIntoString(String file)throws Exception
    {
        // declare a variable in which we store the JSON data as a string and return it to the main() method
        String result;
        // initialize result variable
        // we use the get() method of Paths to get the file data
        // we use readAllBytes() method of Files to read byted data from the files
        result = new String(readAllBytes(Paths.get(file)));
        // return result to the main() method
        return result;
    }
}
