import java.io.File;

public class MoveFiles {

	private static int numMoved = 0;
	
	private static String parentDirectory = System.getProperty("user.home") + "\\Desktop";

	public static void moveFiles(String mediaType, String location) {
		String dest = "E:\\Libraries\\" + location + "\\unsorted\\";
		FileFilter fileFilter = new FileFilter(mediaType);
		File parentDir = new File(parentDirectory);
		File destDir = new File(dest);
		File fileToMove;
		String[] listOfFiles = parentDir.list(fileFilter);

		if (!destDir.exists())
		      destDir.mkdir();
		
		if (listOfFiles.length == 0) {
			//System.out.println("There are no files on your desktop matching that file type!");
			return;
		}

		for (String file : listOfFiles) {
			String absoluteFilePath = new StringBuffer(parentDirectory).append(File.separator).append(file).toString();
			fileToMove = new File(absoluteFilePath);
			File destination = new File(dest + fileToMove.getName()); 
	    	   
			if(fileToMove.renameTo(destination)){
	    		System.out.print("Moved successfully ");
	    	   }else{
	    		System.out.print("failed to move ");
	    	   }
			
	    	System.out.println("File : " + fileToMove.getName() + " moved to: " + destination);
	    	numMoved++;
		}
	
	}
	
	public static int getNumMoved(){
		return numMoved;
	}
}