public class OOPSBannerAppUC7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(CharacterPatternMap[] patternArray, char ch) {
        for (CharacterPatternMap cp : patternArray) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7];
    }

    public static void displayBanner(String text, CharacterPatternMap[] patternArray) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = getCharacterPattern(patternArray, ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

                new CharacterPatternMap('O', new String[]{
                        " *** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "**** ",
                        "*   *",
                        "*   *",
                        "**** ",
                        "*    ",
                        "*    ",
                        "*    "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ****",
                        "*    ",
                        "*    ",
                        " *** ",
                        "    *",
                        "    *",
                        "**** "
                })
        };

        displayBanner("OOPS", patterns);
    }
}