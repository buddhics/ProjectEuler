package q18;

/*
 * @see <a href="http://math.stackexchange.com/questions/279265/finding-the-longest-path-in-an-undirected-weighted-tree">math.stackexchange.com</a>
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaxPath {
	public static void main(String[] args) {
		try {
			new MaxPath().calculateMaxPath("resources/numbers_q18.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void calculateMaxPath(String path) throws IOException{
		File tree = new File(path);
		BufferedReader bf = new BufferedReader(new FileReader(tree));
		TreeNode upperChainRoot = new TreeNode();
		TreeNode ucPointer = new TreeNode();
		ucPointer.next = upperChainRoot;
		TreeNode currentChainRoot = new TreeNode();
		TreeNode ccPointer = new TreeNode();
		ccPointer.next = currentChainRoot;
		String line;
		while((line = bf.readLine())!=null){
			String numberLine[] = line.split(" ");
			for (int i = 0; i < numberLine.length; i++) {
				ccPointer.next.next = new TreeNode();
				ccPointer.next.next.setValue(Integer.parseInt(numberLine[i]));
				ccPointer.next = ccPointer.next.next;
			}
			
			ccPointer = new TreeNode();
			ccPointer.next = currentChainRoot;
			
			if(upperChainRoot.next != null){
				while(ucPointer.next.next != null){
					ccPointer.next.next.setLeft(/*ccPointer.next.next.getValue()+*/ucPointer.next.next.getTheDamnNumber());
					ccPointer.next.next.next.setRight(/*ccPointer.next.next.next.getValue()+*/ucPointer.next.next.getTheDamnNumber());
					
					ccPointer.next = ccPointer.next.next;
					ucPointer.next = ucPointer.next.next;
				}
				upperChainRoot.next = currentChainRoot.next;
			}else{
				upperChainRoot.next = currentChainRoot.next;
			}
			
			currentChainRoot = new TreeNode();
			ccPointer = new TreeNode();
			ccPointer.next = currentChainRoot;
			
			ucPointer = new TreeNode();
			ucPointer.next = upperChainRoot;
		}
		
		int max = 0;
		
		while(ucPointer.next.next != null){
			int nodeMax = ucPointer.next.next.getTheDamnNumber(); 
			max = max>nodeMax?max:nodeMax;
			ucPointer.next = ucPointer.next.next;
		}
		
		System.out.println(max);
	}
}
