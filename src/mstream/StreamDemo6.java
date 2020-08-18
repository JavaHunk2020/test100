package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo6 {
	
	public static void main(String[] args) {
		//10
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);//[Apple, Mango, Guava, Banana, Grapes]
		list.forEach(System.out::println);
	
		//list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		/*Stream<String> steams=list.stream();
		steams =steams.map(s->s.toUpperCase());
		steams.forEach(System.out::println);
		*/
	}

}
