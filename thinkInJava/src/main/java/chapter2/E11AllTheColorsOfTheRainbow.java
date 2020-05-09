package chapter2;

        public class E11AllTheColorsOfTheRainbow {
            int anIntegerRepresentingColors;
            void changeTheHueOfTheColor(int newHue) {
                anIntegerRepresentingColors = newHue;
            }
            public static void main(String[] args) {
                E11AllTheColorsOfTheRainbow all =
                        new E11AllTheColorsOfTheRainbow();
                all.changeTheHueOfTheColor(90);
            }
        }

