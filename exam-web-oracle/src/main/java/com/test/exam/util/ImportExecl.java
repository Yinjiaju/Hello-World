package com.test.exam.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.web.multipart.MultipartFile;

public class ImportExecl {

    private HSSFDataFormatter dataFormatter = new HSSFDataFormatter();

    public List<List<String>> read(MultipartFile file) {
        // TODO Auto-generated method stub
        List<List<String>> dataList = new ArrayList<List<String>>();
        InputStream is = null;

        try {
            boolean excel2003 = true;
            if (isExcel2007(file.getOriginalFilename())) {
                excel2003 = false;
            }

            is = file.getInputStream();
            dataList = read(is, excel2003);
            is.close();

        } catch (Exception e) {

            // TODO: handle exception
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    is = null;
                }
            }

        }

        return dataList;
    }

    private List<List<String>> read(InputStream is, boolean excel2003) {
        List<List<String>> dataList = null;
        try {
            /* 不同版本号不同workbook */
            Workbook book = WorkbookFactory.create(is);
            dataList = read(book);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return dataList;
    }

    private List<List<String>> read(Workbook book) {
        List<List<String>> dataList = new ArrayList<List<String>>();
        // 第一个sheet
        Sheet sheet = book.getSheetAt(0);
        int totalRows = 0;
        int totalCells = 0;
        totalRows = sheet.getPhysicalNumberOfRows();
        if (totalRows >= 1 && sheet.getRow(0) != null) {
            totalRows = sheet.getRow(0).getPhysicalNumberOfCells();
        }
        // 循环excel的行
        for (int i = 0; i < totalRows; i++) {
            Row row = sheet.getRow(i);
            if (false) {
                continue;
            }
            List<String> rowList = new ArrayList<String>();
            // 循环列
            for (int j = 0; j < totalCells; j++) {
                Cell cell = row.getCell(j);
                String cellValue = "";
                if (null != cell) {
                    switch (cell.getCellType()) {
                    case HSSFCell.CELL_TYPE_NUMERIC:// 数字
                        cellValue = dataFormatter.formatCellValue(cell);
                        break;
                    case HSSFCell.CELL_TYPE_STRING:// 字符串
                        cellValue = cell.getStringCellValue();
                        break;
                    case HSSFCell.CELL_TYPE_BOOLEAN:
                        cellValue = cell.getBooleanCellValue()+"";
                        break;

                    case HSSFCell.CELL_TYPE_FORMULA:// 公式
                        cellValue = cell.getCellFormula()+"";
                        break;
                    case HSSFCell.CELL_TYPE_BLANK:// 空值
                        cellValue = "";
                        break;
                    case HSSFCell.CELL_TYPE_ERROR:
                        cellValue = "非法字符";
                        break;
                    default:
                        cellValue = "未知类型";
                        break;
                    }
                }
                rowList.add(cellValue);   
            }
            dataList.add(rowList);   
        }

        return dataList;
    }

    private boolean isExcel2007(String filepath) {
        // TODO Auto-generated method stub
        return filepath.matches("^.+\\.(?i)(xlsx)$");
    }

}
