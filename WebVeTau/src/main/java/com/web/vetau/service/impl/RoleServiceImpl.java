package com.web.vetau.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.vetau.repository.RoleRepositore;
import com.web.vetau.service.RoleService;

public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleRepositore roleRepositore;
}
