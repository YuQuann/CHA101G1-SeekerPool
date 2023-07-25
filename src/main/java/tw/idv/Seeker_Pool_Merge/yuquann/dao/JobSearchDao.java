package tw.idv.Seeker_Pool_Merge.yuquann.dao;

import tw.idv.Seeker_Pool_Merge.yuquann.vo.JobVo;

import java.util.List;

public interface JobSearchDao {

    /**
     * 職缺搜尋結果
     * @param keyword
     * @param city
     * @param town
     * @return
     */
    List<JobVo> searchResult(String keyword, String city, String town);


}
