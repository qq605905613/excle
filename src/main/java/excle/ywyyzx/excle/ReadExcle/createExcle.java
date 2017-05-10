package excle.ywyyzx.excle.ReadExcle;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import excle.ywyyzx.excle.orm.Mchntcd;

public class createExcle {

	public void createWhiteExcle(){
		 try{  
	            //创建新的Excel工作薄  
	            SXSSFWorkbook  workbook=new SXSSFWorkbook ();  
	            //如果新建一个名为“白名单标识”的工作表  
	            Sheet sheet=workbook.createSheet("白名单标识为1");  
//	          Sheet sheet=workbook.createSheet();  
	            //在索引0的位置创建行（最顶端的行）  
	            Row row=sheet.createRow(0);  
	            //在索引0的位置创建单元格(左上端)  
	            Cell cell=row.createCell(0);  
	            //定义单元格为字符串类型  
	            cell.setCellType(XSSFCell.CELL_TYPE_STRING);  
	            //在单元格中输入一些内容  
	            cell.setCellValue("商户号");  
	            cell=row.createCell(1);
	            cell.setCellValue("商户名称");
	            cell=row.createCell(2);
	            cell.setCellValue("商户名称");
	            //新建文件输出流  
	            FileOutputStream fOut=new FileOutputStream("d:\\home1\\test1.xlsx");  
	            //将数据写入Excel  
	            workbook.write(fOut);  
	            fOut.flush();  
	            fOut.close();  
	        }catch(Exception e){  
	            e.printStackTrace();  
	        }  
	    }  
  
		

	
    

}
