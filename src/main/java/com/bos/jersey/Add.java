package com.bos.jersey;


public class Add {

	public Add() {
		// TODO Auto-generated constructor stub
	}
	

	int input1;

	int input2;

	int output;
	
	public Add(int input1,int input2) {
		this.input1 = input1;
		this.input2 = input2;
		this.output = input1+input2;
	}
	
	
	public int getInput1() {
		return input1;
	}
	public void setInput1(int input1) {
		this.input1 = input1;
	}
	public int getInput2() {
		return input2;
	}
	public void setInput2(int input2) {
		this.input2 = input2;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}

	
	@Override
	public String toString() {
		return new StringBuffer("input1").append(this.input1)
				.append("input2").append(this.input1)
				.append("output").append(this.output).toString();
	}
}
