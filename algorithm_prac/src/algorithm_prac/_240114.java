package algorithm_prac;
import java.util.*;
class _240114 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
                
        // giver와 reciever map을 만들고, 각 개인을 key로 접근할 수 있도록 계층형으로 설계하면?
        
        HashMap<String, HashMap<String, HashMap<String,Integer>>> userMap = new HashMap<>(friends.length); // 전체 선물 송수신 정리 map
        for(int i=0; i< friends.length; i++){
            String curFriend = friends[i];
            
            HashMap<String, Integer> senderMap = new HashMap<>(friends.length);  
            HashMap<String, Integer> recieverMap = new HashMap<>(friends.length);
            
            
            for(int k=0; k< friends.length; k++){
                if(friends[k] != curFriend){
                    senderMap.put(friends[k], 0);
                    recieverMap.put(friends[k], 0);        
                }
                           
            }
            
            
            
            HashMap<String, HashMap<String,Integer>> seperateMap = new HashMap<>(friends.length); // giver reciever 구분 키
            
            
            seperateMap.put("send", senderMap);
            seperateMap.put("recieve", recieverMap);
            
            
            for(int j=0; j< friends.length; j++){
                HashMap<String, HashMap<String,Integer>> cloneMap = new HashMap<>(friends.length); // giver reciever 클론
                for (Map.Entry<String, HashMap<String, Integer>> entry : seperateMap.entrySet()) {
                    cloneMap.put(entry.getKey(), new HashMap<>(entry.getValue()));
                }                
                userMap.put(friends[i], cloneMap);
            }
        }
        
        HashMap<String, HashMap<String,Integer>> giftPointMap = new HashMap<>(friends.length); // 선물지수

        
        for(int i=0; i< gifts.length; i++){
            int sepIdx = gifts[i].indexOf(" ");
            String sender = gifts[i].substring(0,sepIdx);
            String reciever = gifts[i].substring(sepIdx+1);
                        
            int sendPoint = userMap.get(sender).get("send").get(reciever) + 1;
            int recievePoint = userMap.get(reciever).get("recieve").get(sender) + 1;
            
            userMap.get(sender).get("send").put(reciever, sendPoint);
            userMap.get(reciever).get("recieve").put(sender, recievePoint);
            
            HashMap<String, Integer> giftSendingPointMap = new HashMap<>(friends.length);
            HashMap<String, Integer> giftRecievingPointMap = new HashMap<>(friends.length);            
            
            if(sender != reciever){
                giftSendingPointMap.put(sender, giftSendingPointMap.get(sender)+1);
                giftRecievingPointMap.put(reciever, giftSendingPointMap.get(reciever)+1);    
                
                giftPointMap.put("giftSendingPoint", giftSendingPointMap);
                giftPointMap.put("giftRecievingPoint", giftRecievingPointMap);                
            }
            
            

            
        }
        
        
        //System.out.println(userMap);
        
        
        
        
        // 결과

        
//         // 선물지수
//         for(int i=0; i< friends.length; i++){
//             for(int j=0; j< userMap.get(friends[i]).get("send").size(); j++){
                
//                 String sender = friends[i];
//                 String reciever = friends[j];
//                 int sPoint = 0;
//                 int rPoint = 0;
                
                
                
//                 if(sender != reciever){
//                     sPoint = userMap.get(sender).get("send").get(reciever); // A가 B에게 보낸 횟수
//                     rPoint = userMap.get(reciever).get("send").get(sender);// B가 A에게 보낸 횟수 
//                 }
                
//                 if(sPoint < rPoint){ // A가 적게 보낸 경우
//                     giftPointMap.put(sender, giftPointMap.get(sender)+1);
//                 }else {
//                     giftPointMap.put(reciever, giftPointMap.get(reciever)+1);
//                 }
                

                
//              }
            
//             // if(userMap.get(friends).get()) // 더 많은 선물을 준사람
//             // else if() // 선물을 주고받은 수가 같거나, 기록이 없는 경우
//         }
        
        System.out.println(giftPointMap);
        
        return answer;
    }
}