# 签到抽奖系统

## 启动项目

### 方式一：源码启动
标准的SpringBoot项目，运行`LottoApplication.java`

### 方式二：执行jar文件
下载执行jar文件[lotto-1.0.jar](lotto-1.0.jar)
执行命令
```sh
java -jar lotto-1.0.jar
```
或
```sh
./lotto-1.0.jar
```
## 抽奖流程

```flow
st=>start: 开始
op1=>operation: :phone: 扫码登记
op2=>operation: 抽奖环节
e=>end: 结束

st->op1->op2->e
```

## 页面列表

* 签到页面
* 三种抽奖方式可任意选择

|view|url|
|---|---|
|手机签到页面|<localhost:8888/static/index.html>|
|抽奖页面2|<localhost:8888/static/lotto2.html>|
|抽奖页面1|<localhost:8888/static/lotto1.html>|
|抽奖页面3|<localhost:8888/static/lotto3.html>|
