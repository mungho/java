package Bai16_copy_file_text.controller;

import Bai16_copy_file_text.model.entity.FileCopyInfor;
import Bai16_copy_file_text.model.service.FileCopyService;

public class FileCopyController {
    FileCopyService fileCopyService = new FileCopyService();

    public int fileCopy(FileCopyInfor file) {
        return fileCopyService.fileCopy(file);
    }
}
