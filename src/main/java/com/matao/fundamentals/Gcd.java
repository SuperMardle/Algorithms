package com.matao.fundamentals;

/**
 * Created by matao on 5/26/16.
 * 自然语言描述:
 * 计算两个非负整数p和q的最大公约数: 若q是0, 则最大公约数为p
 * 否则将p除以q得到余数r, p和q的最大公约数即q和r的最大公约数
 */
public class Gcd {

    public static int gcdByRecursion(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcdByRecursion(q, r);
    }

    public static int gcd(int p, int q) {
        while (q > 0) {
            int r = p % q;
            p = q;
            q = r;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(gcd(20, 5));
        System.out.println(gcdByRecursion(20, 5));
    }
}
