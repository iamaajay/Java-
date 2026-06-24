package c1;
import java.net.*;

public class url {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL u=new URL("https://www.google.com/");
		System.out.println(u.equals(u));
		System.out.println(u.getContent());
		System.out.println(u.getDefaultPort());
		System.out.println(u.getPath());
		System.out.println(u.getFile());
		System.out.println(u.getProtocol());
		System.out.println(u.getPort());

	}

}
