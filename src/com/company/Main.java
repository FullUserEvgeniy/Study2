package com.company;
class TwoDShape{
    private double width;
    private double height;
    private String name;
    TwoDShape(){ //конструктор суперкласса
        width=height=0.0;
        name = "none";
    }
    TwoDShape(double w,double h,String n){ //измененная сигнатура конструктора суперкласса
        width=w;
        height=h;
        name=n;
    }
    TwoDShape(double x,String n){ //измененная сигнатура конструктора суперкласса
        width=height=x;
        name=n;
    }
    TwoDShape(TwoDShape obj){ //измененная сигнатура конструктора суперкласса
        width=obj.width;
        height=obj.height;
        name=obj.name;
    }
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width=w;}
    void setHeight(double h){height=h;}
    String getName(){return name;}
    void showDim(){
        System.out.println("Ширина и высота - "+width+" и "+height);
    }
    double area(){
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }
}
class Triangle extends TwoDShape{
    private String style;
    Triangle(){
        super();
        style="none";
    }
    Triangle(String s,double w,double h){
        super(w, h, "Треугольник");
        style=s;
    }
    Triangle(double x){
        super(x,"треугольник");
        style="Закрашенный";
    }
    Triangle(Triangle obj){
        super(obj);
        style=obj.style;
    }
    double area(){ //переопределение метода
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Треугольник "+style);
    }
}
class Rectangle extends TwoDShape{
    Rectangle(){
        super();
    }
    Rectangle(double w,double h){
        super(w,h,"Прямоугольник");
    }
    Rectangle(double x){
        super(x,"Квадрат");
    }
    Rectangle(Rectangle obj){
        super(obj);
    }
    boolean isSquare(){
        if (getWidth()==getHeight()) return true;
        else return false;
    }
    double area() { //переопределение метода
        return getWidth()*getHeight();
    }
}
public class Main {

    public static void main(String[] args) {
	    TwoDShape shapes[]=new TwoDShape[5]; //используем массив для создания множественных объектов
	    shapes[0]=new Triangle("контурный",8,12); //инициализация массива (создаем объект)
	    shapes[1]=new Rectangle(10); //инициализация массива (создаем объект)
	    shapes[2]=new Rectangle(10,4); //инициализация массива (создаем объект)
	    shapes[3]=new Triangle(7); //инициализация массива (создаем объект)
	    shapes[4]=new TwoDShape(10,20,"фигура"); //инициализация массива (создаем объект)
	    //вывод в консоль параметров созданных объектов
	    for (int i=0;i<shapes.length;i++){
            System.out.println("Объект - "+shapes[i].getName());
            System.out.println("Площадь - "+shapes[i].area());
            System.out.println();
	    }
    }
}
