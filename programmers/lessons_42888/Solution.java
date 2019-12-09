package lessons_42888;

import java.util.*;

public class Solution {

   public String[] solution(String[] record) {

      Map<String, String> userMap = new HashMap<>();
      List<String> uuidList = new ArrayList<>();
      List<String> messageList = new ArrayList<>();
      StringTokenizer st;
      String uuid;
      for (int i = 0; i < record.length; i ++) {
         st = new StringTokenizer(record[i]);
         Action action = Action.valueOf(st.nextToken().toUpperCase());

         uuid = st.nextToken();

         if(action.message != null) {
            messageList.add(action.message);
            uuidList.add(uuid);
         }

         if(action != Action.LEAVE) {
            userMap.put(uuid, st.nextToken());
         }

      }

      String[] answer = new String[messageList.size()];

      for (int i = 0; i < uuidList.size(); i ++) {
         answer[i] = userMap.get(uuidList.get(i)) + messageList.get(i);
      }

      return answer;
   }

   public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(Arrays.toString(solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
   }

}

enum Action {
   ENTER("님이 들어왔습니다."), LEAVE("님이 나갔습니다."), CHANGE(null);

   public String message;

   Action(String message) {
      this.message = message;
   }

}