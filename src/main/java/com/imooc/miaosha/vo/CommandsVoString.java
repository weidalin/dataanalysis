package com.imooc.miaosha.vo;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

public class CommandsVoString {
	@NotNull
	private String command1;
	private String command2;

	public String getCommand1() {
		return command1;
	}

	public void setCommand1(String command1) {
		this.command1 = command1;
	}

	public String getCommand2() {
		return command2;
	}

	public void setCommand2(String command2) {
		this.command2 = command2;
	}

	@Override
	public String toString() {
		return "CommandsVoString{" +
				"command1='" + command1 + '\'' +
				", command2='" + command2 + '\'' +
				'}';
	}
}
