package Java30days_韩顺平.Projects.HouseRentApp.domain;

public class House {
    // 属性
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String state;
    //构造器
    public House(int id,String name,String phone,String address,int rent,String state){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.rent = rent;
        this.state = state;
        this.address = address;
    }
    //getter & setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //为了方便的输出对象信息
    public String toString(){
        return id+
                "\t\t" + name +
                "\t" + phone +
                "\t\t" + address +
                "\t" + rent +
                "\t" + state ;
    }
}
