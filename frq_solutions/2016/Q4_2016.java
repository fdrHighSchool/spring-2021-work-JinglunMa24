public class Q4_2016 {

  // Part A
  public static int totalLetters(List<String> wordList) {
    int count = 0;  // 1 point
    for (String word : wordList) {  // 1 point
      count += word.length();
    } //end for loop
    return count;
  } //end totalLetters()


  // Part B
  public static int basicGapWidth(List<String> wordList, int formattedLen) {
      return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);  // 2 points
  } //end basicGapWidth()


  // Part C
  public static String format(List<String> wordList, int formattedLen) {
    String output = "";
    int basicGap = basicGapWidth(wordList, formattedLen);  // 0.5 points
    int left = leftoverSpaces(wordList, formattedLen);  // 0.5 points
    String gap = "";
    for (int i = 0; i < basicGapWidth(wordList, formattedLen); i++) {  // 1 point
      gap += " ";
    } //end for each loop
    int count = 0;
    while (count < left) {
      output += wordList.get(count) + gap + " ";  // 1 point
      count++;
    } //end while
    while (count < wordList.size() - 1) {
      output += wordList.get(count) + gap;
      count++;
    } //end while
    output += wordList.get(wordList.size() - 1);
    return output;  // 1 point
  } //end format()

} //end Q4_2016
