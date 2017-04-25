package excle.ywyyzx.excle.ReadExcle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import excle.ywyyzx.excle.orm.Mchntcd;


/**
* @author 作者 E-mail:6005905613@qq.com
* @version 创建时间：2017年4月19日 下午7:52:30
* 类说明
*/
public class readExcle {

	
		 public static void main(String[] args) {
		        
		        //String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		        String excel2010 = "d:\\home\\test.xlsx";
		        
		        List<Mchntcd> list = readExcel(excel2010);
		        if(list!=null){
		            for (int i=0;i<list.size();i++) {
		            	if(list.get(i).getWhite()=="0"){
		            		list.remove(i);
		            		
		            		
		            	}
		                
		         
		            }
		            
		        }
		     
		    }
		    
		    
		    private static List<Mchntcd> readExcel(String path){
		        List<Mchntcd> list = new ArrayList<Mchntcd>();
		        try {
		            InputStream is =  new FileInputStream(path);
		           XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		           Mchntcd mchntcd = null;
		           //读sheet
		           for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
		            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
		            if(xssfSheet==null){
		                continue;
		            }
		            //读行
		            for(int rowNum=1;rowNum<=xssfSheet.getLastRowNum();rowNum++){
		                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
		               
		                if(xssfRow!=null){
		                	mchntcd = new Mchntcd();
		                    XSSFCell id = xssfRow.getCell(0);
		                    
		                    XSSFCell mchnt_cd = xssfRow.getCell(1);
		                    XSSFCell mchntnm = xssfRow.getCell(2);
		                    XSSFCell mcc = xssfRow.getCell(3);
		                    XSSFCell address = xssfRow.getCell(4);
		                    XSSFCell tp = xssfRow.getCell(5);
		                    XSSFCell cup = xssfRow.getCell(6);
		                    XSSFCell cupName = xssfRow.getCell(7);
		                    XSSFCell acq = xssfRow.getCell(8);
		                    XSSFCell acpt = xssfRow.getCell(9);
		                    XSSFCell acptName = xssfRow.getCell(10);
		                    XSSFCell mclogo = xssfRow.getCell(11);
		                    XSSFCell white = xssfRow.getCell(12);
		                    	mchntcd.setId(getValue(id));
		                    	mchntcd.setCupName(getValue(cupName));
		                    	mchntcd.setMchntcd(getValue(mchnt_cd));
		                    	mchntcd.setWhite((getValue(white)));
		                    	mchntcd.setMchntcd(getValue(mchnt_cd));
		                    	mchntcd.setAcpt(getValue(acpt));
		                    	mchntcd.setTp(getValue(tp));
		                    	mchntcd.setAddress(getValue(address));
		                    	mchntcd.setAcptName(getValue(acptName));
		                    	mchntcd.setMcc(getValue(mcc));
		                    list.add(mchntcd);
		                    
		                }
		                
		            }
		               return list;
		        }
		           
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return list;
		    }
		    
		    @SuppressWarnings("static-access")
			private static String getValue(XSSFCell xssfRow){
		        if(xssfRow.getCellType()==xssfRow.CELL_TYPE_BOOLEAN){
		            return String.valueOf(xssfRow.getBooleanCellValue());
		        }else if(xssfRow.getCellType()==xssfRow.CELL_TYPE_NUMERIC){
		            return String.valueOf(xssfRow.getNumericCellValue());
		        }else{
		            return String.valueOf(xssfRow.getStringCellValue());
		        }
		        
		    }
		    


}
