//函数的声明和定义
#include<stdio.h>


// 6.1 函数的声明
int Add(int x ,int y );
// 告诉你我有一个函数是什么
// 只需要在使用前，声明函数的返回类型以及名称、参数类型
// 告诉编译器有一个函数叫什么，参数是什么，返回类型是什么，但是具体是不是存在，函数声明决定不了
// 函数的声明一般出现在函数的使用之前，要满足先声明后使用
// 函数的声明一般要放在头文件中



int main ()
{
    int a =0;
    int b =0;
    scanf("%d %d",&a,&b);
    //加法
    int sum = Add(a,b);
    printf("%d\n",sum);
}



// 6.2 函数的定义 
// 创造函数，这个函数有没有创建成功取决于函数定义
// 是值函数的具体实现，交代函数的功能实现
int Add(int x,int y)
{
     return x+y;
}
//引用自己写的代码时需要在头文件进行声明，在源文件进行函数的定义
//再使用 #include""add.h"（函数头文件名称），包含头文件就是将头文件的内容拷贝过来
//变成头文件——>再换成静态库
//导入静态库的方法 #program comment(lib,"add.lib")
