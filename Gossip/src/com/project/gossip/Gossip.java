package com.project.gossip;

import java.util.ArrayList;

public class Gossip {
private Emotion emotion;
private String text;
private ArrayList<User> empfaenger;


public Gossip(Emotion emotion, String text, ArrayList<User> empfaenger) {
	super();
	this.emotion = emotion;
	this.text = text;
	this.empfaenger = empfaenger;
}

public Emotion getEmotion() {
	return emotion;
}
public void setEmotion(Emotion emotion) {
	this.emotion = emotion;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public ArrayList<User> getEmpfaenger() {
	return empfaenger;
}
public void setEmpfaenger(ArrayList<User> empfaenger) {
	this.empfaenger = empfaenger;
}

}
