public class PossiblePaths{

	
	public boolean getPaths(int x, int y, ArrayList<Point> path, 
		HashTable<Point, Boolean> cache){


		Point p = new Point(x, y);

		if(cache.containsKey(p)){
			return cache.get(p);
		}
		path.add(p);

		if(x ==0 && y ==0){
			return true; //found path;
		}

		boolean success = false;

		if(x >=1 && isFree(x-1, y)){
			//Move left
			success = getPaths(x-1, y, path, cache);
		}
		if( !success && y >=1 && isFree(x, y-1)){
			//move up
			success = getPaths(x, y-1, path, cache);
		}

		if(!success){
			path.remove(p);
		}
		cache.put(p, success);
		return success;
	}
}