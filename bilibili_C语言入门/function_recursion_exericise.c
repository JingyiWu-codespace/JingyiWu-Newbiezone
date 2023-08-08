//founction_recursion_exersice+讲解
//打印数字的每一位
// 非递归版
#include<stdio.h>
int fac (int n )
{
    int i = 1;
    int j= 1;
    for (i=1;i<=n;i++)
    {
        j = i*j;
    }
    return j;
}

int main ()
{
    int n = 0 ;
    scanf("%d",&n);
    printf("阶乘为%d\n", fac(n));
    return 0;
}

//递归版
# include<stdio.h>
int fac(int n)
{
    int i =1;
    if (n<=1)
    {
        return 1;
    }
    return fac(n-1)*n;
}

int main()
{
    int n =0;
    scanf("%d",&n);
    printf("%d",fac(n));
}

//strlen的实现——非递归版本
#include<stdio.h>
int my_strlen(char* str)
{
    int count = 0;
    while (*str != '\0')
    {
        count++;
        str++;
    }
    return count;
}

int main ()
{
    int sum = 0;
    char str[20];
    printf("请输入一串字符:");
    scanf("%s",str);
    sum = my_strlen(str);
    printf("%d",sum);
    return 0;
}

//递归版本

#include<stdio.h>
#include 
int my_strlen(char* str)
{
    if (*str !='\0')
    {
        return  my_strlen(str+1)+1;
    }
    else 
    {
        return 0;
    }
}

int main ()
{
    int sum = 0;
    char arr[20];
    scanf("%s",arr);
    sum = my_strlen(arr);
    printf("%d",sum);

    return 0;
}

//字符串逆序（循环实现，非递归）
//不会 听老师讲
#include<stdio.h>
int main ()
{
    char arr[] = "abejgo";
    int sz =sizeof(arr)/sizeof(arr[0]);
    int left = 0;
    int right = sz-2;
    //int right = strlen(arr)-1;


    while (left<right)
    {
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;

        left++;
        right--;
    }

    printf("%s",arr);

    return 0;
}

//字符串逆序 写成函数的方式
#include<stdio.h>
void reverse_string (char arr[])
{
    int left = 0;
    int right = strlen(arr)-1; //函数内部无法使用sizeof这种形式，所以使用strlen
    while (left <right)
    {
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
        left++;
        right--;
    }
}

//字符串逆序，递归的方式+不使用c语言库函数
#include<stdio.h>
#include <string.h>
void reverse (char* str)
{
    char tmp = *str;
    int len = my_strlen(str);
    *str =*(str+len-1);
    *(str+len-1)='\0';
    if (my_strlen(str+1)>=2)
    {
        reverse(str+1);
    }
    
    *(str+len-1)=tmp;
    //*str 是指数组种的首元素 + len-1 指向了数组的最后一个元素
}

int main ()
{
    char arr[] ="adfghjkl";
    reverse (arr);
    printf("%s\n",arr);
    return 0;
}

//还有一种方法
#include <stdio.h>
#include <string.h>
void reverse_ (char arr[],int left, int right )
{
    char tmp = arr[left];
    arr[left ] = arr[right];
    arr[right ]= tmp;
    if (left < right)
    {
        reverse_ (arr, left+1, right-1);
    }

}

int main ()
{
    
    char arr[] ="adfghjkl";
    int left = 0;
    int right = strlen(arr)-1;
    reverse_ (arr,left,right);
    printf("%s\n",arr);
    return 0;
}



//字符串逆序打印，递归,没改变 字符串内容
char reverse_string (char* string)
{
    if (*string!='\0')
    {
          reverse_string(string+1);
    }
    printf("%c",*string);

}




//计算一个数的每位之和

int DigiSum(int n)
{
    if (n>9)
    {
        return DigiSum(n/10)+n%10;
    }
    else 
    {
        return n;
    }

}

int main ()
{
    unsigned int n = 0 ;
    scanf("%u",&n);
    int sum =DigitSum(n);
    printf("%d\n",sum);
    return 0;
}


//编写一个函数现实n的k次方，使用递归实现
//k=0, n的k=1
//k>0, n的k = n*Pow(n,k-1)
//k<0, 1.0/Pow(n,-k)
#include <stdio.h>
double Pow( int n, int k)
{
    
    if (k>0)
    {
        return n*Pow(n,k-1);
    }

    else if (k==0)
    {
        return 1;
    }

    else 
    {
        return 1.0/Pow(n,-k);
    }
}

int main ()
{
    int n=0;
    int k =0;
    scanf("%d %d", &n, &k);
    double ret = Pow(n,k);
    printf("%lf", ret);

    return 0;
}

//求指定位数的斐波那契数
#include<stdio.h>
int fibonacci (int n)
{
    if (n<=1)
    {
        return 1;
    }

    int a =0;
    int b=1;
    int result =0;
    for (int i=2;i<=n;i++)
    {
        result = a+b;
        a=b;
        b=result;
    }
    return result;
}

int main ()
{
    int n =0;
    scanf("%d",&n);
    int ret = fibonacci(n);
    printf("%d",ret);
}

//递归的方式求 斐波那契数
#include<stdio.h>
int fibonacci (int n)
{
    if (n<=2)
    {
        return 1;
    }
    else
    {
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

int main ()
{
    int n =0;
    scanf("%d",&n);
    int ret = fibonacci(n);
    printf("%d",ret);
}