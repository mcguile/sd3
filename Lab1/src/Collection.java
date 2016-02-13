import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Collection {
	private Person[] collection;
	private static int MAX_SIZE = 200;
	private int size;
	
	// filenames
	private static String FROMFNAME = "people.txt";
	private static String TOFNAME = "print_people.txt";
    // optional part (writing objects)
	private static String OBJFNAME = "people.ser";
	
	public Collection(int max){
		collection = new Person[max];
		size = 0;
	}
	
	public Collection(){
		this(MAX_SIZE);
	}
	
	public Person[] getCollection(){
		return collection;
	}
	
	public int getSize(){
		return size;
	}
	
	public void addPerson(String fname,String lname,int age){
		collection[size++] = new Person(fname,lname,age); 
	}
	
	// PART 2: complete the implementation
	public int maxAge(){
		if (size==0) return -1;
		int maxAge = 0;
		for (int i=0; i<size; i++) {
			if (collection[i].getAge() > maxAge) maxAge = collection[i].getAge();
		}
		return maxAge;
	}
	
	// PART 3: complete the implementation
	public void readFromFile() {
		try {
			FileReader fr = new FileReader(FROMFNAME);
			BufferedReader br = new BufferedReader(fr);
			String line;
			String[] s;
			while (br.ready()) {
				line = br.readLine();
				s = line.split(";");
				for (int i=0; i<s.length; i++) {s[i] = s[i].trim();}
				int age = Integer.parseInt(s[3]);
				addPerson(s[0],s[1],age);
		}
		br.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public void writeToFile(){
		StringBuffer val = new StringBuffer("\nMaximum age: " + maxAge());
		for (int i = 0; i < size; i++)
			val.append(collection[i].toString() + "\n");
		try{
			FileWriter wr = new FileWriter(TOFNAME);
			BufferedWriter bw = new BufferedWriter(wr);
			bw.write(val.toString());
			bw.close();
			System.out.println("file written to " + TOFNAME);
		  }catch(Exception e){
			  System.out.println(e.getMessage());
		  }
	}
	
	/*
	 *  Optional part
	 */
	public void writeObjects(){
	
	}
	
	public void readObjects(){

	}
	
	/*
	 *  main method - NOT REQUIRED - you should use JUnit instead...
	 */
	public static void main(String args[]){
		Collection col = new Collection();
		col.readFromFile();
		col.writeToFile();
	}
}
