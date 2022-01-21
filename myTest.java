import java.io.FileNotFoundException;
import java.io.IOException;

public class myTest {

	public static void main(String[] args) throws EmptyStackException, InvalidMapException, FileNotFoundException, IOException {
		
		Map myMap;
		
		myMap = new Map(args[0]);
		Path thePath = new Path(myMap);
		thePath.findPath();
		
		
		
		
	}
}
