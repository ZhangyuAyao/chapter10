package codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好李焕英");
        new Movie("唐探3",100, "陈思诚");
    }


}

class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开");
        System.out.println("广告");
        System.out.println("电影即将开始");
    }

    public Movie(String name) {
        this.name = name;
        System.out.println("Movie(String name) 被构造");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
//        System.out.println("电影屏幕打开");
//        System.out.println("广告");
//        System.out.println("电影即将开始");
        System.out.println("Movie(String name, double price) 被构造");
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
//        System.out.println("电影屏幕打开");
//        System.out.println("广告");
//        System.out.println("电影即将开始");
        System.out.println("Movie(String name, double price, String director) 被构造");
    }
}

