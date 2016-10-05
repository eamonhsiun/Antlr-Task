# Antlr-Task
Interpreter Structure Test


## 实验一

给出使用实例，完成'计算器功能'的'词法语法'分析器的自动实现。

## 实验二

设计并编制调试一个'分析单词'的'词法'分析器

### 要求 
a)	忽略空格、tab键、回车换行等分隔符；
b)	识别不同类型的记号；
c)	识别并忽略注释；
d)	记录下每个记号的行号或位置；
e)	将识别的记号输出； 
f)	如果输入串存折词法分析错误，则报错。

### 步骤

1、对词法现象的形式化描述，附上所定义的种别码表。
2、程序结构说明，包括程序的总体结构，以及主要的数据结构、算法说明。
3．设计充分的测试数据，给出调试的数据及结果。



## 实验三

设计并编制调试一个'分析CMM程序结构'的'语法'分析器

### 要求
a)	在实验一的基础上，以单词序列为输入，分析单词序列构成的语法结构，给出相应的输出，并进行一定的错误处理。
b)	和实验一进行整合，输入为任意的CMM源程序文件，输出是语法树或者类似可以说明语法成分的结构形式（可以输出到文件或者输出到屏幕上）。

### 步骤
1、编译方法说明
	给出CMM语言的文法。根据所采用的实现语法分析的方法，对文件进行相应的修改。
	说明使用的语法分析方法，如递归下降法、预测分析表法或LR方法，给出所采用方法的一些分析过程。
2、程序结构说明，包括程序的总体结构，以及主要的数据结构、算法说明。
3．程序调试，设计充分的测试数据，调试的数据及结果。



## '实验四'

设计并编制调试一个'实现CMM程序结构'的解释器


### 要求

a)	类型检查
b)	变量的作用域与声明检查
c)	除数不为0
d)	数组下标检查
e)	语句中的布尔表达式的类型检查
f)	其他


### 步骤

1．设计：编译方法说明
	给出CMM语言的词法现象和语法现象的形式化描述。
	指出所使用的语法分析方法，并根据使用的语法分析方法，给出相关的中间推导步骤（如：如果采用递归下降法则给出BNF语法图、如采用预测分析表法则给出预测分析表等）。
	说明语义分析中采用的具体的属性文法，进行何种分析。
	采用中间代码形式对语义分析的中间结果给出输出（可选）；
	实现优化技术（可选）；

2．代码实现：要求结构清晰、可读性好。	

3．调试：给出较充分的测试用例，以及测试结果（注意数据的多样性及覆盖性）。




