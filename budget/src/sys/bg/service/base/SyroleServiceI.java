package sys.bg.service.base;

import java.util.List;

import sys.bg.model.base.Syrole;
import sys.bg.service.BaseServiceI;
import sys.bg.util.base.HqlFilter;

/**
 * 角色业务
 * 
 * @author admin
 * 
 */
public interface SyroleServiceI extends BaseServiceI<Syrole> {

	/**
	 * 查找角色
	 * 
	 * @param hqlFilter
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<Syrole> findRoleByFilter(HqlFilter hqlFilter, int page, int rows);

	/**
	 * 查找角色
	 */
	public List<Syrole> findRoleByFilter(HqlFilter hqlFilter);

	/**
	 * 统计角色
	 * 
	 * @param hqlFilter
	 * @return
	 */
	public Long countRoleByFilter(HqlFilter hqlFilter);

	/**
	 * 添加一个角色
	 * 
	 * @param data
	 * @param userId
	 */
	public void saveRole(Syrole syrole, String userId);

	/**
	 * 为角色授权
	 * 
	 * @param id
	 *            角色ID
	 * @param resourceIds
	 *            资源IDS
	 */
	public void grant(String id, String resourceIds);

}
