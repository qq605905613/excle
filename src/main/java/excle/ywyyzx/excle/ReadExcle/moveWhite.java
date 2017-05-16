package excle.ywyyzx.excle.ReadExcle;

import java.util.ArrayList;
import java.util.List;

import excle.ywyyzx.excle.orm.Mchntcd;

/**
* @author 作者 E-mail:6005905613@qq.com
* @version 创建时间：2017年4月24日 下午8:22:48
* 类说明
*/





public class moveWhite {
	/*非标商户的检查
	 * @param mchntcd
	 * @return
	 */
	public List<Mchntcd> White(List<Mchntcd> mchntcd){
		List<Mchntcd> newmchnt = new ArrayList<Mchntcd>();
		//白名单标识为1的队列
		List<Mchntcd> list2 = new ArrayList<Mchntcd>();
		if (mchntcd==null){
			return null;
			
		}
		   if(newmchnt!=null){
	            for (int i=0;i<newmchnt.size();i++) {
	            	//生成新的白名单标识为1的excle
	            	if(newmchnt.get(i).getWhite().equals("1")){
	            		list2.add(newmchnt.get(i));
	            		newmchnt.remove(i);
	            		
	            		
	            	}
	            	createExcle createExcle =new createExcle();
            		createExcle.createWhiteExcle(list2); 
	         
	            }
	         
	        }
	
		return newmchnt;
		
	}
	public List<Mchntcd> Mcc(List<String> list_mcc){
		return null;
		
	}
}
