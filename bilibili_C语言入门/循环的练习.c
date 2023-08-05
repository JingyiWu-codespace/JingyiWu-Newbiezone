//函数练习题

//1. 二分查找

#include <stdio.h>

int main ()
{
    //初始化各项参数
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int key = 0;
    scanf("%d",&key);
    int left = 0;
    int right = sizeof (arr)/sizeof(arr[0])-1;

    while (left <right)
    {
        int mid = left+(right-left)/2 ;
        if (arr[mid]<key)
        {
            left = mid +1;
        }

        else if (arr[mid]>key)
        {
            right = mid;
        }

        else 
        {
            printf("找到了,下标是:%d",mid);
            break;
        }
        
    } 

    if (left >=right  )
    {
        printf("找不到");
    }
    
    return 0;


}

// 2. 猜数字游戏
# include <stdio.h>
# include <stdlib.h>
# include <time.h>

void menu ()
{
    printf("*********************************\n");
    printf("************ 1. PLAY  ***********\n");
    printf("************ 2. EXIT  ***********\n");
    printf("*********************************\n");
}

void game ()
{
    int num = 0;
    int ret = rand()%100+1;
    while (1)
    {
        printf("    猜猜数字    ");
        scanf("%d",&num);
        if (num > ret )
        {
            printf("猜大了");
        }
        else if (num < ret )
        {
            printf("猜小了");
        }
        else 
        {
            printf("猜对了");
        }

    }

}

int main ()
{
    int input = 0;
    srand((unsigned int )time (NULL));//生成随机数
    do 
    {
        menu();
        printf("请选择：>");
        scanf("%d",&input);
        switch (input)
        {
        case 1:
            game ();
            break;
        case 0:
            printf("    退出游戏   ");
            break;
        default:
            printf(   "选择错误");
            break;


        }

    }
    while (input);

    return 0;
}

// 1-100中出现多少个9
#include<stdio.h>
int main ()
{
    int count = 0;
    int n =0;

    for (n=0;n<=100;n++)
    {
        if (n%10==9)
        {
            count ++;
        }
        if (n/10==9)
        {
            count ++;
        }

    }
    printf ("出现数字9 %d",count);

    return 0;
}


//计算1/1-1/2+1/3-1/4+1/5-1/6.....+1/99-1/100

这题蒙圈了


// 求十个整数中最大值
//思路就是，让每一个和第一个数字比较，比第一个数字大就替换

# include <stdio.h>
# include <stdlib.h>
# include <time.h>

int main ()

{
    int arr[10]= {0};
    int i = 0;
    int max_num = 0;
    for  (i =0;i<10;i++)
    {
        scanf("%d",&arr[i]);
    }

    max_num = arr[0];
    for  (i =0;i<10;i++)
    {
        if (arr[i]>max_num)
        {
            max_num =arr[i];
        }
        
    }
    
    printf("最大数字%d\n",max_num);



    return 0;
}

//在屏幕上输入乘法口诀表
# include <stdio.h>
int main ()
{
    int i =1;
    int n =1;
    int ret = 0;
    printf("*************** 9x9 乘法表 *****************\n");
    for (i =1;i<10;i++)
    {
        for (n=1;n<10;n++)
        {
            ret = i*n;
            printf("%d*%d=%d\n",i,n,ret);
        }
    }
    return 0;
}