package Java30days_韩顺平.Chapter17.CpuNum;

public class CupNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
