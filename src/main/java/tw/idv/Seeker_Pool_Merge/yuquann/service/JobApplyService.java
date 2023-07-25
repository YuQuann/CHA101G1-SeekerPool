package tw.idv.Seeker_Pool_Merge.yuquann.service;

public interface JobApplyService {

    /**
     * 檢查是否有應徵過該職缺
     * @param memId
     * @param comMemId
     * @param jobNo
     * @return
     */
    boolean applyCheck(int memId, int comMemId, int jobNo);

}
