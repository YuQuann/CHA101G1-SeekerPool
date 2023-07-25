package tw.idv.Seeker_Pool_Merge.yuquann.dao;

import tw.idv.Seeker_Pool_Merge.yuquann.vo.PositionTypeVo;

import java.util.List;

public interface JobPositionDao {

    /**
     * 新增職缺規格
     * @param ptType
     * @param ptName
     * @return
     */
    int add(String ptType, String ptName);

    /**
     * 生成所有職缺規格
     * @return
     */
    List<PositionTypeVo> showAll();

    /**
     * 編輯職缺規格時展示
     * @param ptNo
     * @return
     */
    PositionTypeVo editShow(int ptNo);

    /**
     * 更新職缺規格
     * @param ptType
     * @param ptName
     * @param ptNO
     * @return
     */
    int update(String ptType, String ptName, int ptNO);

    /**
     * 針對職缺type搜尋結果
     * @param ptType
     * @return
     */
    List<PositionTypeVo> typeSelect(String ptType);

    /**
     * 針對職缺名稱搜尋結果
     * @param ptName
     * @return
     */
    List<PositionTypeVo> nameSelect(String ptName);

    /**
     * 刪除職缺
     * @param ptNO
     * @return
     */
    int delete(int ptNO);



}
