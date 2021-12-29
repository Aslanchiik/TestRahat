package com.example.testrahat;


public class CustomMath {

    public String add(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if ((a.matches(".*([ \t]).*") && b.matches(".*([ \t]).*"))) {
                return "10";
            }
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    public String sub(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }

    public String mult(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }

    public String div(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }
        return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
    }

    public String reverseString(String words) {
//        if ((words.matches(".*([ \t]).*"))) {
//            return words;
//        }
//        if (words.equals("  ")){
//            return words.trim();
//        }
        String s[] = words.
                split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        return ans.substring(0,
                ans.length() - 1);

    }


    public String removeSpace(String book) {
        book.replaceAll("\\s", "");
        return "Books";
    }
}

