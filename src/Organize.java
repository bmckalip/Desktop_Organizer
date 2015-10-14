import javax.swing.JOptionPane;

public class Organize{
	public static void main(String[] args){
	
	String pictures[] = {"png", "jpg", "jpeg", "gif", "tiff", "bmp"};
	String videos[] = {"webM", "FLV", ".ogg", "avi", "wmv", "mp4", "mov"};
	String music[] = {"acc", "flac", "mp3", "wav"};
	String docs[] = {"txt", "yml", "java", "xlsx"};
	String javaFiles[] = {"java"};
	String batchFiles[] = {"bat"};
	
	//specific locations.
	for(int i = 0; i < javaFiles.length; i++){
		MoveFiles.moveFiles(javaFiles[i], "Documents\\Media_Production\\Programming\\java\\kepler");
	}
	for(int i = 0; i < batchFiles.length; i++){
		MoveFiles.moveFiles(javaFiles[i], "Documents\\random batch files");
	}
	
	//default media file types
		for(int i = 0; i < pictures.length; i++){
			MoveFiles.moveFiles(pictures[i], "Pictures");
		}
		for(int i = 0; i < videos.length; i++){
			MoveFiles.moveFiles(videos[i], "Videos");
		}
		for(int i = 0; i < music.length; i++){
			MoveFiles.moveFiles(music[i], "Music");
		}
		for(int i = 0; i < docs.length; i++){
			MoveFiles.moveFiles(docs[i], "Documents");
		}
	//System.out.println("Organization completed. " + MoveFiles.getNumMoved() + " files were organized");
	JOptionPane.showMessageDialog(null, "Organization completed. " + MoveFiles.getNumMoved() + " files were organized");
}
}
