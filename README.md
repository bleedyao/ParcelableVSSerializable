# 这是一个示例代码
该示例代码是为了展示 Parcelable 和 Serializable，两种方式在序列化对象的不同。

## MainActivity
* 创建 Parcelable 序列化的对象，并最为 Intent 当中的参数传递到下一个 Activity 中。

## Main2Activity
* 接收 Intent 对象，反序列化对象，然后将对象信息展示在界面上
* 和上一个 Activity 一样，将 Serializable 序列化对象传到下一个 Activity 中

## Main3Activity
* 接收 Intent 对象，反序列化对象，然后将对象信息展示在界面上
