public class Q3_2019 {

  // Part A
  public ArrayList<String> getDelimitersList(String[] token) {
    ArrayList<String> result = new ArrayList<String> ();
    for (int i = 0; i < token.length; i++) {
      if (token[i].equals(openDel) || token[i].equals(closeDel)) {
        result.add(token[i]);
      } //end if
    } //end for loop
    return result;
  } //emd getDelimitersList

  // Part B
  public boolean isBalanced(ArrayList<String> delimiters) {
    int openDelCount = 0;
    int closeDelCount = 0;

    for (String del : delimiters) {
      if (del.equals(openDel)) {
        openDelCount++;
      } //end if
      else {
        closeDelCount++;
      } //end else

      if (closeDelCount > openDelCount) {
        return false;
      } //end if
    } //end for each loop

    if (openDelCount == closeDelCount) {
      return true;
    } //end if
    else {
      return false;
    } //end else

  } //end isBalanced()

} //end class
