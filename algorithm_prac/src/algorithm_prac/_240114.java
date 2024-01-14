package algorithm_prac;
import java.util.*;
class _240114 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
                
        // giver�� reciever map�� �����, �� ������ key�� ������ �� �ֵ��� ���������� �����ϸ�?
        
        HashMap<String, HashMap<String, HashMap<String,Integer>>> userMap = new HashMap<>(friends.length); // ��ü ���� �ۼ��� ���� map
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
            
            
            
            HashMap<String, HashMap<String,Integer>> seperateMap = new HashMap<>(friends.length); // giver reciever ���� Ű
            
            
            seperateMap.put("send", senderMap);
            seperateMap.put("recieve", recieverMap);
            
            
            for(int j=0; j< friends.length; j++){
                HashMap<String, HashMap<String,Integer>> cloneMap = new HashMap<>(friends.length); // giver reciever Ŭ��
                for (Map.Entry<String, HashMap<String, Integer>> entry : seperateMap.entrySet()) {
                    cloneMap.put(entry.getKey(), new HashMap<>(entry.getValue()));
                }                
                userMap.put(friends[i], cloneMap);
            }
        }
        
        HashMap<String, HashMap<String,Integer>> giftPointMap = new HashMap<>(friends.length); // ��������

        
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
        
        
        
        
        // ���

        
//         // ��������
//         for(int i=0; i< friends.length; i++){
//             for(int j=0; j< userMap.get(friends[i]).get("send").size(); j++){
                
//                 String sender = friends[i];
//                 String reciever = friends[j];
//                 int sPoint = 0;
//                 int rPoint = 0;
                
                
                
//                 if(sender != reciever){
//                     sPoint = userMap.get(sender).get("send").get(reciever); // A�� B���� ���� Ƚ��
//                     rPoint = userMap.get(reciever).get("send").get(sender);// B�� A���� ���� Ƚ�� 
//                 }
                
//                 if(sPoint < rPoint){ // A�� ���� ���� ���
//                     giftPointMap.put(sender, giftPointMap.get(sender)+1);
//                 }else {
//                     giftPointMap.put(reciever, giftPointMap.get(reciever)+1);
//                 }
                

                
//              }
            
//             // if(userMap.get(friends).get()) // �� ���� ������ �ػ��
//             // else if() // ������ �ְ���� ���� ���ų�, ����� ���� ���
//         }
        
        System.out.println(giftPointMap);
        
        return answer;
    }
}