package Soru_6;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Log implements Serializable {
	private String mistake;
	private String className;
	private String methodName;
	private LocalDateTime dateTime;

	public Log() {
		super();
	}

	public Log(String mistake, String className, String methodName, LocalDateTime dateTime) {
		super();
		this.mistake = mistake;
		this.className = className;
		this.methodName = methodName;
		this.dateTime = dateTime;
	}

	public String getMistake() {
		return mistake;
	}

	public void setMistake(String mistake) {
		this.mistake = mistake;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Log [mistake=" + mistake + ", className=" + className + ", methodName=" + methodName + ", dateTime="
				+ dateTime + "]";
	}

}