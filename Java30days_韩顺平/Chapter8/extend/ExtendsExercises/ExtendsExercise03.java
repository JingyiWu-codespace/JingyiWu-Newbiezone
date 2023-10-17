package Java30days_韩顺平.Chapter8.extend.ExtendsExercises;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        Computer computer = new Computer("Arm",8,256);
        computer.getDetails();
        Notepad notePad = new Notepad("Arm",8,256,"grey");
        PC pc = new PC("Arm",8,256,"Apple");
        System.out.println(computer.getDetails());
        pc.printInfo();
        notePad.printInfo();
    }

}

class Computer {
    private String cpu;
    private int memory;
    private int disk;
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public String getCpu(){
        return this.cpu;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getDisk() {
        return this.disk;
    }
    public Computer(String cpu, int memory, int disk){
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public String getDetails() {
        return("Cpu:" + cpu + "\t" + "Memory:" + memory + "\t" + "Disk" + disk);
    }
}

class PC extends Computer {
    private String brand;
    //父类只有一个构造器，所以用super来访问
    //父类的构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public PC (String cpu,int memory, int disk, String brand){
        super(cpu,memory,disk);
        this.brand = brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrnad(){
        return brand;
    }
    public void printInfo(){
        System.out.println(getDetails()+"Brand:"+brand);
    }

}

class Notepad extends Computer {
    public String color;
    public Notepad (String cpu, int memory, int disk, String color){
        super(cpu, memory, disk);
        this.color = color;
    }
    public void setColor(String notepad){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void printInfo(){
        System.out.println(getDetails()+"color:"+color);
    }
}
