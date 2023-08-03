//函数递归
//什么是递归？
//程序调用自身的变成技巧称为递归(recursion)
//递归作为一种算法在程序设计语言中广泛应用。一个过程或函数在其定义或说明中有直接或间接调用自身的一种方法，
//通常递归把一个大型复杂的问题层层转化，为一个与原问题相似的规模较小的问题来求解
//递归策略——只需要少量的程序就可以描述出阶梯过程所需要的多次重复计算，大大减少了程序的代码量。
//必须要有结束递归的条件，否则会死循环溢出，报错内容中 stack overflow 栈溢出

// 递归的两个必要条件：
// 1. 存在限制条件，当满足这个限制条件的时候，递归便不再继续。
// 2. 每次递归调用之后越来越接近这个限制条件 

//接受一个整型值（无符号），按顺序打印的每一位
//例如：
//输入：1234， 输出1 2 3 4 

//%d打印有符号的整数（会有正负数）
//%u打印无符号的整数
#include<stdio.h>
#include<string.h>

// void print (unsigned int n)
// {
//     if(n>9)
//     {
//         print  (n/ 10);

//     }
//     printf("%d",n % 10);

// }

// int main ()
// {
//     unsigned int num = 0;
//     scanf("%u",&num);
//     print(num);

//     return 0;
// }

//编写函数**不允许创建临时变量***，求字符串长度。

//int my_strlen(char str[]) 参数部分写出数组的形式，以下为创建临时变量的写法
int my_strlen(char * str) //参数部分写出指针的形式
{
    int count = 0; //计数，临时变量
    while (* str != '\0')
    {
        count++;
        str++; //指针地址+1 找下一个字符，一个字符是一个字节大小
    }
    return count ;

}



int main ()
{
    char arr[]="abc";
    int len= my_strlen(arr);
    printf("%d",len);
    return 0;
}

// 以下方法为不允许创建临时变量，使用递归求解
//思路如下:
// my_strlen("abc");
// 1+my_strlen("bc");
// 1+1+my_strlen("c")
// 1+1+1+my_strlen("\0")
// 1+1+1+0


#include<stdio.h>
#include<string.h>
int my_strlen(char *str)
{
    if (*str != '\0' )
    {
        return 1+my_strlen(str+1);
        // 为什么不写成（*str++），因为str++是后置++需要先执行函数后再加数，所以对于函数而言str++的数字没有变化
    }
    else return 0;
}


int main ()
{
    char arr[]="abc";
    int len= my_strlen(arr);
    printf("%d",len);
    return 0;
}
