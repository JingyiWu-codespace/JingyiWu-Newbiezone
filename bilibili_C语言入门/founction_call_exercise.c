//函数练习1
//1. 函数判断是不是闰年

#include<stdio.h>
int is_leap_year (int year)
{
    if (((0==year%4)&&(0!=year % 100))||(0==year %400))
    //注意if语句加条件时，要用大括号括起来
    {
        return 1;
    }
    else 
    {
        return 0;
    }

}


int main ()
{
    int x = 0;
    scanf("%d",&x);
    int n=0;

    n=is_leap_year(x);

    if (n)
    {
        printf("%d是闰年",x);
    }
    else
    {
        printf("%d不是闰年",x);
    }
    return 0;
}


// 交换两个整数 （传址调用，注意要指针）

#include<stdio.h>
void swap (int* a,int* b) 
{
    int tmp=*a;
    *a = *b;
    *b= tmp;
}

int main ()
{
    int a = 0;
    int b = 0;
    scanf("%d %d",&a,&b);
    swap(&a,&b);

    printf("%d %d",a,b);
    return 0;
}

//乘法口诀表
//实现一个函数，打印乘法口诀表，此表的行数和列数自己制定
//如：输入9，输出9*9口诀表，输入12，输出12*12的乘法口诀表

//方法一：无函数版本
#include<stdio.h>
int main ()
{
    int i = 0;
    int n = 0;
    int d = 0;
    scanf("%d",&d);

    int ret = 0;
    for (i=1;i<=d;i++)
    {
        for (n=1;n<=d;n++)
        {
            ret= i*n;
            printf("%d * %d = %d\n" ,i,n,ret);
        }
    }

    return 0;
}

//方法二：把它写成函数形似
#include <stdio.h> 
void multi_table(int d)
{
    int i = 0;
    int n = 0;
    //int d = 0;
    //scanf("%d",&d);

    int ret = 0;
    for (i=1;i<=d;i++)
    {
        for (n=1;n<=d;n++)
        {
            ret= i*n;
            printf("%d * %d = %d\n" ,i,n,ret);
        }
    }

}

int main ()
{
    int m=0;
    scanf("%d",&m);
    multi_table(m);
    return 0;

}