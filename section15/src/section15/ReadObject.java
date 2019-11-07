package section15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(FileInputStream fio = new FileInputStream("java/docu.txt"))
		{
			try(ObjectInputStream obj = new ObjectInputStream(fio))
			{
				Vehicle v1 = (Vehicle)obj.readObject();
				Vehicle v2 = (Vehicle)obj.readObject();
				System.out.println(v1);
				System.out.println(v2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
