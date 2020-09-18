public class stringBuffer {

	public static void main(String[] args) {		
		String str = "My name ";
        String str2 = "IS";
        
		str = str.concat("is Anushka Jadhav");
        
        System.out.println(str);
		System.out.println("if string contains of : " + str.contains("of"));
		System.out.println("Ignorecase method : " + str2.equalsIgnoreCase("is"));
		System.out.println(str.split(" ")[0]);
		System.out.println(str.isEmpty());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.append("World"));
		System.out.println(sb.insert(5," "));
		System.out.println(sb.delete(0,7));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	}
}