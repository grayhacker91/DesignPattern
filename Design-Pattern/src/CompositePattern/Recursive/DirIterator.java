package CompositePattern.Recursive;

import java.io.File;

public class DirIterator {
	public static void main(String args[]) {
		String path;
		if(args.length==0) {
			path = ".";
		}
		else {
			path = args[0]; 
		}
		directorySearch(path);
	}
	public static void directorySearch(String path)
	{
	        File dir = new File(path);
	        File fileList[] = dir.listFiles();
	        System.out.println(dir.getAbsolutePath());
	        for(int i=0; i < fileList.length ; i++) {
	        	File file = fileList[i];
	        	if(file.isDirectory()) {
	        		directorySearch(file.getPath());
	        	}
	        	System.out.println(file.getName());
	        }
	}
}

