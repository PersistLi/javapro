package Game;

import java.util.*;

import java.util.Scanner;

public class Licensingdevice {
    public static void main(String[] args) {
        //接收游戏人数
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if(player>18||player<12){
            System.out.println("游戏人数不符要求，无法进行");
        }else {
            /*
            * 定义三个List,分别为：
            *       发牌的列表
            *       发完牌的列表
            *       底牌的列表
            * */
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> finall = new ArrayList<>();
            init(all);
            start(all,player);
            // 盗贼一定在游戏的牌中  总牌中移除盗贼 放入游戏牌中
            all.remove("盗贼");
            play.add("盗贼");
            dipai(all,finall);
            // 将放完底牌的总牌 全部放入游戏牌中
            play.addAll(all);
            // 将游戏牌 打乱顺序 (洗牌)
            Collections.shuffle(play);
            System.out.println("手牌:"+play);
            System.out.println("底牌:"+finall);
        }
    }
    public static void init(List<String> list){
        //循环添加  4个狼人
        for(int i = 0; i <4; i++){
            list.add("狼人");
        }
        //循环添加  4个村民
        for(int i = 0; i<4; i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("丘比特");
        list.add("女巫");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //根据游戏人数不同，初始化
    public static void start(List<String> list,int palyer){
        if(palyer>12)
            list.add("村民");
        if(palyer>13)
            list.add("替罪羊");
        if(palyer>14)
            list.add("狼人");
        if(palyer>15)
            list.add("村民");
        if(palyer>16)
            list.add("村民");
        if(palyer>17)
            list.add("吹笛者");
    }
    //从所有牌中随机拿出3张作为底牌
    public static void dipai(List<String> list, List<String> di){
        //狼人数应该小于等于1
        while(di.size()<3){
            //取list的一个随机下标
            Random random = new Random();
            int index = random.nextInt(list.size());
            if(di.contains("狼人")&&list.get(index).equals("狼人"))
                continue;
            else
                di.add(list.remove(index)) ;
        }
    }
}
