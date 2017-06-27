package com.feng.bootcloud.core.beetl;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

import com.feng.bootcloud.core.util.ToolUtil;

public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

	@Override
	public void initOther() {

		groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
		groupTemplate.registerFunctionPackage("tool", new ToolUtil());

	}

}
