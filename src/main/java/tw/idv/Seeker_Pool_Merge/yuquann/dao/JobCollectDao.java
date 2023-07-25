package tw.idv.Seeker_Pool_Merge.yuquann.dao;

import tw.idv.Seeker_Pool_Merge.yuquann.vo.CollectJobVo;

import java.util.List;

public interface JobCollectDao {

    /**
     * 新增職缺收藏紀錄
     * @param memId
     * @param jobNo
     * @return
     */
    int insert(int memId, int jobNo);


    /**
     *
     * @return
     */
    List<CollectJobVo> selectAll();

}
