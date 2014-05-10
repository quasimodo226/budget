package sys.bg.cxf.demo.impl;

import javax.jws.WebService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import sys.bg.cxf.demo.WebServiceDemoI;
import sys.bg.model.base.Syuser;
import sys.bg.service.base.SyuserServiceI;

/**
 * WebService接口实现类
 * 
 * @author admin
 * 
 */
@WebService(endpointInterface = "sys.bg.cxf.demo.WebServiceDemoI", serviceName = "webServiceDemo")
public class WebServiceDemoImpl implements WebServiceDemoI {

	@Autowired
	private SyuserServiceI userService;

	@Override
	public String helloWs(String name) {
		if (StringUtils.isBlank(name)) {
			name = "SunYu";
		}
		String str = "hello[" + name.trim() + "]WebService test ok!";
		System.out.println(str);
		return str;
	}

	@Override
	public Syuser getUser(String id) {
		if (StringUtils.isBlank(id)) {
			id = "0";
		}
		Syuser user = userService.getById(id.trim());
		Syuser u = new Syuser();
		u.setName(user.getName());
		u.setAge(user.getAge());
		u.setCreatedatetime(user.getCreatedatetime());
		u.setUpdatedatetime(user.getUpdatedatetime());
		u.setId(user.getId());
		u.setLoginname(user.getLoginname());
		u.setSex(user.getSex());
		u.setPhoto(user.getPhoto());
		return u;
	}

}
