package tw.idv.Seeker_Pool_Merge.yuquann.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import tw.idv.Seeker_Pool_Merge.common.util.HikariCPUtil;
import tw.idv.Seeker_Pool_Merge.yuquann.dao.JobSearchDao;
import tw.idv.Seeker_Pool_Merge.yuquann.vo.JobVo;

public class JobSearchDaoImpl implements JobSearchDao {

	private DataSource dataSource = HikariCPUtil.getDataSource();

	public List<JobVo> searchResult(String keyword, String city, String town) {

		String sql = "SELECT JOB_NO,JOB_NAME,CITY_NAME,DISTRICT_NAME,C.COM_MEM_ID,C.COM_NAME,JOB_TOP,C.COM_PICTURE FROM JOB "
				+ "JOIN company_member C ON JOB.COM_MEM_ID = C.COM_MEM_ID "
				+ "WHERE JOB_NAME LIKE concat('%',?,'%') " + "AND JOB_UPLOAD = 1 "
				+ "AND CITY_NAME LIKE concat('%',?,'%') " + "AND DISTRICT_NAME LIKE concat('%',?,'%') "
				+ "ORDER BY JOB_TOP DESC;";

		// 建立集合把物件包裝起來
		List<JobVo> list = new ArrayList<>();
		ResultSet rs = null;

		try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

			ps.setString(1, keyword);
			ps.setString(2, city);
			ps.setString(3, town);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				// 建立vo實體以包裝物件內容
				JobVo vo = new JobVo();
				vo.setJobNo(rs.getInt("JOB_NO"));
				vo.setJobName(rs.getString("JOB_NAME"));
				vo.setCityName(rs.getString("CITY_NAME"));
				vo.setDistrictName(rs.getString("DISTRICT_NAME"));
				vo.setComName(rs.getString("COM_NAME"));
				vo.setComMemId(rs.getInt("COM_MEM_ID"));
				vo.setJobTop(rs.getInt("JOB_TOP"));
				vo.setComPicture(rs.getString("COM_PICTURE"));

				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
