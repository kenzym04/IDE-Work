 import java.util.ArrayList;
            import java.util.List;

            public class MostFrequentDigits1 {

                /**
                 * @param args
                 */
                public static void main(String[] args) {
                    // TODO Auto-generated method stub

                    long number = 12345612;
                    String str = "12342352397235823050237238523";
                    getMostFrequentDigitWInNumber(number);
                    getMostFrequentDigitInString(str);

                }

                public static void getMostFrequentDigitWInNumber(long number) {
                    List<Integer> list = new ArrayList<Integer>();
                    int[] frequency = new int[10];
                    int mostFrequentVal = 0;
                    while (number > 0) {
                        int digit = (int) (number % 10);
                        number /= 10;
                        frequency[digit]++;
                        if (frequency[digit] > mostFrequentVal) {
                            mostFrequentVal = frequency[digit];
                        }
                    }

                    for (int j = 0; j < frequency.length; j++) {
                        if (frequency[j] == mostFrequentVal) {
                            list.add(j);
                        }
                    }
                    System.out.println("most frequent digits in Number:" + list);
                }

                public static void getMostFrequentDigitInString(String str) {
                    List<Integer> list = new ArrayList<Integer>();
                    int mostFrequentVal = 0;
                    int[] frequency = new int[10];
                    for (int k = 0; k < str.length(); k++) {
                        char c = str.charAt(k);
                        int ind = Integer.valueOf(String.valueOf(c));
                        frequency[ind]++;
                        if (frequency[ind] > mostFrequentVal) {
                            mostFrequentVal = frequency[ind];
                        }
                    }

                    for (int j = 0; j < frequency.length; j++) {
                        if (frequency[j] == mostFrequentVal) {

                            list.add(j);
                        }
                    }
                    System.out.println("most frequent digits in string:" + list);
                }

            }
