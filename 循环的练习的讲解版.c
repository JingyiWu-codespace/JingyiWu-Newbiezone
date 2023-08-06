// 准备10个整数，找出最大值
// 排序本质是打擂台
// 二分查找 要有序！
#include <stdio.h>
//这个版本是自己写的，遇到负数就报错了
//还是看老师写的，最好不要改变数组
int main ()
{
    int max = 0;//设置成arr[0]
    int arr[10]={-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
    int i = 0;

    for (i=0;i<=9;i++)
    {
        if (arr[i]>arr[0]) //以后的数字都比arr[0]小，无法发生替换
        {
            arr[0]=arr[i]; 
            //这样会改变数组本身，不推荐，下面更新老师的写法
            max = arr[0];
        }
    }
    printf("%d",max);
    return 0;
}

#include<stdio.h>
int main ()
{
    int arr[10]={0}; //记得指定数组的元素个数
    //如果不置顶，就会根据初始化的内容来推算元素个数
    int i=0;
   
    for (i=0;i<10;i++)
    {
        scanf("%d ",&arr[i]);
    } 


    int max = arr[0];
    for (i=1;i<10;i++)
    {
        if (arr[i]>max)
        {
            max = arr[i];
        }
    }
    printf("%d",max);
    return 0;
}

//打印9*9乘法表
#include <stdio.h>
int main ()
{
    int i = 0;
    int j = 0;
    for (i=1;i<10;i++)
    {
        for (j=1;j<=i;j++)
        {
            printf("%d*%d=%-2d\t",i,j, i*j );
            // %2d 两位右对齐
            // %-2d 两位左对齐
        }
    }

    return 0;
}