package excle.ywyyzx.excle.ReadExcle;

import java.util.ArrayList;
import java.util.List;

import excle.ywyyzx.excle.orm.Mchntcd;

/**
 * @author 作者 E-mail:6005905613@qq.com
 * @version 创建时间：2017年4月24日 下午8:22:48 类说明
 */

public class moveWhite {
	/*
	 * 非标商户的检查
	 * 
	 * @param mchntcd 读取的list
	 * 
	 * @return
	 */
	public List<Mchntcd> White(List<Mchntcd> mchntcd) {
		System.out.println("开始执行白名单模块");
		// 返回新的队列
		// List<Mchntcd> newmchnt = new ArrayList<Mchntcd>();
		// 白名单标识为1的队列
		List<Mchntcd> list2 = new ArrayList<Mchntcd>();
		if (mchntcd == null) {
			return null;

		}
		if (mchntcd != null) {
			for (int i = 0; i < mchntcd.size(); i++) {
				// 生成新的白名单标识为1的excle
				if (mchntcd.get(i).getWhite().equals("1")) {
					list2.add(mchntcd.get(i));
					mchntcd.remove(i);

				}

			}
			createExcle createExcle = new createExcle();
			createExcle.createWhiteExcle(list2, "白名单标识为1", "d:\\home1\\白名单标识为1.xlsx");

		}

		return mchntcd;

	}

	// 判断Mcc是否在MCC.txt集合文件中
	/**
	 * @param list_mcc
	 *            读取到的禁用MCC
	 * @param newmchnt
	 *            执行白名单标识为1后返回的新的集合
	 * @return
	 */
	public List<Mchntcd> Mcc(List<String> list_mcc, List<Mchntcd> newmchnt) {
		System.out.println("开始执行禁用mcc");
		//List<Mchntcd> newmcc = new ArrayList<Mchntcd>();
		for (int i = 0; i < newmchnt.size(); i++) {
			if (list_mcc.contains(newmchnt.get(i).getMcc())) {
				
				newmchnt.remove(newmchnt.get(i));
			}

		}
		createExcle createExcle = new createExcle();
		createExcle.createWhiteExcle(newmchnt, "MCC", "d:\\home1\\可审MCC.xlsx");
		return newmchnt ;

	}

	/**判断商户名称是否含有特定的
	 * @param mchntcd
	 * @return
	 */
	public List<Mchntcd> likeName(List<Mchntcd> mchntcd) {
		String forbid = "小微";
		for (int i = 0; i < mchntcd.size(); i++) {
		
				if (mchntcd.get(i).getMchntnm().indexOf(forbid) > -1) {
					System.out.println(mchntcd.get(i).getMchntcd());
				}
			}
		
		return null;

	}
}
