package Java30days_韩顺平.Chapter8.encap;
public class ChapterIntroduction {
    public static void main(String[] args) {
        MytoolsChapter8 mt = new MytoolsChapter8();
        int[] arr = {6, 32, 6, 7, 38, 34};
        mt.bubble(arr);
        System.out.println("结果");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}

//编写一个类 编写一个方法，完成int数组对冒泡排序的功能
class MytoolsChapter8 {
    int temp = 0;

    public void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {//外层循环次数-1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}


