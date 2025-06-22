package Bai16_copy_file_text.view;

import Bai16_copy_file_text.controller.FileCopyController;
import Bai16_copy_file_text.model.entity.FileCopyInfor;

import java.util.Scanner;

public class FileCopyView {
    Scanner scanner = new Scanner(System.in);
    FileCopyController fileCopyController = new FileCopyController();

    public void inputPath() {
        System.out.println("Enter the original path");
        String originalPath = scanner.nextLine();
        if (originalPath.isEmpty()) {
            throw new IllegalArgumentException();
        }

        System.out.println("Enter the clone path");
        String clonePath = scanner.nextLine();
        if (clonePath.isEmpty()) {
            throw new IllegalArgumentException();
        }

        FileCopyInfor fileCopyInfor = new FileCopyInfor(originalPath, clonePath);
        int characterCount = fileCopyController.fileCopy(fileCopyInfor);

        if (characterCount == 0) {
            System.out.println("File is empty");
        } else {
            System.out.println("The number character: " + characterCount);
        }
    }
}
