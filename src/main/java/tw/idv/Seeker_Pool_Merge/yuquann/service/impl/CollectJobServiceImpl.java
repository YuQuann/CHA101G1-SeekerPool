package tw.idv.Seeker_Pool_Merge.yuquann.service.impl;

import java.util.List;

import tw.idv.Seeker_Pool_Merge.yuquann.dao.impl.JobCollectDaoImpl;
import tw.idv.Seeker_Pool_Merge.yuquann.service.CollectJobService;
import tw.idv.Seeker_Pool_Merge.yuquann.vo.CollectJobVo;

public class CollectJobServiceImpl implements CollectJobService {

	public boolean check(int memId, int jobNo) {

		JobCollectDaoImpl dao = new JobCollectDaoImpl();
		List<CollectJobVo> list = dao.selectAll();

		for (CollectJobVo vo : list) {

			int dbMemId = vo.getMemId();
			int dbJobNo = vo.getJobNo();

			if (memId == dbMemId && jobNo == dbJobNo) {
//				System.out.println("該會員已收藏該職缺至清單中");
				return false;
			}
		}
		return true;
	}

}
