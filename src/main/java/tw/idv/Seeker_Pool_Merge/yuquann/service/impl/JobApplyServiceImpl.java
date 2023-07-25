package tw.idv.Seeker_Pool_Merge.yuquann.service.impl;

import java.util.List;

import tw.idv.Seeker_Pool_Merge.yuquann.dao.impl.JobApplyDaoImpl;
import tw.idv.Seeker_Pool_Merge.yuquann.service.JobApplyService;
import tw.idv.Seeker_Pool_Merge.yuquann.vo.ApplyRecordVo;

public class JobApplyServiceImpl implements JobApplyService {
		//商業邏輯判斷三項參數是否同時存在於資料庫中的某一欄位
		public boolean applyCheck(int memId, int comMemId, int jobNo) {
			
			JobApplyDaoImpl dao = new JobApplyDaoImpl();
			List<ApplyRecordVo> list = dao.selectAll();
			
			for(ApplyRecordVo vo : list) {
				
				int dbMemId = vo.getMemId();
				int dbComMemId = vo.getComMemId();
				int dbJobNo = vo.getJobNo();
				
				if(memId == dbMemId && comMemId == dbComMemId && jobNo == dbJobNo) {
//					System.out.println("該會員已應徵過該職缺");
					return false;
				}
			}
			return true;
		}
	
}
