import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class ChoixFichier {

    public ChoixFichier(){
        
    }

    public File getOpenFichier(){
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        File fic=null;
        int returnValue = jfc.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            fic = jfc.getSelectedFile();
        }
        return fic;
    }

    public File getSaveFichier() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        File fic=null;
        int returnValue = jfc.showSaveDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            fic = jfc.getSelectedFile();
        }
        return fic;
    }
}