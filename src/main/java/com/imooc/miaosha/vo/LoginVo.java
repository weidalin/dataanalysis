package com.imooc.miaosha.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.imooc.miaosha.validator.IsMobile;

public class LoginVo {
	@NotNull
	private String command;


	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	@Override
	public String toString() {
		return "CommandsVo{" +
				"command='" + command + '\'' +
				'}';
	}
}
