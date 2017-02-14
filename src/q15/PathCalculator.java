package q15;

import java.util.ArrayList;

public class PathCalculator {
	public static void main(String[] args) {
		int start[] = {0,0};
		int end[] = {20,20};
		boolean goRight = true;
		
		//build key path
		ArrayList<int[]> path = new ArrayList<int[]>();
		path.add(start);
		while(path.get(path.size()-1)[0]<=20 & path.get(path.size()-1)[1]<20){
			int x = path.get(path.size()-1)[0];
			int y = path.get(path.size()-1)[1];
			if(goRight){
				int right[] = {++x,y};
				path.add(right);
				goRight = false;
			}else{
				int down[] = {x,++y};
				path.add(down);
				goRight = true;
			}
		}
		//no need for program for this shit :D :D :D
	}
}
