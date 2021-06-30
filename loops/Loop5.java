package loops;

public class Loop5 {
	public static void main(String[] args) {
		int n=44;
		String size;
		
			switch(n) {
			
			case 29:
				size="small";
				break;
				
			case 42:
				size="medium";
				break;
			case 44:
				size="large";
				break;
			case 48:
				size="extra large";
				break;
			default:
				size="unknown";
				break;
		}
		System.out.println("size:"+size);
		
	}

}
