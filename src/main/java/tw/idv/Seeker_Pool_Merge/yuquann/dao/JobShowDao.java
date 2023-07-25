package tw.idv.Seeker_Pool_Merge.yuquann.dao;

import java.util.Map;

public interface JobShowDao {

    /**
     * 職缺展示頁面資料
     * @param jobNo
     * @return
     */
    Map<String,Object> jobShow(int jobNo);

}
