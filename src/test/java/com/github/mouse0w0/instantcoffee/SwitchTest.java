package com.github.mouse0w0.instantcoffee;

import org.junit.jupiter.api.Test;

public class SwitchTest {
    @Test
    public void test() {
        Utils.validate(Switch.class);
    }

    private static class Switch {
        public int tableSwitch(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                default:
                    return -1;
            }
        }

        public int tableSwitch2(int i) {
            switch (i) {
                case 0:
                    return 0;
                // case 1:
                //     return 1;
                case 2:
                    return 2;
                // case 3:
                //     return 3;
                case 4:
                    return 4;
                // case 5:
                //     return 5;
                case 6:
                    return 6;
                default:
                    return -1;
            }
        }

        public int lookupSwitch(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 100:
                    return 1;
                case 200:
                    return 2;
                case 300:
                    return 3;
                case 400:
                    return 4;
                case 500:
                    return 5;
                default:
                    return -1;
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Utils.validate(SwitchTest.class);
        }
    }
}
