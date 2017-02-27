package com.hmh.wordGame;

public class Main {

  public static void main(String[] args) {
    // populate args if empty or has too few strings
    // assume populated correctly otherwise, no further checks on the input
    if(args.length < 2)
    {
      args = new String[]{"Gimi", "Fili", "Ilif", "Mark"};
    }

    for(int i = 0; i < args.length - 1; i++) {
      for(int j = i + 1; j < args.length; j++) {
        if(isPalindrome(args[i].toLowerCase(), args[j].toLowerCase())) {
          System.out.println("Palindrome Found! " + args[i] + " and " + args[j]);
        }
      }
    }
  }

  private static boolean isPalindrome(String str1, String str2) {
    if(str1.length() != str2.length()) {
      return false;
    }
    char[] a = str1.toCharArray();
    char[] b = str2.toCharArray();
    int lastIndex = str2.length() - 1;
    for(int i = 0; i < str1.length(); i++) {
      if(a[i] != b[lastIndex - i]) {
        return false;
      }
    }
    return true;
  }
}
