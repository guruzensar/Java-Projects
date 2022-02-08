package com.zensar.training.bean;

import java.util.Arrays;

public class Question {
	
	private int questionNumber;
	private String questionText;
	private String[] choiceTexts;
	private int index;
	
	public Question(int questionNumber, String questionText) {
		super();
		this.questionNumber = questionNumber;
		this.questionText = questionText;
		this.choiceTexts=new String[5];
	}

	public Question() {
		super();
		this.choiceTexts=new String[5];
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(int questionnNumber) {
		this.questionNumber = questionnNumber;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String[] getChoiceTexts() {
		return choiceTexts;
	}

	public void setChoiceTexts(String[] choiceTexts) {
		this.choiceTexts = choiceTexts;
	}
	
	public void addChoice(String choiceText){
		this.choiceTexts[index++]=choiceText;
	}

	@Override
	public String toString() {
		return "Question [questionnNumber=" + questionNumber
				+ ", questionText=" + questionText + ", choiceTexts="
				+ Arrays.toString(choiceTexts) + "]";
	}
	
	
	

}
