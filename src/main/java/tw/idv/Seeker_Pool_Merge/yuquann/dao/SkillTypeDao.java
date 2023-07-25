package tw.idv.Seeker_Pool_Merge.yuquann.dao;

import tw.idv.Seeker_Pool_Merge.yuquann.vo.SkillTypeVo;

import java.util.List;

public interface SkillTypeDao {

    /**
     * 顯示所有技能規格
     * @return
     */
    List<SkillTypeVo> selectAll();

    /**
     * 新增技能規格
     * @param skType
     * @param skName
     * @return
     */
    int skillAdd(String skType, String skName);

    /**
     * 編輯技能頁面
     * @param skType
     * @param skName
     * @param skNo
     * @return
     */
    int skillEdit(String skType, String skName, int skNo);

    /**
     * 顯示編輯技能頁面
     * @param skNo
     * @return
     */
    SkillTypeVo skillEditShow(int skNo);

    /**
     * 關鍵字搜尋技能
     * @param keyword
     * @return
     */
    List<SkillTypeVo> skillSelect(String keyword);

    /**
     * 刪除技能
     * @param skNo
     * @return
     */
    int skillDelete(int skNo);



}
