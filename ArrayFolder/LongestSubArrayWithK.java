package ArrayFolder;

import static java.lang.Math.max;

        public class LongestSubArrayWithK {
            int call() {
                int[] array = {1, 2, 3, 1, 1, 1, 4, 3, 2};
                int length = 3;
                int len = 0;
                int n = array.length;
                for (int i = 0; i < n; i++) {
                    int sum = 0;
                    for (int j = i; j < n; j++) {

                            sum += array[j];

                        if (sum == length) {
                            len = max(len, j - i + 1);

                        }

                    }


                }
                return len;
            }
        }