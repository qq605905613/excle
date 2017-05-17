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

	public void createWhiteExcle(List<Mchntcd> mchntcds,String sheetname ,String filename) {
		try {
			
			System.out.println(">>>>>>>>>>>>开始生成白名单标识为1的商户>>>>>>>>>>>>>>>>>>");	
			
			// 创建新的Excel工作薄
			SXSSFWorkbook workbook = new SXSSFWorkbook();
			// 如果新建一个名为“白名单标识”的工作表
			Sheet sheet = workbook.createSheet(sheetname);
			// Sheet sheet=workbook.createSheet();
			// 在索引0的位置创建行（最顶端的行）
			Row row = sheet.createRow(0);
			// 在索引0的位置创建单元格(左上端)
			Cell cell = row.createCell(0);
			// 定义单元格为字符串类型
			cell.setCellType(XSSFCell.CELL_TYPE_STRING);
			// 在单元格中输入一些内容
			cell.setCellValue("商户号");
			cell = row.createCell(1);
			cell.setCellValue("商户名称");
			cell = row.createCell(2);
			cell.setCellValue("MCC");
			cell = row.createCell(3);
			cell.setCellValue("商户地址");
			cell = row.createCell(4);
			cell.setCellValue("联接方式");
			cell = row.createCell(5);
			cell.setCellValue("所属分公司");
			cell = row.createCell(6);
			cell.setCellValue("收单机构代码");
			cell = row.createCell(7);
			cell.setCellValue("受理机构代码");
			cell = row.createCell(8);
			cell.setCellValue("受理机构名称");
			cell = row.createCell(9);
			cell.setCellValue("商户品牌");
			cell = row.createCell(10);
			cell.setCellValue("是否为非标商户");
			for (int index=0;index<mchntcds.size();index++){
				row=sheet.createRow(index+1);
				  cell=row.createCell(0); 
				  cell.setCellValue(mchntcds.get(index).getMchntcd());
				  cell=row.createCell(1); 
				  cell.setCellValue(mchntcds.get(index).getMchntnm());
				  cell=row.createCell(2); 
				  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
				  cell.setCellValue(mchntcds.get(index).getMcc());
				  cell=row.createCell(3); 
				  cell.setCellValue(mchntcds.get(index).getAddress());
				  cell=row.createCell(4); 
				  cell.setCellValue(mchntcds.get(index).getTp());
				  cell=row.createCell(5); 
				  cell.setCellValue(mchntcds.get(index).getCup());
				  cell=row.createCell(6); 
				  cell.setCellValue(mchntcds.get(index).getCupName());
				  cell=row.createCell(7); 
				  cell.setCellValue(mchntcds.get(index).getAcq());
				  cell=row.createCell(8); 
				  cell.setCellValue(mchntcds.get(index).getAcpt());
				  cell=row.createCell(9); 
				  cell.setCellValue(mchntcds.get(index).getAcptName());
				  cell=row.createCell(10); 
				  cell.setCellValue(mchntcds.get(index).getMclogo());
				  cell=row.createCell(11); 
				  cell.setCellValue(mchntcds.get(index).getWhite());
			}

			
			// 新建文件输出流
			FileOutputStream fOut = new FileOutputStream(filename);
			// 将数据写入Excel
			workbook.write(fOut);
			fOut.flush();
			fOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
