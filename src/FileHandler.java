import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileHandler {

    public FileHandler() {
        this.fileChooser = new JFileChooser();
    }

    private JFileChooser fileChooser;
    private File openFile;
    private File validFile;
    private File invalidFile;

    public void openFile()
    {
        fileChooser.setDialogType(0);
        if(fileChooser.showOpenDialog(null)==0){
            openFile = fileChooser.getSelectedFile();
        }
    }

    public void saveFIle(boolean currentDir)
    {
        fileChooser.setDialogType(1);
        PrintWriter validWriter,invalidWriter;
        if(currentDir) {
            this.invalidFile = new File(fileChooser.getCurrentDirectory().toString() + "\\invalidAdresses.txt");
            this.validFile = new File(fileChooser.getCurrentDirectory().toString() + "\\validAdresses.txt");
        }
        else
        {
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            JOptionPane.showMessageDialog(null,"Select Folder to Save The Output Files");
            if (fileChooser.showSaveDialog(null)==0){
                this.invalidFile = new File(fileChooser.getSelectedFile().toString() + "\\invalidAdresses.txt");
                this.validFile = new File(fileChooser.getSelectedFile().toString() + "\\validAdresses.txt");
            }
        }

        try {
            validWriter = new PrintWriter(validFile);
            invalidWriter = new PrintWriter(invalidFile);

            for (int i=0;i<IPStorage.getValidatedList().size();i++) {
                if (IPStorage.getValidatedList().get(i).isValid())
                    validWriter.println(IPStorage.getValidatedList().get(i).getIPAddress() + "\n");
                else
                    invalidWriter.println(IPStorage.getValidatedList().get(i).getIPAddress() + "\n");
            }

            validWriter.close();
            invalidWriter.close();
            JOptionPane.showMessageDialog(null,"Saved");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void populateList()
    {
        try {
            Scanner reader = new Scanner(openFile);

            while (reader.hasNext()) {
                IPStorage.getAddressList().add(reader.nextLine());
            }
        }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
}
