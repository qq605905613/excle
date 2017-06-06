package excle.ywyyzx.excle.ReadExcle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import excle.ywyyzx.excle.orm.Mcc;
import excle.ywyyzx.excle.orm.Mchntcd;
import excle.ywyyzx.excle.orm.MchntcdDone;



/**
* @author 作者 E-mail:6005905613@qq.com
* @version 创建时间：2017年4月19日 下午7:52:30
* 类说明
*/
public class readExcle {

	
		
		    
		    
		    @SuppressWarnings("unused")
			public List<Mchntcd> readExcel(String path){
		    	System.out.println(">>>>>>>>>>>>>>>>>>>开始读取excle>>>>>>>>>>>>>>>>>>>>>>>");
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
		                    	mchntcd.setMchntnm(getValue(mchntnm));
		                    	mchntcd.setCupName(getValue(cupName));
		                    	mchntcd.setMchntcd(getValue(mchnt_cd));
		                    	mchntcd.setWhite((getValue(white)));
		                    	mchntcd.setMchntcd(getValue(mchnt_cd));
		                    	mchntcd.setAcpt(getValue(acpt));
		                    	mchntcd.setTp(getValue(tp));
		                    	mchntcd.setAddress(getValue(address));
		                    	mchntcd.setAcptName(getValue(acptName));
		                    	mchntcd.setMcc(getValue(mcc));
		                    	mchntcd.setCup(getValue(cup));
		                    	mchntcd.setAcq(getValue(acq));
		                    	
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
			public  String getValue(XSSFCell xssfRow){
		        if(xssfRow.getCellType()==xssfRow.CELL_TYPE_BOOLEAN){
		            return String.valueOf(xssfRow.getBooleanCellValue());
		        }else if(xssfRow.getCellType()==xssfRow.CELL_TYPE_NUMERIC){
		            return String.valueOf(xssfRow.getNumericCellValue());
		        }else{
		            return String.valueOf(xssfRow.getStringCellValue());
		        }
		        
		    }
		    //读取禁用的MCC
		    public List<String> getValue(){
		    	  String filePaths = "d:\\home1\\profile\\mcc.txt";

		    	List<String> list_mcc =new ArrayList<String>();
		    	   try {
		                String encoding="GBK";
		                File file=new File(filePaths);
		                if(file.isFile() && file.exists()){ //判断文件是否存在
		                    InputStreamReader read = new InputStreamReader(
		                    new FileInputStream(file),encoding);//考虑到编码格式
		                    BufferedReader bufferedReader = new BufferedReader(read);
		                    String lineTxt = null;
		                    while((lineTxt = bufferedReader.readLine()) != null){
		                    	list_mcc.add(lineTxt);
		                     
		                    }
		                    read.close();
		        }else{
		            System.out.println("找不到指定文件");
		        }
		        } catch (Exception e) {
		            System.out.println("读取mcc内容出错");
		            e.printStackTrace();
		        }
		     
		    
				return list_mcc;
		    	
		    }
		  public List<MchntcdDone> readDone(String path){
			    List<MchntcdDone> list = new ArrayList<MchntcdDone>();
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
		                	MchntcdDone mchntcdDone = new MchntcdDone();
		                                     
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
		                    	
		                    mchntcdDone.setMchntnm(getValue(mchntnm));
		                    mchntcdDone.setCupName(getValue(cupName));
		                    mchntcdDone.setMchntcd(getValue(mchnt_cd));
		                    mchntcdDone.setWhite((getValue(white)));
		                    mchntcdDone.setMchntcd(getValue(mchnt_cd));
		                    mchntcdDone.setAcpt(getValue(acpt));
		                    mchntcdDone.setTp(getValue(tp));
		                    mchntcdDone.setAddress(getValue(address));
		                    mchntcdDone.setAcptName(getValue(acptName));
		                    mchntcdDone.setMcc(getValue(mcc));
		                    mchntcdDone.setCup(getValue(cup));
		                    mchntcdDone.setAcq(getValue(acq));
		                    	
		                    list.add(mchntcdDone);
		                    
		                }
		                
		            }
		               return list;
		        }
		           
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return list;
		
			  
		  }

}
