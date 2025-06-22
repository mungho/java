package Bai16_copy_file_text.model.service;

import Bai16_copy_file_text.model.entity.FileCopyInfor;

import java.io.*;

public class FileCopyService {
    public int fileCopy(FileCopyInfor fileCopyInfor) {
        File originalFile = new File(fileCopyInfor.getOriginalPath());
        File cloneFile = new File(fileCopyInfor.getClonePath());

        if (!originalFile.exists()){
            System.out.println("Original file is not exist ");
        }

        if (!cloneFile.exists()) {
            System.out.println("Clone file is not exist");
        }

        int characterCount = 0;
        try(BufferedInputStream reader = new BufferedInputStream(new FileInputStream(originalFile));
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(cloneFile))) {

            int temp;
            while ((temp = reader.read()) != -1) {
                writer.write(temp);
                characterCount++;
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;

        return characterCount;
    }
}
