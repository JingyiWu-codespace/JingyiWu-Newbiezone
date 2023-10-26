package Java30days_韩顺平.Projects.HouseRentApp.view;

import Java30days_韩顺平.Projects.HouseRentApp.domain.House;
import Java30days_韩顺平.Projects.HouseRentApp.service.HouseService;
import Java30days_韩顺平.Projects.HouseRentApp.utils.Utility;

/*
1.显示界面
2. 接收用户输入
3. 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    //显示主菜单
    //设置属性
    private boolean loop=true;//控制显示菜单
    private char key = ' ';
    private HouseService houseService = new HouseService(1);
    public void update(){
        System.out.println("==================修改房屋信息==================");
        System.out.println("==================请选择待修改房屋编号(-1表示退出)==================");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("==================放弃修改房屋信息==================");
            return;
        }
        House house = houseService.search(updateId);
        if (house == null){
            System.out.println("==================你要修改的房屋信息不存在==================");
            return;
        }else{
            System.out.print("姓名("+ house.getName()+")：");
            String name = Utility.readString(8,"");
            //如果用户直接回车表示不修改信息，默认返回字符串
            if (!"".equals(name)){
                house.setName(name);
            }
            System.out.print("电话("+ house.getPhone()+")：");
            String phone = Utility.readString(12,"");
            //如果用户直接回车表示不修改信息，默认返回字符串
            if (!"".equals(phone)){
                house.setPhone(phone);
            }
            System.out.print("地址("+ house.getAddress()+")：");
            String address = Utility.readString(18,"");
            //如果用户直接回车表示不修改信息，默认返回字符串
            if (!"".equals(address)){
                house.setAddress(address);
            }
            System.out.print("租金("+ house.getRent()+")：");
            int rent = Utility.readInt(-1);
            //如果用户直接回车表示不修改信息，默认返回字符串
            if (rent!= -1){
                house.setRent(rent);
            }
            System.out.print("状态("+ house.getState()+")：");
            String state = Utility.readString(3,"");
            //如果用户直接回车表示不修改信息，默认返回字符串
            if (!"".equals(state)){
                house.setState(state);
            }
            System.out.println("==================修改房屋信息成功==================");
        }

    }
    //编写addHouse() 接收输入，创建House对象，调用add方法
    public void addHouse(){
        System.out.println("==================添加房屋==================");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt(16);
        System.out.println("状态：");
        String state = Utility.readString(3);
        //注意id是系统分配的，用户不能输入，房屋id为自增长
        House newHouse = new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("==================添加房屋成功==================");
        } else{
            System.out.println("==================添加房屋失败==================");
        }
    }
    public void searchHouse(){
        System.out.println("==================查找房屋信息==================");
        System.out.println("==================请输入需要查找的ID==================");
        int searchId = Utility.readInt();
        House house = houseService.search(searchId);
        if (house!=null){
            System.out.println(house);
        }else {
            System.out.println("==================房屋ID不存在==================");
        }

    }
    public void exit(){
        char c=Utility.readConfirmSelection();
        if (c=='Y'){
            loop = false;
        }
    }

    public void delHouse(){
        System.out.println("==================删除房屋信息==================");
        System.out.println("请输入待删除房屋的编号（-1退出）:");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("==================放弃删除房屋信息==================");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("==================删除房屋信息成功==================");
            }else {
                System.out.println("==================房屋信息不存在，删除失败==================");
            }

        } else {
            System.out.println("==================放弃删除房屋信息==================");
        }
    }

    //编写listHouse()显示房屋列表
    public void listHouses(){
        System.out.println("==================房屋列表==================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0;i<houses.length;i++){
            if (houses[i]==null){//如果为空就不显示
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==================房屋列表显示完毕==================");
    }
    public void mainMenu(){
        do {
            System.out.println("------------------房屋出租系统------------------");
            System.out.println("\t\t\t\t\t\t1.新 增 房 源");
            System.out.println("\t\t\t\t\t\t2.查 找 房 屋");
            System.out.println("\t\t\t\t\t\t3.删 除 房 屋");
            System.out.println("\t\t\t\t\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t\t\t\t\t5.房 屋 列 表");
            System.out.println("\t\t\t\t\t\t6.退      出");
            System.out.println("请输入你的选择(1-6): ");
            key = Utility.readChar();

            switch (key){
                case '1':
                    addHouse();
                    break;
            }
            switch (key){
                case '2':
                    searchHouse();
                    break;
            }
            switch(key){
                case'3':
                    delHouse();
                    break;
            }
            switch (key){
                case '4':
                    update();
                    break;
            }
            switch(key){
                case '5':
                    listHouses();
                    break;
            }
            switch (key){
                case '6':
                    exit();


                    break;

            }



        }
        while (loop);

    }






}

