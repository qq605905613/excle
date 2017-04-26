package excle.ywyyzx.excle.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import excle.ywyyzx.excle.orm.Mchntcd;

/**
* @author 作者 E-mail:6005905613@qq.com
* @version 创建时间：2017年4月25日 上午10:48:30
* 类说明
*/





public class creatSheet {
	public  String newSheet(String path) throws IOException {
	
		FileInputStream in = new FileInputStream(path); 
		HSSFWorkbook workbook = new HSSFWorkbook(in);
		 workbook.createSheet();
		workbook.setSheetName(2, "test");
		
		
		
		return "测试";
		
	}

}
