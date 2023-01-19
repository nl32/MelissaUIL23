import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Trapped {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("trapped.dat"));
		int n = kb.nextInt();
		for (int i = 0; i <n; i++) {
			int size = kb.nextInt(); kb.nextLine();
			String[][] maze = new String[size][size];
			for (int j = 0; j < size; j++) {
				maze[j] = kb.nextLine().split("");
			}
			int startX =-1;
			int startY = -1;
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					if(maze[j][k].equals("@")){
						startX = j;
						startY = k;
					}
				}
			}
			boolean flag = false;
			for (String s: maze[0]){
				if (s.equals(".")){
					flag = true;
					break;
				}
			}
			for (String s: maze[maze.length-1]){
				if (s.equals(".")){
					flag = true;
					break;
				}
			}
			for (int j = 0; j < maze.length; j++) {
				if(maze[j][0].equals(".")){
					flag = true;
					break;
				}
			}
			for (int j = 0; j < maze.length; j++) {
				if(maze[j][maze.length-1].equals(".")){
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println("No Exit");
			}else{
			boolean exit = findExit(startX,startY,maze,new HashMap<>());
			if (exit){
				System.out.println("Exit");
			}else {
				System.out.println("No Exit");
			}
			}
		}
	}
	static boolean findExit(int x, int y, String[][] maze, Map<Point,Boolean> visited){
		if(x <0 || x>= maze.length || y<0 || y>= maze.length) return false;
		if(visited.containsKey(new Point(x,y)) && visited.get(new Point(x,y))==true) return false;
		if (maze[x][y].equals("*")) return false;
		if(maze[x][y].equals(".") && (x==0 || x==maze.length-1 || y==0 || y==maze.length-1)){
			return true;
		}
		visited.put(new Point(x,y),true);
		return  findExit(x-1,y,maze,visited) ||
				findExit(x+1,y,maze,visited) ||
				findExit(x,y-1,maze,visited) ||
				findExit(x,y+1,maze,visited);
	}
}
