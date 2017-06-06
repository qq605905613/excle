package excle.ywyyzx.excle.App;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import excle.ywyyzx.excle.ReadExcle.createExcle;
import excle.ywyyzx.excle.ReadExcle.moveWhite;
import excle.ywyyzx.excle.ReadExcle.readExcle;
import excle.ywyyzx.excle.orm.Mchntcd;

/**
 * @author 作者 E-mail:6005905613@qq.com
 * @version 创建时间：2017年4月26日 下午10:59:50 类说明
 */
public class app {

	public static void main(String[] args) {
	
		        //String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		        String exce2010 = "d:\\home1\\test.xlsx";
		        //String a = newSheet(excel2010) ;
		        //readExcle read = new readExcle();
		   readExcle  read =new readExcle();
		   moveWhite white =new moveWhite();
List<Mchntcd>	mcc =	 white.White(read.readExcel(exce2010)) ;
List<Mchntcd> forbid = white.Mcc(read.getValue(), mcc);  
createExcle  txt =new createExcle();
  try {
List<Mchntcd> white_done =	read.readExcel("d:\\home1\\白名单标识为1.xlsx");
	txt.createDone(white_done);
List<Mchntcd> mcc_done =read.readExcel("d:\\home1\\可审MCC.xlsx");
	txt.createDone(mcc_done);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  // white.Mcc(read.getValue(), mcc);
		  
		    }
}
