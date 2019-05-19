package com.clickchain.gumball;

public class Messages {
	public static String NQ_START = "Quarter for a Gumball";
	public static String NQ_QUART = "Turn the Crank for a Gumball";
	public static String NQ_EJECT = "You haven't inserted a quarter yet";
	public static String NQ_CRANK = "You need to pay first";
	public static String NQ_TAKE = "So Sorry, come back after pay day";

	public static String HQ_START = NQ_QUART;
	public static String HQ_QUART = "You can't insert another quarter";
	public static String HQ_EJECT = "Pick up your Quarter from the tray";
	public static String HQ_CRANK = "A Gumball is on its way!";
	public static String HQ_TAKE = NQ_START;

	public static String SO_START = "Sorry, the machine is sold out";
	public static String SO_QUART = "There are no gumballs, please pick up your quarter";
	public static String SO_EJECT = "This is not a slot machine";
	public static String SO_CRANK = "There are no gumballs";
	public static String SO_TAKE = "I can't give you what I don't have";

	public static String SL_START = HQ_CRANK;
	public static String SL_QUART = "Please wait, we're already giving you a gumball";
	public static String SL_EJECT = "Sorry, you already turned the crank";
	public static String SL_CRANK = "Turning again doesn't get you another gumball";
	public static String SL_TAKE = NQ_START;

//	public static String WN_START = "You are a Winner!";
//	public static String WN_QUART = "Please wait, we're already giving you two gumballs!";
//	public static String WN_EJECT = "You have already turned the crank";
//	public static String WN_CRANK = "Turning again doesn't get you another gumball";
//	public static String WN_TAKE = "WN_TAKE";
}
