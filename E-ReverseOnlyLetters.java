class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        StringBuilder lettersOnly = new StringBuilder();
        for (int k = s.length() - 1; k >= 0; k--) {
            if (Character.isLetter(s.charAt(k))) {
                lettersOnly.append(s.charAt(k));
            }
        }
        int letterIndex = 0;

        for (int j = 0; j < s.length(); j++) {
            char current = s.charAt(j);
            if (Character.isLetter(current)) {
                result.append(lettersOnly.charAt(letterIndex));
                letterIndex++;
            } else {
                result.append(current);
            }
        }

        return result.toString();
    }
}
