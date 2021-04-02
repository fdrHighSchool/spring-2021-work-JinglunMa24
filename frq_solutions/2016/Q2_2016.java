public class Q2_2016 {

  // Part A
  public LogMessage(String message) {
    this.machineId = message.substring(0, message.indexOf(":"));
    this.description = message.substring(message.indexOf(":") + 1);
  } //end LogMessage()


  // Part B
  public boolean containsWord(String keyword) {
    int index = this.description.indexOf(keyword);
    if (index != -1) {
      boolean check1 = (index == 0) || (this.description.charAt(index - 1).equals(" "));
      boolean check2 = (index == this.description.length() - keyword.length()) || (description.charAt(index + keyword.length() + 1).equals(" "));
      return check1 && check2;
    } //end if
    return false;
  } //end containsWord()


  // Part C
  public List<LogMessage> removeMessages(String keyword) {
    for (int i = messageList.size() - 1; i >= 0; i--) {
      if (messageList.get(i).containsWord(keyword)) {
        messageList.remove(i);
      } //end if
    } //end for loop
    return messageList;
  } //end removeMessages()

} //end Q2_2016
