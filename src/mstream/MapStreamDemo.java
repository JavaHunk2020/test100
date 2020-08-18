package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Fruit {
	String name;
	Fruit(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
}

public class MapStreamDemo {
	
	public static void main(String[] args) {
		
		 //OCA11 , OCP11
		
		//10
		List<String> list=Arrays.asList("Apple","Mango","Guava","Banana","Grapes");
		Stream<String> streams=list.stream();
		
		//Map<String,Integer> ahahah=streams.collect(Collectors.toMap((String t)->t, (String s)->s.length()));
		//Map<String,Integer> ahahah=streams.collect(Collectors.toMap(Function.identity(), s->s.length()));
		Map<String,Integer> ahahah=streams.collect(Collectors.toMap(Function.identity(), String::length));
		Map<String,String> mapa2=streams.collect(Collectors.toMap(Function.identity(), (String s)->s.length()+""));
		Map<String,Fruit> mapa3=streams.collect(Collectors.toMap(Function.identity(), (String s)->new Fruit(s)));
		Map<String,Fruit> mapa4=streams.collect(Collectors.toMap(Function.identity(), Fruit::new));
	
		ahahah.forEach((key,value)->{
			System.out.println("Key = "+key+" , value = "+value);
		});
	}

}
