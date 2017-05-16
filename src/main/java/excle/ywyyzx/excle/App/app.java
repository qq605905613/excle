package excle.ywyyzx.excle.App;

import java.util.ArrayList;
import java.util.List;

import excle.ywyyzx.excle.ReadExcle.createExcle;
import excle.ywyyzx.excle.ReadExcle.readExcle;
import excle.ywyyzx.excle.orm.Mchntcd;

/**
 * @author 作者 E-mail:6005905613@qq.com
 * @version 创建时间：2017年4月26日 下午10:59:50 类说明
 */
public class app {

	public static void main(String[] args) {
	
		        //String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		        //String excel2010 = "d:\\home1\\test.xlsx";
		        //String a = newSheet(excel2010) ;
		        //readExcle read = new readExcle();
		        
		    String filepath = "d:\\home1\\profile\\mcc.txt";
		   readExcle excle = new readExcle();
		   excle.getValue(filepath);
		
		     
		    }
}
