package excle.ywyyzx.excle.App;

import java.util.List;

import excle.ywyyzx.excle.orm.Mchntcd;

/**
* @author 作者 E-mail:6005905613@qq.com
* @version 创建时间：2017年4月26日 下午10:59:50
* 类说明
*/
public class app {

	public static void main(String[] args) {
		
		        //String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		        String excel2010 = "d:\\home\\test.xlsx";
		        String a = newSheet(excel2010) ;
		        
		     List<Mchntcd> list = new readExcel readExcel(excel2010);
		   if(list!=null){
		            for (int i=0;i<list.size();i++) {
		            	if(list.get(i).getWhite()=="0"){
		            		list.remove(i);
		            		
		            		
		            	}
		                
		         
		            }
		            
		        }
		      
		     
		    }
	}

