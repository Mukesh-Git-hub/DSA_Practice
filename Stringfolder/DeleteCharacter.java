package Stringfolder;

public class DeleteCharacter {
        public String makeFancyString(String s) {
            StringBuilder str = new StringBuilder();
            int f = 1;
            str.append(s.charAt(0));

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    f++;
                } else {
                    f = 1;
                }

                if (f < 3) {
                    str.append(s.charAt(i));
                }
            }

            return str.toString();
        }
    }


