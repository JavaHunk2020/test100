

class Matha{
	public static int cube(int num) {
		return num*num*num;
	}
}

@FunctionalInterface
interface Cal {
	public int flit(int n);
}


public class ReferenceToStaticMethod {
	public static void main(String[] args) {
		Cal cal44=new  Cal() {
			@Override
			public int flit(int n) {
				return Matha.cube(n);
			}
		};
		
		Cal cal46=(int n)->Matha.cube(n);
			
	
		Cal cal47=Matha::cube;
		
		//Cal cal=(int n) ->Matha.cube(n);
		Cal cal=Matha::cube;
		int result=cal.flit(12);
		System.out.println(result);
	}
}
