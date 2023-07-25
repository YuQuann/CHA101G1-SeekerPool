package tw.idv.Seeker_Pool_Merge.yuquann.service;

public interface CollectJobService {

    /**
     * 檢查是否已經收藏過該職缺
     * @param memId
     * @param jobNo
     * @return
     */
    boolean check(int memId, int jobNo);

}
