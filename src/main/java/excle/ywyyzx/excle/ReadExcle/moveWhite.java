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
	public List<Mchntcd> moveWhite(List<Mchntcd> mchntcd){
		List<Mchntcd> newmchnt = new ArrayList<Mchntcd>();
		if (mchntcd==null){
			return null;
			
		}
		for(int i=1; i<mchntcd.size();i++){
			if(mchntcd.get(i).getWhite().equals("1")){
				mchntcd.remove(i);
			}
			
			
		}
		return mchntcd;
		
	}

}
