package com.company;

public class Bund {
    public static long StolenMoney;
    public static boolean bundq = false;
    public static boolean SucBund = false;

    public static void bund() {
        long RB = Bredlam.getStandSalary();
        System.out.println("БУУУУУУУУНД!!111!!11!");
        System.out.println("Зарплата в размере " + RB + " слишком мала для работяг.");
        bundq = true;
        System.out.println("Рабочие начали волнения.");
        System.out.println("Грядет бунд.");
        System.out.println("План готов. Начинается бунд");
        System.out.println("Рабочие начали нападения на Бредламы");
        if (Math.random() > 0.99) {
            System.out.println("Рабочим удалось вытащить часть денег из кармана жадных владельцев бредламов.");
            StolenMoney = Math.round(RB * Math.random() * 40);
            System.out.println("Рабочие получили " + StolenMoney + " денег");
            System.out.println("Однако теперь рабочие были уволены.");
            SucBund = true;
        } else {
            System.out.println("Рабочие безуспешно совершили нападения на бредламы.");
            System.out.println("Рабочие остались с пустыми руками и были лишены зарплаты за один месяц.");
        }
        System.out.println();
    }

}
