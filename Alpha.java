package com.toy.anagrams.lib;

import java.util.Scanner;

public class Alpha
{
    public static void main ( String[] args){
  System.out.println("Please enter a character: ");
  String character = in.next();

  System.out.println(character);

  if (character.isLetter()){
    System.out.println("The character entered is a letter.");
  }
  else (character.isDigit()){
    System.out.println("The character entered is not a letter");
}
}
