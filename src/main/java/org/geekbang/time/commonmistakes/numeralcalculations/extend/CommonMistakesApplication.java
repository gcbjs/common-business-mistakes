package org.geekbang.time.commonmistakes.numeralcalculations.extend;

import java.math.BigDecimal;

/**
 * Create by yuzhangbin on 2020/9/24
 */
public class CommonMistakesApplication {

    public static void main(String[] args) {
        System.out.println("ROUND_UP");
        formatRoundUp();
        System.out.println("ROUND_DOWN");
        formatRoundDown();
        System.out.println("ROUND_CEILING");
        formatRoundCeiling();
        System.out.println("ROUND_FLOOR");
        formatRoundFloor();
        System.out.println("ROUND_HALF_UP");
        formatRoundHalfUp();
        System.out.println("ROUND_HALF_DOWN");
        formatRoundHalfDown();
        System.out.println("ROUND_HALF_EVEN");
        formatRoundHalfEven();
    }

    /**
     * ROUND_UP
     * 向远离零的方向舍入。舍弃非零部分，并将非零舍弃部分相邻的一位数字加一。
     */
    private static void  formatRoundUp() {
        BigDecimal result = new BigDecimal("1.24").setScale(1,BigDecimal.ROUND_UP);
        System.out.println(result.toString());
    }

    /**
     * ROUND_DOWN
     * 向接近零的方向舍入。舍弃非零部分，同时不会非零舍弃部分相邻的一位数字加一，采取截取行为。
     */
    private static void formatRoundDown() {
        BigDecimal result = new BigDecimal("1.24").setScale(1,BigDecimal.ROUND_DOWN);
        System.out.println(result.toString());
    }

    /**
     * ROUND_CEILING
     * 向正无穷的方向舍入。如果为正数，舍入结果同ROUND_UP一致；如果为负数，舍入结果同ROUND_DOWN一致。注意：此模式不会减少数值大小。
     */
    private static void formatRoundCeiling() {
        BigDecimal positive = new BigDecimal("1.24").setScale(1,BigDecimal.ROUND_CEILING);
        System.out.println(positive.toString());

        BigDecimal negative = new BigDecimal("-1.24").setScale(1,BigDecimal.ROUND_CEILING);
        System.out.println(negative.toString());
    }

    /**
     * ROUND_FLOOR
     * 向负无穷的方向舍入。如果为正数，舍入结果同ROUND_DOWN一致；如果为负数，舍入结果同ROUND_UP一致。注意：此模式不会增加数值大小。
     */
    private static void formatRoundFloor() {
        BigDecimal positive = new BigDecimal("1.24").setScale(1,BigDecimal.ROUND_FLOOR);
        System.out.println(positive.toString());

        BigDecimal negative = new BigDecimal("-1.24").setScale(1,BigDecimal.ROUND_FLOOR);
        System.out.println(negative.toString());
    }

    /**
     * ROUND_HALF_UP
     * 向“最接近”的数字舍入，如果与两个相邻数字的距离相等，则为向上舍入的舍入模式。如果舍弃部分>= 0.5，
     * 则舍入行为与ROUND_UP相同；否则舍入行为与ROUND_DOWN相同。这种模式也就是我们常说的我们的“四舍五入”。
     */
    private static void formatRoundHalfUp() {
        BigDecimal positive = new BigDecimal("1.24").setScale(1,BigDecimal.ROUND_HALF_UP);
        System.out.println(positive.toString());

        BigDecimal negative = new BigDecimal("1.26").setScale(1,BigDecimal.ROUND_HALF_UP);
        System.out.println(negative.toString());
    }

    /**
     * ROUND_HALF_DOWN
     * 向“最接近”的数字舍入，如果与两个相邻数字的距离相等，则为向下舍入的舍入模式。如果舍弃部分> 0.5，
     * 则舍入行为与ROUND_UP相同；否则舍入行为与ROUND_DOWN相同。这种模式也就是我们常说的我们的“五舍六入”。

     */
    private static void formatRoundHalfDown() {
        BigDecimal positive = new BigDecimal("1.25").setScale(1,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(positive.toString());

        BigDecimal negative = new BigDecimal("1.26").setScale(1,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(negative.toString());
    }

    /**
     * ROUND_HALF_EVEN
     * 向“最接近”的数字舍入，如果与两个相邻数字的距离相等，则相邻的偶数舍入。
     * 如果舍弃部分左边的数字奇数，则舍入行为与 ROUND_HALF_UP 相同；如果为偶数，则舍入行为与 ROUND_HALF_DOWN 相同
     */
    private static void formatRoundHalfEven() {
        BigDecimal positive = new BigDecimal("1.24").setScale(1,BigDecimal.ROUND_HALF_EVEN);
        System.out.println(positive.toString());

        BigDecimal negative = new BigDecimal("1.26").setScale(1,BigDecimal.ROUND_HALF_EVEN);
        System.out.println(negative.toString());
    }

}
