

public class Path {

	Map cityMap;
	
	
	public Path (Map theMap) {
		
		cityMap = theMap;
	}
	
	public void findPath() {
		
		ArrayStack<MapCell> path = new ArrayStack<MapCell> (10, 2, 2);
		MapCell start = cityMap.getStart();
		int numCells = 0;
		
		path.push(start);
		start.markInStack();
		numCells++;
		
		MapCell topCell = start;

		try {
		while (path.isEmpty() == false && topCell.isDestination() == false ) {
			    
				topCell = path.peek();
				if (topCell.isDestination()) {
					break;
				}
				else {
					
				}
				
		
		System.out.println("Path was found containing " + numCells +" cells.");
		
		}
		}
	
			catch (EmptyStackException e) {
				System.out.print("No path was found");
				}

		}

		

	
	private MapCell nextCell (MapCell cell) {
		

		
		
		}
		
	}
	
	
	
	
	


