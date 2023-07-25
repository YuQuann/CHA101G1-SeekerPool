package tw.idv.Seeker_Pool_Merge.yuquann.dao;

import tw.idv.Seeker_Pool_Merge.yuquann.vo.ApplyRecordVo;

import java.util.List;

public interface JobApplyDao {

    /**
     * 新增應徵紀錄
     * @param memId
     * @param comMemId
     * @param jobNo
     * @return
     */
    int insert(int memId, int comMemId, int jobNo);

    /**
     *
     * @return
     */
    List<ApplyRecordVo> selectAll();

}
