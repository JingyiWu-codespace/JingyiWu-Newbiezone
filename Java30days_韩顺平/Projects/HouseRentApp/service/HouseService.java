package Java30days_韩顺平.Projects.HouseRentApp.service;

import Java30days_韩顺平.Projects.HouseRentApp.domain.House;
import Java30days_韩顺平.Projects.HouseRentApp.utils.Utility;

/*
 *HouseService.java
 * 定义House[],保存House对象
 * 响应Houseview的调用
 * 完成对房屋信息的各种操作
 */
public class HouseService {
    private int houseNums = 1; //记录当前有多少个房屋信息
    private House[] houses; //保存House 对象
    private int idCounter = 1;

    public HouseService(int size) {
        // new houses;
        houses = new House[size]; //指定数组大小
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //修改房屋信息


    //根据id查找房屋信息
    public House search(int id){
        int searchIndex = -1;
        for( int i = 0;i<houses.length;i++){
            if (id == houses[i].getId()){
                searchIndex = i;
                return houses[searchIndex];
            }
        }return null;

    }
    //del方法，删除一个房屋信息
    public boolean del(int delId){
        //先找到删除房屋信息对应的下标
        //下标和房屋编号不是一个数值
        int index = -1;
        for (int i = 0;i<houseNums;i++){
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        //怎么删除？
        for (int i = index; i<houseNums-1;i++){
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        return true;

    }

    //add 方法 添加对象 返回布尔值
    public boolean add(House newHouse) {
        //先暂时不考虑数组扩容的问题
        if (houseNums == houses.length) {
            System.out.println("数组已满，是否继续添加？n/k");
            System.out.println("每次添加1行");
            String counter = Utility.readString(1);
            if (counter.equals("n")) {
                House[] housesNew = new House[houses.length + 1];
                for (int i = 0; i < houses.length; i++) {
                    housesNew[i] = houses[i];
                }
                houses = housesNew;
                return true;
            } else if (counter.equals("k")) {
                System.out.println("拒绝添加");
                return false;
            }
        }
        houses[houseNums++] = newHouse;
        //设计id自增长的机制
        newHouse.setId(++idCounter);
        return true;


    }

    //list方法
    public House[] list() {
        return houses;
    }
}
