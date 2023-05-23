package com.study.first;

/**
 * @ProjectName: firstDemo
 * @Package: com.study.first
 * @ClassName: Eume
 * @Author: zwjie911
 * @Description:
 * @Date: 2023/4/28 23:17
 * @Version: 1.0
 */

/**
 * 1. switch不能使用boolean和long类型的数据, 可以使用byte, short, int, char, 枚举, String
 * 2. switch中的判定值
 *      1. 如果case中有这个判定值, 两者相同, 则从改判定值一直往下面执行, 直到遇到break或者执行结束.
 *      2. 如果case中没有这个判定值, 但是有default, 则从default开始执行.
 *      注意:
 *          1. 如果有判定值, 并且有default, 则不管default在什么地方, 都从判定值开始执行,
 *          2. 如果没有判定值, 则从default开始执行, 依次执行下去, 直到遇到break或者switch结束
 */
public class Eume {
    public static void main(String[] args) {
        System.out.println(" hello ");

//        testSwitch1();
//        testSwitch2();
//        testSwitch3();
        testSwitch4();
//        testSwitch5();
//        testSwitch6();
    }

    public static void testSwitch1() {
        /**
         * switch 可以说使用 byte, short, int, 枚举, String,
         * 但是不能使用long, 不能使用boolean
         */
        boolean b = true;
//        switch(b){
//            case true:
//                System.out.println("b = " + b);
//            case false:
//                System.out.println("b = " + b);
//        }


        /**
         * 测试switch可以一直下去
         */

    }

    public static void testSwitch2() {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("这里是case 1: a = " + a);
            case 2:
                System.out.println("这里是case 2: a = " + a);
            case 3:
                System.out.println("这里是case 3: a = " + a);
            case 4:
                System.out.println("这里是case 4: a = " + a);
            case 5:
                System.out.println("这里是case 5: a = " + a);
            default:
                System.out.println("这里是default: a = " + a);

        }
    }

    public static void testSwitch3() {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("这里是case 1: a = " + a);
            case 2:
                System.out.println("这里是case 2: a = " + a);
            case 3:
                System.out.println("这里是case 3: a = " + a);
            case 4:
                System.out.println("这里是case 4: a = " + a);
                break;
            case 5:
                System.out.println("这里是case 5: a = " + a);
            default:
                System.out.println("这里是default: a = " + a);

        }
    }

    public static void testSwitch4() {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("这里是case 1: a = " + a);
            case 2:
                System.out.println("这里是case 2: a = " + a);
            case 3:
                System.out.println("这里是case 3: a = " + a);
            default:
                System.out.println("这里是default: a = " + a);
            case 4:
                System.out.println("这里是case 4: a = " + a);
                break;
            case 5:
                System.out.println("这里是case 5: a = " + a);


        }
    }

    public static void testSwitch5() {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("这里是case 1: a = " + a);
            default:
                System.out.println("这里是default: a = " + a);
            case 2:
                System.out.println("这里是case 2: a = " + a);
            case 3:
                System.out.println("这里是case 3: a = " + a);
            case 4:
                System.out.println("这里是case 4: a = " + a);
                break;
            case 5:
                System.out.println("这里是case 5: a = " + a);


        }
    }

    public static void testSwitch6() {
        int a = 6;
        switch (a) {
            default:
                System.out.println("这里是default: a = " + a);
            case 1:
                System.out.println("这里是case 1: a = " + a);
            case 2:
                System.out.println("这里是case 2: a = " + a);
            case 3:
                System.out.println("这里是case 3: a = " + a);
            case 4:
                System.out.println("这里是case 4: a = " + a);
                break;
            case 5:
                System.out.println("这里是case 5: a = " + a);


        }
    }
}
