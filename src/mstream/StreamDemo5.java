package mstream;

import java.util.stream.Stream;

public class StreamDemo5 {
	
	public static void main(String[] args) throws InterruptedException {
		Stream<Integer> streams=Stream.iterate(2,(s)->s+2); // 2 4 6 8 10 12 
		System.out.println(streams);
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		
		//streams.forEach(s->System.out.println(s));
		streams.forEach((Integer s)->{
		      	System.out.println(s);
		      	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			});
		
		//streams.forEach(System.out::println);
	}

}
