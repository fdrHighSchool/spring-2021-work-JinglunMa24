public class Q4_2016 {

  // Part A
  public static int totalLetters(List<String> wordList) {
    int count = 0;
    for (String word : wordList) {
      count += word.length();
    } //end for loop
    return count;
  } //end totalLetters()


  // Part B
  public static int basicGapWidth(List<String> wordList, int formattedLen) {
      return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
  } //end basicGapWidth()


  // Part C
  public static String format(List<String> wordList, int formattedLen) {
    String output = "";
    int basicGap = basicGapWidth(wordList, formattedLen);
    String gap = "";
    for (int i = 0; i < basicGapWidth(wordList, formattedLen); i++) {
      gap += " ";
    } //end for each loop
    int left = leftoverSpaces(wordList, formattedLen);
    int count = 0;
    while (count < left) {
      output += wordList.get(count) + gap + " ";
      count++;
    } //end while
    while (count < wordList.size() - 1) {
      output += wordList.get(count) + gap;
      count++;
    } //end while
    output += wordList.get(wordList.size() - 1);
    return output;
  } //end format()

} //end Q4_2016
