//Class Created On 2018.11.30 By Jaco van Stryp
//Class Will Manage Database Location
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class dbLocationManager {

    public String getLocalStorageLocation() {
        String path = System.getProperty("user.home") + File.separator + "Documents";
        path += File.separator + "";
        return path;
    }

    public void createAllSubFolders() {

        String path = this.getDatabaseLocation();
        File customDir = new File(path + "\\Book_Management_Admin");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //Subjects
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects");
        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //Students
        customDir = new File(path + "\\Book_Management_Admin\\Students");
        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 1
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_1");
        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 2
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_2");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 3
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_3");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 4
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_4");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 5
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_5");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 6
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_6");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 7
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_7");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 8
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_8");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 9
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_9");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 10
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_10");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 11
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_11");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 12
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_12");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //Teacher
        customDir = new File(path + "\\Book_Management_Admin\\Students\\Grade_Teacher");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
               //SubjectGen
               //Grade 1
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_1");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 2
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_2");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 3
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_3");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 4
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_4");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 5
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_5");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 6
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_6");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 7
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_7");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 8
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_8");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 9
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_9");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 10
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_10");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 11
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_11");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 12
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_12");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

         //Grade Teacher
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Subjects\\Grade_Teacher");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
                   //Vakke
                    customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
               //Grade 1
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_1");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 2
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_2");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 3
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_3");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 4
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_4");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 5
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_5");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 6
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_6");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 7
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_7");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 8
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_8");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 9
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_9");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 10
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_10");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 11
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_11");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        
         //Grade 12
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_12");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

         //Grade Teacher
               
        customDir = new File(path + "\\Book_Management_Admin\\Books\\Vakke\\Grade_Teacher");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }











    }

    public void CheckIfDatabaseLocationExcists() {
        try {

            String path = System.getProperty("user.home") + File.separator + "Documents";
            path += File.separator + "Book_Management_System";
            File customDir = new File(path);
            System.out.println(path);
            if (customDir.exists()) {
                System.out.println(customDir + " already exists");
            } else if (customDir.mkdirs()) {
                try {
                    Runtime.getRuntime().exec("attrib +h \"" + customDir + "\""); //This Will Attempt To Hide The File
                } catch (IOException e) {

                }
                System.out.println(customDir + " was created");

            } else {
                System.out.println(customDir + " was not created");
                JOptionPane.showMessageDialog(null, "Could not create files to local directories\n\nPlease make sure this computer has appropriate permisions to create folders in\n\n'Documents'");
            }

            boolean found = false;

            while (found == false) {

                PrintWriter printMain = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\Book_Management_System\\dbLocation.db", true));
                printMain.print("");
                printMain.close();

                String location = "";
                Scanner scConstruct = new Scanner(new File(this.getLocalStorageLocation() + "\\Book_Management_System\\dbLocation.db"));
                while (scConstruct.hasNextLine()) {
                    location = (scConstruct.nextLine());
                }
                System.out.println(location);
                File f1 = new File(location);
                while (f1.isDirectory() == false) {
                    PrintWriter printMainNew = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\Book_Management_System\\dbLocation.db", false));
                    location = JOptionPane.showInputDialog(null, "Please Enter A Location Where All Student Data Can Be Stored\n\nThis Location Needs READ AND WRITE\nAccess From All Deveices That Will Be Using This Software", "Warning", JOptionPane.WARNING_MESSAGE);
                    printMainNew.print(location);
                    printMainNew.close();

                    f1 = new File(location);
                }

                found = true;
                this.createAllSubFolders();
                
            }

        } catch (Exception ex) {

            System.exit(0);

        }

    }

    public String getDatabaseLocation() { // this method will check if the database location does exists and then return the location of it
        //The user will be prompted if that location does not exist!

        try {
            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\Book_Management_System\\dbLocation.db"));
            
            String line = scFile.nextLine();
           System.out.println(line);
        
            return line;
        } catch (Exception ex) {
            try {
                this.CheckIfDatabaseLocationExcists();
                Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\Book_Management_System\\dbLocation.db"));
                
                String line = scFile.nextLine();
                System.out.println(line);
                
                return line;
             
            } catch (Exception ex1) {
               
            }
          

        }
        return "";

    }

   

}
