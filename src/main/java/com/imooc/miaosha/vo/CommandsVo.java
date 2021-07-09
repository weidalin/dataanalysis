package com.imooc.miaosha.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

public class CommandsVo {
	@NotNull
	private String[] commands;

	public String[] getCommands() {
		return commands;
	}

	public void setCommands(String[] commands) {
		this.commands = commands;
	}

	@Override
	public String toString() {
		return "CommandsVo{" +
				"commands=" + Arrays.toString(commands) +
				'}';
	}
}
