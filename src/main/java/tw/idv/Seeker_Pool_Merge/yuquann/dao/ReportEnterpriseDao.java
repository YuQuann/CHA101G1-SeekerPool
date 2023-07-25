package tw.idv.Seeker_Pool_Merge.yuquann.dao;

import tw.idv.Seeker_Pool_Merge.yuquann.vo.ReportEnterpriseVo;

import java.util.List;

public interface ReportEnterpriseDao {

    /**
     * 檢舉表單送出
     * @param vo
     * @return
     */
    int insert(ReportEnterpriseVo vo);

    /**
     * 更新檢舉表單狀態(審核結果以及審核狀態)
     * @param vo
     * @return
     */
    int update(ReportEnterpriseVo vo);

    /**
     * 號碼查詢檢舉表單
     * @param reNo
     * @return
     */
    ReportEnterpriseVo selectNumber(int reNo);

    /**
     * 檢舉狀態查詢
     * @param reResult
     * @return
     */
    List<ReportEnterpriseVo> selectResult(int reResult);

    /**
     * 全部檢舉表單查詢
     * @return
     */
    List<ReportEnterpriseVo> selectAll();

    /**
     *
     * @param reNo
     * @return
     */
    ReportEnterpriseVo statusShow(int reNo);

}
